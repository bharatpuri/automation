package com.automation.testCases;

import org.apache.log4j.Logger;

import com.automation.base.HandleException;
import com.automation.browser.Browser;
import com.automation.browser.Chrome;

public class TestDemo {
	
	private final static Logger LOGGER = Logger.getLogger(Browser.class.getName());

	
	public static void main(String[] args) throws HandleException {
		
		LOGGER.info("Start the execution of the program");
		
		Browser b = new Chrome();
		b.openBrowser();
		System.out.println("Hello");
		
//		DataStoreRepository data = new DataStoreRepository("pageobjects", "loginPage");
//		IDataStoreInMap dataStore = data.CreateDataStoreForFile();
//		System.out.println(dataStore.getValue("bharat"));
	}

}
