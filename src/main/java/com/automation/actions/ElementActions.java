package com.automation.actions;

import org.openqa.selenium.WebElement;

import com.automation.base.HandleException;

public interface ElementActions {
	
	public WebElement getElement(String locator) throws HandleException;

	public void clickOnElement(String element) throws HandleException;

	public String getElementText(String element) throws HandleException;

	public void submitOnElement(String element) throws HandleException;

	public void clearText(String element) throws HandleException;

	public void sendKeysToElement(String textToSend, String element) throws HandleException;
}
