package com.pagemodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage {
	
	//1. WebElements  -> @FindBy
	//2. Actions
	//3. Constructor
	
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	public void enterEmail(String e)
	{
		email.sendKeys(e);
	}
	
	@FindBy(id="pass")
	private WebElement password;
	public void enterPassword(String p)
	{
		password.sendKeys(p);
	}
	
	FacebookPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[text()='Create new account']")
	WebElement createNewAccount;
	
	public void clicOnCreateNewAccount()
	{
		createNewAccount.click();
	}
	
	
	
   

}
