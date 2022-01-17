package com.example.security.customer;

import java.io.Serializable;
import java.sql.Date;

import lombok.Data;

@Data
public class CustomerRequest implements Serializable {

	public static Long customer_id;

	public static String last_name;

	private String first_name;

	private String last_name_Kana;

	private String first_name_Kana;

	private String gender;

	private Date birthday;

	public static int tel_no;

	private String email;

	private int post_no;

	private String ken_code;

	public static String address;

	private String address_detail;

	private String remarks;

	private int contract_flg;

	//		public int getCusotmer_id() {
	//		  return 0;
	//		 }
	public String getLast_name() {
		return last_name;
	}

	//		 public String getFirst_name() {
	//		  return null;
	//		 }
	//		 public String getLast_name_Kana() {
	//		  return null;
	//		 }
	//		 public String getFirst_name_Kana() {
	//		  return null;
	//		 }
	//		 public String getGender() {
	//		  return null;
	//		 }
	//		 public Date getBirthday() {
	//		  return null;
	//		 }
	public int getTel_no() {
		return tel_no;
	}

	//		 public String getEmail() {
	//		  return null;
	//		 }
	//		 public int getPost_no() {
	//		  return 0;
	//		 }
	//		 public String getKen_code() {
	//		  return null;
	//		 }
	public String getAddress() {
		return address;
	}

	public Long getCustomer_id() {
		// TODO 自動生成されたメソッド・スタブ
		return customer_id;
	}
	//		 public String getAddress_detail() {
	//		  return null;
	//		 }
	//		 public String getRemarks() {
	//		  return null;
	//		 }
	//		 public int getContract_flg() {
	//		  return 0;
	//		 }
}
