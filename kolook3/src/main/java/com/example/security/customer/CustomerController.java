package com.example.security.customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/customer/list")
	public String customerlist(Model model) {
		List<Customer> customerlist = customerService.searchAll();
		model.addAttribute("customerlist", customerlist);
		return "list";
	}

	//顧客新規登録画面の表示
	@GetMapping(value = "/customer/add")
	public String displayAdd(Model model) {
		model.addAttribute("customerRequest", new CustomerRequest());
		return "add";
	}

	//新規登録
	@RequestMapping(value ="/customer/create", method = RequestMethod.POST)
	public String create(@Validated @ModelAttribute CustomerRequest customerRequest, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			List<String> errorList = new ArrayList<String>();
			for (ObjectError error : result.getAllErrors()) {
				errorList.add(error.getDefaultMessage());
			}
			model.addAttribute("validationError", errorList);
			return "add";
		}
		customerService.create(customerRequest);
		return "redirect:/customer/list";
	}

	@GetMapping("/customer/list")
	public String customer(Model model) {
		List<Customer> customerlist = customerService.searchAll();
		model.addAttribute("customerlist", customerlist);
		return "list";
	}

	//詳細画面
	@GetMapping("/customer/{id}/detail")
	public String displayDetail(@PathVariable Long id, Model model) {
		Customer customer = customerService.findById(id);
		model.addAttribute("customerData",customer);
		return "detail";
	}

	//編集画面
	@GetMapping("/customer/{id}/edit")
	  public String displayEdit(@PathVariable Long id, Model model) {
	    Customer customer = customerService.findById(id);
	    CustomerUpdateRequest customerUpdateRequest = new CustomerUpdateRequest();
	    customerUpdateRequest.setCustomer_id(customer.getCustomer_id());
	    customerUpdateRequest.setFirst_name(customer.getFirst_name());
		customerUpdateRequest.setLast_name(customer.getLast_name());
		customerUpdateRequest.setLast_name_Kana(customer.getLast_name_Kana());
		customerUpdateRequest.setFirst_name_Kana(customer.getFirst_name_Kana());
		customerUpdateRequest.setGender(customer.getGender());
		customerUpdateRequest.setBirthday(customer.getBirthday());
		customerUpdateRequest.setTel_no(customer.getTel_no());
		customerUpdateRequest.setEmail(customer.getEmail());
		customerUpdateRequest.setPost_no(customer.getPost_no());
		customerUpdateRequest.setKen_code(customer.getKen_code());
		customerUpdateRequest.setAddress(customer.getAddress());
		customerUpdateRequest.setAddress_detail(customer.getAddress_detail());
		customerUpdateRequest.setRemarks(customer.getRemarks());
		customerUpdateRequest.setContract_flg(customer.getContract_flg());
	    model.addAttribute("customerUpdateRequest", customerUpdateRequest);
	    return "edit";
	  }

	//編集機能
	@RequestMapping(value = "/customer/update", method = RequestMethod.POST)
	  public String update(@ModelAttribute CustomerUpdateRequest customerUpdateRequest, BindingResult result, Model model) {
			if (result.hasErrors()) {
			  List<String> errorList = new ArrayList<String>();
			  for (ObjectError error : result.getAllErrors()) {
			    errorList.add(error.getDefaultMessage());
			  }
			  model.addAttribute("validationError", errorList);
			  return "edit";
			}
	    // ユーザー情報の更新
	    customerService.update(customerUpdateRequest);
	    return "redirect:/customer/list";
	  }

	//削除
	@GetMapping("/customer/{id}/delete")
	public String delete(@PathVariable Long id, Model model) {
		customerService.delete(id);
		return "redirect:/customer/list";
	}

}