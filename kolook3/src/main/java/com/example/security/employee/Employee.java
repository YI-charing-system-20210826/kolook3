package com.example.security.employee;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Data
@Table(name = "employee")
public class Employee implements Serializable {

	@Id
	@Column(name = "member_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long member_id;

	@Column(name = "last_name")
	private String last_name;

	@Column(name = "first_name")
	private String first_name;

	@Column(name = "last_name_Kana")
	private String last_name_Kana;

	@Column(name = "first_name_Kana")
	private String first_name_Kana;

	@Column(name = "emp_status")
	private String emp_status;

	@Column(name = "section")
	private String section;

	@Column(name = "position")
	private String position;

	@Column(name = "tel_no")
	private int tel_no;

	@Column(name = "email")
	private String email;

	@Column(name = "post_no")
	private int post_no;

	@Column(name = "ken_code")
	private String ken_code;

	@Column(name = "address")
	private String address;

	@Column(name = "address_detail")
	private String address_detail;

	@Column(name = "birthday")
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date birthday;

	@Column(name = "gender")
	private String gender;

	@Column(name = "join_at")
	private int join_at;

	@Column(name = "leave_at")
	private int leave_at;

	@Column(name = "role")
	private int role;

	@Column(name = "password")
	private String password;

	@Column(name = "member_img")
	private String member_img;

	@Column(name = "created_at")
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date created_at;

	@Column(name = "updated_at")
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date updated_at;

	@Column(name = "last_login")
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date last_login;

	
}