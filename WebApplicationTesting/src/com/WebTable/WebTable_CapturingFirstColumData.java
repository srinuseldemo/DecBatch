package com.WebTable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_CapturingFirstColumData {
	
	WebDriver driver;
	
	public void applicationLaunch()
	{
		String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
		
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		
		driver.manage().window().maximize();		
		
	}

public void capturingFirstColumData_ExportingToExcelFile() throws IOException
	{		
		FileInputStream file = new FileInputStream
				("./src/com/ExcelTestDataFiles/SingleTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");		
		
// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]
			
	// taking the common XpathExpression into variables	
String xpathExpression_Part1=
		"/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
String xpathExpression_Part2="]/td[1]";	
	
By tableXpathL=
By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr");

	List<WebElement>WebTablecityNames=driver.findElements(tableXpathL);
		
	int citiesCount=WebTablecityNames.size();
	System.out.println(citiesCount);
	
	for(int index=1;index<=citiesCount;index++) // to goto all the Row's
	{
	WebElement cityNameElement=driver.findElement
			(By.xpath(xpathExpression_Part1+index+xpathExpression_Part2));
		
		String cityName=cityNameElement.getText();
			System.out.println(cityName);
	
			// creating a New Row in the Sheet
			Row row=sheet.createRow(index);
			// Creating a Row of a cell
			Cell rowOfCell=row.createCell(0);
			
			// Setting the value into the row of a Cell
			rowOfCell.setCellValue(cityName);
		
			// Saving the Excel 
		FileOutputStream file1 = new FileOutputStream
						("./src/com/ExcelTestDataFiles/SingleTestData.xlsx");
			workBook.write(file1);
	}
		
	}
	
	public static void main(String[] args) throws IOException {
		
	WebTable_CapturingFirstColumData rowCellData = new
										WebTable_CapturingFirstColumData();
	rowCellData.applicationLaunch();
	rowCellData.capturingFirstColumData_ExportingToExcelFile();
	rowCellData.applicationClose();
	
	}
	
	public void applicationClose()
	{
		driver.close();
		
	}
	
}
