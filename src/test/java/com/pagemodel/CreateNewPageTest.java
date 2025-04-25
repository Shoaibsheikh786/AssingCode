package com.pagemodel;

import org.testng.annotations.Test;

public class CreateNewPageTest extends Base{
	
	//constructor
	//@beofre method
	
//	@BeforeTest()
//	public void SetUp()
//	{
//		initilization();
//	}
	FacebookPage fb;
	CreateNewPage cp;
	CreateNewPageTest()
	{   
		//super();
		initilization();
		fb=new FacebookPage(driver);
		cp=new CreateNewPage(driver);
	}
	@Test
	void verifyFirstName()
	{
		fb.clicOnCreateNewAccount();
		cp.enterFirstName("shoaib");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test(enabled=false)
	public void printTitle()
	{   
		
		String title=driver.getTitle();
		System.out.println("Title "+title);
	}
	
	@Test(enabled=false)
	public void printTitle2()
	{   
		
		String title=driver.getTitle();
		System.out.println("Title "+title);
	}
	
	

}
