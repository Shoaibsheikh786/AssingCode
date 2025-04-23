package com.sel.day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestParalley {
	
	@Test
	public void test1() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.close();
	}

	@Test
	public void test2() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.close();
	}

	@Test
	public void test3() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.close();
	}

	@Test
	public void test4() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.close();
	}

}
