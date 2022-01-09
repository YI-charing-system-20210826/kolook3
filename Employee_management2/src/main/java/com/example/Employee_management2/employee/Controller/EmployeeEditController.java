package com.example.Employee_management2.employee.Controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Employee_management2.employee.domain.model.Employee;
import com.example.Employee_management2.employee.domain.service.EmployeeMapService;
import com.example.Employee_management2.employee.domain.service.EmployeeServiceSelectOne;
import com.example.Employee_management2.employee.domain.service.EmployeeServiceUpdateOne;

@Controller
public class EmployeeEditController {

	@Autowired
	private EmployeeServiceUpdateOne employeeServiceUpdateOne;
	@Autowired
	private EmployeeServiceSelectOne esso;
	@Autowired
	private EmployeeMapService ems;
	
	private Employee employee;

	Map<Integer, String> sexMap;

	Map<String,String> companyDepartMap;

	private Map<String, Integer> radioLanguage;

	//言語ラジオボタンの初期化メソッド
	private Map<String, Integer> initRadioLanguage(){
		Map<String, Integer> languageMap = new LinkedHashMap<>();
		//languageMapにステータスを格納
		languageMap.put("未学習", 0);
		languageMap.put("1章", 1);
		languageMap.put("2章", 2);
		languageMap.put("3章", 3);
		languageMap.put("4章", 4);
		languageMap.put("5章", 5);
		languageMap.put("学習済", 6);

		return languageMap;
	}

	//従業員編集画面　GET用コントローラー
	@GetMapping("/edit/{id}")
	public String getEmployeeEdit(@ModelAttribute Employee form, Model model, @PathVariable("id") String id) {
		System.out.println("Get:編集コントローラー起動");
		/**
		 * @author 畑中悠希
		 * Employeeを渡す部分
		 */
		//employeeIdのチェック(空でない、0以上)
		if (id != null) {
		} else {
			return "/edit/error";
		}
		
		
		//従業員情報の取得(1件) Employee employee = ...
		employee = esso.selectOne(id);
		//Employeeクラスをフォームクラスに変換
		model.addAttribute("employee", employee);

		
		
		/** 外部テーブル呼び出し部分(radioに使う) */

		//<input>タグの性別用Mapを送る
		sexMap = ems.getSexMap();
		model.addAttribute("sexMap",sexMap);
		companyDepartMap = ems.getCompanyDepartMap();
		model.addAttribute("companyDepartMap",companyDepartMap);
		radioLanguage = initRadioLanguage();
		model.addAttribute("radioLanguage", radioLanguage);
		//詳細画面に遷移
		model.addAttribute("contents", "edit::edit_contents");
		System.out.println("編集Controller終了");
		return "layout";
	}
	
	
	//public String getEmployeeRegister(@ModelAttribute EmployeeForm form, Model model)
	//employee/registerに遷移

	//従業員編集画面  POST用コントローラー
	@PostMapping(value = "/edit", params = "update")
	public String postEmployeeEdit(@ModelAttribute Employee form, Model model) {
		System.out.println("更新ボタン処理");
		form.editTest("postEmployeeEdit:form");

		//Employeeインスタンスの生成
		Employee employee = new Employee();

		//フォームクラスをEmployeeクラスに変換
		employee.setEmployeeId(form.getEmployeeId()); //従業員ID
		employee.setUsername(form.getUsername()); //ログイン時使用のユーザーネーム
		employee.setPassword(form.getPassword()); //パスワード
		employee.setCompanyCode(form.getCompanyCode()); //企業コード
		employee.setCompanyDepartCode(form.getCompanyDepartCode()); //稼働先企業コード
		employee.setEmployeeName(form.getEmployeeName()); // 従業員名
		employee.setSex(form.getSex()); //性別
		employee.setBirthday(form.getBirthday()); //誕生日
		employee.setAge(form.getAge()); //年齢
		employee.setZipCode(form.getZipCode()); //郵便番号
		employee.setAddress1(form.getAddress1()); //都道府県
		employee.setAddress2(form.getAddress2()); //市区町村
		employee.setAddress3(form.getAddress3()); //町域名
		employee.setBlockName(form.getBlockName()); //丁目以降
		employee.setPhoneNumber(form.getPhoneNumber()); //電話番号
		employee.setEmail(form.getEmail()); //メールアドレス
		employee.setEmployeeType(form.getEmployeeType()); //雇用形態
		employee.setJava(form.getJava()); //java
		employee.setPhp(form.getPhp()); //PHP
		employee.setJavaScript(form.getJavaScript()); //JavaScript
		employee.setMysql(form.getMysql()); //MySQL
		employee.setSystemEngeneer(form.getSystemEngeneer()); //SE
		employee.setPython(form.getPython()); //PYthon
		employee.setAndroid(form.getAndroid()); //Android
		employee.setDesign(form.getDesign()); //デザイン
		employee.setEnterementAt(form.getEnterementAt()); //入社年月日
		employee.setRetirementAt(form.getRetirementAt()); //退社年月日
		employee.setCompanyDepartEnteredAt(form.getCompanyDepartEnteredAt()); //稼働開始日
		employee.setCompanyDepartRetirementAt(form.getCompanyDepartRetirementAt()); //稼働終了予定日
		employee.setCreatedAt(form.getCreatedAt()); //登録日時
		System.out.println("employee格納");

		boolean result = employeeServiceUpdateOne.updateOne(employee);



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
}

//public class EmployeeEditController {
//	//従業員編集画面　GET用コントローラー
//	@GetMapping("/employeeEdit")
//	public String getEmployeeEdit() {
//		//employeeIdチェック
//
//		//employee/editに遷移
//
//	}
//
//
//	//従業員編集画面  POST用コントローラー
//	@PostMapping("/employeeEdit")
//	public String postEmployeeEdit() {
//		//更新時、入力チェックに引っ掛かったらemployee/edit.htmlにリダイレクト
//
//		//従業員更新処理
//		boolean result=employeeService.updateOne(user);
//		if (result==true){
//		model.addAttribute("result","更新成功");
//		}else{
//		model.addAttribute("result","更新失敗");
//		}
//		//従業員詳細画面を表示
//		return getUserList(model);
//	}
//
//	 @PostMapping(value = "/employeeEdit", バグBUGparams = "delete")
//	    public String postUserDetailDelete(@ModelAttribute Employee employee,
//	            Model model) {
//
//	        System.out.println("削除ボタンの処理");
//	        //削除実行
//	        boolean result = userService.deleteOne(form.getUserId());
//	        if (result == true) {
//	            model.addAttribute("result", "削除成功");
//	        } else {
//	            model.addAttribute("result", "削除失敗");
//	        }
//
//	        //ユーザー一覧画面を表示
//	        return getUserList(model);
//	    }
//
//
//
//}
