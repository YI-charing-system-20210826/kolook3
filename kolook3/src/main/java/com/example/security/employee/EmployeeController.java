package com.example.security.employee;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeRepository repository;

	@Autowired
	private EmployeeSelectService employeeSelectService;

	public List<Employee> get() {
		return (List<Employee>) repository.findAll();
	}

	//従業員情報一覧画面
	@PostMapping("/employee_list")
	public String employeeList(Model model) {
		List<Employee> employeeList = employeeSelectService.searchAll();
		model.addAttribute("employeeList",employeeList);
		return "employee_list";
	}

	//従業員新規登録画面の表示
	@GetMapping(value= "/employee_add")
	public String displayAdd(Model model) {
		//model.addAttribute("cusutomerRequest",new CustomerRequest());
		return "employee_add";
	}

	//従業員新規登録
	//@param userRequest リクエストデータ
	//@param model Model
	//@return ユーザー情報一覧画面
	 //@RequestMapping(value = "/employee/create", method = RequestMethod.POST)
	  //public String create(@Validated @ModelAttribute UserRequest userRequest, BindingResult result, Model model) {
	    //if (result.hasErrors()) {
	      // 入力チェックエラーの場合
	      //List<String> errorList = new ArrayList<String>();
	      //for (ObjectError error : result.getAllErrors()) {
	      //  errorList.add(error.getDefaultMessage());
	     // }
	      //model.addAttribute("validationError", errorList);
	      //return "employee/add";
	   // }
	    // ユーザー情報の登録
	    //userService.create(userRequest);
	   //return "redirect:/employee/list";
	  //}

}