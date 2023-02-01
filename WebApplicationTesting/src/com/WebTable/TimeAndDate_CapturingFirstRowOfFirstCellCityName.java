package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeAndDate_CapturingFirstRowOfFirstCellCityName {
	
	WebDriver driver;
	
	public void applicationLaunch()
	{
		String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
		
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();		
	}
	
	public void webTable_CapturingCityName()
	{
		/*
xpath Expression - based on the HTML tag's - right from the Top to the
Inspected Element Tag

xpath - locator
xpath Expression - selector

Absolute Xpath
/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
 
		 */
		
By cityNameLocator=By.xpath
("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]");
	
	WebElement cityNameElement=driver.findElement(cityNameLocator);
	
	String cityName=cityNameElement.getText();
	System.out.println(cityName);
	}
	public static void main(String[] args) {
		
TimeAndDate_CapturingFirstRowOfFirstCellCityName tad = new
							TimeAndDate_CapturingFirstRowOfFirstCellCityName();
		
		tad.applicationLaunch();
		tad.webTable_CapturingCityName();
		tad.applicationClose();
	}
	public void applicationClose()
	{
		driver.quit();
	}
}
