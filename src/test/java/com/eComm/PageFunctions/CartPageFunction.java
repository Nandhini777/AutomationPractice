package com.eComm.PageFunctions;

import org.testng.Assert;

import com.eComm.Utils.CommonClasses;

public class CartPageFunction extends CommonClasses {

	public static CartPageFunction CartPageFunction;

	public static CartPageFunction getInstance() {
		if (CartPageFunction == null) {
			CartPageFunction = new CartPageFunction();
		}
		return CartPageFunction;

	}


	
}

	

