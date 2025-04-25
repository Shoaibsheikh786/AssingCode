package com.pagemodel;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookTest extends Base {

	//1.use this url https://www.facebook.com/r.php?entry_point=login
	//2. use this url https://www.facebook.com/ --> X
	//3. get the value from config file --> chrome , firefox ,else brwoser not found
	//4. get browser and username and password form config file
	//5. create an excel file store username and passowrd there then read it , 
	//6. use parameter to pass username and passwrod @Parameters

	
	@BeforeTest
	public void setUp() {
		//if(valu.equsl==chrme)--> chorme , or firex-> firefox 
		initilization(); // --> it will change the driver val- >chrome, firefox, timeout, maxscreen, deltecookies,..etc
		fb = new FacebookPage(driver); //null
		
		 
	}
	
	@Test()
	public void loginWithInvalidCredentials2() {

	  
		fb.enterEmail("some other email");
		fb.enterPassword("newPassword2");

		// some best practice

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test(enabled=false)
	public void loginWithInvalidCredentials() {

		
		fb.enterEmail("thistime@gmail.com");
		fb.enterPassword("newPassword");

		// some best practice

	}
	
	
	@Test(enabled=false)
	public void createNewAccoutn()
	{
		fb.clicOnCreateNewAccount();
	}

}
