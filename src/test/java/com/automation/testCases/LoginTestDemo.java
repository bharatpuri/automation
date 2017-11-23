package com.automation.testCases;

import org.testng.annotations.Test;

import com.automation.base.CustomException;
import com.automation.browser.Browser;
import com.automation.browser.Chrome;

import applicationFunctions.LoginPageFunctionality;

public class LoginTestDemo {
	LoginPageFunctionality login;
	Browser browser = new Chrome();

	public LoginTestDemo() throws CustomException {
		login = new LoginPageFunctionality();
	}

	@Test
	public void login() throws CustomException {

		browser.openBrowser();
		login.loginAsSuperUser();
	}
}
