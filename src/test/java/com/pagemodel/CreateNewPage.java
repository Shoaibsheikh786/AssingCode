package com.pagemodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewPage extends Base{
	
	public CreateNewPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement fname;	
	
	public void enterFirstName(String f)
	{
		fname.sendKeys(f);
	
	}

}
