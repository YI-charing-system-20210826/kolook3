package com.example.security.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public List<Customer> searchAll() {
		return customerRepository.findAll();
	}

	public void delete(Long id) {
		Customer customer = findById(id);
		customerRepository.delete(customer);
	}

	public Customer findById(Long id) {
		return customerRepository.findById(id).get();
	}

	public void create(CustomerRequest customerRequest) {
		Customer customer = new Customer();
		customer.setCustomer_id(customerRequest.getCustomer_id());
		customer.setLast_name(customerRequest.getLast_name());
		customer.setFirst_name(customerRequest.getFirst_name());
		customer.setLast_name_Kana(customerRequest.getLast_name_Kana());
		customer.setFirst_name_Kana(customerRequest.getFirst_name_Kana());
		customer.setGender(customerRequest.getGender());
		customer.setBirthday(customerRequest.getBirthday());
		customer.setTel_no(customerRequest.getTel_no());
		customer.setEmail(customerRequest.getEmail());
		customer.setPost_no(customerRequest.getPost_no());
		customer.setKen_code(customerRequest.getKen_code());
		customer.setAddress(customerRequest.getAddress());
		customer.setAddress_detail(customerRequest.getAddress_detail());
		customer.setRemarks(customerRequest.getRemarks());
		customer.setContract_flg(customerRequest.getContract_flg());
		customerRepository.save(customer);
	}

	public void update(CustomerUpdateRequest customerUpdateRequest) {
		Customer customer = findById(customerUpdateRequest.getCustomer_id());
		customer.setAddress(customerUpdateRequest.getAddress());
		customer.setLast_name(customerUpdateRequest.getLast_name());
		customer.setTel_no(customerUpdateRequest.getTel_no());
		customerRepository.save(customer);
	}
}