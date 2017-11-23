package com.automation.actions;

import com.automation.base.CustomException;

public interface AlertActions {
	
	public abstract String getAlertText() throws CustomException;

	public abstract void acceptAlert();
	
	public abstract void dismissAlert();

}
