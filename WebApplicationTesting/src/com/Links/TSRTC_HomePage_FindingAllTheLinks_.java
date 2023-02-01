package com.Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HomePage_FindingAllTheLinks_ {
	
	public static void main(String[] args) {
		
		WebDriver driver;		
		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
			
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver(); // Creating an object
		driver.get(applicationUrlAddress);
		
		// Maximization of the Window
		driver.manage().window().maximize();
			
		// Inspecting the Elements to Find the Properties
// <a class="selectedtabcopy" href="1" target="_top" title="Home">Home</a>
// <a class="tabcopy blinking" href="le="Bus on Contract">Bus on Contract</a>
// <a class="tabcopy" href="get="_top" title="Enquiry">Enquiry</a>		
	
		/* ---  working with a Single Element -----
		By homeL=By.linkText("Home");
		WebElement home=driver.findElement(homeL);
		String home_Text=home.getText();
		*/
		
 // when working on a single Element - identifying the Property and Automate
 //When working on Group of elements - we should find a common Property existing
//among all the Elements-and getting all of then in a Variable (List of Elements)		
		
	   By linksL=By.tagName("a");
	   List<WebElement>TSRTC_HomePagelinks=driver.findElements(linksL);
	
	   // Finding the Size of the ArrayList(TSRTC_HomePagelinks)
	   int  TSRTC_HomePagelinks_Count=TSRTC_HomePagelinks.size();
	   
System.out.println(" The number of links of TSRTC HomePage are: "
													+TSRTC_HomePagelinks_Count);
	   for(int i=0;i<TSRTC_HomePagelinks.size();i++)
	   {
		   String TSRTC_HomePageLinkName=TSRTC_HomePagelinks.get(i).getText();
		   System.out.println(i+" "+TSRTC_HomePageLinkName);
	   }
		
		driver.quit();
		
	}

}
