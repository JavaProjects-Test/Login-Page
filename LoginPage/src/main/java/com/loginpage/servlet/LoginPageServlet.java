package com.loginpage.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.loginpage.model.LoginPage;
import com.loginpage.service.ILoginPageService;
import com.loginpage.service.LoginPageServiceImpl;

public class LoginPageServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		LoginPage objectLoginPage = new LoginPage();

		String email = request.getParameter("Email");
		String password = request.getParameter("Password");

		objectLoginPage.setEmailID(email);
		objectLoginPage.setPassword(password);

		/*
		 * ILoginPageService loginPageServiceObject = new
		 * LoginPageServiceImpl(); boolean result =
		 * loginPageServiceObject.addUser(objectLoginPage);
		 */
		boolean result = true;
		if (result) {
			out.write("<html>");
			out.write("<body>");
			out.write("<h1>Added Successfully</h1>");
			out.write("</body>");
			out.write("</html>");
		} else {
			out.write("Wrong Email Id or Password");
			RequestDispatcher re = request.getRequestDispatcher("index.html");
			re.include(request, response);
		}

	}

}
