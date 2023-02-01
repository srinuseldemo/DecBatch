package com.ExcelOpeartions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_WriteOperation {
	
	public static void main(String[] args) throws IOException {
		

		// Identify the File in the System - Excel File
												// path of the excel file
	FileInputStream file = new FileInputStream("C:\\Users\\srinivas1\\Desktop\\Dec9amBatch\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\SingleTestData.xlsx");	
		
	// Identify the WorkBook - In the File
	XSSFWorkbook workBook = new XSSFWorkbook(file);
	
	// Identify the Sheet - In the WokBook
	XSSFSheet sheet = workBook.getSheet("Sheet1");
	
	// Create the Row - in the Sheet
	Row row=sheet.createRow(2);

	// Create the Row of a Cell - in the already created Row 
		Cell cell=row.createCell(3);
		
	// In the Row of a Cell Created - Set the Value
		cell.setCellValue("Testing");
	
		// *saving the file with the workBook
				// Path of the File
	FileOutputStream file1 = new FileOutputStream
			("C:\\Users\\srinivas1\\Desktop\\Dec9amBatch\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\SingleTestData.xlsx");
		workBook.write(file1);
	}
}
