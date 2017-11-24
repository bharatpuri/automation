package com.automation.actionsimpl;

import org.openqa.selenium.Alert;

import com.automation.actions.AlertActions;
import com.automation.base.CustomException;
import com.automation.browser.Browser;

public class AlertImplementions implements AlertActions {

	Alert simpleAlert = Browser.getDriver().switchTo().alert();
	
	/* 
	 * Get the text from alert on web page
	 */
	@Override
	public String getAlertText() throws CustomException {

		String alertText = simpleAlert.getText();

		return alertText;
	}

	/* 
	 * Accept the alert from web page 
	 * 
	 */
	@Override
	public void acceptAlert() {
		simpleAlert.accept();

	}

	/* 
	 * Dismiss the alert from web page 
	 */
	@Override
	public void dismissAlert() {
		simpleAlert.dismiss();

	}

}
