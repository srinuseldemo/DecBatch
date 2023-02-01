package com.OrangeHRMApplication;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Utitlity.Log;

public class BaseTest {
	
	public WebDriver driver;
	public Properties property;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	@BeforeTest
	public void setUp() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		Log.info("Chrome Browser Launched Successfully");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(applicationUrlAddress);
		
		Log.info("Successfuly Navigated to OrangeHRM Application LogIn Page");
		
		loadProperties();
	}
	
	private void loadProperties() throws IOException {
													// Properties file Path
FileInputStream applicationPropertiesFile = new FileInputStream
("C:\\Users\\srinivas1\\Desktop\\Dec9amBatch\\OHRM_DDT\\src\\com\\Config\\OrangeHRM.properties");
property = new Properties();
property.load(applicationPropertiesFile);
}

	@AfterTest
	public void tearDown() {
		driver.quit();
		
		Log.info("OrangeHRM Application Closed Successfully");
	}
	
	
	
	
		
}
