package com.sel.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cal {

	// calender
	// TakeScrnshot
	// Data Driven testing

	@Test
	public void dealingWithCalender() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();

		// October 2025

		WebElement m = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));

		String month = m.getText(); //april 

		System.out.println(month);
		
		while(!month.equals("October"))
		{
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			Thread.sleep(1000);
			
			
			 m = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
             month = m.getText();
			
		}
		
		driver.findElement(By.xpath("//a[text()='10']")).click();
	}

}
