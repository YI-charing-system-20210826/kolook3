package com.example.security.customer;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

@Table(name = "customer")
public class Customer {

	@Column(name = "customer_id")
	@NotNull
	private int customer_id;

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

	@Column(name = "gender")
	@NotNull
	private String gender;

	@Column(name = "birthday")
	@NotNull
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date birthday;

	@Column(name = "tel_no")
	private int tel_no;

	@Column(name = "email")
	private String email;

	@Column(name = "post_no")
	private int post_no;

	@Column(name = "ken_code")
	@NotNull
	private String ken_code;

	@Column(name = "address")
	@NotNull
	private String address;

	@Column(name = "address_detail")
	@NotNull
	private String address_detail;

	@Column(name = "remarks")
	private String remarks;

	@Column(name = "contract_flg")
	private String contract_flg;

	// JPA requirement
	protected Customer() {
	}

	//一覧表示用のコンストラクタ
	public Customer(int customer_id, String last_name, String first_name, String last_name_Kana, String first_name_Kana,
			String gender, Date birthday, int tel_no, String email, int post_no, String ken_code, String address,
			String address_detail, String remarks, String contract_flg) {
		this.customer_id = customer_id;
		this.last_name = last_name;
		this.first_name = first_name;
		this.last_name_Kana = last_name_Kana;
		this.first_name_Kana = first_name_Kana;
		this.gender = gender;
		this.birthday = birthday;
		this.tel_no = tel_no;
		this.email = email;
		this.post_no = post_no;
		this.ken_code = ken_code;
		this.address = address;
		this.address_detail = address_detail;
		this.remarks = remarks;
		this.contract_flg = contract_flg;
	}

}
