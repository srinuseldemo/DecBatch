package com.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Utility.Log;



public class BaseTest {
	

public WebDriver driver;		
String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srinivas1\\Desktop\\Dec9amBatch\\OrangeHRM\\browserDriverFiles\\chromedriver.exe");
		driver = new ChromeDriver(); // Creating an object
		
	Log.info("Chrome Browser Launched Successfully");
	//	System.out.println( " Chrome Browser Launched Successfully  ");
		
		driver.get(applicationUrlAddress);
		
		Log.info("Successfully navigated to OrangeHRM Application LogIn Page");
	//	System.out.println(" Successfully navigated to OrangeHRM Application LogIn Page ");
		
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	driver.manage().window().maximize();
				
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		
		Log.info("OrangeHRM Application Closed Successfully");
		//System.out.println(" OrangeHRM Application Closed Successfully ");
		
	}



}
