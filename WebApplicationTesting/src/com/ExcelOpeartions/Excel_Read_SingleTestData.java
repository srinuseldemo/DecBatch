package com.ExcelOpeartions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_SingleTestData {

	public static void main(String[] args) throws IOException {
		
		// Identify the File in the System - Excel File
												// path of the excel file
	FileInputStream file = new FileInputStream("C:\\Users\\srinivas1\\Desktop\\Dec9amBatch\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\SingleTestData.xlsx");	
		
	// Identify the WorkBook - In the File
	XSSFWorkbook workBook = new XSSFWorkbook(file);
	
	// Identify the Sheet - In the WokBook
	XSSFSheet sheet = workBook.getSheet("Sheet1");
	
	// Identify the Row - In the Sheet
	Row row=sheet.getRow(0);
	
	// Identify the Row of a Cell - in the Row
	Cell cell=row.getCell(1);
	
	// get the data from the Row of a Cell
	String testData=cell.getStringCellValue();
	
	System.out.println(testData);
			
	}
}
