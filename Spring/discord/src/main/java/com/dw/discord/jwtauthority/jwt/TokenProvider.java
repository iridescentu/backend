package com.dw.discord.jwtauthority.jwt;

import io.jsonwebtoken.*;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

@Component
public class TokenProvider implements InitializingBean { // 아래의 코드들은 Bean의 구현체이다

   private final Logger logger = LoggerFactory.getLogger(TokenProvider.class);
   private static final String AUTHORITIES_KEY = "auth";
   private final String secret;
   private final long tokenValidityInMilliseconds;
   private Key key;

   public TokenProvider(
      @Value("${jwt.secret}") String secret, // jwt.secret → application.properties에서 찾음
      @Value("${jwt.token-validity-in-seconds}") long tokenValidityInSeconds) { // jwt.token-validity-in-seconds → application.properties에서 찾음
      this.secret = secret;
      this.tokenValidityInMilliseconds = tokenValidityInSeconds * 1000;
   }

   @Override
   public void afterPropertiesSet() { // 호출의 시점을 조정하는 코드 (Line 41의 secret이 자기 값을 가질 때까지 기다렸다가 호출하라는 함수)
      byte[] keyBytes = Decoders.BASE64.decode(secret);
      this.key = Keys.hmacShaKeyFor(keyBytes);
   }

   public String createToken(Authentication authentication) {
      String authorities = authentication.getAuthorities().stream() // 연결되어 있는 정보들을 하나하나 확인하기 위해 .stream() 사용
         .map(GrantedAuthority::getAuthority) // 위의 .stream()을 이용해 확인한 정보들을 .map()을 사용해 수정 가능
//       .map(GrantedAuthority -> grantedAuthority.getAuthority()); // 이 코드와 Line 47의 코드는 동일하지만 다르게 쓴 것
         .collect(Collectors.joining(",")); // .collect: 문자열을 합치는 것
      // 만약 admin 유저라면 권한이 admin과 user 두 개이기 때문에 ("admin", "user") 이런 식으로 합치겠다는 뜻 → Token은 전체가 전부 String이기 때문에 문자열로 바꿔서 합치기 위함이다

      long now = (new Date()).getTime(); // 현재 시간
      Date validity = new Date(now + this.tokenValidityInMilliseconds); // 현재 시간 + 만료 시간을 더해 validity에 찍어 준다

      return Jwts.builder()
         .setSubject(authentication.getName())
         .claim(AUTHORITIES_KEY, authorities)
         .signWith(key, SignatureAlgorithm.HS512) // HS512: 많이 쓰이는 암호화 알고리즘
         .setExpiration(validity) // 만료 시간 넣기
         .compact(); // 문자열화 하기
   }

   // getAuthentication: token에서 Authentication의 내용을 꺼내는 것
   // Line 45 ~ Line 61까지의 역순
   public Authentication getAuthentication(String token) {
      Claims claims = Jwts
              .parserBuilder()
              .setSigningKey(key)
              .build()
              .parseClaimsJws(token)
              .getBody();

      // Collection: 배열 종류들의 최상단 부모
      // <? extends: 오른쪽에서 상속받은 모든 것들이 Collection으로 올 수 있다
      // 때문에 GrantedAuthority에서 상속받은 어떤 것이든 Collection으로 올 수 있음
      Collection<? extends GrantedAuthority> authorities =
         Arrays.stream(claims.get(AUTHORITIES_KEY).toString().split(","))
            .map(SimpleGrantedAuthority::new)
//          .map(authority -> new SimpleGrantedAuthority()); // Line 78과 동일한 코드
            .collect(Collectors.toList());

      User principal = new User(claims.getSubject(), "", authorities); // User 정보에서 principal 만들기

      // principal: username, null: password, authorities: 권한
      // UsernamePasswordAuthenticationToken에서 password는 사용하지 않기 때문에 null이라는 값을 넣어 줘야 함
      // 만약 null을 넣지 않고 principal, authorities 이렇게 두 가지만 적는다면 403 Forbidden error가 남
      return new UsernamePasswordAuthenticationToken(principal, null, authorities);
   }

   public boolean validateToken(String token) {
      try {
    	  // 아래의 코드에서 SigningKey는 우리가 application properties에 넣어 둔 key이다
    	  // 이후 빌드를 하고 Line 86 ~ Line 93까지의 error들을 체크한다
         Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token); // 토큰의 유효성 여부 체크
         return true;
      // 토큰의 유효성 여부 체크 중 exception이 발생할 수 있기 때문에 아래의 코드들처럼 예외 처리를 해 준다
      } catch (io.jsonwebtoken.security.SecurityException | MalformedJwtException e) { // Line 83에서의 key를 이용해 잘못된(Malformed) 토큰이 있는지 확인한다
         logger.info("잘못된 JWT 서명입니다.");
      } catch (ExpiredJwtException e) {
         logger.info("만료된 JWT 토큰입니다.");
      } catch (UnsupportedJwtException e) {
         logger.info("지원되지 않는 JWT 토큰입니다.");
      } catch (IllegalArgumentException e) {
         logger.info("JWT 토큰이 잘못되었습니다.");
      }
      return false;
   }
}