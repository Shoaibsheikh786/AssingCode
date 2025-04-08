package com.swag_labs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.java.utils.CommonUtils;
import com.swag_labs.base.SetUp;

public class CheckoutPage extends SetUp {
	
	//Constructor to initlize
	public CheckoutPage(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[@class='title' and @data-test='title']")
	private WebElement CheckOutCompleteLogo;
	public String validateCheckout()
	{
		return CommonUtils.getText(CheckOutCompleteLogo);
	}
	
	@FindBy(xpath="//div[@id='checkout_complete_container']/child::h2")
	private WebElement orderMessage;
	
	public String validateOrder()
	{
		return CommonUtils.getText(orderMessage);
	}

}
