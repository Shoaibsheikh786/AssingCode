package com.sel.day5;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class Listeners1 {
	
	//Listeners -> interfaces -> abstract methods
	// -> listen a particular actions
	//-> particular -> execute if test failed -> 
	
	@Test
	public void test1()
	{

		System.out.println("Open chrome");
		System.out.println("Url");
		System.out.println("user");
		System.out.println("pass");
		System.out.println("login");
		
		Assert.assertTrue(false);  //fail
	}

}
