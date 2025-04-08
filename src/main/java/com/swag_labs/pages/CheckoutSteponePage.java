package com.swag_labs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.java.utils.RandomData;
import com.swag_labs.base.SetUp;

public class CheckoutSteponePage extends SetUp{
	
	public CheckoutSteponePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first-name")
	private WebElement firstname;
	public void enterFistname()
	{
		firstname.sendKeys(RandomData.getFirstname());
	}

	@FindBy(id="last-name")
	private WebElement lastname;
	
	public void enterLastName()
	{
		lastname.sendKeys(RandomData.getLastName());
	}
	
	@FindBy(id="postal-code")
	private WebElement postalCode;
	
	public void enterPostalCode()
	{
		postalCode.sendKeys(RandomData.getPostalAddress());
	}
	
	@FindBy(id="continue")
	private WebElement cont;
	
	public void clickOnContinue()
	{
		cont.click();
	}

}
