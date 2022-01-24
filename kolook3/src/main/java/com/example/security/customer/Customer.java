package com.example.security.customer;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

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
	@NotNull
	private String gender;

	@Column(name = "birthday")
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
	private String address;

	@Column(name = "address_detail")
	private String address_detail;

	@Column(name = "remarks")
	private String remarks;

	@Column(name = "contract_flg")
	private int contract_flg;

	// // JPA requirement
	// protected Customer() {
	// }

	//一覧表示用のコンストラクタ
	//  public Customer(int customer_id, String last_name, String first_name, String last_name_Kana, String first_name_Kana,
	//    String gender, Date birthday, int tel_no, String email, int post_no, String ken_code, String address,
	//    String address_detail, String remarks, int contract_flg) {
	//   this.customer_id = customer_id;
	//   this.last_name = last_name;
	//   this.first_name = first_name;
	//   this.last_name_Kana = last_name_Kana;
	//   this.first_name_Kana = first_name_Kana;
	//   this.gender = gender;
	//   this.birthday = birthday;
	//   this.tel_no = tel_no;
	//   this.email = email;
	//   this.post_no = post_no;
	//   this.ken_code = ken_code;
	//   this.address = address;
	//   this.address_detail = address_detail;
	//   this.remarks = remarks;
	//   this.contract_flg = contract_flg;
	//  }
	//
	//  public void setCustomer_id(int customer_id) {
	//   this.customer_id = customer_id;
	//  }
	//  public int getCustomer_id() {
	//  return customer_id;
	//  }
	//  public void setLast_name(String last_name) {
	//   this.last_name = last_name;
	//  }
	//  public String getLast_name() {
	//  return last_name;
	//  }
	//  public void setFirst_name(String first_name) {
	//   this.first_name = first_name;
	//  }
	//  public String getFirst_name() {
	//  return first_name;
	//  }
	//
	//  public void setLast_name_Kana(String last_name_Kana) {
	//   this.last_name_Kana = last_name_Kana;
	//  }
	//  public String getLast_name_Kana() {
	//  return last_name_Kana;
	//  }
	//
	//  public void setFirst_name_Kana(String first_name_Kana) {
	//   this.first_name_Kana = first_name_Kana;
	//  }
	//  public String getFirst_name_Kana() {
	//  return first_name_Kana;
	//  }
	//
	//  public void setGender(String gender) {
	//   this.gender = gender;
	//  }
	//  public String getGender() {
	//  return gender;
	//  }
	//
	//  public void setBirthday(Date birthday) {
	//   this.birthday = birthday;
	//  }
	//  public Date getBirthday() {
	//  return birthday;
	//  }
	//
	//  public void setTel_no(int tel_no) {
	//   this.tel_no = tel_no;
	//  }
	//  public int getTel_no() {
	//  return tel_no;
	//  }
	//
	//  public void setEmail(String email) {
	//   this.email = email;
	//  }
	//  public String getEmail() {
	//  return email;
	//  }
	//
	//  public void setPost_no(int post_no) {
	//   this.post_no = post_no;
	//  }
	//  public int getPost_no() {
	//  return post_no;
	//  }
	//
	//  public void setKen_code(String ken_code) {
	//   this.ken_code = ken_code;
	//  }
	//  public String getKen_code() {
	//  return ken_code;
	//  }
	//
	//  public void setAddress(String address) {
	//   this.address = address;
	//  }
	//  public String getAddress() {
	//  return address;
	//  }
	//
	//  public void setAddress_detail(String address_detail) {
	//   this.address_detail = address_detail;
	//  }
	//
	//  public String getAddress_detail() {
	//  return address_detail;
	//  }
	//  public void setRemarks(String remarks) {
	//  this.remarks = remarks;
	//   }
	//
	//  public String getRemarks() {
	//  return remarks;
	//   }
	//
	//  public void setContract_flg(int contract_flg) {
	//  this.contract_flg = contract_flg;
	//  }
	//  public int getContract_flg() {
	//  return contract_flg;
	//  }
}