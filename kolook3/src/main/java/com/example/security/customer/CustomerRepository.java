package com.example.security.customer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    public Customer findByUsername(String username);
    public List<Customer> findAll();
	public static List<Customer> searchAll() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
}