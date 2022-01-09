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
public class EmployeeServiceCountEmployee {
	/**
	 * @
	 * @author 畑中悠希
	 * @version 1.0
	 * 総社員数をデータベースから取得してくれる
	 * @return countId
	 */
	@Autowired
	PostgresDriverSQLData pdsql;

	public int SelectCount() {
		System.out.println("SelectCount起動");
		int countId = 0;

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
			preparedStatement = connection.prepareStatement(pdsql.getSELECT_SQL_COUNT_USER());
			System.out.println(preparedStatement);
	 		resultSet = preparedStatement.executeQuery();
			System.out.println("SQLデータの格納");
			//取得したSQLデータをList内に格納
			while (resultSet.next()) {
				countId = resultSet.getInt("x");
			}
			//正しいIdが出力されているか確認
			System.out.println("総社員数：" + countId);

		} catch (ClassNotFoundException e) {
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
		System.out.println("SelectCount終了");
		System.out.println();
		System.out.println();
		return countId;
	}
}
