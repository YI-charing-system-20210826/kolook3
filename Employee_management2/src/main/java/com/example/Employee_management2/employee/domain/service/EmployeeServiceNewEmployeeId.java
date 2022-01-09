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
public class EmployeeServiceNewEmployeeId {
	/**
	 * @
	 * @author 畑中悠希
	 * @version 1.0
	 * EmployeeIdの一番下の数を取ってくることが出来る
	 * @param id
	 * @return employeeList
	 */
		@Autowired
		PostgresDriverSQLData pdsql;

	public int SelectOneEmployeeId() {
		System.out.println("SelectOneEmployeeId起動");
		int employeeId = 0;
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		PreparedStatement preparedStatement = null;

		try {
			//データベースに接続
			Class.forName(pdsql.getPOSTGRES_DRIVER());
			connection = DriverManager.getConnection(pdsql.getJDBC_CONNECTION(), pdsql.getUSER(), pdsql.getPASS());
			statement = connection.createStatement();
			System.out.println("SQL文作成開始");
			//SQL文の作成と実行
			preparedStatement = connection.prepareStatement(pdsql.getSELECT_SQL_EMPLOYEE_ID());
			System.out.println(preparedStatement);
			resultSet = preparedStatement.executeQuery();
			System.out.println("SQLデータの格納");
			//取得したSQLデータをList内に格納
			while (resultSet.next()) {
			employeeId = resultSet.getInt("x");
			}
			//最後の番号にプラス1を足す
			employeeId += 1;
			//正しいIdが出力されているか確認
			System.out.println("取得されたか："+employeeId);

		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQLが正常に使用されませんでした");
			e.printStackTrace();
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
		System.out.println("SelectOneEmployeeId終了");
		System.out.println();
		System.out.println();
		return employeeId;
	}
}
