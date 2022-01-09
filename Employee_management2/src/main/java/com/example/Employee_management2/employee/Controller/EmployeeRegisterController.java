package com.example.Employee_management2.employee.Controller;

import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Employee_management2.employee.domain.model.Employee;
import com.example.Employee_management2.employee.domain.model.Employee.Authority;
import com.example.Employee_management2.employee.domain.service.EmployeeMapService;
import com.example.Employee_management2.employee.domain.service.EmployeeServiceInsert;
import com.example.Employee_management2.employee.domain.service.EmployeeServiceSelectAll;

@Controller
public class EmployeeRegisterController {

	@Autowired
	private EmployeeServiceInsert employeeServiceInsert;

	@Autowired
	EmployeeServiceSelectAll employeeService;
	
	@Autowired
	private EmployeeMapService ems;

	/**
	 *ラジオボタン用の変数
	 */
	//性別ラジオボタン用変数
	private Map<String, Integer> radioSex;
	//言語
	private Map<String, Integer> radioLanguage;
	
	Map<String,String> companyDepartMap;


	//性別ラジオボタンの初期化メソッド
	private Map<String, Integer> initRadioSex(){
		Map<String, Integer> sexMap = new LinkedHashMap<>();
		//男性、女性をsexMapに格納
		sexMap.put("男性", 1);
		sexMap.put("女性", 2);

		return sexMap;
	}

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


	//従業員登録画面　GET用コントローラー
	@GetMapping("/register")
	public String getEmployeeRegister(@ModelAttribute Employee form, Model model) {
		//ラジオボタンの初期化メソッド呼び出し
		radioSex = initRadioSex();
		radioLanguage = initRadioLanguage();
		companyDepartMap = ems.getCompanyDepartMap();

		//ラジオボタン用のMapをModelに登録
		model.addAttribute("radioSex", radioSex);
		model.addAttribute("radioLanguage", radioLanguage);
		model.addAttribute("companyDepartMap",companyDepartMap);


		//htmlテンレートのコンテンツ部分に登録画面を表示
		model.addAttribute("contents", "register::register_contents");

		//従業員登録画面に遷移
		return "layout";
	}
	//public String getEmployeeRegister(@ModelAttribute EmployeeForm form, Model model)
	//employee/registerに遷移


	//従業員登録画面  POST用コントローラー
	@PostMapping("/register")
	public String postEmployeeRegister(@ModelAttribute @Validated Employee form, BindingResult bindingResult, Model model) {
		System.out.println("postEmployeeResister");
		System.out.println("bindingResult");
		//登録時、入力チェックに引っ掛かったらemployee/register.htmlにリダイレクト
		if(bindingResult.hasErrors()){
			//get用コントローラーの呼び出し
			return getEmployeeRegister(form, model);
		}
		
		//取得したformに新規でROLE＿USER権限を与える
		form.setAuthorities(EnumSet.of(Authority.ROLE_USER));
		
		//employee格納前のemployeeの中身を出力
		System.out.println("Employee.A:"+form);
		System.out.println();

		//insert用変数
		Employee employee = new Employee();
		
		//employeeの中にformからデータの格納
		employee.setUsername(form.getUsername());  //ログインで使用のユーザーネーム
		employee.setCompanyCode(form.getCompanyCode());  //企業コード
		employee.setEmployeeName(form.getEmployeeName());  //従業員
		employee.setEnabled(true);  //権限
		employee.setCompanyDepartCode(form.getCompanyDepartCode());  //稼働先企業コード
		employee.setPassword(form.getPassword());  //パスワード
		employee.setSex(form.getSex());  //性別
		employee.setAuthorities(form.getAuthoritiesSet());
		employee.setBirthday(form.getBirthday());  //誕生日
		employee.setAge(form.getAge());  //年齢
		employee.setZipCode(form.getZipCode());  //郵便番号
		employee.setAddress1(form.getAddress1()); //都道府県
		employee.setAddress2(form.getAddress2()); //市区町村
		employee.setAddress3(form.getAddress3()); //町域名
		employee.setBlockName(form.getBlockName());  //丁目以降
		employee.setPhoneNumber(form.getPhoneNumber());  //電話番号
		employee.setEmail(form.getEmail());  //メールアドレス
		employee.setEmployeeType(form.getEmployeeType());  //雇用形態
		employee.setJava(form.getJava());  //java
		employee.setPhp(form.getPhp());  //PHP
		employee.setJavaScript(form.getJavaScript());  //JavaScript
		employee.setMysql(form.getMysql());  //MySQL
		employee.setSystemEngeneer(form.getSystemEngeneer());  //SE
		employee.setPython(form.getPython());  //PYthon
		employee.setAndroid(form.getAndroid());  //Android
		employee.setDesign(form.getDesign());  //デザイン
		employee.setEnterementAt(form.getEnterementAt());  //入社年月日
		employee.setRetirementAt(form.getRetirementAt());  //退社年月日
		employee.setCompanyDepartEnteredAt(form.getCompanyDepartEnteredAt());  //稼働開始日
		employee.setCompanyDepartRetirementAt(form.getCompanyDepartRetirementAt());  //稼働終了予定日
		employee.setCreatedAt(form.getCreatedAt());  //登録日時
		
		//格納後のemployeeの中身を出力
		System.out.println("Employee.B:"+employee);

		boolean result = employeeServiceInsert.insert(employee);

		//従業員登録結果の判定
		if(result == true) {
			System.out.println("insert成功");
			//成功したら一覧へ
			System.out.println("ListController起動");

			model.addAttribute("contents", "list::list_contents");
			//ユーザー一覧の生成(List<> employeeListに入れる)
			//Modelにユーザーリストを登録(model.addAttribute("employeeList", employeeList))
			List<Employee> employeeList = employeeService.SelectAllSQL();
			model.addAttribute("employeeList", employeeList);
			//employee/list.htmlに遷移
			System.out.println("layoutへ移動");
			return "layout";
		} else {
			System.out.println("insert失敗");
			//失敗したら登録画面へ
			//htmlテンレートのコンテンツ部分に登録画面を表示
			model.addAttribute("contents", "register::register_contents");
			return "layout";
		}


	}
}
