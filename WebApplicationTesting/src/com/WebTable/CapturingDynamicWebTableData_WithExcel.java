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
import org.openqa.selenium.WebElement;
public class CapturingDynamicWebTableData_WithExcel extends BaseTest
{
	public void capturingWebTableData() throws IOException
	{
		// Excel File
		FileInputStream file = new FileInputStream
				("./src/com/ExcelTestDataFiles/SingleTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");		
		
		// Identifying the WebTable
		// /html/body/div[5]/section[1]/div - Property of WebTable
		By webTableLocator=By.xpath("/html/body/div[5]/section[1]/div");
		WebElement webTable=driver.findElement(webTableLocator);
		
// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		
		By rowsL=By.tagName("tr");
		// finding all the Rows of the WebTable 
		List<WebElement>rows=webTable.findElements(rowsL);
		
		// go to all the Row's of the webTable
		for(int rowIndex=0;rowIndex<rows.size();rowIndex++)
		{
			By cellL=By.tagName("td");
			// go to a Row of the WebTable and find the number of Cells
		List<WebElement>rowOfCells=rows.get(rowIndex).findElements(cellL);

			// Creating a new Row in the Sheet - Excel
			Row newRow=sheet.createRow(rowIndex);
			
			// to goto every Row of All the Cells
			for(int rowOfCell=0;rowOfCell<rowOfCells.size();rowOfCell++)
			{
				// goto row of cell and get the data
	//			String data=rowOfCells.get(rowIndex).getText();
						
				String data=rowOfCells.get(rowOfCell).getText();
				System.out.print(data+" ");
				
		// In the New Row Created - Creating a new Row of Cell - Excel
				Cell newRowOfCell=newRow.createCell(rowOfCell);
				
				// in the New Row of cell created - setting the value
				newRowOfCell.setCellValue(data);
			}
			// Saving the Excel 
		FileOutputStream file1 = new FileOutputStream
						("./src/com/ExcelTestDataFiles/SingleTestData.xlsx");
				workBook.write(file1);
				System.out.println();
			}
		}
	
	public static void main(String[] args) throws IOException {
		
	CapturingDynamicWebTableData_WithExcel dynamicTableData = new 
									CapturingDynamicWebTableData_WithExcel();
		
		dynamicTableData.setUp();
		dynamicTableData.capturingWebTableData();
		dynamicTableData.tearDown();
	}
}
