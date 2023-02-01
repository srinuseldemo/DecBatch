package com.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Monster_CurrentLocation_Industry_Select {

	public static void main(String[] args) {
		
		WebDriver driver;		
		String applicationUrlAddress="https://my.monsterindia.com/sponsered_popup.html";
			
	System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver(); // Creating an object
		
		//System.setProperty("webdriver.gecko.driver", "./FireFoxDriver/geckodriver.exe");
		//driver = new FirefoxDriver();
		
		driver.get(applicationUrlAddress);
		
		// Maximization of the Window
		driver.manage().window().maximize();
	
		// Current Location Element - its a Block of the WebPage
		// class="border_grey1"
		
		By currentLocationL=By.className("border_grey1");
		WebElement currentLocation=driver.findElement(currentLocationL);
		
// 		import org.openqa.selenium.support.ui.Select; - Package
// Select class is used to perform selection of Optional Values of DropDown		
		Select currentLocationSelect = new Select(currentLocation);
		
		currentLocationSelect.selectByVisibleText("Chennai");
		currentLocationSelect.selectByIndex(4);
		currentLocationSelect.selectByValue("491");
		
		// Automating Industry Element - DropDown
		// id="id_industry"
		
		By industryL=By.id("id_industry");
		WebElement industry=driver.findElement(industryL);
		
		Select industrySelect = new Select(industry);
		industrySelect.selectByVisibleText("Other");
		industrySelect.selectByIndex(2);
		industrySelect.selectByValue("5");
	
		/*
		industrySelect.deselectByIndex(1);
		industrySelect.deselectByValue("4");
industrySelect.deselectByVisibleText("Banking/Accounting/Financial Services");
		*/
		
		industrySelect.deselectAll();
		
			
		
		
		
		/* 
		 // Finding all the Elements of the CurrentLocation DropDown
		By dropDownOptionL=By.tagName("option");
		
		List<WebElement>currentLocationCities=currentLocation.findElements(dropDownOptionL);
		
		// finding the Number of Elements in the DropDown
		int currentLocationCities_Count=currentLocationCities.size();
		System.out.println(" The nuber of Cities in the Current Location DropDown are : "+currentLocationCities_Count);
		
		for(int index=0;index<currentLocationCities_Count;index++)
		{
		// Printing all the CityNames of the CurrentLocation DropDown
			String cityName=currentLocationCities.get(index).getText();
			System.out.println(index+" "+cityName);
		}
	*/	
	//	driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
