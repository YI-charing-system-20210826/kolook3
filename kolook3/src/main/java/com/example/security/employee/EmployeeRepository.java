package com.example.security.employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    public Employee findByUsername(String username);
    public List<Employee> findAll();
	public static List<Employee> searchAll() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
}