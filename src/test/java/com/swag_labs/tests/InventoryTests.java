package com.swag_labs.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.java.listeners.AllureListener;
import com.java.utils.Messages;
import com.swag_labs.base.SetUp;
import com.swag_labs.pages.CartPage;
import com.swag_labs.pages.CheckoutCompletePage;
import com.swag_labs.pages.CheckoutPage;
import com.swag_labs.pages.CheckoutSteponePage;
import com.swag_labs.pages.InventoryPage;
import com.swag_labs.pages.LoginPage;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Listeners(AllureListener.class)
public class InventoryTests extends SetUp {

	InventoryPage ivp;
	CheckoutPage chkOut;
	CartPage cart;
	CheckoutSteponePage details;
	CheckoutCompletePage ckCmplt;
	LoginPage lp;
	public InventoryTests() {
		initlization();
		lp=new LoginPage(driver);
		ivp=new InventoryPage(driver);
		chkOut=new CheckoutPage(driver);
		cart=new CartPage(driver);
		details=new CheckoutSteponePage(driver);
		ckCmplt=new CheckoutCompletePage(driver);
		lp.enterUsername();
		lp.enterPassword();
		lp.clickOnLoign();

	}
     
	@Epic("Ep001")
	@Feature("End to End Chekout")
	@Story("User can order items")
	@Description("validate the end to end transcation ")
	@Severity(SeverityLevel.CRITICAL)
    @Owner("Swetha")
	@Test
	public void verifyProductCheckoutFunctionality() {
		
		ivp.addTwoRandomProducts();
		ivp.clickOnCheckOutLogo();
		cart.clickOnCheckout();
		details.enterFistname();
		details.enterLastName();
		details.enterPostalCode();
		details.clickOnContinue();
		ckCmplt.clickOnFinsish();
		Assert.assertEquals(chkOut.validateOrder(),Messages.ORDER_SUCCESS_MESSAGE);
		Assert.assertEquals(chkOut.validateCheckout(),Messages.ORDER_CONFIRMATION_MESSAGE);
	
		
	}

}
