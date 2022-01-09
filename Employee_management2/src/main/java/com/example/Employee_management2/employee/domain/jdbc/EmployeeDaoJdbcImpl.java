package com.example.Employee_management2.employee.domain.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.Employee_management2.employee.domain.model.Employee;
import com.example.Employee_management2.employee.domain.repository.EmployeeDao;
import com.example.Employee_management2.employee.domain.service.EmployeeServiceNewEmployeeId;
import com.example.Employee_management2.employee.domain.service.PostgresDriverSQLData;

@Repository
public class EmployeeDaoJdbcImpl implements EmployeeDao {

	/* 従業員テーブルから一人の情報を全て呼び出すINSERT文 */
	//	private String insertSentence = "SELECT * FROM ? WHERE id = ?";

	@Autowired
	JdbcTemplate jdbc;

	@Autowired
	PostgresDriverSQLData pdsql;
	@Autowired
	EmployeeServiceNewEmployeeId esnei;

	//従業員テーブルの件数を取得(空の状態にしてます)
	public int count() throws DataAccessException {
		return 0;
	}

	//従業員テーブルにデータを1件insert
	@Override
	public int insertOne(Employee employee) throws DataAccessException {
		System.out.println("EmployeeDaoJdbcImpl:insertOne起動");
		//１件登録、結果はint値で返す
		int resultNum = jdbc.update("INSERT INTO employee_users_data("
				+ "employee_id, "
				+ "username, "
				+ "password, "
				+ "company_code, "
				+ "employee_name, "
				+ "enabled, "
				+ "sex, "
				+ "birthday, "
				+ "age, "
				+ "zip_code, "
				+ "address1, "
				+ "address2, "
				+ "address3, "
				+ "block_name, "
				+ "phone_number, "
				+ "email, "
				+ "employee_type, "
				+ "employee_type_code, "
				+ "entered_at, "
				+ "company_depart_code, "
				+ "company_depart_entered_at, "
				+ "company_depart_retirement_at, "
				+ "created_at, "
				+ "Java, "
				+ "php, "
				+ "javaScript, "
				+ "mysql, "
				+ "system_engeneer, "
				+ "python, "
				+ "android, "
				+ "design, "
				+ "email_flg "
				+ ") "
				+ "VALUES (?, ?, ?, ?, ?, ? ,? , ?, ?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
				esnei.SelectOneEmployeeId(), employee.getUsername(), employee.getPassword(), employee.getCompanyCode(),
				employee.getEmployeeName(), employee.getEnabled(), employee.getSex(), employee.getBirthday(),
				employee.getAge(), employee.getZipCode(), employee.getAddress1(), employee.getAddress2(),
				employee.getAddress3(), employee.getBlockName(), employee.getPhoneNumber(), employee.getEmail(),
				employee.getEmployeeType(), employee.getEmployeeTypeCode(), employee.getEnterementAt(),
				employee.getCompanyDepartCode(), employee.getCompanyDepartEnteredAt(),
				employee.getCompanyDepartRetirementAt(), new java.sql.Date(new java.util.Date().getTime()),
				employee.getJava(), employee.getPhp(), employee.getJavaScript(), employee.getMysql(),
				employee.getSystemEngeneer(), employee.getPython(), employee.getAndroid(),
				employee.getDesign(),
				employee.getEmailFlg());
		/**
		 * @author 畑中悠希
		 * @version 1.0
		 * employee_users_data登録時に追加でemplouyee_authoritiesにデータを挿入できる部分
		 * resultNum判定が成功したときのみ動き出す
		 * resultNum判定が失敗するとresultNumで作成されたデータは削除される
		 */
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		PreparedStatement preparedStatement = null;
		int resultNum2 = 0;
		if (resultNum > 0) {
			System.out.println("データベース登録完了");
			try {

				//データベースに接続
				try {
					System.out.println("EmployeeDaoJdbcImpl:Postgres_Driverでデータベース接続");
					Class.forName(pdsql.getPOSTGRES_DRIVER());
					connection = DriverManager.getConnection(pdsql.getJDBC_CONNECTION(), pdsql.getUSER(),
							pdsql.getPASS());
					statement = connection.createStatement();
				} catch (NullPointerException e) {
					System.out.println("PostgresDriverがNullです");
				}

				//SQL文の作成と実行
				System.out.println("SQL文作成開始");
				preparedStatement = connection.prepareStatement(pdsql.getINSERT_SQL_AUTHORITIES());
				System.out.println(preparedStatement);
				preparedStatement.setString(1, employee.getUsername());
				System.out.println(preparedStatement);

				//権限の付与をここで行う。Stringタイプのenum
				preparedStatement.setString(2, "ROLE_USER");
				System.out.println(preparedStatement);
				resultNum2 = preparedStatement.executeUpdate();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				System.out.println("insertOne:SQLが正常に使用されませんでした");
				resultNum2 = 0;

				//権限のプログラムがうまう動かなかった時のプログラム、作成したデータを削除する
				System.out.println("権限の付与が出来なかったので削除します");
				jdbc.update("DELETE FROM employee_users_data WHERE employee_id = ?"
						,employee.getEmployeeId()
						);
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
		} else {
			//権限のプログラムがうまう動かなかった時のプログラム、作成したデータを削除する
			System.out.println("employee_users_dataの登録に失敗しています");
		}
		System.out.println("EmployeeDaoJdbcImpl:insertOne終了");
		return resultNum2; //登録したレコード数を戻す
	}

	//Userテーブルを１件更新
	@Override
	public int updateOne(Employee employee) throws DataAccessException {
		System.out.println("EmployeeDaoJdbcImpl:updateOne:起動");
		System.out.println("employeeのデータを取得できているか確認");
		employee.editTest("EmployeeDaojdbcImpl:employee");
		System.out.println();


		//１件更新
		int resultNum = jdbc.update("UPDATE employee_users_data SET "
				+ "employee_name = ?"
				+ ", birthday = ?"
				+ ", age = ?"
				+ ", sex = ?"
				+ ", company_code = ?"
				+ ", company_depart_code = ?"
				+ ", zip_code = ?"
				+ ", address1 = ?"
				+ ", address2 = ?"
				+ ", address3 = ?"
				+ ", block_name = ?"
				+ ", phone_number = ?"
				+ ", email = ?"
				+ ", email_flg = ?"
				+ ", java = ?"
				+ ", php = ?"
				+ ", javascript = ?"
				+ ", mysql = ?"
				+ ", system_engeneer = ?"
				+ ", python = ?"
				+ ", android = ?"
				+ ", design = ?"
				+ " WHERE employee_id = ?"
				, employee.getEmployeeName()
				, employee.getBirthday()
				, employee.getAge()
				, employee.getSex()
				, employee.getCompanyCode()
				, employee.getCompanyDepartCode()
				, employee.getZipCode()
				, employee.getAddress1()
				, employee.getAddress2()
				, employee.getAddress3()
				, employee.getBlockName()
				, employee.getPhoneNumber()
				, employee.getEmail()
				, employee.getEmailFlg()
				, employee.getJava()
				, employee.getPhp()
				, employee.getJavaScript()
				, employee.getMysql()
				, employee.getSystemEngeneer()
				, employee.getPython()
				, employee.getAndroid()
				, employee.getDesign()
				, employee.getEmployeeId());


		System.out.println("SQL格納できているか? " + resultNum);
		System.out.println("EmployeeDaoJdbcImpl:updateOne:終了");
		return resultNum;
	}

	// Userテーブルを１件削除.
	@Override
	public void deleteOne(String Id) throws DataAccessException {

	}

	@Override
	public Employee selectOne(String employeeId) throws DataAccessException {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public List<Employee> selectAll() throws DataAccessException {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}