package com.JH.securityproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.JH.securityproject.common.dto.BaseResponse;
import com.JH.securityproject.common.status.ResultCode;
import com.JH.securityproject.dto.MemberDto;
import com.JH.securityproject.dto.MemberLoginDto;
import com.JH.securityproject.service.MemberService;

import jakarta.validation.Valid;

@CrossOrigin(origins="http://localhost:3000", 
methods= {RequestMethod.GET, RequestMethod.POST})
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
	public ResponseEntity<BaseResponse<Void>> signup(@RequestBody @Valid MemberDto memberDto) {
		return new ResponseEntity<BaseResponse<Void>>(
				new BaseResponse<Void>(ResultCode.SUCCESS.name(),
						null,
						memberService.signUp(memberDto )),
				HttpStatus.CREATED);
	}
	
	@PostMapping("login")
	public ResponseEntity<BaseResponse<Void>> signup(@RequestBody @Valid MemberLoginDto memberLoginDto) {
		return new ResponseEntity<BaseResponse<Void>>(
				new BaseResponse<Void>(ResultCode.SUCCESS.name(),
						null,
						memberService.login(memberLoginDto)),
				HttpStatus.OK);
	}
}