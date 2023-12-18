package com.dw.discord.service.impl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dw.discord.dto.BaseResponse;
import com.dw.discord.dto.MemberDto;
import com.dw.discord.dto.MemberLoginDto;
import com.dw.discord.enumstatus.Gender;
import com.dw.discord.enumstatus.ResultCode;
import com.dw.discord.exception.InvalidRequestException;
import com.dw.discord.model.Member;
import com.dw.discord.repository.MemberRepository;
import com.dw.discord.service.MemberService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class MemberServiceImpl implements MemberService{

	private final MemberRepository memberRepository;
	
	@Autowired // @Autowired = 의존성 주입: 내 클래스 안에 다른 클래스가 붙어 있는 것
	// 생성자 = Source → Generate Constructor Using Fields → Select All
	public MemberServiceImpl(MemberRepository memberRepository) {
		super();
		this.memberRepository = memberRepository;
	}

	@Override
	public BaseResponse<Void> signUp(MemberDto memberDto) {
		Member member = memberRepository.findByLoginId(memberDto.getLoginId());
		if (member != null) {
//			return new BaseResponse<Void>( // <Void>를 쓴 이유는 아래 코드에 null을 썼기 때문에. 만약 null 자리에 숫자가 있었다면 <int>를 썼을 것.
//					"FAIL",
//					null,
//					"이미 등록된 ID입니다");
			throw new InvalidRequestException("Duplicate ID", "이미 등록된 ID입니다");
		}
		member = new Member();
		member.setId(null);
		member.setLoginId(memberDto.getLoginId());
		member.setPassword(memberDto.getPassword());
		member.setName(memberDto.getName());
		member.setBirthDate(LocalDate.parse(memberDto.getBirthDate(),
				DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		member.setGender(Gender.valueOf(memberDto.getGender()));
		member.setEmail(memberDto.getEmail());
		
		memberRepository.save(member);
		return new BaseResponse<Void>( // <Void>를 쓴 이유는 아래 코드에 null을 썼기 때문에. 만약 null 자리에 숫자가 있었다면 <int>를 썼을 것.
//				"SUCCESS",
				ResultCode.SUCCESS.name(),
				null,
				"회원가입이 완료되었습니다");
	}

	@Override
	public BaseResponse<Void> login(MemberLoginDto memberLoginDto) {
			Member member = memberRepository.findByLoginId(memberLoginDto.getLoginId());
			if (member != null && member.getPassword().matches(memberLoginDto.getPassword())) {
				return new BaseResponse<Void>( // <Void>를 쓴 이유는 아래 코드에 null을 썼기 때문에. 만약 null 자리에 숫자가 있었다면 <int>를 썼을 것.
//						"SUCCESS",
						ResultCode.SUCCESS.name(),
						null,
						"로그인이 완료되었습니다");
			} else {
//				return new BaseResponse<Void>( // <Void>를 쓴 이유는 아래 코드에 null을 썼기 때문에. 만약 null 자리에 숫자가 있었다면 <int>를 썼을 것.
//						"FAIL",
//						null,
//						"ID 혹은 Password가 올바르지 않습니다");
				throw new InvalidRequestException("Invalid ID / PW", "ID 혹은 Password가 올바르지 않습니다");
			}
	}
}
