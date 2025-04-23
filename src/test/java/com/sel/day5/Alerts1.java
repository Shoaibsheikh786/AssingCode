package com.sel.day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
//		driver.get("https://practice.expandtesting.com/js-dialogs");
//		driver.findElement(By.id("js-alert")).click();
		
		//alert will be generated
		
		//ok //acecpt ;
		//cancel //dismiss
		//____ send keys
		
		
		driver.get("https://practice.expandtesting.com/js-dialogs");
		driver.findElement(By.id("js-prompt")).click();
		Alert alert=driver.switchTo().alert();
		
		alert.sendKeys("Hello world");
		Thread.sleep(2000);
		alert.accept();
		
		
		
	}

}
