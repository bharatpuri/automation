package com.automation.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.automation.base.CustomException;

public interface ElementActions {

	//public WebElement getElement(String locator) throws HandleException;
	
//	public boolean isElementEnabled(WebElement element) throws CustomException;
//	public boolean isElementDisplayed(WebElement element) throws CustomException;

	public void clickOnElement(String element) throws CustomException;

	public String getElementText(String element) throws CustomException;

	public void submitOnElement(String element) throws CustomException;

	public void clearText(String element) throws CustomException;

	//public void sendKeysToElement(String textToSend, WebElement element) throws CustomException;
	public void sendKeysToElement(String textToSend, String element) throws CustomException;
//	public boolean isElementEnabled(WebElement element) throws CustomException;
//
//	public boolean isElementDisplayed(WebElement element) throws CustomException;

}
