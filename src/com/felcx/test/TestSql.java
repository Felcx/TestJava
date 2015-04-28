package com.felcx.test;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.felcx.interfaces.IBaseExcute;


public class TestSql implements IBaseExcute {

	/**
	 * 连接到mysql数据库
	 * 
	 * @throws Exception
	 */
	private void connToMysql() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost/test", "Felcx", "TZLaiomy");
		System.out.println("Database connected!");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("show databases");
		while (resultSet.next()) {
			System.out.println(resultSet.getString(1));
		}
		connection.close();
	}

	/**
	 * 获取数据库元数据
	 */
	private void getMetaData() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost/test", "Felcx", "TZLaiomy");
		System.out.println("Database connected!");
		DatabaseMetaData dbMetaData=connection.getMetaData();
		System.out.println(dbMetaData.getURL());
		System.out.println(dbMetaData.getUserName());
		System.out.println(dbMetaData.getDatabaseProductName());
		System.out.println(dbMetaData.getDriverName());
		System.out.println(dbMetaData.getDriverVersion());
		System.out.println(dbMetaData.getDriverMajorVersion());
		System.out.println(dbMetaData.getMaxConnections());
		System.out.println(dbMetaData.getMaxTableNameLength());
		ResultSet rTables=dbMetaData.getTables(null, null, null, new String[]{"TABLE"});
		while(rTables.next()){
			System.out.println(rTables.getString("TABLE_NAME"));
		}
		connection.close();
	}

	@Override
	public void excuter() throws Exception {
		 connToMysql();
		//getMetaData();
	}

}
