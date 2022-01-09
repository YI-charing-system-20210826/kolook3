package com.example.Employee_management2.employee.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Employee_management2.employee.domain.model.Employee;
import com.example.Employee_management2.employee.domain.repository.EmployeeDao;

@Service
public class EmployeeServiceInsert {

	@Autowired
	EmployeeDao dao;

	//insert用メソッド
	public boolean insert(Employee employee) {
		System.out.println("EmployeeServiceInsert:INSERTメソッド実行");
		//insertの実行
		int resultNum = dao.insertOne(employee);

		//判定用変数
		boolean result = false;

		if(resultNum > 0) {
			// insert成功
			result = true;
		}
		return result;
	}
}
