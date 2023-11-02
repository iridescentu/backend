package com.JH.securityproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JH.securityproject.dto.MemberDto;
import com.JH.securityproject.service.MemberService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/member")
public class MemberController {

	private MemberService memberService;
	
	@Autowired
	public MemberController(MemberService memberService) {
		super();
		this.memberService = memberService;
	}
	
	@PostMapping("signup")
	public ResponseEntity<String> signup(@RequestBody @Valid MemberDto memberDto) {
		return new ResponseEntity<String>(memberService.signUp(memberDto),
				HttpStatus.CREATED);
	}
}
