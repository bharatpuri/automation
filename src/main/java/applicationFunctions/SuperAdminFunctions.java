package applicationFunctions;

import com.automation.actionsimpl.ElementActionsImpl;
import com.automation.base.CustomException;
import com.automation.base.DataStoreRepository;
import com.pageObjects.LoginPage;

public class LoginPageFunctionality {
	ElementActionsImpl eleActions = new ElementActionsImpl();
	DataStoreRepository loginTestData;

	public LoginPageFunctionality() throws CustomException {
		loginTestData = DataStoreRepository.loadRepository("TestData", "loginTestData");
	}

	// login with super user
	public void loginAsSuperUser() throws CustomException {

		String userName = loginTestData.getValue("LoginUsername");
		String password = loginTestData.getValue("LoginPassword");

		eleActions.sendKeysToElement(userName, LoginPage.loginUserName);
		eleActions.sendKeysToElement(password, LoginPage.loginPassword);
		eleActions.clickOnElement(LoginPage.loginSubmit);
		

	}

}
