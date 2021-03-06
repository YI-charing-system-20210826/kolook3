package com.example.security.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeSelectService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> searchAll() {
		return employeeRepository.findAll();
	}
}