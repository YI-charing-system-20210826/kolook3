package com.example.Employee_management2.employee.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Employee_management2.employee.domain.model.Employee;
import com.example.Employee_management2.employee.domain.repository.EmployeeDao;

@Service
public class EmployeeServiceUpdateOne {
    @Autowired
    EmployeeDao dao;

    /**
     * １件更新用メソッド.
     */
    public boolean updateOne(Employee employee) {
    	System.out.println("EmployeeServiceUpdateOne:updateOne:起動");
        // 判定用変数
        boolean result = false;
        // １件更新
        int resultNum = dao.updateOne(employee);

        System.out.println("ここまでちゃんとできていますかね");
        System.out.println("アップデートresult確認" + resultNum);

        if (resultNum > 0) {
            // update成功


            result = true;
        }
    	System.out.println("EmployeeServiceUpdateOne:updateOne:終了");

        return result;
    }
}

//public class EmployeeServiceUpdateOne {
//	/** ドライバーのクラス名 */
//	private static final String POSTGRES_DRIVER = "org.postgresql.Driver";
//	/** JDMC接続先情報 */
//	private static final String JDBC_CONNECTION = "jdbc:postgresql://localhost:5432/employee?characterEncoding=UTF-8";
//	/** ユーザー名 */
//	private static final String USER = "postgres";
//	/** パスワード */
//	private static final String PASS = "postgres";
//	/** SQL UPDATE文 */
//	private static String UPDATE_SQL_ID = "UPDATE EmployeeUsersData SET login_time = ? WHERE id = ?";
//	/** ・SQL SELECT文 */
//	private String SELECT_SQL_ALLID = "SELECT id , name FROM ?";
//	/** テーブル名 */
//	private String TableName = "EmployeeUsersData";
//	/**
//	 * @author 松田
//	 * @version 1.0
//	 * @param id
//	 * @return employeeList
//	 */
//	public List<Employee> UpdateOneSQL() {
//		List<Employee> employeeList = new ArrayList<>();
//
//		Connection connection = null;
//		Statement statement = null;
//		ResultSet resultSet = null;
//		PreparedStatement preparedStatement = null;
//
//		try {
//			//データベースに接続
//			Class.forName(POSTGRES_DRIVER);
//			connection = DriverManager.getConnection(JDBC_CONNECTION, USER, PASS);
//			statement = connection.createStatement();
//
//			//UPDATE SQL文の作成と実行
//			preparedStatement = connection.prepareStatement(UPDATE_SQL_ID);
//			preparedStatement.setString(1,TableName);
//			preparedStatement.executeUpdate();
//
//			//SELECT SQL文の作成と実行
//			preparedStatement = connection.prepareStatement(SELECT_SQL_ALLID);
//			preparedStatement.setString(1, TableName);
//			resultSet = preparedStatement.executeQuery();
//
//			//取得したSQLデータをList内に格納
//			while (resultSet.next()) {
//				employeeList.add(new Employee(resultSet.getInt("id"),resultSet.getString("name")));
//			}
//
//		} catch(ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			System.out.println("SQLが正常に使用されませんでした");
//		} finally {
//			try {
//				if (resultSet != null) {
//					resultSet.close();
//				}
//				if (statement != null) {
//					statement.close();
//				}
//				if (connection != null) {
//					connection.close();
//				}
//			} catch (SQLException e) {
//				System.out.println("正常にSQLが閉じられませんでした");
//			}
//		}
//		return employeeList;
//	}
//}
