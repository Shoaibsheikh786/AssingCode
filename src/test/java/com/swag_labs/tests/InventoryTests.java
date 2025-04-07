package com.swag_labs.tests;

import org.testng.annotations.Test;

import com.swag_labs.base.SetUp;
import com.swag_labs.pages.InventoryPage;

public class InventoryTests extends SetUp {

	InventoryPage ivp;
	public InventoryTests() {
		initlization();
		ivp=new InventoryPage(driver);
		ivp.enterUsername();
		ivp.enterPassword();
		ivp.clickOnLoign();
	}

	@Test
	public void verifyProductCheckoutFunctionality() {
		
		ivp.addTwoRandomProducts();
	}

}
