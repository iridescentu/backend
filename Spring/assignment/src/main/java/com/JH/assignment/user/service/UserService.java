package com.JH.assignment.user.service;

import java.util.List;

public interface UserService {

	// 직원 정보를 새로 생성한다
		User saveUser(User user);
		
		// 전체 직원 정보를 조회한다
		List<User> getAllUsers();

		// ID로 직원 한 명의 정보를 조회한다
		User getUserById(long id);
		
		// ID로 직원 한 명의 정보를 업데이트한다
		User updateUserById(User user, long id);
		
		// ID로 직원 한 명의 정보를 삭제한다
		void deleteUser(long id);
}
