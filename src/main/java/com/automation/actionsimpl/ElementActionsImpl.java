package com.automation.actionsimpl;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.automation.actions.ElementActions;
import com.automation.base.CustomException;

import applicationFunctions.Locator;

public class ElementActionsImpl implements ElementActions {
	private final static Logger LOGGER = Logger.getLogger(ElementActionsImpl.class.getName());

//	public WebElement getElement(String element) throws CustomException {
//		WebElement webElement = null;
//
//		String loctor_type = element.split("=")[0].replace("\"", "");
//		String locator_value = element.split("=", 2)[1].replace("\"", "");
//
//		switch (loctor_type) {
//		case "id": // Search the element with Id property
//			if (waitForElement().until(ExpectedConditions.visibilityOfElementLocated(By.name(locator_value)))
//					.isDisplayed()) {
//				webElement = Browser.getDriver().findElement(By.id(locator_value));
//			} else
//				throw new CustomException("No element found on web page by " + locator_value);
//			break;
//		case "name": // Search the element with Name property
//			webElement = Browser.getDriver().findElement(By.name(locator_value));
//			if (waitForElement().until(ExpectedConditions.visibilityOfElementLocated(By.name(locator_value)))
//					.isDisplayed()) {
//				webElement = Browser.getDriver().findElement(By.name(locator_value));
//			} else
//				throw new CustomException("No element found on web page by " + locator_value);
//			break;
//		case "cssSelector": // Search the element with cssSelector property
//			if (waitForElement().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator_value)))
//					.isDisplayed()) {
//				webElement = Browser.getDriver().findElement(By.cssSelector(locator_value));
//			} else
//				throw new CustomException("No element found on web page by " + locator_value);
//			break;
//		case "xpath": // Search the element with xpath property
//			if (waitForElement().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator_value)))
//					.isDisplayed()) {
//				webElement = Browser.getDriver().findElement(By.xpath(locator_value));
//
//			} else
//				throw new CustomException("No element found on web page by " + locator_value);
//			break;
//		case "className": // Search the element with className property
//			if (waitForElement().until(ExpectedConditions.visibilityOfElementLocated(By.className(locator_value)))
//					.isDisplayed()) {
//				webElement = Browser.getDriver().findElement(By.className(locator_value));
//			} else
//				throw new CustomException("No element found on web page by " + locator_value);
//			break;
//		case "linkText": // Search the element with linkText property
//			if (waitForElement().until(ExpectedConditions.visibilityOfElementLocated(By.linkText(locator_value)))
//					.isDisplayed()) {
//				webElement = Browser.getDriver().findElement(By.linkText(locator_value));
//			} else
//				throw new CustomException("No element found on web page by " + locator_value);
//			break;
//		case "partialLinkText":// Search the element with partialLinkText
//			// property
//			if (waitForElement().until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(locator_value)))
//					.isDisplayed()) {
//				webElement = Browser.getDriver().findElement(By.partialLinkText(locator_value));
//			} else
//				throw new CustomException("No element found on web page by " + locator_value);
//			break;
//		case "tagName": // Search the element with tagName property
//			if (waitForElement().until(ExpectedConditions.visibilityOfElementLocated(By.tagName(locator_value)))
//					.isDisplayed()) {
//				webElement = Browser.getDriver().findElement(By.tagName(locator_value));
//			} else
//				throw new CustomException("Failed invalid locator type: " + locator_value);
//			break;
//		default: // Throw exception if any invalid WebElement is found
//			throw new CustomException("Failed to read the data from file" + loctor_type);
//		}
//		return webElement;
//	}

	@Override
	public void clickOnElement(String element) throws CustomException {
		WebElement webElement = Locator.findElement(element);
		if (webElement.isEnabled()) {
			webElement.click();
			LOGGER.info("Click action performed on this element: " + element);
		} else
			throw new CustomException("Failed to click on element on this locator: " + element);

	}

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

	@Override
	public void submitOnElement(String element) throws CustomException {
		WebElement webElement =  Locator.findElement(element);
		if (webElement.isDisplayed()) {
			webElement.submit();
			LOGGER.info("Submit action performed on this element: " + element);
		} else
			throw new CustomException("Failed to submit on element with this locator: " + element);

	}

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
