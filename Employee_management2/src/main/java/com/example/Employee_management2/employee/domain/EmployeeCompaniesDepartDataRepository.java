package com.example.Employee_management2.employee.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Employee_management2.employee.domain.model.EmployeeCompaniesDepartData;

	@Repository
public interface EmployeeCompaniesDepartDataRepository extends CrudRepository<EmployeeCompaniesDepartData, Long>{
}
