package com.example.security.customer;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "customer")
public class Customer implements Serializable {

	@Id
	@Column(name = "customer_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customer_id;

	@Column(name = "last_name")
	private String last_name;

	@Column(name = "first_name")
	private String first_name;

	@Column(name = "last_name_Kana")
	private String last_name_Kana;

	@Column(name = "first_name_Kana")
	private String first_name_Kana;

	@Column(name = "gender")

	private String gender;

	@Column(name = "birthday")

	private String birthday;

	@Column(name = "tel_no")
	private String tel_no;

	@Column(name = "email")
	private String email;

	@Column(name = "post_no")
	private String post_no;

	@Column(name = "ken_code")

	private String ken_code;

	@Column(name = "address")
	private String address;

	@Column(name = "address_detail")
	private String address_detail;

	@Column(name = "remarks")
	private String remarks;

	@Column(name = "contract_flg")
	private int contract_flg;


}