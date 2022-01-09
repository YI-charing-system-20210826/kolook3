package com.example.Employee_management2.employee.domain.service;

import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * @author 畑中悠希
 * @version 1.0
 * Postgreに接続する為の言葉セット集
 */

@Component
@Data
public class PostgresDriverSQLData {
	/**
	 * 	ドラーバー接続用
	 */

	/** ドライバーのクラス名 */
	private final String POSTGRES_DRIVER = "org.postgresql.Driver";
	/** JDMC接続先情報 */
	private final String JDBC_CONNECTION = "jdbc:postgresql://localhost:5432/EmployeeData?characterEncoding=UTF-8";
	/** ユーザー名 */
	private final String USER = "postgres";
	/** パスワード */
	private final String PASS = "postgres";

	/**
	 * テーブル検索用
	 */

	/** 企業名テーブル */
	private final String COMPANIES_DATA = "employee_companies_data";
	/** 稼働先名テーブル */
	private final String COMPANIES_DEPART_DATA = "employee_companies_depart_data";
	/** 言語テーブル */
	private final String LANGUAGE_DATA = "employee_language_data";
	/** 稼働ジャンルテーブル */
	private final String TYPE_CODE = "employee_type_code";
	/** ユーザーテーブル */
	private final String USERS_DATA = "employee_users_data";
	/** 性別テーブル */
	private final String SEX_TABLE = "employee_sex";

	/**
	 * コラム検索用
	 */

	/** 社員番号コラム */
	private final String EMPLOYEE_ID = "employee_id";
	/** ユーザー名コラム */
	private final String EMPLOYEE_USERNAME = "employee_name";
	/** 所属先コラム */
	private final String EMPLOYEE_COMPANY_CODE = "company_code";
	/** 稼働先企業コラム */
	private final String EMPLOYEE_COMPANY_DEPART_CODE = "company_depart_code";
	/** 稼働先企業名コラム */
	private final String EMPLOYEE_COMPANY_DEPART_NAME = "company_depart_name";
	/** 性別コラム */
	private final String EMPLOYEE_SEX = "sex";
	/** 性別名前コラム */
	private final String EMPLOYEE_SEX_NAME = "sex_name";

	/**
	 * SQL作成用
	 */

	/** 全企業の一覧呼び出せるSQL文 */
	private String SELECT_SQL_ONE_ID = "SELECT * FROM "+USERS_DATA+" "+"WHERE employee_id = ?";
	/** SQL文 */
	private final String SELECT_SQL_ALLID = "SELECT employee_id , employee_name , company_code , company_depart_code FROM "+USERS_DATA + " ORDER BY EMPLOYEE_ID ASC";
	/** 外部テーブル性別用SQL文 */
	private final String SELECT_SQL_SEX_TABLE = "SELECT sex, sex_name FROM "+ SEX_TABLE;
	/** 外部テーブル性別用SQL文 */

	private final String SELECT_SQL_DEPART_TABLE = "SELECT company_depart_code, company_depart_name FROM "+ COMPANIES_DEPART_DATA;
	/** authorities入力用SQL文 */
	private final String INSERT_SQL_AUTHORITIES = "INSERT INTO employee_authorities (employee_username,authorities) VALUES ( ? , ? )";
	/** employeeIdの最後を取得 */
	private final String SELECT_SQL_EMPLOYEE_ID = "SELECT employee_id FROM employee_users_data ORDER BY employee_id DESC LIMIT 1";
	/** 社員数を数えるためのSQL */
	private final String SELECT_SQL_COUNT_USER = "SELECT COUNT ("+EMPLOYEE_ID+") AS x FROM "+USERS_DATA;
	/** 企業に対する社員数を数えるためのSQL */
	private final String SELECT_SQL_COUNT_USER_COMPAANY = "SELECT COUNT ("+EMPLOYEE_ID+")AS x FROM "+USERS_DATA +"where "+EMPLOYEE_COMPANY_CODE+"= ? ";
	/** 削除用SQL文 */
	private String SELECT_SQL_DELETE = "DELETE FROM "+USERS_DATA+" "+" WHERE "+EMPLOYEE_ID+" "+" = ?";
}