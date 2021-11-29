package com.example.security.employee;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

@Entity
@Data
@Table(name = "employee")
public class Employee {

	@Id
	@Column(name = "member_id")
	@NotNull
	private int member_id;

	@Column(name = "last_name")
	@NotNull
	private String last_name;

	@Column(name = "first_name")
	@NotNull
	private String first_name;

	@Column(name = "last_name_Kana")
	@NotNull
	private String last_name_Kana;

	@Column(name = "first_name_Kana")
	@NotNull
	private String first_name_Kana;

	@Column(name = "emp_status")
	@NotNull
	private String emp_status;

	@Column(name = "section")
	@NotNull
	private String section;

	@Column(name = "position")
	@NotNull
	private String position;

	@Column(name = "tel_no")
	@NotNull
	private int tel_no;

	@Column(name = "email")
	@NotNull
	private String email;

	@Column(name = "post_no")
	@NotNull
	private int post_no;

	@Column(name = "ken_code")
	@NotNull
	private String ken_code;

	@Column(name = "address")
	@NotNull
	private String address;

	@Column(name = "address_detail")
	private String address_detail;

	@Column(name = "birthday")
	@NotNull
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date birthday;

	@Column(name = "gender")
	@NotNull
	private String gender;

	@Column(name = "join_at")
	private int join_at;

	@Column(name = "leave_at")
	private int leave_at;

	@Column(name = "role")
	@NotNull
	private int role;

	@Column(name = "password")
	@NotNull
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

	//JPA requirement
	protected Employee() {
	}

	public Employee(int member_id, String last_name, String first_name, String last_name_Kana, String first_name_Kana,
			String emp_status, String section, String position, int tel_no, String email, int post_no, String ken_code,
			String address, String address_detail, Date birthday, String gender, int join_at, int leave_at, int role,
			String password, String member_img, Date created_at, Date updated_at, Date last_login) {

		this.member_id = member_id;
		this.last_name = last_name;
		this.first_name = first_name;
		this.last_name_Kana = last_name_Kana;
		this.first_name_Kana = first_name_Kana;
		this.emp_status = emp_status;
		this.section = section;
		this.position = position;
		this.tel_no = tel_no;
		this.email = email;
		this.post_no = post_no;
		this.ken_code = ken_code;
		this.address = address;
		this.address_detail = address_detail;
		this.birthday = birthday;
		this.gender = gender;
		this.join_at = join_at;
		this.leave_at = leave_at;
		this.role = role;
		this.password = password;
		this.member_img = member_img;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.last_login = last_login;

	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public int getMember_id() {
		return member_id;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setLast_name_Kana(String last_name_Kana) {
		this.last_name_Kana = last_name_Kana;
	}

	public String getLast_name_Kana() {
		return last_name_Kana;
	}

	public void setFirst_name_Kana(String first_name_Kana) {
		this.first_name_Kana = first_name_Kana;
	}

	public String getFirst_name_Kana() {
		return first_name_Kana;
	}

	public void setEmp_status(String emp_status) {
		this.emp_status = emp_status;
	}

	public String getEmp_status() {
		return emp_status;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getSection() {
		return section;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	public void setTel_no(int tel_no) {
		this.tel_no = tel_no;
	}

	public int getTel_no() {
		return tel_no;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setPost_no(int post_no) {
		this.post_no = post_no;
	}

	public int getPost_no() {
		return post_no;
	}

	public void setKen_code(String ken_code) {
		this.ken_code = ken_code;
	}

	public String getKen_code() {
		return ken_code;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress_detail(String address_detail) {
		this.address_detail = address_detail;
	}

	public String getAddress_detail() {
		return address_detail;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setJoin_at(int join_at) {
		this.join_at = join_at;
	}

	public int getJoin_at() {
		return join_at;
	}

	public void setLeave_at(int leave_at) {
		this.leave_at = leave_at;
	}

	public int getLeave_at() {
		return leave_at;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public int getRole() {
		return role;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}
	
	public void setMember_img(String member_img) {
		this.member_img = member_img;
	}

	public String getMember_img() {
		return member_img;
	}
	
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getCreated_at() {
		return created_at;
	}
	
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}
	
	public void setLast_login(Date last_login) {
		this.last_login = last_login;
	}

	public Date getLast_login() {
		return last_login;
	}
}