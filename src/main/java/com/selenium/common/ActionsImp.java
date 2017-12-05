package com.selenium.common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.automation.browser.Browser;

public class ActionsImp {
	Actions actions = new Actions(Browser.getDriver());

	public void mouseHover(WebElement element) {

		actions.moveToElement(element).build().perform();

	}

}
