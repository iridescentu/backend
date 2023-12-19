package com.dw.discord.jwtauthority.service;

import java.util.Collections;

import com.dw.discord.exception.InvalidRequestException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dw.discord.jwtauthority.dto.UserDto;
import com.dw.discord.jwtauthority.model.Authority;
import com.dw.discord.jwtauthority.model.User;
import com.dw.discord.jwtauthority.repository.UserRepository;
import com.dw.discord.jwtauthority.util.SecurityUtil;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Transactional
    public UserDto signup(UserDto userDto) { // 가입하기
        if (userRepository.findOneWithAuthoritiesByUsername(userDto.getUsername())
        		.orElse(null) != null) {
            throw new InvalidRequestException("Duplicated member","이미 가입되어 있는 유저입니다.");
        }

        // Line 34 ~ Line 35: 유저 권한 넣어 주기
        Authority authority = new Authority();
        authority.setAuthorityName("ROLE_USER");

        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setPassword(passwordEncoder.encode(userDto.getPassword())); // passwordEncoder를 이용해 비밀번호를 암호화해 패스워드를 넣어 줌
        user.setNickname(userDto.getNickname());
        user.setAuthorities(Collections.singleton(authority));
        user.setActivated(true); // 회원 관리를 할 때 회원을 활성화/비활성화 시킬 수 있어야 함

        return UserDto.from(userRepository.save(user)); // from: save가 끝난 뒤에 user를 UserDto로 바꿔(conversion) 주는 것
    }

    @Transactional(readOnly = true)
    public UserDto getUserWithAuthorities(String username) {
        return UserDto.from(userRepository.findOneWithAuthoritiesByUsername(username) // DB에서 해당 유저의 정보를 얻어온다
        		.orElseThrow(() -> new InvalidRequestException(username,"member not found")));
    }

    @Transactional(readOnly = true)
    public UserDto getCurrentUserWithAuthorities() { // CurrentUser(현재 사용자): user/admin 권한 상관없이 본인의 콘텐츠를 볼 수 있도록
    	// CurrentUser는 SecurityContextHolder에서 해당 유저의 정보를 받아온다
        return UserDto.from(
                SecurityUtil.getCurrentUsername()
                        .flatMap(userRepository::findOneWithAuthoritiesByUsername)
                        .orElseThrow(() -> new InvalidRequestException("No current user","Current member not found"))
        );
    }
}