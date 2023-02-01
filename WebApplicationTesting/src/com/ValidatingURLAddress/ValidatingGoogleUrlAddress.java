package com.ValidatingURLAddress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingGoogleUrlAddress {
	
	public static void main(String[] args) {
		
		
		String applicationUrlAddress="http://google.com";
		
System.setProperty("webdriver.chrome.driver", 
								"./browserDriverFiles/chromedriver.exe");

// creating an Object for the Chrome Browser 
	WebDriver driver = new ChromeDriver(); 
	
	driver.get(applicationUrlAddress);
	
	String expcted_GoogleHomePageUrlAddress="google.com";
	System.out.println(" The expected Google HomePage Url Address is : "
										+expcted_GoogleHomePageUrlAddress);
	
	String actual_GoogleHomePageUrlAddress=driver.getCurrentUrl();
	System.out.println(" The actual Google HomePage url address is : "+
											actual_GoogleHomePageUrlAddress);
	
	//System.out.println(applicationUrlAddress);
	
if(actual_GoogleHomePageUrlAddress.contains(expcted_GoogleHomePageUrlAddress))
	{
		System.out.println(" Google HomePage Url Address Matched  - PASS ");
	}
	else
	{
		System.out.println(" Google HomePage Url Address NOT Matched  - FAIL ");
	}
	driver.quit();
	}
}
