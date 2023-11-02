package com.JH.securityproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JH.securityproject.model.Member;

public interface MemberRepository extends JpaRepository<Member, Long>{

	Member findByLoginId(String loginId);
}
