package com.JH.assignment.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JH.assignment.user.model.User;

@RestController
public class UserController {

	// http://localhost:8080/user
	@GetMapping("/user/mike")
	public User getUser() {
		return new User("mike");
	}
	

}

//@RestController
//public class StudentController {
//	
//	// http://localhost:8080/student
//	@GetMapping("/student")
//	public Student getStudent() {
//		return new Student("Tom", "Smith");
//	}
//	
//	// http://localhost:8080/students
//	@GetMapping("/students")
//	public List<Student> getStudents() {
//		List<Student> students = new ArrayList<>();
//		students.add(new Student("Tom", "Smith"));
//		students.add(new Student("John", "Long"));
//		students.add(new Student("Steve", "White"));
//		students.add(new Student("Leon", "Red"));
//		students.add(new Student("Mike", "Tyson"));
//		return students;
//	}
//	
//	// http://localhost:8080/student/{firstName}/{lastName}
//	@GetMapping("/student/{firstName}/{lastName}")
//	public Student studentPathVariable(@PathVariable String firstName, @PathVariable String lastName) {
//	return new Student(firstName, lastName);
//	}
//	
//	// http://localhost:8080/student/query	
//	@GetMapping("/student/query")
//	public Student studentQueryParam(
//			@RequestParam(name = "firstName") String firstName,
//			@RequestParam(name = "lastName") String lastName
//			) {
//		return new Student(firstName, lastName);
//	}