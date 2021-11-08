package com.example.security.employee;
import java.util.Date;
import java.util.EnumSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

@Table(name = "employee")
public class Employee  {

	//private static final long serialVersionUID = 1L;

	//権限は一般ユーザ、マネージャ、システム管理者の３種類とする
	public enum Authority {
	ROLE_USER, ROLE_MANAGER, ROLE_ADMIN
	}

	@Id

    //@Column:Entityクラス内で定義したカラム名に相当するメンバ変数に付与する。
	@Column(nullable = false, unique = true)
	private String username;

	@Column(nullable = false)
	private String password;

	@Column(nullable = false, unique = true)
	private String mailAddress;

	@Column(nullable = false)
	private boolean mailAddressVerified;

	@Column(nullable = false)
	private boolean enabled;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;

	@ElementCollection(fetch = FetchType.EAGER)
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Set<Authority> authorities;


	 //JPA requirement
	 //protected Employee() {
	 //}
	//コンストラクタ
	public Employee(String username, String password, String mailAddress) {
		this.username = username;
		this.password = password;
		this.mailAddress = mailAddress;
		this.mailAddressVerified = false;
		this.enabled = true;
		this.authorities = EnumSet.of(Authority.ROLE_USER);
	}
}