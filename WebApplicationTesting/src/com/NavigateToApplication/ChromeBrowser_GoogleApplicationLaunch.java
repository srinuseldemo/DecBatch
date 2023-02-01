package com.NavigateToApplication;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser_GoogleApplicationLaunch {
	
	public static void main(String[] args) {
		
		// Automate the Browser - Chrome
System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\srinivas1\\Desktop\\Dec9amBatch\\WebApplicationTesting\\browserDriverFiles\\chromedriver.exe");
		
		// Launch the Chrome Browser
	ChromeDriver driver = new ChromeDriver();
	
	// Navigate to Google Home Page
	
	// Object - (driver) always points to current Browser
	driver.get("http://google.com");
	
	// navigate to Bing Home Page
	driver.navigate().to("http://bing.com");
	
	// close the Browser
	driver.close();
	driver.quit();
			
	}

}
