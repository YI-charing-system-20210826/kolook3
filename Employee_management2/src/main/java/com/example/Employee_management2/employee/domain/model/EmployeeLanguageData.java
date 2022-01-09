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
@Table(name="employee_language_data")
public class EmployeeLanguageData {
	
	@Id
	@Column(name="language_code")
	@NotBlank
	private String languageCode; //言語コード
	
	@Column(name="language")
	@NotBlank
	private String language; //言語名
	
	@Column(name = "created_at")
	private Date createdAt; //登録日時
	
	@Column(name="updated_at")
	private Date updatedAt;  //更新日時
}
