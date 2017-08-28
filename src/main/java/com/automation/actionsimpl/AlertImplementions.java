package com.automation.actionsimpl;

import org.openqa.selenium.Alert;

import com.automation.actions.AlertActions;
import com.automation.base.HandleException;
import com.automation.browser.Browser;
public class AlertImplementions implements AlertActions {


	public String getAlertText() throws HandleException {
		Alert simpleAlert;

		simpleAlert = Browser.getDriver().switchTo().alert();

		String alertText = simpleAlert.getText();

		return alertText;
	}

	public void handleAlert(String action) {
		Alert simpleAlert;

		simpleAlert =  Browser.getDriver().switchTo().alert();

		if (action.equalsIgnoreCase("accept")) {
			simpleAlert.accept();
		} else
			simpleAlert.dismiss();
	}

}
