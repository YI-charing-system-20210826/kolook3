package com.example.Employee_management2.employee.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Employee_management2.employee.domain.model.EmployeeLanguageData;

@Repository
public interface EmployeeLanguageDataRepository extends CrudRepository<EmployeeLanguageData, Long>{
}
