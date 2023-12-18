package com.dw.discord.jwtauthority.controller;

import com.dw.discord.dto.BaseResponse;
import com.dw.discord.enumstatus.ResultCode;
import com.dw.discord.jwtauthority.dto.LoginDto;
import com.dw.discord.jwtauthority.dto.TokenDto;
import com.dw.discord.jwtauthority.jwt.JwtFilter;
import com.dw.discord.jwtauthority.jwt.TokenProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:3000",
        methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
public class AuthController {
    private final TokenProvider tokenProvider;
    private final AuthenticationManagerBuilder authenticationManagerBuilder;

    public AuthController(TokenProvider tokenProvider, 
    		AuthenticationManagerBuilder authenticationManagerBuilder) {
        this.tokenProvider = tokenProvider;
        this.authenticationManagerBuilder = authenticationManagerBuilder;
    }

    @PostMapping("/authenticate") // 로그인이기 때문에 Line 35에서 LoginDto로 받음.
    
    // Login을 하면 <TokenDto>를 사용해 Token을 준다.
    public ResponseEntity<BaseResponse<TokenDto>> authorize(@RequestBody @Valid LoginDto loginDto) {

        UsernamePasswordAuthenticationToken authenticationToken = // user 정보를 받아 담아 놓기 위한 빈 박스라고 생각하면 된다.
                new UsernamePasswordAuthenticationToken(loginDto.getUsername(), 
                		loginDto.getPassword());

        Authentication authentication = authenticationManagerBuilder.getObject()
        		.authenticate(authenticationToken);
        // Line 43 ~ Line 44가 성공했을 경우에만 Line 46부터의 코드가 실행된다.
        SecurityContextHolder.getContext().setAuthentication(authentication);
        // 위의 코드(Line 43 ~ Line 44)가 성공했을 경우에 Line 46의 SecurityContextHolder 안에 들어 있는 사용자의 authentication(로그인 정보)을 확인할 수 있다.

        String jwt = tokenProvider.createToken(authentication); // 로그인이 성공했을 경우(Line 43 ~ Line 44)에 토큰을 생성해서 사용자에게 부여한다.

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(JwtFilter.AUTHORIZATION_HEADER, "Bearer " + jwt); // 토큰 앞에 7 자리의 text가 있는데, 이것이 "Bearer "(공백 포함)이다. ※외워야 함※

        return new ResponseEntity<>(
                new BaseResponse<>(ResultCode.SUCCESS.name(), new TokenDto(jwt), ResultCode.SUCCESS.getMsg()), // Body
                httpHeaders, // Header
                HttpStatus.OK); // 상태 코드
    }
}