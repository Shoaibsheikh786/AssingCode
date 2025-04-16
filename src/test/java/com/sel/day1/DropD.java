package com.sel.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DropD {

	public static void main(String[] args) throws InterruptedException {
     
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dropdown");
		WebElement d=driver.findElement(By.xpath("//select[@id='country']"));
		
		//Select 
		Select sel=new Select(d);
		
		//selectByindex
		//selectByVisisbleText
		//selectByValue
		
		sel.selectByIndex(4);
		
		Thread.sleep(2000);
		
		sel.selectByVisibleText("Australia");
		
		Thread.sleep(2000);
		
		sel.selectByValue("BE");
		
		
	}
	
	@Test
	public void findElents()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dropdown");
		
	List<WebElement> ele=driver.findElements(By.tagName("a"));
	
	//how to print from list
	System.out.println("Total Anchor Tags"+ele.size());
	for(int i=0;i<ele.size();i++)
	{
		WebElement e=ele.get(i);
		System.out.println(e.getAttribute("href")+" "+e.getText());
	}

	
	}
	
	@Test
	public void dealingWithFrames()
	{
		
		//input[@id='email']
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/iframe");
		
		
		driver.switchTo().frame("email-subscribe");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Hello");
		driver.switchTo().parentFrame();
		
	}
	
	@Test
	public void waits()
	{
		//wait 
		//1 satic wiat
		//2 dynmic
		//input[@id='email']
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/iframe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='worindabcc']")).sendKeys("Hello");
		//driver.find(logout) --> 4 --> ..
		
		//..driver.finbtn()--> 5 --> 0 1 3 4 4 4 4
		
		
		//driver.
		
		//FluentWait
	}
	
	@Test
	public void waits2()
	{
		//wait 
		//1 satic wiat
		//2 dynmic
		//input[@id='email']
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/iframe");
		//1.Object WebDriverwait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//2. Condition
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//email")));
		
	
		//driver.find(logout) --> 4 --> ..
		
		//..driver.finbtn()--> 5 --> 0 1 3 4 4 4 4
		
		
		//driver.
		
		//FluentWait
	}
	
	@Test
	public void FWait()
	{  
		WebDriver driver=new ChromeDriver();
		Wait<WebDriver> fluentWait = new FluentWait<>(driver)
			    .withTimeout(Duration.ofSeconds(30))
			    .pollingEvery(Duration.ofSeconds(5));

			WebElement element = fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementID")));

	}

}
