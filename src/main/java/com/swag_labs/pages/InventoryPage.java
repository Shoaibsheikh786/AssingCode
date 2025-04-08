package com.swag_labs.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.java.utils.PasswordUtils;
import com.java.utils.RandomData;
import com.swag_labs.base.SetUp;

public class InventoryPage extends SetUp {

	List<Double> price;

	public InventoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		price = new ArrayList<>();
	}

	

	// Inventory

	@FindBy(xpath = "//button[text()='Add to cart']")
	private List<WebElement> Products;

	public void addTwoRandomProducts() {
		int r = RandomData.genRandom();
		WebElement ele = Products.get(r);
		ele.click();
		WebElement ele2 = Products.get(r+1);
		ele2.click();

	}
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	private WebElement checkoutLogo;
	
	public void clickOnCheckOutLogo()
	{
		checkoutLogo.click();
	}
	
	
	
	

	
	
	
 
}
