package com.java.listeners;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.swag_labs.base.SetUp;

import io.qameta.allure.Attachment;

public class AllureListener extends SetUp implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        if (driver != null) {
            System.out.println("Attaching screenshot and logs for failed test: " + result.getName());
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            saveScreenshotToAllure(screenshot);
            attachLogs("Test failed: " + result.getName());
        } else {
            System.out.println("Driver is null, cannot take screenshot");
            attachLogs("Driver was null. Unable to capture screenshot for failed test: " + result.getName());
        }
    }

    @Attachment(value = "Failure Screenshot", type = "image/png")
    public byte[] saveScreenshotToAllure(byte[] screenshot) {
    	 return screenshot;
    }

    @Attachment(value = "Test Log", type = "text/plain")
    public String attachLogs(String message) {
        return message;
    }
}
