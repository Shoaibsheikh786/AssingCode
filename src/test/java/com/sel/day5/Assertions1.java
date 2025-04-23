package com.sel.day5;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions1 {
	
	@Test
	public void test1()
	{

		System.out.println("Open chrome");
		System.out.println("Url");
		System.out.println("login");
		
		//Assetions-> 
		//1. Hard Assertion
		//2. Soft Assertion
		//driver.getTitle();
		//btn.getText();
		//btn.isDisplayed();
		//
		Assert.assertEquals("facebook","twitter");
		
		//will this code be execute if test fails 
		System.out.println("login Again");
	}
	
	@Test
	public void test12()
	{
		SoftAssert sf=new SoftAssert();

		System.out.println("Open chrome");
		System.out.println("Url");
		System.out.println("login");
		
		//Assetions-> 
		//1. Hard Assertion
		//2. Soft Assertion
		//driver.getTitle();
		//btn.getText();
		//btn.isDisplayed();
		//
		sf.assertEquals("facebook","twitter");
		
		
		//will this code be execute if test fails 
		System.out.println("login");
		
    
		//assertAll();
		sf.assertAll();
		
	
	}


}
