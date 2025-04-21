package com.sel.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass {
	
	//Actions 
	// mouse interaction 
	// drag n drop
	// double
	// rightclick 
	// hover
	
	@Test
	public void test1()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/drag-and-drop-circles");
		
		//1.Actions class
		
		Actions act=new Actions(driver);
		
	WebElement src=	driver.findElement(By.xpath("//div[@class='red']"));
	WebElement dest=driver.findElement(By.id("target"));
	
	act.dragAndDrop(src, dest).build().perform();
	
//	act.doubleClick(src).build().perform();
	
//right click --> contextClick()
	act.contextClick(src).build().perform();
	
	//mouseover
	
	act.moveToElement(src).build().perform();
	
	
	}

}
