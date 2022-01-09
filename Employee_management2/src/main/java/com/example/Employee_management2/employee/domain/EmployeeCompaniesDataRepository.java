package com.example.Employee_management2.employee.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Employee_management2.employee.domain.model.EmployeeCompaniesData;

@Repository
public interface EmployeeCompaniesDataRepository extends CrudRepository<EmployeeCompaniesData, Long>{
}
