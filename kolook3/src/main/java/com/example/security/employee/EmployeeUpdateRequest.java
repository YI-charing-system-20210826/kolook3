package com.example.security.employee;

import java.io.Serializable;
import java.sql.Date;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class EmployeeUpdateRequest extends EmployeeRequest implements Serializable {

 @NotNull
 private Long id;

 public static Long member_id;

 public static String last_name;

 public static String first_name;

 public static String last_name_Kana;

 public static String first_name_Kana;

 public static String emp_status;

 public static String section;

 public static String position;

 public static int tel_no;

 public static String email;

 public static int post_no;

 public static String ken_code;

 public static String address;

 public static String address_detail;

 public static Date birthday;

 public static String gender;

 public static int join_at;

 public static int leave_at;

 public static int role;

 public static String password;

 public static String member_img;

 public static Date created_at;

 public static Date updated_at;

 public static Date last_login;

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

 public Long getMember_id() {
  return member_id;
 }

 @SuppressWarnings("static-access")
 public void setMember_id(Long member_id) {
  this.member_id = member_id;
 }

 public int getTel_no() {
  return tel_no;
 }

 @SuppressWarnings("static-access")
 public void setTel_no(int tel_no) {
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

 public int getJoin_at() {
  return join_at;
 }

 @SuppressWarnings("static-access")
 public void setJoin_at(int join_at) {
  this.join_at = join_at;
 }

 public int getLeave_at() {
  return leave_at;
 }

 @SuppressWarnings("static-access")
 public void setLeave_at(int leave_at) {
  this.leave_at = leave_at;
 }


 public int getRole() {
  return role;
 }

 @SuppressWarnings("static-access")
 public void setRole(int role) {
  this.role = role;
 }

 public String getPassword() {
        return password;
 }

 @SuppressWarnings("static-access")
 public void setPassword(String password) {
  this.password = password;
 }

 public String getMember_img() {
        return member_img;
 }

 @SuppressWarnings("static-access")
 public void setMember_img(String member_img) {
  this.member_img = member_img;
 }

 public Date getCreated_at() {
        return created_at;
 }

 @SuppressWarnings("static-access")
 public void setCreated_at(Date created_at) {
  this.created_at = created_at;
 }

 public Date getUpdated_at() {
        return updated_at;
 }

 @SuppressWarnings("static-access")
 public void setUpdated_at(Date updated_at) {
  this.updated_at = updated_at;
 }

 public Date getLast_login() {
        return last_login;
 }

 @SuppressWarnings("static-access")
 public void setLast_login(Date last_login) {
  this.last_login = last_login;
 }


}