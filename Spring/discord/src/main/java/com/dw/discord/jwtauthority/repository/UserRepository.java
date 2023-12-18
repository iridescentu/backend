package com.dw.discord.jwtauthority.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dw.discord.jwtauthority.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {
	  // @EntityGraph: 데이터를 미리 캐싱해 두는 것
	 // 동작될 때마다 계속 정보를 읽어 오는 것이 아닌, 데이터를 미리 읽어서 저장해 둠으로서 저장 공간을 조금 더 효율적으로 사용하기 위한 것.
	 @EntityGraph(attributePaths = "authorities")
	 Optional<User> findOneWithAuthoritiesByUsername(String username);
	 // findOneWith: JoinTable에 사용되는 것.
	 // Line 16의 username을 사용해 Line 15의 authorities에 가서 username을 찾으라는 것.

	 // 위 메소드와 동일한 메소드 (JPQL(=JPA에서 사용하는 SQL) 버전)
	 // JPA에서 SQL을 사용하지 않지만 @Query라는 Annotation을 이용해 SQL을 사용할 수 있도록 한다.
	@Query("SELECT u FROM User u JOIN FETCH u.authorities WHERE u.username = :username")
	Optional<User> findAuthoritiesByUsername(@Param("username") String username);

}
