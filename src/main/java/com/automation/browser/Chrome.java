package com.automation.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.base.DataStoreRepository;
import com.automation.base.HandleException;
import com.automation.base.IDataStoreInMap;

public class Chrome extends Browser {
	@Override
	public WebDriver getBrowser() throws HandleException {
		DataStoreRepository data = new DataStoreRepository("", "config");
		IDataStoreInMap dataStore = data.CreateDataStoreForFile();

		System.setProperty("webdriver.chrome.driver", dataStore.getValue("forUbuntuSystemChromeDriverPath"));

		driver = new ChromeDriver();
		return driver;
	}

}
