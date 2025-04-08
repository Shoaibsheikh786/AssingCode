package com.java.utils;

import org.openqa.selenium.WebElement;

public class CommonUtils {
	
	public static String getText(WebElement element) {
	    return element.getText().trim();
	}
}
