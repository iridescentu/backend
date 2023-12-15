package com.dw.discord.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dw.discord.model.Member;

// class 가 아닌 interface것과 extends JpaRepository<a, b> 잊지 말기
public interface MemberRepository extends JpaRepository<Member, Long>{

	Member findByLoginId(String loginId);
}
