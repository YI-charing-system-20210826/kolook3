package com.example.security.employee;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class EmployeeRequest implements Serializable {

	public static Long member_id;

//	@NotEmpty(message = "名前を入力してください")
//	@Size(max = 100, message = "名前は100桁以内で入力してください")
	public  String last_name;

	public String first_name;

	public String last_name_Kana;

	public String first_name_Kana;

	public String emp_status;

	public String section;

	public String position;

	@Pattern(regexp = "0\\d{1,4}-\\d{1,4}-\\d{4}", message = "電話番号の形式で入力してください")
	public String tel_no;

	public String email;

	public String post_no;

	public String ken_code;

	@Size(max = 255, message = "住所は255桁以内で入力してください")
	public String address;

	public String address_detail;

	public String birthday;

	public String gender;

	public int join_at;

	public int leave_at;

	public int role;

	public String password;

	public String member_img;

	public Date created_at;

	public Date updated_at;

	public Date last_login;

	public Long getMember_id() {
		return member_id;
	}

	public String getLast_name() {
		return last_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getLast_name_Kana() {
		return last_name_Kana;
	}

	public String getFirst_name_Kana() {
		return first_name_Kana;
	}

	public String getTel_no() {
		return tel_no;
	}

	public String getAddress() {
		return address;
	}
}
