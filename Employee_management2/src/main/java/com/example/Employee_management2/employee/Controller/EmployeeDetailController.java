package com.example.Employee_management2.employee.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Employee_management2.employee.domain.model.Employee;
import com.example.Employee_management2.employee.domain.service.EmployeeServiceSelectOne;

//従業員詳細画面のGET用メソッド
@Controller
public class EmployeeDetailController {
	@Autowired
	EmployeeServiceSelectOne esso;

	@GetMapping("/employeeDetail/{id}")
	public String getEmployeeDetail(Model model,@PathVariable("id") String id) {
		System.out.println("詳細コントローラー起動");
	//employeeIdのチェック(空でない、0以上)
		if(id != null) {
		}else {
			return "/employeeDetail/error";
		}
	//従業員情報の取得(1件) Employee employee = ...
		Employee employee = esso.selectOne(id);
	//データが格納されているか確認
		System.out.println("Controller:取得されたか確認："+employee.getUsername());
	//Employeeクラスをフォームクラスに変換
		model.addAttribute("employee", employee);
	//詳細画面に遷移
		model.addAttribute("contents", "detail::detail_contents");
		System.out.println("詳細Controller終了");
		return "layout";
	}

	@PostMapping("/employeeDetail/{id}")
	//従業員詳細画面 Post用コントローラー
	public String postEmployeeDetail(Model model,@PathVariable("id") String id) {
		System.out.println("詳細コントローラー起動");
	//employeeIdのチェック(空でない、0以上)
		if(id != null) {
		}else {
			return "/employeeDetail/error";
		}
	//従業員情報の取得(1件) Employee employee = ...
		Employee employee = esso.selectOne(id);
		System.out.println(employee);
	//Employeeクラスをフォームクラスに変換
		model.addAttribute("employee", employee);
	//詳細画面に遷移
		model.addAttribute("contents", "detail::detail_contents");
		System.out.println("詳細Controller終了");
		return "layout";
	}
}
