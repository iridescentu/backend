package com.dw.discord.jwtauthority.config;


import com.dw.discord.jwtauthority.jwt.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import static org.apache.tomcat.jni.SSLConf.apply;

@Configuration // 이 Annotation을 달아 줘야 Spring Security의 환경 설정이라는 것을 알려 주는 것이다. 환경 설정 클래스임을 명시하는 역할.
@EnableWebSecurity // 환경 설정(우리의 경우는 Web App)의 특징(Rest API 등)을 알려 주는 것이다. 웹 기반 보안을 활성화.
@EnableMethodSecurity // 메소드 수준의 보안을 활성화. ~ 메소드 수준이란, 컨트롤러의 메소드들마다 다른 수준의 보안을 가질 수 있도록 아래의 Annotation을 사용하도록 한다는 뜻.
// <@PreAuthorize, @Secured, @RollAllowed>
public class SecurityConfig {
    private final TokenProvider tokenProvider; // tokenProvider = 토큰을 생성해 주는 class.
    //    private final CorsFilter corsFilter;
    private final JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint; // jwtAuthenticationEntryPoint = 예외(exception) 설정. (비밀번호가 틀렸을 경우), 인증 실패.
    private final JwtAccessDeniedHandler jwtAccessDeniedHandler; // jwtAccessDeniedHandler = 인가 실패(admin만 접속할 수 있는 공간에 user가 왔을 경우), 인가 실패.

    public SecurityConfig(TokenProvider tokenProvider, JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint,
                          JwtAccessDeniedHandler jwtAccessDeniedHandler) {
        super();
        this.tokenProvider = tokenProvider;
        this.jwtAuthenticationEntryPoint = jwtAuthenticationEntryPoint;
        this.jwtAccessDeniedHandler = jwtAccessDeniedHandler;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(); // BCryptPasswordEncoder = 암호화 알고리즘을 구현한 것, 암호화 알고리즘을 쓰겠다고 알려 주는 것.
        // 이미 라이브러리 안에 있는 것이기 때문에 우리가 따로 무엇을 할 필요가 없고, Spring Security가 이 passwordEncoder를 사용하겠다는 뜻이기 때문에
        // 우리가 이 코드에서 return만 해 준 것.
        // 만약 이 코드가 없다면, 암호화가 일어나지 않는다.
    }


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http // http라는 객체에 .csrf 혹은 .exceptionHandling처럼 계속 .을 찍고 함수를 연결해 두었기 때문에 Chain이라고 불린다.
        // 반드시 SecurityFilterChain이라는 것을 만들어 줘야 하며, @Bean으로 정의해야 한다.
        
                .csrf(csrf -> csrf.disable())
                // 토큰을 쓰지 않고 세션을 쓰게 된다면 csrf를 사용하겠지만,
                // 현재 우리는 토큰을 사용하기 때문에 disable로 비활성화 처리를 해 주었다.

                .exceptionHandling(exceptionHandling -> exceptionHandling // 인가 실패
                        .accessDeniedHandler(jwtAccessDeniedHandler)
                        .authenticationEntryPoint(jwtAuthenticationEntryPoint)
                )

                .authorizeHttpRequests(authorizeHttpRequests -> authorizeHttpRequests // 인증 실패
                        .requestMatchers("/api/authenticate").permitAll()
                        .requestMatchers("/api/signup").permitAll()
                        .requestMatchers("/api/basic/signup").permitAll()
//                        .requestMatchers("/api/board").permitAll()
                        .anyRequest().authenticated()
                )

                .sessionManagement(sessionManagement -> sessionManagement.sessionCreationPolicy( // Session 관리
                        SessionCreationPolicy.STATELESS)) // 우리는 Session이 아닌 Token을 사용하기 때문에 Session 상태를 STATELESS(무상태)로 만들어 준다.

                // defaultSeccessUrl = 로그인이 됐을 때 어디로 갈까? → "/": root로 보내겠다는 뜻이다. (아마 없어도 될 듯하다)
                .formLogin(formLoginCustomizer -> formLoginCustomizer.defaultSuccessUrl("/"))

                .addFilterBefore(
                        new JwtFilter(tokenProvider),
                        UsernamePasswordAuthenticationFilter.class // User와 Password로 인증을 하는 것.
                );

        return http.build();
    }
}
