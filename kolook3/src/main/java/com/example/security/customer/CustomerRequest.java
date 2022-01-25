package com.example.security.customer;

import java.io.Serializable;
<<<<<<< Updated upstream
import java.sql.Date;
=======
import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
>>>>>>> Stashed changes

import lombok.Data;

@Data
public class CustomerRequest implements Serializable {

	public Long customer_id;

<<<<<<< Updated upstream
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
=======
	@NotEmpty(message = "名前を入力してください")
	@Size(max = 100, message = "名前は100桁以内で入力してください")
	public String last_name;

	public String first_name;

	public String last_name_Kana;

	public String first_name_Kana;

	public String gender;

	public Date birthday;

//	@Pattern(regexp = "0\\d{1,4}-\\d{1,4}-\\d{4}", message = "電話番号の形式で入力してください")
	public String tel_no;

	public String email;

	public int post_no;

	public String ken_code;

	@Size(max = 255, message = "住所は255桁以内で入力してください")
	public String address;

	public String address_detail;

	public String remarks;

	public int contract_flg;
>>>>>>> Stashed changes

	private int contract_flg;

	//		public int getCusotmer_id() {
	//		  return 0;
	//		 }
	public String getLast_name() {
		return last_name;
	}

<<<<<<< Updated upstream
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
=======
	public String getFirst_name() {
		return first_name;
	}

	public String getLast_name_Kana() {
		return last_name_Kana;
	}

	public String getFirst_name_Kana() {
		return first_name_Kana;
	}

	public String getGender() {
		return gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public String getTel_no() {
>>>>>>> Stashed changes
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
