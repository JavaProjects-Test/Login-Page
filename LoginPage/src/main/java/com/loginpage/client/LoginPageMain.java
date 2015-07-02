/*package com.loginpage.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.loginpage.model.LoginPage;
import com.loginpage.servlet.LoginPageServlet;

public class LoginPageMain {

	public static void main(String[] args) {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
LoginPage objectLoginPage=new LoginPage();
System.out.println("Welcome to Login World");
while(true){
	
	try {
		System.out.println("Enter Email ID");
		objectLoginPage.setEmailID(br.readLine());
		
		System.out.println("Enter Password");
		objectLoginPage.setPassword(br.readLine());
		
		LoginPageServlet objLoginPageServlet=new LoginPageServlet();
	//objLoginPageServlet.service(objectLoginPage.setEmailID(br.readLine()), objectLoginPage.setPassword(br.readLine()));
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

	}

}
*/