package com.automation.actionsimpl;

import org.openqa.selenium.Alert;

import com.automation.actions.AlertActions;
import com.automation.base.CustomException;
import com.automation.browser.Browser;

public class AlertImplementions implements AlertActions {

	Alert simpleAlert = Browser.getDriver().switchTo().alert();

	public String getAlertText() throws CustomException {

		String alertText = simpleAlert.getText();

		return alertText;
	}

	@Override
	public void acceptAlert() {
		simpleAlert.accept();

	}

	@Override
	public void dismissAlert() {
		simpleAlert.dismiss();

	}

}
