package com.example.security.customer;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class CustomerRequest implements Serializable {

	public static Long customer_id;

	@NotEmpty(message = "名前を入力してください")
	@Size(max = 100, message = "名前は100桁以内で入力してください")
	public String last_name;

	public String first_name;

	public String last_name_Kana;

	public String first_name_Kana;

	public String gender;

	public String birthday;

	@Pattern(regexp = "0\\d{1,4}-\\d{1,4}-\\d{4}", message = "電話番号の形式で入力してください")
	public String tel_no;

	public String email;

	public String post_no;

	public String ken_code;

	@Size(max = 255, message = "住所は255桁以内で入力してください")
	public String address;

	public String address_detail;

	public String remarks;

	public  int contract_flg;

	public Long getCusotmer_id() {
		return customer_id;
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

	public String getGender() {
		return gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public String getTel_no() {
		return tel_no;
	}

	public String getEmail() {
		return email;
	}

	public String getPost_no() {
		return post_no;
	}

	public String getKen_code() {
		return ken_code;
	}

	public String getAddress() {
		return address;
	}

	public String getAddress_detail() {
		return address_detail;
	}

	public String getRemarks() {
		return remarks;
	}

	public int getContract_flg() {
		return contract_flg;
	}

	public Long getCustomer_id() {
		// TODO 自動生成されたメソッド・スタブ
		return customer_id;
	}
}
