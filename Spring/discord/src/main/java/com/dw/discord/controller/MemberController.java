package com.dw.discord.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dw.discord.dto.BaseResponse;
import com.dw.discord.dto.MemberDto;
import com.dw.discord.dto.MemberLoginDto;
import com.dw.discord.service.impl.MemberServiceImpl;

import jakarta.validation.Valid;

@RestController

// 동일 출처 원칙 
@CrossOrigin(origins = "http://localhost:3000",
		methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})

public class MemberController {
	
	private final MemberServiceImpl memberServiceImpl;
	
	@Autowired
	public MemberController(MemberServiceImpl memberServiceImpl) {
		super();
		this.memberServiceImpl = memberServiceImpl;
	}

	@PostMapping("/api/signup") // Backend에서는 주소를 정할 때 /api 로 시작하는 것이 좋은 습관임
	// 하지만, Frontend 쪽에서 주소를 정할 때는 api를 빼고 만드는 게 나음
	// 현재 /api/signup으로 예를 들자면,
	// Backend에서는 지금처럼 /api/signup으로 하고,
	// Frontend에서는 /api를 뺀 /signup으로만 해 주는 것.
	// 아래 두 코드처럼 가입이나 로그인은 RequestHeader가 아닌 RequestBody를 사용해야 함
	// @Valid를 사용한 이유는 @Valid 뒤에 있는 것들을 Validation 해 주기 위해
	public ResponseEntity<BaseResponse<Void>> signUp(@RequestBody @Valid MemberDto memberDto) {
		return new ResponseEntity<BaseResponse<Void>> (
				memberServiceImpl.signUp(memberDto),
				HttpStatus.CREATED);
	}
	
	@PostMapping("/api/login")
	public ResponseEntity<BaseResponse<Void>> login(@RequestBody @Valid MemberLoginDto membeLoginrDto) {
		return new ResponseEntity<BaseResponse<Void>> (
				memberServiceImpl.login(membeLoginrDto),
				HttpStatus.OK);
	}
}
