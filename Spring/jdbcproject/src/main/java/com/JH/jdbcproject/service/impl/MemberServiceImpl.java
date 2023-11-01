package com.JH.jdbcproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JH.jdbcproject.model.Member;
import com.JH.jdbcproject.repository.MemberRepository;
import com.JH.jdbcproject.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {
	
	
	private MemberRepository memberRepository;
	
	@Autowired
	public MemberServiceImpl(MemberRepository memberRepository) {
		super();
		this.memberRepository = memberRepository;
	}

	@Override
	public Member saveMember(Member member) {
		return memberRepository.save(member);
	}

	@Override
	public Member getMemberById(long id) {
		return memberRepository.findById(id).orElseThrow(()->null);
	}

	@Override
	public Member getMemberByName(String name) {
		return memberRepository.findByName(name).orElseThrow(()->null);
	}

	@Override
	public List<Member> getAllMembers() {
		return memberRepository.findAll();
	}

}
