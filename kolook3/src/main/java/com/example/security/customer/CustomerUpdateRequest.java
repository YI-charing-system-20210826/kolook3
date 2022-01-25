package com.example.security.customer;

import java.io.Serializable;
import java.sql.Date;

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

	private String first_name;

	private String last_name_Kana;

	private String first_name_Kana;

	private String gender;

	private Date birthday;

	public static String tel_no;

	private String email;

	private int post_no;

	private String ken_code;

	public static String address;

	private String address_detail;

	private String remarks;

	private int contract_flg;

<<<<<<< Updated upstream
	public static void setLast_name(String last_name) {
		// TODO 自動生成されたメソッド・スタブ

=======
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
>>>>>>> Stashed changes
	}

	public static void setCustomer_id(Long customer_id) {
		// TODO 自動生成されたメソッド・スタブ

	}

	public static void setTel_no(int tel_no) {
		// TODO 自動生成されたメソッド・スタブ

	}

<<<<<<< Updated upstream
	public static void setAddress(String address) {
		// TODO 自動生成されたメソッド・スタブ
=======
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
>>>>>>> Stashed changes

	}

}
