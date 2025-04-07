package com.swag_labs.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.java.utils.RandomData;
import com.swag_labs.base.SetUp;

public class InventoryPage extends SetUp {

	List<Double> price;

	public InventoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		price = new ArrayList<>();
	}

	@FindBy(id = "user-name")
	private WebElement username;

	public void enterUsername() {
		username.sendKeys(getUsername());
	}

	@FindBy(name = "password")
	private WebElement password;

	public void enterPassword() {
		password.sendKeys(getPassword());
	}

	@FindBy(css = "input[value='Login']")
	private WebElement login;

	public void clickOnLoign() {
		login.click();
	}

	// Inventory

	@FindBy(xpath = "//button[text()='Add to cart']")
	private List<WebElement> Products;

	public void addTwoRandomProducts() {
		int r = RandomData.genRandom();
		System.out.println("Random number --> "+r);
		
		System.out.println(Products.size());
		
		WebElement ele = Products.get(r);

		ele.click();
		
		
		WebElement ele2 = Products.get(r+1);
		ele2.click();

	}

}
