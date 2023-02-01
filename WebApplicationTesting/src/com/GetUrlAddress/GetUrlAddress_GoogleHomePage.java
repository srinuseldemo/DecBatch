package com.GetUrlAddress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlAddress_GoogleHomePage {
	
	public static void main(String[] args) {
		
		String applicationUrlAddress="http://google.com";
		
System.setProperty("webdriver.chrome.driver", 
								"./browserDriverFiles/chromedriver.exe");

// creating an Object for the Chrome Browser 
	WebDriver driver = new ChromeDriver(); 
	
	driver.get(applicationUrlAddress);
	
	String actual_GoogleHomePageUrlAddress=driver.getCurrentUrl();
	System.out.println(" The actual Google HomePage url address is : "+
											actual_GoogleHomePageUrlAddress);
	
	System.out.println(applicationUrlAddress);
	
	driver.quit();
	
		
	}

}
