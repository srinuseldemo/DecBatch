package com.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HandlingAlert {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;		
		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
				
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
			driver = new ChromeDriver(); // Creating an object
			
			driver.get(applicationUrlAddress);
			driver.manage().window().maximize();
			
// Performing click operation on Check Availability - to view the alert
			// id="searchBtn" - property of Check Availability Element
			
			By checkAvailabilityL=By.id("searchBtn");
	WebElement checkAvailabilityButton=driver.findElement(checkAvailabilityL);
	checkAvailabilityButton.click();
			
	//Thread.sleep(5000);
			Alert alert=driver.switchTo().alert();
			
			// perform click on OK Button
				alert.accept();
			
			// Perform click on Cancel Button
			//	alert.dismiss();
			
			// sending text into an Alert
			//	alert.sendKeys("sending text into an Alert");
		}
}
