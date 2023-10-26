package iridescentu.first.employeeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import iridescentu.first.employeeManagement.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	

}
