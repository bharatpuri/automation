package com.pageObjects;

import org.openqa.selenium.By;

/**
 * @author bharatp This class contains all the elements of login page
 */
public class LoginPage {
	
	public static String loginUserName = "id=j_username";
	public static String loginPassword = "id=j_password";
	public static String loginSubmit = "xpath=//button[contains(.,'Login')]";
	
//	public static By loginUserNameDemo = By.id("j_username");
//	
//public static void main(String[] args) {
//	System.out.println(loginUserNameDemo);
//	String abc = loginUserNameDemo.toString().split(":")[1];
//	System.out.println(abc.trim());
//	
//	//String demo = loginSubmit.split("=")[0];
//	
//}
}
