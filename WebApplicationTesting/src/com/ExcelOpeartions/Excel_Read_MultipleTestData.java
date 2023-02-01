package com.ExcelOpeartions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_MultipleTestData {
	
	public static void main(String[] args) throws IOException {
		
	FileInputStream file = new FileInputStream("./src/com/ExcelTestDataFiles/UpdateMultipleTestDataFile.xlsx");	
		
	XSSFWorkbook workBook = new XSSFWorkbook(file);
	
	XSSFSheet sheet = workBook.getSheet("Sheet1");
	
	// goes the the Sheet and identifying the active Row Count
	int rowCount=sheet.getLastRowNum();
	
	// Going to all the Active Row's
	for(int rowIndex=0;rowIndex<=rowCount;rowIndex++)
	{
		// Goes to an Active Row and finding the Last Active Cell Count
		int cellCount=sheet.getRow(rowIndex).getLastCellNum();
		
		// to Goto Every Active Row of all the Active Cells
		for(int cellIndex=0;cellIndex<cellCount;cellIndex++)
		{
			// going to Sheet - to an active Index
			Row row=sheet.getRow(rowIndex);
			// In the Active Row Index - going to an active Cell
			Cell cell=row.getCell(cellIndex);
			
			// getting the Active Row of an Active Cell Value(data)
			String data=cell.getStringCellValue();
			System.out.print(data+"  ");
						
		}
		System.out.println();
	}
}

}
