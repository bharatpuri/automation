package com.pageObjects;

import com.selenium.common.Locator;
import com.selenium.common.Locator.LocatorType;

/**
 * @author bharatp This class contains all the elements of login page
 */
public class LoginPage {
	
	public static Locator userName = new Locator(LocatorType.ID, "j_username");
	
	public static Locator loginPassword = new Locator(LocatorType.ID, "j_password");

	public static String loginSubmit = "xpath=//button[contains(.,'Login')]";
	

}
