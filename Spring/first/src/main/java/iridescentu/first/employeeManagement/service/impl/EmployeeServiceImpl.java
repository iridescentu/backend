package iridescentu.first.employeeManagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iridescentu.first.employeeManagement.model.Employee;
import iridescentu.first.employeeManagement.repository.EmployeeRepository;
import iridescentu.first.employeeManagement.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	// 직원 정보를 새로 생성한다
	@Override
	public Employee saveEmployee(Employee employee) {
		System.out.println(employee.getFirstName());
		return employeeRepository.save(employee);
	}
		
	// 전체 직원 정보를 조회한다
	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	// ID로 직원 한 명의 정보를 조회한다
	@Override
	public Employee getEmployeeById(long id) {
		Optional<Employee> employee = employeeRepository.findById(id);
		if (employee.isPresent()) {
			return employee.get();
		} else {
			return null;
		}
	}
		
	// ID로 직원 한 명의 정보를 업데이트한다
	@Override
	public Employee updateEmployeeById(Employee employee, long id) {
		return null;
	}
		
	// ID로 직원 한 명의 정보를 삭제한다
	@Override
	public void deleteEmployee(long id) {
		
	}
}
