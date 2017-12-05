package com.pageObjects;

import com.selenium.common.Locator;
import com.selenium.common.Locator.LocatorType;

/**
 * This class will contains all the elements of Groups page.
 * @author bharatp
 *
 */
public class GroupPage {
	public static Locator groupTab = new Locator(LocatorType.ID, "lrsadminAccGroupItem");

	public static Locator addNewGroup = new Locator(LocatorType.ID, "addAccountGroups");

	public static Locator viewAllGroups = new Locator(LocatorType.ID, "showAllAccountGroup");

	public static Locator accountGroupName = new Locator(LocatorType.ID, "accountGroupName");

	public static Locator groupDescription = new Locator(LocatorType.ID, "description");

	public static Locator cancelGroupButton = new Locator(LocatorType.XPATH, "//button[contains(.,'Cancel')]");

	public static Locator saveGroupButton = new Locator(LocatorType.XPATH, "//button[contains(.,'Save')]");

	public static Locator deleteGroupButton = new Locator(LocatorType.XPATH, "//button[contains(.,'Delete Group')]");

	public static Locator firstGroupFromList = new Locator(LocatorType.XPATH, "//div[(@class='mdMasterNode')]");

	// /**
	// * Constructor will initialized all the elements of this class
	// */
	// public GroupPage() {
	// PageFactory.initElements(Browser.getDriver(), this);
	// }

}
