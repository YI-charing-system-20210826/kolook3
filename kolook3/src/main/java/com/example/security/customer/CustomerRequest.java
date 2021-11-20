package com.example.security.customer;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CustomerRequest implements Serializable {

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
	
	public Object getLast_name() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public Object getFirst_name() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public Object getLast_name_Kana() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public Object getFirst_name_Kana() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public Object getGender() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public Object getBirthday() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public Object getEmail() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public Object getTel_no() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public Object getPost_no() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public Object getAddress() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public Object getKen_code() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public Object getAddress_detail() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public Object getRemarks() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public Object getContract_flg() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
}
