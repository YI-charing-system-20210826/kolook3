package com.example.security.customer;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class CustomerUpdateRequest extends CustomerRequest implements Serializable {

	@NotNull
	private Long id;

	public static Long customer_id;

	public static String last_name;

	public static String first_name;

	public static String last_name_Kana;

	public static String first_name_Kana;

	public static String gender;

	public static Date birthday;

	public static String tel_no;

	public static String email;

	public static int post_no;

	public static String ken_code;

	public static String address;

	public static String address_detail;

	public static String remarks;

	public static int contract_flg;

	public String getLast_name() {
		return last_name;
	}

	@SuppressWarnings("static-access")
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	@SuppressWarnings("static-access")
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name_Kana() {
		return last_name_Kana;
	}

	@SuppressWarnings("static-access")
	public void setLast_name_Kana(String last_name_Kana) {
		this.last_name_Kana = last_name_Kana;
	}

	public String getFirst_name_Kana() {
		return first_name_Kana;
	}

	@SuppressWarnings("static-access")
	public void setFirst_name_Kana(String first_name_Kana) {
		this.first_name_Kana = first_name_Kana;
	}

	public Long getCustomer_id() {
		return customer_id;
	}

	@SuppressWarnings("static-access")
	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}

	public String getTel_no() {
		return tel_no;
	}

	@SuppressWarnings("static-access")
	public void setTel_no(String tel_no) {
		this.tel_no = tel_no;
	}

	public String getEmail() {
		return email;
	}

	@SuppressWarnings("static-access")
	public void setEmail(String email) {
		this.email = email;
	}

	public int getPost_no() {
		return post_no;
	}

	@SuppressWarnings("static-access")
	public void setPost_no(int post_no) {
		this.post_no = post_no;
	}

	public String getKen_code() {
		return ken_code;
	}

	@SuppressWarnings("static-access")
	public void setKen_code(String ken_code) {
		this.ken_code = ken_code;
	}

	public String getAddress() {
		return address;
	}

	@SuppressWarnings("static-access")
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress_detail() {
		return address_detail;
	}

	@SuppressWarnings("static-access")
	public void setAddress_detail(String address_detail) {
		this.address_detail = address_detail;
	}

	public Date getBirthday() {
		return birthday;
	}

	@SuppressWarnings("static-access")
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	@SuppressWarnings("static-access")
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRemarks() {
		return remarks;
	}

	@SuppressWarnings("static-access")
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getContract_flg() {
		return contract_flg;
	}

	@SuppressWarnings("static-access")
	public void setContract_flg(int contract_flg) {
		this.contract_flg = contract_flg;
	}

}
