package com.example.Employee_management2.employee.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.Employee_management2.employee.domain.model.Employee;
import com.example.Employee_management2.employee.domain.service.EmployeeServiceDeleteOne;

//業務用データの削除
@Controller
public class EmployeeDeleteController {
	
	@Autowired
	EmployeeServiceDeleteOne esdo;

	
	@GetMapping("/delete/{id}")
	public String deleteSQL(@ModelAttribute Employee form, Model model, @PathVariable("id") String id) {
		System.out.println("EmployeeDeleteController起動");
		
		boolean result = esdo.deleteOne(id);

		//従業員登録結果の判定
		if (result == true) {
			System.out.println("update成功");
			model.addAttribute("result", "更新成功");
			//成功したら詳細画面へ(仮で一覧を表示)
			model.addAttribute("contents", "list::list_contents");
			return "redirect:list";
		} else {
			System.out.println("update失敗");
			model.addAttribute("result", "更新失敗");
			//失敗したら登録画面へ(仮で一覧を表示)
			model.addAttribute("contents", "list::list_contents");
			return "redirect:list";
		}
	}
//	@PostMapping("/delete/{id}")
//	public String deleteSQL2(@ModelAttribute Employee form, Model model, @PathVariable("id") String id) {
//		System.out.println("EmployeeDeleteController2起動");
//		//取得したStringIdをSQLに飛ばして実行
//		esdo.deleteOne(id);
//		System.out.println("EmployeeDeleteController2終了");
//		//一覧画面に遷移する
//		return "redirect:list";
//	}
}