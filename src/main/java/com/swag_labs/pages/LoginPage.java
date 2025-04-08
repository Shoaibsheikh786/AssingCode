package com.swag_labs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.java.utils.PasswordUtils;
import com.swag_labs.base.SetUp;

public class LoginPage  extends SetUp{
	
   public LoginPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
	@FindBy(id = "user-name")
	private WebElement username;

	public void enterUsername() {
		username.sendKeys(getUsername());
	}

	@FindBy(name = "password")
	private WebElement password;

	public void enterPassword() {
		String pass=getPassword();
		password.sendKeys(PasswordUtils.decrypt(pass));
	}

	@FindBy(css = "input[value='Login']")
	private WebElement login;

	public void clickOnLoign() {
		login.click();
	}

}
