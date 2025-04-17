package com.sel.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JsExecutor {
	
  @Test
  public void test1()
  {
	  WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com");
		WebElement ele=driver.findElement(By.id("back-to-top"));
	//	WebElement ele2=driver.findElement(By.xpath(""));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", ele);
		
		js.executeScript("window.scrollBy(0,500)");
		
		//
//		js.executeScript("arguments[0].value='shaoib';", ele);
		
		
		

  }

}
