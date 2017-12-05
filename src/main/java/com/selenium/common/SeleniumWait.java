package com.selenium.common;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.browser.Browser;

public class SeleniumWait {
	/**
	 * Wait for element 120 seconds
	 * 
	 * @return
	 */
	public static WebDriverWait waitForElement() {
		return new WebDriverWait(Browser.getDriver(), 120);
	}

}
