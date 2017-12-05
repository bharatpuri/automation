package com.selenium.common;

/**
 * This class will initialize the locator type and value
 * @author bharatp
 *
 */
public class Locator {
	
	private LocatorType locType;
	private String value;

	public enum LocatorType {
		ID, NAME, CLASS, CSSSELECTOR, CLASSNAME, LINKTEXT, TAGNAME, PARTIALLINKTEXT, XPATH;
	}

	public Locator(LocatorType type, String locatorValue) {
		locType = type;
		value = locatorValue;
	}

	/**
	 * This function will return the locator type
	 * 
	 * @return
	 */
	public LocatorType getLocarorType() {

		return locType;
	}

	/**
	 * This function will return the locator value
	 * 
	 * @return
	 */
	public String getLocarorValue() {
		return value;

	}

}
