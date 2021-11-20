package com.example.security.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/customer/list")
	public String customerList(Model model) {
		List<Customer> customerList = customerService.searchAll();
		model.addAttribute("customerList", customerList);
		return "list";
	}

	//顧客新規登録画面の表示
		@GetMapping(value="/customer/list/add")
		public String displayAdd(Model model) {
			model.addAttribute("cusutomerRequest", new CustomerRequest());
			return "add";
		}

	@GetMapping("/customer/{id}")
	public String displayDetail(@PathVariable Long id, Model model) {
		return "customer/detail";
	}

}