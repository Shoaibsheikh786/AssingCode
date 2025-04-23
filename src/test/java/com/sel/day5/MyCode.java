package com.sel.day5;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyCode implements  ITestListener{

	
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		//write it here
		System.out.println("Hello Test Passed");
   	}

	@Override
	public void onTestFailure(ITestResult result) {
		//write it herer
		
		System.out.println("Hello Test Failed TakeScreenshot");
	}

	
}
