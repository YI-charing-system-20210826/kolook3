package com.example.Employee_management2.employee.domain.model;

import java.util.Date;

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
@Table(name="employee_companies_depart_data")
public class EmployeeCompaniesDepartData {
	@Id
	@Column(name="company_depart_code")
	@NotBlank
	private String companyDepartCode; //稼働先企業コード
	
	@Column(name="company_depart_name")
	@NotBlank
	private String companyDepartName; //稼働先企業名
	
	@Column(name = "created_at")
	private Date createdAt; //登録日時
	
	@Column(name="updated_at")
	private Date updatedAt;  //更新日時
}
