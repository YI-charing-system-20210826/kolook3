package com.example.security.customer;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

import lombok.Data;

@Data
public class CustomerRequest implements Serializable {

//	@NotEmpty(message = "名前を入力してください")
//	@Size(max = 100, message = "名前は100桁以内で入力してください")
//	private String name;
//	/**
//	 * 住所
//	 */
//	@Size(max = 255, message = "住所は255桁以内で入力してください")
//	private String address;
//	/**
//	 * 電話番号
//	 */
//	@Pattern(regexp = "0\\d{1,4}-\\d{1,4}-\\d{4}", message = "電話番号の形式で入力してください")
//	private String phone;

	 @Column(name = "customer_id")
	 private int customer_id;

	 @Column(name = "last_name")

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
	 private int contract_flg;


//		public int getCusotmer_id() {
//		  return 0;
//		 }
//		 public String getLast_name() {
//		  return null;
//		 }
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
//		 public int getTel_no() {
//		  return 0;
//		 }
//		 public String getEmail() {
//		  return null;
//		 }
//		 public int getPost_no() {
//		  return 0;
//		 }
//		 public String getKen_code() {
//		  return null;
//		 }
//		 public String getAddress() {
//		  return null;
//		 }
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
