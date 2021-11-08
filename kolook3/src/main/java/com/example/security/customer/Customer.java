package com.example.security.customer;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.sun.istack.NotNull;

@Entity

@Table(name = "customer")
public class Customer implements UserDetails {

	private static final long serialVersionUID = 1L;
	
	
	@Column(name="customer_id")
	@NotNull
	private int customer_id;

	@Id
	@Column(nullable = false)
	private String username; //ログインに使用

	@Column(nullable = false)
	private String password; //ログインに使用

	@Column(nullable = false)
	private String mailAddress;

	@Column(nullable = false)
	private boolean mailAddressVerified;

	@Column(nullable = false)
	private boolean enabled;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;

	public enum Authority {
		ROLE_USER, ROLE_MANAGER, ROLE_ADMIN
	}

	@ElementCollection(fetch = FetchType.EAGER)
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Set<Authority> authorities;
	

	@Column(name = "last_name")
	@NotNull
	private String last_name;
	
	@Column(name = "first_name")
	@NotNull
	private String first_name;
	
	@Column(name = "last_name_Kana")
	@NotNull
	private String last_name_Kana;
	
	@Column(name = "first_name_Kana")
	@NotNull
	private String first_name_Kana;
	
	@Column(name = "gender")
	@NotNull
	private String gender;
	
	@Column(name = "birthday")
	@NotNull
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date birthday;
	
	@Column(name="tel_no")
	private int tel_no;
	
	@Column(name = "email")
	private String email;
	
	@Column(name="post_no")
	private int post_no;
	
	@Column(name = "ken_code")
	@NotNull
	private String ken_code;
	
	@Column(name = "address")
	@NotNull
	private String address;
	
	@Column(name = "address_detail")
	@NotNull
	private String address_detail;
	
	@Column(name = "remarks")
	private String remarks;
	
	@Column(name = "contract_flg")
	private String contract_flg;

	// JPA requirement
	protected Customer() {
	}
	
	//一覧表示用のコンストラクタ
	public Customer(int customer_id,String last_name,String first_name,String last_name_Kana,String first_name_Kana,String gender,Date birthday,int tel_no,String email,int post_no,String ken_code,String address,String address_detail,String remarks,String contract_flg) {
		this.customer_id = customer_id;
		this.last_name = last_name;
		this.first_name = first_name;
		this.last_name_Kana = last_name_Kana;
		this.first_name_Kana = first_name_Kana;
		this.gender = gender;
		this.birthday = birthday;
		this.tel_no = tel_no;
		this.email = email;
		this.post_no = post_no;
		this.ken_code = ken_code;
		this.address = address;
		this.address_detail = address_detail;
		this.remarks = remarks;
		this.contract_flg = contract_flg;
	}

	//コンストラクタ
	public Customer(String username, String password, String mailAddress) {
		this.username = username;
		this.password = password;
		this.mailAddress = mailAddress;
		this.mailAddressVerified = false;
		this.enabled = true;
		this.authorities = EnumSet.of(Authority.ROLE_USER);
	}

	//登録時に、日時を自動セットする
	@PrePersist
	public void prePersist() {
		this.createdAt = new Date();
	}

	//admin権限チェック
	public boolean isAdmin() {
		return this.authorities.contains(Authority.ROLE_ADMIN);
	}

	//admin権限セット
	public void setAdmin(boolean isAdmin) {
		if (isAdmin) {
			this.authorities.add(Authority.ROLE_MANAGER);
			this.authorities.add(Authority.ROLE_ADMIN);
		} else {
			this.authorities.remove(Authority.ROLE_ADMIN);
		}
	}

	//管理者権限を保有しているか？
	public boolean isManager() {
		return this.authorities.contains(Authority.ROLE_MANAGER);
	}

	//管理者権限セット
	public void setManager(boolean isManager) {
		if (isManager) {
			this.authorities.add(Authority.ROLE_MANAGER);
		} else {
			this.authorities.remove(Authority.ROLE_MANAGER);
			this.authorities.remove(Authority.ROLE_ADMIN);
		}
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> authorities = new ArrayList<>();
		for (Authority authority : this.authorities) {
			authorities.add(new SimpleGrantedAuthority(authority.toString()));
		}
		return authorities;
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
	}
}
