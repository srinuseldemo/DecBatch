package com.OHRMApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
WebDriver driver;		
String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver(); // Creating an object
		
		driver.get(applicationUrlAddress);
	
		// Implicit wait - its a Global wait / smart wait
	// Implicit wait will get applicable to all the Elements on the WebPage
		// which are under Test - to be identified with the given Property
	// it will be applicable for every Element under Test - throughout the
		// the navigation of the driver - for the  element on each and every
		// WebPage under Test - to be identified with the Property given
				
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	driver.manage().window().maximize();
				
	}
	
	public void tearDown()
	{
		driver.close();
	}

}
