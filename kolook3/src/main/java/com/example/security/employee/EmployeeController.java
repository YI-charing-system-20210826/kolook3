package com.example.security.employee;
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
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;


	//従業員情報一覧画面
	@PostMapping("/employee_list")
	public String employeeList(Model model) {
		List<Employee> employeelist = employeeService.searchAll();
		model.addAttribute("employeelist",employeelist);
		return "employee_list";
	}

	//従業員新規登録画面の表示
	@GetMapping(value= "/employee/employee_add")
	public String displayAdd(Model model) {
		model.addAttribute("employeeRequest",new EmployeeRequest());
		return "employee_add";
	}

	//新規登録
	@RequestMapping(value ="/employee/create", method = RequestMethod.POST)
	public String create(@Validated @ModelAttribute EmployeeRequest employeeRequest, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			List<String> errorList = new ArrayList<String>();
			for (ObjectError error : result.getAllErrors()) {
				errorList.add(error.getDefaultMessage());
			}
			model.addAttribute("validationError", errorList);
			return "employee_add";
		}
		employeeService.create(employeeRequest);
		return "redirect:/employee_list";
	}

	@GetMapping("/employee_list")
	public String employee(Model model) {
		List<Employee> employeelist = employeeService.searchAll();
		model.addAttribute("employeelist", employeelist);
		return "employee_list";
	}

	//詳細画面
		@GetMapping("/employee/{id}/employee_detail")
		public String displayDetail(@PathVariable Long id, Model model) {
			Employee employee = employeeService.findById(id);
			model.addAttribute("employeeData",employee);
			return "employee_detail";
		}

		//編集画面
		@GetMapping("/employee/{id}/employee_edit")
		  public String displayEdit(@PathVariable Long id, Model model) {
		    Employee employee = employeeService.findById(id);
		    EmployeeUpdateRequest employeeUpdateRequest = new EmployeeUpdateRequest();
		    employeeUpdateRequest.setMember_id(employee.getMember_id());
		    employeeUpdateRequest.setLast_name(employee.getLast_name());
		    employeeUpdateRequest.setTel_no(employee.getTel_no());
		    employeeUpdateRequest.setAddress(employee.getAddress());
		    employeeUpdateRequest.setFirst_name(employee.getFirst_name());
		    employeeUpdateRequest.setLast_name_Kana(employee.getLast_name_Kana());
		    employeeUpdateRequest.setFirst_name_Kana(employee.getFirst_name_Kana());
		    employeeUpdateRequest.setEmp_status(employee.getEmp_status());
		    employeeUpdateRequest.setSection(employee.getSection());
		    employeeUpdateRequest.setPosition(employee.getPosition());
		    employeeUpdateRequest.setEmail(employee.getEmail());
		    employeeUpdateRequest.setPost_no(employee.getPost_no());
		    employeeUpdateRequest.setKen_code(employee.getKen_code());
		    employeeUpdateRequest.setAddress_detail(employee.getAddress_detail());
		    employeeUpdateRequest.setBirthday(employee.getBirthday());
		    employeeUpdateRequest.setGender(employee.getGender());
		    employeeUpdateRequest.setJoin_at(employee.getJoin_at());
		    employeeUpdateRequest.setLeave_at(employee.getLeave_at());
		    employeeUpdateRequest.setRole(employee.getRole());
		    employeeUpdateRequest.setPassword(employee.getPassword());
		    employeeUpdateRequest.setMember_img(employee.getMember_img());
		    employeeUpdateRequest.setCreated_at(employee.getCreated_at());
		    employeeUpdateRequest.setUpdated_at(employee.getUpdated_at());
		    model.addAttribute("employeeUpdateRequest", employeeUpdateRequest);
		    return "employee_edit";
		  }

		//編集機能
		@RequestMapping(value = "/employee/update", method = RequestMethod.POST)
		  public String update(@ModelAttribute EmployeeUpdateRequest employeeUpdateRequest, BindingResult result, Model model) {
				if (result.hasErrors()) {
				  List<String> errorList = new ArrayList<String>();
				  for (ObjectError error : result.getAllErrors()) {
				    errorList.add(error.getDefaultMessage());
				  }
				  model.addAttribute("validationError", errorList);
				  return "employee_edit";
				}
		    // ユーザー情報の更新
		    employeeService.update(employeeUpdateRequest);
		    return "redirect:/employee_list";
		  }

		//削除
		@GetMapping("/employee/{id}/employee_delete")
		public String delete(@PathVariable Long id, Model model) {
			employeeService.delete(id);
			return "redirect:/employee_list";
		}

}