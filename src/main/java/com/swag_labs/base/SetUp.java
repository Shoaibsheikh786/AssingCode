package com.swag_labs.base;

import java.io.File;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetUp {
   

	public static WebDriver driver; 
	public static File file;
	public static FileInputStream fis;
	public static Properties prop;
	public static String browser;
	public static String url;
	private static String username;
	private static String password;
	
	// read Configuration file
	public SetUp() {
		prop=new Properties();
		file=new File("./Config/config.properties");
		try {
			fis=new FileInputStream(file);
			prop.load(fis);
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		   browser=	prop.getProperty("browser");
		   url=prop.getProperty("url");
	}
	public void initlization()
	{
	  if(browser.equals("chrome"))
	  {
		  driver=new ChromeDriver();
		  
	  }
	  else if(browser.equals("firefox"))
	  {
		  driver=new FirefoxDriver();
	  }
	  else if(browser.equals("edge"))
	  {
		  driver=new EdgeDriver();
	  }
	  else
	  {
		  System.out.println("Browser Not Found "+browser);
		  return;
		  
	  }
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	}
	
	public String getUsername()
	{
		return prop.getProperty("username");
	}
	
	public String getPassword()
	{
		return prop.getProperty("password");
	}
	


	
	
	
	

}
