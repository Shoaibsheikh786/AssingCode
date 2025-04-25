package com.pagemodel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	// -> which browser i need open

	static WebDriver driver;
	FacebookPage fb;
	File file;
	FileInputStream fis;
	Properties pr;
	static String b;  //chrome

	// read config read file
	// -> which browser i need open
	Base() {
		file = new File("./config.properties");
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pr = new Properties();
		try {
			pr.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		b = pr.getProperty("browser");

	}

	public static void initilization() {
		if (b.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (b.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("Browser Not Found");
		}

		driver.get("https://www.facebook.com/");
	}

}
