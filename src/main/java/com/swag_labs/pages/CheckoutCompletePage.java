package com.swag_labs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swag_labs.base.SetUp;

public class CheckoutCompletePage extends SetUp{
	
	public CheckoutCompletePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//button[text()='Finish']")
	private WebElement finish;
	
	public void clickOnFinsish()
	{
		finish.click();
	}

}
