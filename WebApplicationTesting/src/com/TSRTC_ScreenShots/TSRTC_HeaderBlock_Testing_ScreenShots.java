package com.TSRTC_ScreenShots;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HeaderBlock_Testing_ScreenShots {
	
	public static void main(String[] args) throws IOException {
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
		String expected_HeaderBlockLinkUrlAddress=tSRTC_HeaderBlockLinks.get(index).getAttribute("href");
		System.out.println(" The expected Url Address of the Header Block Link is :- "+expected_HeaderBlockLinkUrlAddress);

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
		String actual_WebpageCurrentUrlAddress=driver.getCurrentUrl();
		System.out.println(actual_WebpageCurrentUrlAddress);
		
		if(actual_WebpageCurrentUrlAddress.equals(expected_HeaderBlockLinkUrlAddress))
		{
			System.out.println(" Header Block Link URL Address Matched - PASS");
		}
		else
		{
			System.out.println("Header Block Link URL Address Matched - FAIL ");
		}
		
		// Capturing The ScreenShot of the Current WebPage
		File currentWebpageScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
		FileUtils.copyFile(currentWebpageScreenShot, new File("./TSRTC_SceenShots/"+tSRTC_headerBlock_LinkName+".png"));
		
		
		System.out.println();
		driver.navigate().back();
			
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
