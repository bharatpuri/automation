package com.automation.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.automation.base.HandleException;

public class IE extends Browser {

	@Override
	public WebDriver getBrowser() throws HandleException {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\abc\\Desktop\\Server\\IEDriverServer.exe");
		return new InternetExplorerDriver();
	}

}
