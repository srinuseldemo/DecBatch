package com.Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TSRTC_HeaderBlock_FindingElements_GetNames {
	
	public static void main(String[] args) {
		WebDriver driver;		
		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
			
System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver(); // Creating an object
		
		//System.setProperty("webdriver.gecko.driver", "./FireFoxDriver/geckodriver.exe");
		//driver = new FirefoxDriver();
		
		driver.get(applicationUrlAddress);
		
		// Maximization of the Window
		driver.manage().window().maximize();
		
		// To GoTo the HeaderBlock
		// Identifying the HeaderBlock - class="menu-wrap"
		
		By tSRTC_headerBlockL=By.className("menu-wrap");
		WebElement tSRTC_headerBlock=driver.findElement(tSRTC_headerBlockL);
		
// Inspecting the Elements in the Header Block - Find the Properties
// <a class="selectedtabcopy" href="1" target="_top" title="Home">Home</a>
// <a class="tabcopy blinking" href="le="Bus on Contract">Bus on Contract</a>
// <a class="tabcopy" href="get="_top" title="Enquiry">Enquiry</a>		

//When working on Group of elements - we should find a common Property existing
//among all the Elements-and getting all of then in a Variable (List of Elements)		

		 By linksL=By.tagName("a");
		 
// Using the Identified HeaderBlock - working on the Elements in the HeaderBlock		 
 List<WebElement>tSRTC_HeaderBlockLinks=tSRTC_headerBlock.findElements(linksL);
		 
  int tSRTC_headerBlockLinks_Count=tSRTC_HeaderBlockLinks.size();
 System.out.println(" The number of links in the TSRTC Header Block are : - "
		 									+tSRTC_headerBlockLinks_Count);
		
	for(int index=0;index<tSRTC_headerBlockLinks_Count;index++)
	{
		String tSRTC_headerBlock_LinkName=
									tSRTC_HeaderBlockLinks.get(index).getText();
		System.out.println(index+" "+tSRTC_headerBlock_LinkName);
	}
	driver.quit();
	}
}
