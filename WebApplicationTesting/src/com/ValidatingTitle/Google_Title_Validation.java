package com.ValidatingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Title_Validation {
	
	public static void main(String[] args) {
		
		String applicationUrlAddress="http://google.com";
		
System.setProperty("webdriver.chrome.driver", 
								"./browserDriverFiles/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		
		String expected_GoogleHomePageTitle="Google";
System.out.println(" The Expected Title of Google HomePage is : "
											+expected_GoogleHomePageTitle);
		
		String actual_GoogleHomePageTitle=driver.getTitle();
System.out.println(" The actual Title of the Google HomePage is: "
													+actual_GoogleHomePageTitle);
		
		if(actual_GoogleHomePageTitle.equals(expected_GoogleHomePageTitle))
		{
			System.out.println(" Title Matched - PASS ");
		}
		else
		{
			System.out.println(" Title not Matched - FAIL ");
		}
		
		driver.quit();
	}	

}
