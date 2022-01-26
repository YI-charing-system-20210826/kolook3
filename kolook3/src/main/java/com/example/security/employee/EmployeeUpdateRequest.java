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

 private String first_name;

 private String last_name_Kana;

 private String first_name_Kana;

 private String emp_status;

 private String section;

 private String position;

 public static String tel_no;

 private String email;

 private int post_no;

 private String ken_code;

 public static String address;

 private String address_detail;

 private Date birthday;

 private String gender;

 private int join_at;

 private int leave_at;

 private int role;

 private String password;

 private String member_img;

 private Date created_at;

 private Date updated_at;

 private Date last_login;

 public static void setLast_name(String last_name) {
  // TODO 自動生成されたメソッド・スタブ

 }

 public static void setMember_id(Long member_id) {
  // TODO 自動生成されたメソッド・スタブ

 }

 public static void setTel_no(int tel_no) {
  // TODO 自動生成されたメソッド・スタブ

 }

 public static void setAddress(String address) {
  // TODO 自動生成されたメソッド・スタブ

<<<<<<< Updated upstream
 }

 /*public Long getId() {
  // TODO 自動生成されたメソッド・スタブ
  return null;
=======
 public String getTel_no() {
  return tel_no;
 }

 @SuppressWarnings("static-access")
 public void setTel_no(String tel_no) {
  this.tel_no = tel_no;
>>>>>>> Stashed changes
 }
 */
}