package com.OHMApplicationTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
WebDriver driver;		
String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver(); // Creating an object
		
	System.out.println( " Chrome Browser Launched Successfully  ");
		
		driver.get(applicationUrlAddress);
System.out.println(" Successfully navigated to OrangeHRM Application LogIn Page ");
		
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	driver.manage().window().maximize();
				
	}
	/*
	@AfterTest
	public void tearDown()
	{
		driver.close();
		
		System.out.println(" OrangeHRM Application Closed Successfully ");
		
	}
*/

}
