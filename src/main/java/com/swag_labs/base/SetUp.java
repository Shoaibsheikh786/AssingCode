package com.swag_labs.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SetUp {
   

	public static WebDriver driver; 
	public static File file;
	public static FileInputStream fis;
	public static Properties prop;
	public static String browser;
	public static String url;
	private static String username;
	private static String password;
	private static String key;
	
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
		   key=prop.getProperty("SECRET_KEY");
	}
	public void initlization()
	{
	  driver=createDriver();
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	 
	 
	}
	
	public String getUsername()
	{
		return prop.getProperty("username");
	}
	
	public String getPassword()
	{
		return prop.getProperty("password");
	}
	
//	@AfterTest
//	public void tearDown()
//	{
//		if(driver!=null)
//			driver.close();
//	}
	
	
	//to initilize
	public WebDriver createDriver() {
	   
	    boolean isHeadless = Boolean.parseBoolean(System.getProperty("headless", "false"));

	    switch (browser.toLowerCase()) {
	        case "chrome":
	            ChromeOptions chromeOptions = new ChromeOptions();
	            if (isHeadless) {
	                // For Chrome versions 109 and above
	                chromeOptions.addArguments("--headless=new");
	                chromeOptions.addArguments("--no-sandbox", "--disable-dev-shm-usage");
	                chromeOptions.addArguments("--disable-notifications");
	            }
	            return new ChromeDriver(chromeOptions);

	        case "firefox":
	            FirefoxOptions firefoxOptions = new FirefoxOptions();
	            if (isHeadless) {
	                firefoxOptions.addArguments("-headless");
	            }
	            return new FirefoxDriver(firefoxOptions);

	        default:
	            throw new IllegalArgumentException("Unsupported browser: " + browser);
	    }
	}


	
	
	
	

}
