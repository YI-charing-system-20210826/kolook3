package com.example.Employee_management2.employee.domain.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.Employee_management2.employee.domain.model.Employee;

public interface EmployeeDao {
	//従業員テーブルの件数取得
	public int count() throws DataAccessException;

	//従業員テーブルにデータを1件insert
	public int insertOne(Employee employee) throws DataAccessException;

	//従業員テーブルのデータを1件取得
	public Employee selectOne(String employeeId) throws DataAccessException;

	//従業員テーブルの全データを取得
	public List<Employee> selectAll() throws DataAccessException;

	//従業員テーブルを1件更新
	public int updateOne(Employee employee) throws DataAccessException;

	//従業員テーブルを1件削除　

	public void deleteOne(String employeeId) throws DataAccessException;
}