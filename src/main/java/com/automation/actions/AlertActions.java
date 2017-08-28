package com.automation.actions;

import com.automation.base.HandleException;

public interface AlertActions {
	
	public abstract String getAlertText() throws HandleException;

	public abstract void handleAlert(String action);

}
