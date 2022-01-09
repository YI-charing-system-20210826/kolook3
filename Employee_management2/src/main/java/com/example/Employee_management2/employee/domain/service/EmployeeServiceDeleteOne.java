package com.example.Employee_management2.employee.domain.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class EmployeeServiceDeleteOne{
	
	@Autowired
	PostgresDriverSQLData pdsql;
	
	public boolean deleteOne(String employeeId) {
		System.out.println("EmployeeServiceDeleteOne起動");

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		PreparedStatement preparedStatement = null;
		boolean check = false;

		try {
			//データベースに接続
			Class.forName(pdsql.getPOSTGRES_DRIVER());
			connection = DriverManager.getConnection(pdsql.getJDBC_CONNECTION(), pdsql.getUSER(), pdsql.getPASS());
			statement = connection.createStatement();
			
			//SQL文の作成と実行
			preparedStatement = connection.prepareStatement(pdsql.getSELECT_SQL_DELETE());
			preparedStatement.setInt(1, Integer.parseInt(employeeId));
			preparedStatement.executeUpdate();
			check =true;

		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQLが正常に使用されませんでした");
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				System.out.println("正常にSQLが閉じられませんでした");
			}
		}
		System.out.println("EmployeeServiceDeleteOne終了");
		return check;
	}
}
