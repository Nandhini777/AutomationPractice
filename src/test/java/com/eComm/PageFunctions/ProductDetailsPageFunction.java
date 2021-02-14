package com.eComm.PageFunctions;

import org.testng.Assert;

import com.eComm.Utils.CommonClasses;

public class ProductDetailsPageFunction extends CommonClasses {

	public static ProductDetailsPageFunction ProductDetailsPageFunction;

	public static ProductDetailsPageFunction getInstance() {
		if (ProductDetailsPageFunction == null) {
			ProductDetailsPageFunction = new ProductDetailsPageFunction();
		}
		return ProductDetailsPageFunction;

	}


	public void launchWebURL() throws InterruptedException {
		get_CommonActions_Instance().navigateToURL("http://automationpractice.com/index.php");
		get_CommonActions_Instance().implicitWait(50);
		get_CommonActions_Instance().pageTitleValidation("My Store");
	

	}

	

	public void login(String email, String password) throws InterruptedException {
		get_CommonActions_Instance().scrollToMakeElementVisible(getLoginRepoInstance().email);
		get_CommonActions_Instance().sendKeysAction(getLoginRepoInstance().email, email);
		get_CommonActions_Instance().sendKeysAction(getLoginRepoInstance().password, password);
		get_CommonActions_Instance().sleep(2000);
		get_CommonActions_Instance().add_Log_With_ScreenShot("Email & password");
		get_CommonActions_Instance().clickAction(getLoginRepoInstance().btnSignIn);
		get_CommonActions_Instance().add_Log_With_ScreenShot("URLLaunched");
		get_CommonActions_Instance().sleep(2000);
		get_CommonActions_Instance().pageTitleValidation("My account - My Store");
	}
	
	public void createAccount() throws InterruptedException {		
		get_CommonActions_Instance().navigateToURL("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		get_CommonActions_Instance().add_Log_With_ScreenShot("URLLaunched");
		
	}

	public void logout() throws InterruptedException {
		get_CommonActions_Instance().sleep(5000);
		get_CommonActions_Instance().scrollToToOfPage();
		get_CommonActions_Instance().clickAction(getLoginRepoInstance().logout);
	}
}

	

