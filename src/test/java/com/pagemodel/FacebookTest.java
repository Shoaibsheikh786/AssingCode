package com.pagemodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookTest {

	WebDriver driver;
	FacebookPage fb;

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 fb = new FacebookPage(driver);
	}

	@Test
	public void loginWithInvalidCredentials() {

		
		fb.enterEmail("thistime@gmail.com");
		fb.enterPassword("newPassword");

		// some best practice

	}
	@Test
	public void loginWithInvalidCredentials2() {

	  
		fb.enterEmail("some other email");
		fb.enterPassword("newPassword2");

		// some best practice

	}

}
