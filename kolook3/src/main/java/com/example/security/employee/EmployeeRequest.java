package com.example.security.employee;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class EmployeeRequest implements Serializable {

	@NotEmpty(message = "名前を入力してください")
	@Size(max = 100, message = "名前は100桁以内で入力してください")
	private String name;
	/**
	 * 住所
	 */
	@Size(max = 255, message = "住所は255桁以内で入力してください")
	private String address;
	/**
	 * 電話番号
	 */
	@Pattern(regexp = "0\\d{1,4}-\\d{1,4}-\\d{4}", message = "電話番号の形式で入力してください")
	private String phone;

	public String getLast_name() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public String getFirst_name() {
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

	public String getGender() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public Date getBirthday() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public String getEmail() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public int getTel_no() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	public int getPost_no() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	public String getAddress() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public String getKen_code() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public String getAddress_detail() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public Object getRemarks() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public String getContract_flg() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public int getMember_id() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}
}
