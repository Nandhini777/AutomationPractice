package com.eComm.StepDefinitions;

import com.eComm.Utils.CommonClasses;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;


public class LoginSteps extends CommonClasses {

	// Login
	@Given("^launch the website$")
	public void customerWebsiteLaunch() throws Throwable {

		getLoginPageFunctionInstance().launchWebURL();
	}

	@Given("^enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter(String email , String password) throws Throwable {
		getLoginPageFunctionInstance().login(email, password);
	}
	

	@Given("^Navigate to create an account$")
	public void create_an_account() throws Throwable {
		getLoginPageFunctionInstance().createAccount();
	}
	@Then("^user logout$")
	public void userlogout() throws Throwable {
		getLoginPageFunctionInstance().logout();
	}
}
