package com.loginpage.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.loginpage.model.LoginPage;

public class LoginPageDaoImpl implements ILoginPageDao {

	public Connection getConnection() throws Exception {
		System.out.println("Driver Loading.....");
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded.");
		System.out.println("Establishing Connection.....");
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql//localhost:3307/LOGINDB", "root", "12345");
		System.out.println("Connection Estsblished.");
		return connection;
	}

	public boolean addUser(LoginPage object) {
		boolean status = false;
		Connection connection;
		try {
			connection = getConnection();
			PreparedStatement preparedStatement = connection
					.prepareStatement("INSERT INTO LOGINTABLE value EMAIL_ID=?,PASSWORD=?");
			preparedStatement.setString(1, "EMAIL_ID");
			preparedStatement.setString(2, "PASSWORD");
			int numberOfUpdate = preparedStatement.executeUpdate();
			if (numberOfUpdate == 1) {
				status = true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

}
