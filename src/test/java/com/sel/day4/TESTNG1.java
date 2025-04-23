package com.sel.day4;

import org.testng.annotations.Test;

public class TESTNG1 {

	 
   //before test=1  , before method->2
	
	
	@Test(priority=1,invocationCount=5,invocationTimeOut=500) 
	public void test2()
	{
		System.out.println("Hello world 2");
	}
	@Test(enabled=false)
	public void test1()
	{
		System.out.println("Hello world 1");
	}
	
	@Test(groups="smoke")
	public void sTest()
	{
		System.out.println("smoke Test");
	}
	
	@Test(groups="regression")
	public void rTest()
	{
		System.out.println("regression 1");
	}
	@Test(groups="regression")
	public void rTest2()
	{
		System.out.println("regression 2");
	}
	
	
	// parallel testing
	// listeners
	
}
