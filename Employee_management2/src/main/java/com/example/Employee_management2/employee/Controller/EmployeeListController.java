package com.example.Employee_management2.employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Employee_management2.employee.domain.model.Employee;
import com.example.Employee_management2.employee.domain.service.EmployeeServiceCountEmployee;
import com.example.Employee_management2.employee.domain.service.EmployeeServiceSelectAll;

/**
 * list画面のコントローラー
 * @author masuda
 */
	
@Controller
public class EmployeeListController {
	@Autowired
	EmployeeServiceSelectAll employeeService;
	@Autowired
	EmployeeServiceCountEmployee esce;

	@GetMapping("/list")
	//従業員一覧画面　GET用コントローラー
	public String getEmployeeList(Model model) {
		System.out.println("Get:ListController起動");

		model.addAttribute("contents", "list::list_contents");
		
		//ユーザー一覧の生成(List<> employeeListに入れる)
		List<Employee> employeeList = employeeService.SelectAllSQL();
		model.addAttribute("employeeList", employeeList);
		
		//社員の総数を作成して格納する
		int countEmployee = esce.SelectCount();
		model.addAttribute("countEmployee", countEmployee);
		
		//employee/list.htmlに遷移
		System.out.println("layoutへ移動");
		return "layout";
	}

	@PostMapping("/list")
	//従業員一覧画面 Get用コントローラー
	public String postEmployeeList(Model model) {
		System.out.println("Post:ListController起動");

		model.addAttribute("contents", "list::list_contents");
		//ユーザー一覧の生成(List<> employeeListに入れる)
		//Modelにユーザーリストを登録(model.addAttribute("employeeList", employeeList))
		List<Employee> employeeList = employeeService.SelectAllSQL();
		model.addAttribute("employeeList", employeeList);
		//employee/list.htmlに遷移
		System.out.println("layoutへ移動");
		return "layout";
	}
}
