package com.WebTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BaseTest {
	WebDriver driver;
	String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
	public void setUp()
	{		
	System.setProperty("webdriver.chrome.driver",
			"./ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();		
	}
	public void tearDown()
	{
		driver.quit();
	}
}
