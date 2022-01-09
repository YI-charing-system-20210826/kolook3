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
@Table(name="employee_type_code")
public class EmployeeTypeCode {
	@Id
	@Column(name="employee_type_code")
	@NotBlank
	private String companyDepartCode; //稼働ジャンルコード
	
	@Column(name="employee_name")
	@NotBlank
	private String companyDepartName; //稼働ジャンル
}
