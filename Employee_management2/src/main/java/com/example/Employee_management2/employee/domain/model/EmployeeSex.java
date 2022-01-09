package com.example.Employee_management2.employee.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employee_sex")
public class EmployeeSex {
	@Id
	@Column(name="sex")
	@NotBlank
	private int companyCode; //企業コード
	
	@Column(name="sex_name")
	@NotBlank
	private String companyName; //企業名
}
