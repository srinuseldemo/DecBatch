package com.RadioButtonsTesting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RadioButton_Group1_Testing {
	
	WebDriver driver;
	String applicationUrlAddress="https://echoecho.com/htmlforms10.htm";
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void radioButtonsTest() throws InterruptedException
	{
		/*
<input type="radio" name="group1" value="Milk">
<input type="radio" name="group1" value="Butter" checked="">
<input type="radio" name="group1" value="Cheese">
		 */
		By group1RadioButtonsLocator=By.name("group1");
List<WebElement>group1RadioButtons=
						driver.findElements(group1RadioButtonsLocator);
		
		int group1RadioButtonsCount=group1RadioButtons.size();
		
		// Performing click operation of each radio button
		for(int clickIndex=0;clickIndex<group1RadioButtonsCount;clickIndex++)
		{
			// performing click on a radio button
			group1RadioButtons.get(clickIndex).click();
			
			Thread.sleep(5000);
	
			// getting the status of each Radio button after click
	for(int statusIndex=0;statusIndex<group1RadioButtonsCount;statusIndex++)
			{
			
		//getting the status
System.out.println(group1RadioButtons.get(statusIndex).getAttribute("value")+
			" "+group1RadioButtons.get(statusIndex).getAttribute("checked"));
				
			}
	System.out.println();
			Thread.sleep(5000);
		}
			
		/*
		for(int index=0;index<group1RadioButtonsCount;index++)
		{
			group1RadioButtons.get(index).click();
			String selectedValue =group1RadioButtons.get(index).getAttribute("value");
			System.out.println("selected radio buttion Value is "+ selectedValue);
			int count=0;
			for(int j=0;j<group1RadioButtonsCount;j++) {
				String status = group1RadioButtons.get(j).getAttribute("checked");
				String val = group1RadioButtons.get(j).getAttribute("value");
				if (index==j) {
					continue;
				}else {
					if (!status.equals("true")) {
						System.out.println("Unchecked value is "+ val);
						count++;
					}
				}
			}
			System.out.println(count);
			if(count==group1RadioButtonsCount-1) {
				System.out.println("Value selected -- Remaining values unselected-PASS");
			}else {
				System.out.println("FAIL");
			}
			
			
		}
		*/
	}

}
