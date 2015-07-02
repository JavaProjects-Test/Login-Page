package com.loginpage.service;

import com.loginpage.dao.ILoginPageDao;
import com.loginpage.dao.LoginPageDaoImpl;
import com.loginpage.model.LoginPage;
import com.loginpage.servlet.LoginPageServlet;

public class LoginPageServiceImpl implements ILoginPageService {
	ILoginPageDao objectLoginPageDao = new LoginPageDaoImpl();

	public boolean addUser(LoginPage object) {
		boolean status = false;
		if (object.getEmailID() != null && object.getPassword() != null) {
			status = objectLoginPageDao.addUser(object);
		}
		return status;
	}

}
