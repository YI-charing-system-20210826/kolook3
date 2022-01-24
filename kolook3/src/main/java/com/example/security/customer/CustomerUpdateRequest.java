package com.example.security.customer;

import java.io.Serializable;
import java.sql.Date;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class CustomerUpdateRequest extends CustomerRequest implements Serializable {

	@NotNull
	private Long id;

	public static Long customer_id;

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

	private int contract_flg;

	public static void setLast_name(String last_name) {
		// TODO 自動生成されたメソッド・スタブ

	}

	public static void setCustomer_id(Long customer_id) {
		// TODO 自動生成されたメソッド・スタブ

	}

	public static void setTel_no(int tel_no) {
		// TODO 自動生成されたメソッド・スタブ

	}

	public static void setAddress(String address) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
