package com.sel.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandles {
  
	@Test
	public void test1() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/windows");
		String bTitle=driver.getTitle();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		//1. need to  switch control to the another page
		String cWin= driver.getWindowHandle();
		
		
		Set<String> allWin=   driver.getWindowHandles();
		//--> driver(id)
		//conver it inot the list 
		
	    List<String> li=new ArrayList<>(allWin);
	    String sw=li.get(1);
	    
	    driver.switchTo().window(sw);
	    
		String aTitle=driver.getTitle();
		
		System.out.println("Beforer Click "+bTitle);
		
		System.out.println("After Click "+aTitle);
		Thread.sleep(2000);
		driver.switchTo().window(cWin);
	}
}
