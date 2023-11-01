package com.JH.jdbcproject.service;

import java.util.List;
import java.util.Optional;

import com.JH.jdbcproject.model.Member;

public interface MemberService {

	Member saveMember(Member member);
	
	Member getMemberById(long id);
	
	Member getMemberByName(String name);
	
	List<Member> getAllMembers();
	

}
