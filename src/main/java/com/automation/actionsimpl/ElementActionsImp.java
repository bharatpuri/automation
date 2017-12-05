package com.automation.actionsimpl;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.automation.actions.ElementActions;
import com.automation.base.CustomException;
import com.automation.browser.Browser;
import com.selenium.common.Locator;

public class ElementActionsImp implements ElementActions {
	private final static Logger LOGGER = Logger.getLogger(ElementActionsImp.class.getName());

	/**
	 * Click on web element when element is enabled on web page
	 * 
	 * @param element
	 * @throws CustomException
	 */
	@Override
	public void clickOnElement(WebElement element) throws CustomException {
		// checking element is enabled or not
		if (isElementEnabled(element)) {
			element.click();
			LOGGER.info("Click action performed on this element: " + element);
		} else
			throw new CustomException("Failed to click on element on this locator: " + element);

	}

	/**
	 * Get text from enabled element
	 * 
	 * @param element
	 * @return element text
	 * @throws CustomException
	 */
	@Override
	public String getElementText(WebElement element) throws CustomException {
		String text = null;
		// checking element is enabled or not
		if (isElementEnabled(element)) {
			text = element.getText();
		} else {
			throw new CustomException("Failed to get the text on this locator: " + element);
		}
		return text;
	}

	/**
	 * Perform submit action on enabled element
	 * 
	 * @param element
	 * @throws CustomException
	 */
	@Override
	public void submitOnElement(WebElement element) throws CustomException {
		// checking element is enabled or not
		if (isElementEnabled(element)) {
			element.submit();
			LOGGER.info("Click action performed on this element: " + element);
		} else
			throw new CustomException("Failed to click on element on this locator: " + element);

	}

	/**
	 * Clear text from text element when element is enabled
	 * 
	 * @param element
	 * @throws CustomException
	 */
	@Override
	public void clearText(WebElement element) throws CustomException {
		// Checking element is enabled or not
		if (isElementEnabled(element)) {
			element.clear();
			LOGGER.info("Clear text on this locator: " + element);
		} else
			throw new CustomException("Failed to clear the element text on this locator: " + element);

	}

	/**
	 * Enter key(input) to the element when element is enabled
	 * 
	 * @param textToSend
	 * @param element
	 * @throws CustomException
	 */
	@Override
	public void enterText(String textToSend, WebElement element) throws CustomException {
		// Checking element is enabled or not
		if (isElementEnabled(element)) {
			element.clear();
			element.sendKeys(textToSend);
			LOGGER.info("Text entered on this locator :" + element + "" + textToSend);
		} else
			throw new CustomException("Failed to send the key on this locator: " + element);
	}

	/**
	 * Check element is enabled on web page
	 * 
	 * @param element
	 * @return
	 * @throws CustomException
	 */
	@Override
	public boolean isElementEnabled(WebElement element) {
		try {
			return element.isEnabled();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			LOGGER.debug("No element found as enabled :" + element);

		}
		return false;
	}

	/**
	 * Check element is displayed on web page
	 * 
	 * @param element
	 * @return
	 * @throws CustomException
	 */
	@Override
	public boolean isElementDisplayed(WebElement element) {

		try {
			return element.isDisplayed();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			LOGGER.debug("No element found :" + element);

		}
		return false;
	}

	@Override
	public boolean isElementSelected(WebElement element) {

		try {
			return element.isSelected();

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			LOGGER.debug("No element found :" + element);

		}
		return false;
	}

	@Override
	public WebElement getElement(Locator locator) throws CustomException {
		WebElement webElement = null;
		String locatortype = locator.getLocarorType().toString();
		String locatorValue = locator.getLocarorValue();

		switch (locatortype) {
		case "ID": // Search the element with Id property

			webElement = Browser.getDriver().findElement(By.id(locatorValue.trim()));

			break;
		case "NAME": // Search the element with Name property
			webElement = Browser.getDriver().findElement(By.name(locatorValue.trim()));
			break;
		case "CSSSELECTOR": // Search the element with cssSelector property

			webElement = Browser.getDriver().findElement(By.cssSelector(locatorValue.trim()));

			break;
		case "XPATH": // Search the element with xpath property

			webElement = Browser.getDriver().findElement(By.xpath(locatorValue.trim()));

			break;
		case "CLASSNAME": // Search the element with className property

			webElement = Browser.getDriver().findElement(By.className(locatorValue.trim()));

			break;
		case "LINKTEXT": // Search the element with linkText property

			webElement = Browser.getDriver().findElement(By.linkText(locatorValue.trim()));

			break;
		case "PARTIALLINKTEXT":// Search the element with partialLinkText
			
			webElement = Browser.getDriver().findElement(By.partialLinkText(locatorValue.trim()));

			break;
		case "TAGNAME": // Search the element with tagName property

			webElement = Browser.getDriver().findElement(By.tagName(locatorValue.trim()));
			break;
		default: // Throw exception if any invalid WebElement is found
			throw new CustomException("Failed to find the locator" + locatorValue);
		}
		return webElement;
	}
//
//	public WebElement getElement1(Locator locator) throws CustomException {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
