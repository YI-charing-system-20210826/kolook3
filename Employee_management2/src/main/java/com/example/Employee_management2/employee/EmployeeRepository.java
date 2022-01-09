package com.example.Employee_management2.employee;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Employee_management2.employee.domain.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{
    public Employee findByUsername(String username);
    public List<Employee> findAll();

}