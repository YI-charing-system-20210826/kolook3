package com.example.Employee_management2.employee.domain.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

public class EmployeeServiceLoginLogout {
	
	/**
	 * @
	 * @author 畑中悠希
	 * @version 1.0
	 * ログイン、ログアウト時の時間に関するクラス
	 * @param id
	 * @return employeeList
	 */
	
	/** ドライバーのクラス名 */
	private static final String POSTGRES_DRIVER = "org.postgresql.Driver";
	/** JDMC接続先情報 */
	private static final String JDBC_CONNECTION = "jdbc:postgresql://localhost:5432/employee?characterEncoding=UTF-8";
	/** ユーザー名 */
	private static final String USER = "postgres";
	/** パスワード */
	private static final String PASS = "postgres";
	/** SQL文 */
	private String UPDATE_SQL_LOGIN = "UPDATE ? SET ? = ? WHERE id = ?";
	/** テーブル名 */
	private String TableName = "EmployeeUsersData";
	
	/** ログインコラム名 */
	private String LOGIN_TIME = "login_time";
	/** タイムアウトコラム名 */
	private String TIME_OUT_TIME = "time_out_time";
	/** ログアウトコラム名 */
	private String LOGOUT_TIME = "logout_time";
	
	
	//SQL接続用
	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
	private PreparedStatement preparedStatement = null;
	private Timestamp timeStamp = null;
	private Calendar calendar = Calendar.getInstance();
	
	
		/**
		 * @
		 * @author 畑中悠希
		 * @version 1.0
		 * ログイン時、login_time、time_out_timeに時間をセットする
		 * @param id
		 * @return employeeList
		 */
	public void setLoginTime(Date loginTime,int id) {

		try {
			//データベースに接続
			Class.forName(POSTGRES_DRIVER);
			connection = DriverManager.getConnection(JDBC_CONNECTION, USER, PASS);
			statement = connection.createStatement();
			
			/* 取得したDate型をSQLTimeStamp型に変換する */
			timeStamp = new Timestamp(loginTime.getTime());
			
			//SQL文にデータを入力
			preparedStatement = connection.prepareStatement(UPDATE_SQL_LOGIN);
			preparedStatement.setString(1, TableName);
			preparedStatement.setString(2, LOGIN_TIME);
			preparedStatement.setTimestamp(3, timeStamp);
			preparedStatement.setInt(4, id);
			
			//SQL文でデータを実行
			preparedStatement.executeUpdate();
			
			
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
				if (preparedStatement != null) {
					preparedStatement = null;
				}
			} catch (SQLException e) {
				System.out.println("正常にSQLが閉じられませんでした");
			}
		}
	}
	public void setTimeOutTime(Date loginTime,int id) {
		try {
			//データベースに接続
			Class.forName(POSTGRES_DRIVER);
			connection = DriverManager.getConnection(JDBC_CONNECTION, USER, PASS);
			statement = connection.createStatement();
			
			/* 取得したDate型をSQLTimeStamp型に変換する */
			calendar.setTime(loginTime);
			
			
			timeStamp = new Timestamp(loginTime.getTime());
			
			
			//SQL文にデータを入力
			preparedStatement = connection.prepareStatement(UPDATE_SQL_LOGIN);
			preparedStatement.setString(1, TableName);
			preparedStatement.setString(2, LOGIN_TIME);
			preparedStatement.setTimestamp(3, timeStamp);
			preparedStatement.setInt(4, id);
			
			//SQL文でデータを実行
			preparedStatement.executeUpdate();
			
			
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
				if (preparedStatement != null) {
					preparedStatement = null;
				}
			} catch (SQLException e) {
				System.out.println("正常にSQLが閉じられませんでした");
			}
		}

	}
}
