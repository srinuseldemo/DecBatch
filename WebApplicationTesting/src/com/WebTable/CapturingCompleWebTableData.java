package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingCompleWebTableData {
	
WebDriver driver;
	
	public void applicationLaunch()
	{
		String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
		
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		
		driver.manage().window().maximize();		
		
	}

	public void applicationClose()
	{
		driver.close();
		
	}
	
	
	public void capturingTableData() // static WebTable
	{
		// First Row of First Cell property
// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
	
		// Last Row of Last Cell Property
// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]		
		
String xpathExpressionPart1=
		"/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";	
String xpathExpressionPart2="]/td[";
String xpathExpressionPart3="]";

	for(int rowIndex=1;rowIndex<=36;rowIndex++) // goes to every Row
	{
		// going to every Row of all the Cells
		for(int rowOfCellIndex=1;rowOfCellIndex<=8;rowOfCellIndex++)
		{
			
By tableL=By.xpath(xpathExpressionPart1+rowIndex+xpathExpressionPart2+
										rowOfCellIndex+xpathExpressionPart3);
			WebElement table=driver.findElement(tableL);
			String data=table.getText();
			
		System.out.print(data+"  ");
		}
		System.out.println();
	}

	}
	
	
	
	
	public static void main(String[] args) {
		
		CapturingCompleWebTableData cwtd = new CapturingCompleWebTableData();
		cwtd.applicationLaunch();
		cwtd.capturingTableData();
		cwtd.applicationClose();
		
	}
	

}
