package com.automation.wait;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.browser.Browser;


public class SeleniumWait {

	public static WebDriverWait waitForElement() {
		return new WebDriverWait(Browser.getDriver(), 120);
	}
}
