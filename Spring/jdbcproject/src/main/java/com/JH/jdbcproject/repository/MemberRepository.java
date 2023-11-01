package com.JH.jdbcproject.repository;

import java.util.List;
import java.util.Optional;

import com.JH.jdbcproject.model.Member;

public interface MemberRepository {
	
	// 저장
	Member save(Member member);
	
	// ID로 row 찾기
	Optional<Member> findById(Long id);
	
	// 이름으로 row 찾기
	Optional<Member> findByName(String name);

	// 모든 row 찾기
	List<Member> findAll();

}
