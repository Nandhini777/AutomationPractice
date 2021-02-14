package com.eComm.Utils;

import com.eComm.ObjectRepository.*;
import com.eComm.PageFunctions.*;

public class CommonClasses {

	// ---------------------Object Repository-------------------------

	protected RegistrationRepo getRegistrationRepo() {
		return RegistrationRepo.getInstance();

	}
	protected LoginRepo getLoginRepoInstance() {
		return LoginRepo.getInstance();

	}
	protected ProductDetailsRepo getProductDetailsRepo() {
		return ProductDetailsRepo.getInstance();

	}
	
	protected CartPageRepo getCartPageRepo() {
		return CartPageRepo.getInstance();

	}
	
	protected CheckoutPageRepo getCheckoutPageRepo() {
		return CheckoutPageRepo.getInstance();

	}
	protected MyAccountRepo getMyAccountRepo() {
		return MyAccountRepo.getInstance();

	}	


	// ---------------------PageFunctions-------------------------

	protected RegistrationPageFunction getRegistrationPageFunction() {
		return RegistrationPageFunction.getInstance();

	}
	
	protected LoginPageFunction getLoginPageFunctionInstance() {
		return LoginPageFunction.getInstance();

	}	
	
	protected CartPageFunction getCartPageFunction() {
		return CartPageFunction.getInstance();

	}

	protected ProductDetailsPageFunction getProductDetailsPageFunction() {
		return ProductDetailsPageFunction.getInstance();

	}
	
	protected CheckoutFlowFunction getCheckoutFlowFunction() {
		return CheckoutFlowFunction.getInstance();

	}
	
	// ----------------------CommonClasses-----------------------

	protected CommonActions get_CommonActions_Instance() {
		return CommonActions.getInstance();

	}

}
