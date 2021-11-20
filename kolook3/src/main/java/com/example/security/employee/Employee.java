package com.example.security.employee;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Data
@Table(name = "employee")
public class Employee{

	@Id

	//@Column:Entityクラス内で定義したカラム名に相当するメンバ変数に付与する。
	@Column(nullable = false, unique = true)
	private String username;

	@Column(nullable = false)
	private String password;

	@Column(nullable = false, unique = true)
	private String mailAddress;

	@Column()
	private boolean mailAddressVerified;

	@Column()
	private boolean enabled;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;

	//JPA requirement
	protected Employee() {
	}
	
	/*//コンストラクタ
	public Employee(String username, String password, String mailAddress) {
		this.username = username;
		this.password = password;
		this.mailAddress = mailAddress;
		this.mailAddressVerified = false;
		this.enabled = true;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isEnabled() {
		return this.enabled;
	}
	
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	public String getMailAddress() {
		return mailAddress;
	}
	
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
	
	public boolean isMailAddressVerified() {
		return mailAddressVerified;
	}
	
	public void setMailAddressVerified(boolean mailAddressVerified) {
		this.mailAddressVerified = mailAddressVerified;
	}
	
	public Date getCreatedAt() {
		return createdAt;
	}*/
	
}