package com.GetTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle_GoogleHomePage {
	
	public static void main(String[] args) {
		
		// Automate the Browser - Chrome
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\srinivas1\\Desktop\\Dec9amBatch\\WebApplicationTesting\\browserDriverFiles\\chromedriver.exe");
				
				// Launch the Chrome Browser
			ChromeDriver driver = new ChromeDriver();
			// Navigate to Google Home Page
			driver.get("http://google.com");
			
			//get the title of the google Home page -
		String actual_GoogleHomePageTitle=driver.getTitle();
			
System.out.println(" The Actual Title of the Google HomePage is : "
													+actual_GoogleHomePageTitle);
		
driver.quit();			
	
	}
}
