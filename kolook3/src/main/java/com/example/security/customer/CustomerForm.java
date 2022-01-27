package com.example.security.customer;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.example.security.employee.Data;

@Data
public class CustomerForm {

	public int customer_id;

	@NotBlank
	@Size(min = 1, max = 20)
	public String last_name;

	public String first_name;

	public String last_name_Kana;

	public String first_name_Kana;

	public int tel_no;

	@Size(max = 100)
	public String email;

	public String post_no;

	public String ken_code;

	public String address;

	public String address_detail;

	public String birthday;

	public String gender;

	public String remarks;

	public int contract_flg;

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name_Kana() {
		return last_name_Kana;
	}

	public void setLast_name_Kana(String last_name_Kana) {
		this.last_name_Kana = last_name_Kana;
	}

	public String getFirst_name_Kana() {
		return first_name_Kana;
	}

	public void setFirst_name_Kana(String first_name_Kana) {
		this.first_name_Kana = first_name_Kana;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getTel_no() {
		return tel_no;
	}

	public void setTel_no(int tel_no) {
		this.tel_no = tel_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPost_no() {
		return post_no;
	}

	public void setPost_no(String post_no) {
		this.post_no = post_no;
	}

	public String getKen_code() {
		return ken_code;
	}

	public void setKen_code(String ken_code) {
		this.ken_code = ken_code;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress_detail() {
		return address_detail;
	}

	public void setAddress_detail(String address_detail) {
		this.address_detail = address_detail;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getContract_flg() {
		return contract_flg;
	}

	public void setContract_flg(int contract_flg) {
		this.contract_flg = contract_flg;
	}

}
