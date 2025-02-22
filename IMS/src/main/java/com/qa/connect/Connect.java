package com.qa.connect;

import java.sql.*;

public class Connect {
	
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static String DB_URL;
	static final String USER = "root";
	static final String PASS = "pickle";
	
	static Connection conn = null;
	static Statement stmt = null;

	public Connect(String database) {
//		DB_URL = "jdbc:mysql://localhost:3306/" + database + "?useSSL=false&serverTimezone=GMT";//test on local workbench
		DB_URL = "jdbc:mysql://34.89.64.253/" + database + "?useSSL=false&serverTimezone=GMT";//publicIP
//		DB_URL = "jdbc:mysql://xx.xx.xxx.x/" + database + "?useSSL=false&serverTimezone=GMT";//privateIP
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Connecting to the inventory database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Connection call() {
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);			
			System.out.println("Connected!\n");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public Statement getstmt() {
		return stmt;
	}
	
}
