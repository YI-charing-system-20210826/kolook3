package com.example.Employee_management2.employee.domain.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employee_users_data")
public class Employee implements UserDetails {

	private static final long serialVersionUID = 1L;

	/**
	 * エンティティ
	 * @author 増田
	 */

	@Column(name="employee_id")
	@NotNull
	private int employeeId; //従業員ID

	// 各カラムをフェールド変数に設定
	@Id
	@Column(name="username")
	@Pattern(regexp="^[a-zA-Z0-9]+$")
	private String username;  //ログインで使用

	//パスワード
	@Column(name="password")
	private String password;

	@Column(name="company_code")
	@NotBlank
	@Length(max=5)
	@Pattern(regexp="^[0-9]+$")
	private String companyCode;  //企業コード

	@Column(name="company_depart_code")
	@NotBlank
	@Length(max=5)
	@Pattern(regexp="^[0-9]+$")
	private String companyDepartCode;  //稼働先企業コード

	//管理者権限用のenum
	public enum Authority {ROLE_USER, ROLE_MANAGER, ROLE_ADMIN}

	// roleは複数管理できるように、Set<>で定義。
	@ElementCollection(fetch = FetchType.EAGER)
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Set<Authority> authorities;

	@Column(name="employee_name")
	@Length(min=1, max=25)
	@NotBlank
	private String employeeName;  //名前

	@Column(name="enabled")  //demo引用
	private boolean enabled;

	@Column(name="sex")
	@NotNull
	private int sex;  //性別

	@Column(name="birthday")
	@NotNull
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date birthday;  //誕生日

	@Column(name="age")
	@NotNull
	@Min(14)
	@Max(100)
	private int age; //年齢

	@Column(name="zip_code")
	@NotBlank
	@Length(max=8)
	@Pattern(regexp="^^[0-9]{3}-[0-9]{4}$")
	private String zipCode;  //郵便番号

	@Column(name="address1")
	@NotBlank
	private String address1;  //都道府県

	@Column(name="address2")
	@NotBlank
	private String address2;  //市区町村

	@Column(name="address3")
	@NotBlank
	private String address3;  //町域名

	@Column(name="block_name")
	@NotBlank
	private String blockName;  //丁目以降

	@Column(name="phone_number")
	@NotBlank
	@Length(max=11)
	@Pattern(regexp="^[0-9]+$")
	private String phoneNumber;  //電話番号

	@Column(name="email")
	@NotBlank
	@Email
	private String email;  //メールアドレス

	@Column(name="employee_type")
	@NotNull
	private int employeeType;  //雇用形態

	@Column(name="employee_type_code")
	private String employeeTypeCode;  //稼働内容ジャンル

	@Column(name="java")
	private int java;  //java

	@Column(name="php")
	private int php;  //PHP

	@Column(name="javascript")
	private int javaScript;  //JavaScript

	@Column(name="mysql")
	private int mysql; // SQL

	@Column(name="system_engeneer")
	private int systemEngeneer;  //SE

	@Column(name="python")
	private int python;  //PYTHON

	@Column(name="android")
	private int android;  //android

	@Column(name="design")
	private int design; // デザイン

	@Column(name="entered_at")
	@NotNull
	private Date enterementAt;  //入社年月日

	@Column(name="retirement_at")
	private Date retirementAt;  //退社年月日

	@Column(name="company_depart_entered_at")
	@NotNull
	private Date companyDepartEnteredAt;  //稼働開始日

	@Column(name="company_depart_retirement_at")
	private Date companyDepartRetirementAt;  //稼働終了予定日

	@Column(name="created_at")
	private Date createdAt;  //登録日時

	@Column(name="updated_at")
	private Date updateAt;  //更新日時

	@Column(name="login_time")
	private Date loginTime;  //ログイン時間

	@Column(name="time_out_time")
	private Date timeOutTime;  //タイムアウト時間

	@Column(name="deleted_at")
	private Date deletedAt;  //論理削除フラグ

	@Column(name="memo")
	private String memo;  //メモ

	@Column(name="user_img")
	private String userImg;  //アイコン写真

	@Column(name= "exist")
	@NotNull
	private int exist;  //Eメールユニーク解除フラグ

	@Column(name="email_flg")
	@NotNull
	private int emailFlg;  //Eメール配信フラグ

	@Column(name="logout_time")
	private Date logoutTime;  //ログアウト時間

	/**
	 * 一覧表示するために使用するコンストラクタ
	 * @author 畑中 悠希
	 * @param employeeId
	 * @param username
	 */
	public Employee(int employeeId,String username) {
		this.employeeId = employeeId;
		this.username = username;
	}

	/**
	 * 一覧表示するために使用するコンストラクタver3
	 * @author 畑中 悠希
	 * @param employeeId
	 * @param name
	 * @param companyCode
	 * @param companyDepartCode
	 */
	public Employee(int employeeId,String username,String companyCode,String companyDepartCode) {
		this.employeeId = employeeId;
		this.username = username;
		this.companyCode = companyCode;
		this.companyDepartCode = companyDepartCode;
	}

/**
 * setEmployee, setManager, setRegisterManager? の作成
 * タスク：畑中さん 完了 権限登録可能
 * @author 畑中悠希
 * @param username @password
 */
	public Employee(String username, String password) {
		this.username = username;
		this.password = password;
		this.enabled = true;
		this.authorities = EnumSet.of(Authority.ROLE_USER);
	}
	public void setUser() {
		this.authorities = EnumSet.of(Authority.ROLE_USER);
		System.out.println("authorities:"+ this.authorities);
	}
	
	//manager権限
	public void setManager(boolean isManager) {
		if (isManager) {
			this.authorities.add(Authority.ROLE_MANAGER);
		} else {
			this.authorities.remove(Authority.ROLE_MANAGER);
			this.authorities.remove(Authority.ROLE_ADMIN);
		}
	}

	//admin権限
	public void setAdmin(boolean isAdmin) {
		if (isAdmin) {
			this.authorities.add(Authority.ROLE_MANAGER);
			this.authorities.add(Authority.ROLE_ADMIN);
		} else {
			this.authorities.remove(Authority.ROLE_ADMIN);
		}
	}
	public void setUser(boolean isUser) {
		if(isUser) {
			this.authorities.add(Authority.ROLE_USER);
		} else {
			this.authorities.remove(Authority.ROLE_MANAGER);
			this.authorities.remove(Authority.ROLE_ADMIN);
		}
	}

	//管理者権限を保有してるか確認するためのメソッド
	public boolean isManager() {
		return this.authorities.contains(Authority.ROLE_MANAGER);
	}
	//admin権限を保有してるか確認するためのメソッド
	public boolean isAdmin() {
		return this.authorities.contains(Authority.ROLE_ADMIN);
	}
	public boolean isUser() {
		return this.authorities.contains(Authority.ROLE_USER);
	}

	public Employee findByUsername(String username) {

		return this;
	}

	//権限を取得するためのメソッド
	//登録のときにエラー吐いている
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		System.out.println("getAuthorities起動");
		List<GrantedAuthority> authorities = new ArrayList<>();
		for (Authority authority : this.authorities) {
			System.out.println(authority);
			authorities.add(new SimpleGrantedAuthority(authority.toString()));
		}
		return authorities;
	}
	
	public Set<Authority> getAuthoritiesSet() {
		System.out.println("getAuthoritiesSet起動");
		return this.authorities;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	//パスワードを取得するためのメソッド
	@Override
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean isEnabled() {
		return this.enabled;
	}

	/**
	 * 全権取得の為に使用するコンストラクタ
	 * SQLのResultSetを入れることで全てのデータが入った、
	 * Employeeクラスを簡単に作れます
	 * @author 畑中 悠希
	 * @param employeeId
	 * @param name
	 */




	public Employee(ResultSet resultSet) {
		try {
		this.username = check("username",resultSet.getString("username"));
		this.employeeId = check("employee_id",resultSet.getInt("employee_id"));
		this.companyCode = check("company_code",resultSet.getString("company_code"));
		this.companyDepartCode = check("compnay_depart_code",resultSet.getString("company_depart_code"));
		this.employeeName = check("employee_name",resultSet.getString("employee_name"));
		this.sex =check("sex",resultSet.getInt("sex"));
		this.birthday = check("birthday",resultSet.getDate("birthday"));
		this.age = check("age",resultSet.getInt("age"));
		this.zipCode = check("zip_code",resultSet.getString("zip_code"));
		this.address1 = check("address1",resultSet.getString("address1"));
		this.address2 = check("address2",resultSet.getString("address2"));
		this.address3 = check("address3",resultSet.getString("address3"));
		this.blockName = check("block_name",resultSet.getString("block_name"));
		this.phoneNumber = check("phone_number",resultSet.getString("phone_number"));
		this.email = check("email",resultSet.getString("email"));
		this.employeeType = check("employee_type",resultSet.getInt("employee_type"));
		this.employeeTypeCode = check("employee_type_code",resultSet.getString("employee_type_code"));
		this.java = check("java",resultSet.getInt("java"));
		this.php = check("php",resultSet.getInt("php"));
		this.javaScript = check("javascript",resultSet.getInt("javascript"));
		this.mysql = check("mysql",resultSet.getInt("mysql"));
		this.systemEngeneer = check("system_engeneer",resultSet.getInt("system_engeneer"));
		this.python = check("python",resultSet.getInt("python"));
		this.android = check("android",resultSet.getInt("android"));
		this.design = check("design",resultSet.getInt("design"));
		this.enterementAt = check("entered_at",resultSet.getDate("entered_at"));
		this.retirementAt = check("retirement_at",resultSet.getDate("retirement_at"));
		this.companyDepartEnteredAt = check("company_depart_entered_at",resultSet.getDate("company_depart_entered_at"));
		this.companyDepartRetirementAt = check("company_depart_retirement_at",resultSet.getDate("company_depart_retirement_at"));
		this.createdAt = check("created_at",resultSet.getDate("created_at"));
		this.updateAt = check("updated_at",resultSet.getDate("updated_at"));
		} catch (SQLException e) {
			System.out.println("SQLデータを正しく格納することが出来ませんでした");
			e.printStackTrace();
		}
	}

	//null回避用メソッド
	public int check(String s,int c) {
		try {
			System.out.println(s+":"+c);
		if(c != -1) {
			return c;
			}
		} catch(NullPointerException e) {
			c = -1;
		}
		return c;
	}
	public String check(String s,String b) {
		System.out.println(s+":"+b);
		if(b != null) {
			return b;
		}else {
			return "未定義";
		}
	}
	public Date check(String s,Date d) {
			System.out.println(s+":"+d);
		if(d != null) {
			return d;
		}else {
			return new Date(-31536000000L);
		}
	}
	
	/***
	 * @author 畑中悠々希
	 * @version 1.0
	 * @id employee
	 * @param point どの場所で書いたかを送ってください
	 * employeeの中に格納されているデータを確認する為のプログラム（編集用）
	 */
	
	public void editTest(String point) {
		System.out.println("起動場所:"+point);
		System.out.println("employeeId:"+this.getEmployeeId());
		System.out.println("username:"+this.getUsername());
		System.out.println("getCompanyCode:"+this.getCompanyCode());
		System.out.println("getCompanyDepartCode:"+this.getCompanyDepartCode());
		System.out.println("employeeName:"+this.getEmployeeName());
		System.out.println("enabled:"+this.getEnabled());
		System.out.println("sex:"+this.sex);
		System.out.println("birthday:"+this.getBirthday());
		System.out.println("age:"+this.getAge());
		System.out.println("zipCode:"+this.getZipCode());
		System.out.println("addores1:"+this.getAddress1());
		System.out.println("address2:"+this.getAddress2());
		System.out.println("address3:"+this.getAddress3());
		System.out.println("blockName:"+this.getBlockName());
		System.out.println("phoneNumber:"+this.getPhoneNumber());
		System.out.println("email:"+this.getEmail());
		System.out.println("employeeType:"+this.getEmployeeType());
		System.out.println("java:"+this.getJava());
		System.out.println("php:"+this.getPhp());
		System.out.println("javascript:"+this.getJavaScript());
		System.out.println("mysql:"+this.getMysql());
		System.out.println("systemEngeneer:"+this.getSystemEngeneer());
		System.out.println("python:"+this.getPython());
		System.out.println("android:"+this.getAndroid());
		System.out.println("design:"+this.getDesign());
		System.out.println();
		System.out.println();
	}
	
	/**
	 * ログイン日時の登録が出来るメソッド
	 * @author 畑中 悠希
	 * @param employeeId
	 * @param name
	 */
	@PrePersist
	public void prePersist() {
		this.loginTime = new Date();
	}

	public Object getEnabled() {
		// TODO 自動生成されたメソッド・スタブ
		return this.enabled;
	}
}
