package com.example.security.customer;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.security.customer.Customer;

@Repository

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
