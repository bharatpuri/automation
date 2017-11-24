package com.automation.actionsimpl;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.automation.actions.ElementActions;
import com.automation.base.CustomException;

import applicationFunctions.Locator;

public class ElementActionsImpl implements ElementActions {
	private final static Logger LOGGER = Logger.getLogger(ElementActionsImpl.class.getName());

	/* 
	 * Click on web Element 
	 */
	@Override
	public void clickOnElement(String element) throws CustomException {
		WebElement webElement = Locator.findElement(element);
		if (webElement.isEnabled()) {
			webElement.click();
			LOGGER.info("Click action performed on this element: " + element);
		} else
			throw new CustomException("Failed to click on element on this locator: " + element);

	}

	/* 
	 * Get the text on web element
	 */
	public String getElementText(String element) throws CustomException {
		String text = null;
		WebElement webElement =  Locator.findElement(element);
		if (webElement.isDisplayed()) {
			text = webElement.getText();
		} else {
			throw new CustomException("Failed to get the text on this locator: " + element);
		}
		return text;
	}

	/* 
	 * Perform Submit action on web element 
	 */
	@Override
	public void submitOnElement(String element) throws CustomException {
		WebElement webElement =  Locator.findElement(element);
		if (webElement.isDisplayed()) {
			webElement.submit();
			LOGGER.info("Submit action performed on this element: " + element);
		} else
			throw new CustomException("Failed to submit on element with this locator: " + element);

	}

	/* 
	 * Clear the text from text element 
	 */
	public void clearText(String element) throws CustomException {
		WebElement webElement =  Locator.findElement(element);
		if (webElement.isEnabled()) {
			webElement.clear();
			LOGGER.info("Clear text on this locator: " + element);
		} else
			throw new CustomException("Failed to clear the element text on this locator: " + element);
	}

	// @Override
	// public boolean isElementEnabled(WebElement element) throws CustomException {
	// WebElement webElement = getElement(element);
	// return webElement.isEnabled();
	// }
	//
	// @Override
	// public boolean isElementDisplayed(WebElement element) throws CustomException
	// {
	// WebElement webElement = getElement(element);
	// return webElement.isDisplayed();
	//
	// }

	// @Override
	// public boolean isElementEnabled(WebElement element) throws CustomException {
	// // TODO Auto-generated method stub
	// return false;
	// }
	//
	// @Override
	// public void sendKeysToElement(String textToSend, WebElement element) throws
	// CustomException {
	// if (isElementEnabled(element)) {
	// element.clear();
	// element.sendKeys(textToSend);
	// LOGGER.info("Text entered on this locator :" + element + "" + textToSend);
	// } else
	// throw new CustomException("Failed to send the key on this locator: " +
	// element);
	// }

	/* 
	 * Enter key(input) to text box on web element 
	 */
	@Override
	public void sendKeysToElement(String textToSend, String element) throws CustomException {
		WebElement webElement =  Locator.findElement(element);
		if (webElement.isEnabled()) {
			webElement.clear();
			webElement.sendKeys(textToSend);
			LOGGER.info("Text entered on this locator :" + element + "" + textToSend);
		} else
			
			throw new CustomException("Failed to send the key on this locator: " + element);
	}

}
