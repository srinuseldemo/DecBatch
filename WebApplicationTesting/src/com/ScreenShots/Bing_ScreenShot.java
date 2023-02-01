package com.ScreenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_ScreenShot {
	public static void main(String[] args) throws IOException {
		WebDriver driver;		
	String applicationUrlAddress="http://bing.com";
			
	System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver(); // Creating an object
		
		driver.get(applicationUrlAddress);
		
		                      // TypeCasting
File bingCapturedSreenShot=((TakesScreenshot)driver).getScreenshotAs
															(OutputType.FILE);
	FileUtils.copyFile(bingCapturedSreenShot, new File
										("./ApplicationScreenShots/bing.png"));
	
	// TakesScreenshot - is an interface in WebDriver
	// OutputType - is an interface in WebDriver
	
	// FileUtils - Class from Apache.commons.io
	// copyFile - method to copy and save the file
	
	driver.quit();
		
	}
}
