package com.swag_labs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swag_labs.base.SetUp;

public class CartPage extends SetUp{
	
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="checkout")
	private WebElement checkout;
	public void clickOnCheckout()
	{
		checkout.click();
	}

}
