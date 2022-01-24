package com.example.security.employee;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class EmployeeRequest implements Serializable {

	public static Long member_id;

	public static String last_name;

	private String first_name;

	private String last_name_Kana;

	private String first_name_Kana;

	private String emp_status;

	private String section;

	private String position;

	public static int tel_no;

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

	public Long getMember_id() {
		return member_id;
	}

	public String getLast_name() {
		return last_name;
	}

	/*public String getFirst_name() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	
	public String getLast_name_Kana() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	
	public String getFirst_name_Kana() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	
	public String getEmp_status() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	
	public String getSection() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	
	public String getPosition() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}*/

	public int getTel_no() {
		return tel_no;
	}

	/*public String getEmail() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	
	public int getPost_no() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}
	
	public String getKen_code() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}*/

	public String getAddress() {
		return address;
	}
	
	/*public Object getFirst_name() {
		// TODO 自動生成されたメソッド・スタブ
		return first_name;
	}
	
	public Object getLast_name_Kana() {
		// TODO 自動生成されたメソッド・スタブ
		return last_name_Kana;
	}
	
	public Object getFirst_name_Kana() {
		// TODO 自動生成されたメソッド・スタブ
		return first_name_Kana;
	}
	
	public Object getEmp_status() {
		// TODO 自動生成されたメソッド・スタブ
		return emp_status;
	}
	
	public Object getSection() {
		// TODO 自動生成されたメソッド・スタブ
		return section;
	}
	
	public Object getPosition() {
		// TODO 自動生成されたメソッド・スタブ
		return position;
	}
	
	public Object getEmail() {
		// TODO 自動生成されたメソッド・スタブ
		return email;
	}
	
	public Object getPost_no() {
		// TODO 自動生成されたメソッド・スタブ
		return post_no;
	}
	
	public Object getKen_code() {
		// TODO 自動生成されたメソッド・スタブ
		return ken_code;
	}
	
	public Object getAddress_detail() {
		// TODO 自動生成されたメソッド・スタブ
		return address_detail;
	}
	
	public Object getBirthday() {
		// TODO 自動生成されたメソッド・スタブ
		return birthday;
	}
	
	public Object getGender() {
		// TODO 自動生成されたメソッド・スタブ
		return gender;
	}
	
	public Object getJoin_at() {
		// TODO 自動生成されたメソッド・スタブ
		return join_at;
	}
	
	public Object getLeave_at() {
		// TODO 自動生成されたメソッド・スタブ
		return leave_at;
	}
	
	public Object getRole() {
		// TODO 自動生成されたメソッド・スタブ
		return role;
	}
	
	public Object getPassword() {
		// TODO 自動生成されたメソッド・スタブ
		return password;
	}
	
	public Object getMember_img() {
		// TODO 自動生成されたメソッド・スタブ
		return member_img;
	}
	
	public Object getCreated_at() {
		// TODO 自動生成されたメソッド・スタブ
		return created_at;
	}
	
	public Object getUpdated_at() {
		// TODO 自動生成されたメソッド・スタブ
		return updated_at;
	}
	
	public Object getLast_login() {
		// TODO 自動生成されたメソッド・スタブ
		return last_login;
	}*/

	/*public String getAddress_detail() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	
	public Date getBirthday() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	
	public String getGender() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	
	public int getJoin_at() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}
	
	public int getLeave_at() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}
	
	public int getRole() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}
	
	public String getPassword() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	
	public String getMember_img() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	
	public Date getCreated_at() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	
	public Date getUpdated_at() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	
	public Date getLast_login() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}*/

	/*public Object getRemarks() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	
	public String getContract_flg() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	*/}
