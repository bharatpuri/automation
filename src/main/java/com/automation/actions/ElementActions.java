package com.automation.actions;

import org.openqa.selenium.WebElement;

import com.automation.base.CustomException;
import com.selenium.common.Locator;

public interface ElementActions {
	public WebElement getElement(Locator locator) throws CustomException;
	
	public void clickOnElement(WebElement element) throws CustomException;

	public String getElementText(WebElement element) throws CustomException;

	public void submitOnElement(WebElement element) throws CustomException;

	public void clearText(WebElement element) throws CustomException;

	public void enterText(String textToSend, WebElement element) throws CustomException;

	public boolean isElementEnabled(WebElement element) throws CustomException;

	public boolean isElementDisplayed(WebElement element) throws CustomException;
	
	public boolean isElementSelected(WebElement element) throws CustomException;

}
