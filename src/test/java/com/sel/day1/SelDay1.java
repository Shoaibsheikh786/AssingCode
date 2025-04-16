package com.sel.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelDay1 {
	
	public static void main(String[] args) {
		
		//open 
		//basic methods in selnium 
		
		//selenium methos
		
		//class ChromeDriver();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.navigate().to("https://www.google.com");
		
		driver.manage().window().maximize();  //max
		
		driver.manage().window().minimize(); //min
		
		driver.manage().deleteAllCookies();
		
		driver.navigate().forward();
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		driver.close(); //to current window
		
		driver.quit();  //to close all the windows
		
		
	}

}
