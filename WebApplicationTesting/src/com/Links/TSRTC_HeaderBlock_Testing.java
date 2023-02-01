package com.Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HeaderBlock_Testing {
	
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
		
		 By linksL=By.tagName("a");
		 
// Using the Identified HeaderBlock - working on the Elements in the HeaderBlock		 
 List<WebElement>tSRTC_HeaderBlockLinks=tSRTC_headerBlock.findElements(linksL);
		 
  int tSRTC_headerBlockLinks_Count=tSRTC_HeaderBlockLinks.size();
 System.out.println(" The number of links in the TSRTC Header Block are : - "
		 									+tSRTC_headerBlockLinks_Count);
		
	for(int index=0;index<tSRTC_headerBlockLinks_Count;index++)
	{
		// goes to the ArrayList and gets the Text of the Elements
		String tSRTC_headerBlock_LinkName=
									tSRTC_HeaderBlockLinks.get(index).getText();
		
		System.out.println(index+" "+tSRTC_headerBlock_LinkName);
		
		// goes to the ArrayList and Performs a Click Operation on the Element
		tSRTC_HeaderBlockLinks.get(index).click();
		
		// getting the Navigated WebPage Title 
		String actual_WebPageTitle=driver.getTitle();
		System.out.println(actual_WebPageTitle);
		
		// getting the Navigated WebPage Current Url Address
		String actual_WebpaceCurrentUrlAddress=driver.getCurrentUrl();
		System.out.println(actual_WebpaceCurrentUrlAddress);
		
		System.out.println();
		
//Once the Click operation happens on a links the driver will move to next page		
// but the elements which are under test are in the Previous page - so they 
// should be moved to the Previous WebPage		
		
		driver.navigate().back();
		
// Once Click operation happens on a link - the driver will be moved to the next
// WebPage - when the driver focus shifts to the next page , all The information
// save in the ArrayList of the Previous Page will be cleared - So we should be
// re Identifying the Element of the Page and getting back all the Elements into 
//	the ArrayList again - Re creating the ArrayList( which will save all the
// elements )		
		
		// Again Identifying the HeaderBlock of the Current Page
		// To GoTo the HeaderBlock
		// Identifying the HeaderBlock - class="menu-wrap"
		 tSRTC_headerBlockL=By.className("menu-wrap");
		 tSRTC_headerBlock=driver.findElement(tSRTC_headerBlockL);
		
		 // Re-Creating the ArrayList
		 linksL=By.tagName("a");
		 tSRTC_HeaderBlockLinks=tSRTC_headerBlock.findElements(linksL);
		}
	driver.quit();
	}
}
