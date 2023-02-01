package com.ExcelCommonMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperationMethods {
		
	public static String getRowOfCellValue
	(String excelFilePath,String sheetName,int rowIndex, int cellIndex) throws IOException {
		
		FileInputStream excelFile = new FileInputStream(excelFilePath);
		XSSFWorkbook workBook = new XSSFWorkbook(excelFile);
		XSSFSheet sheet = workBook.getSheet(sheetName);
		
		XSSFRow row =  sheet.getRow(rowIndex);
		XSSFCell rowOfCell=row.getCell(cellIndex);
		
		String rowOfCellValue = rowOfCell.getStringCellValue();
		return rowOfCellValue;
	}
	
	public static void setRowOfCellValue
	(String excelFilePath,String sheetName,int rowIndex,int cellIndex,
	     									String data) throws IOException
	{
		FileInputStream excelFile = new FileInputStream(excelFilePath);
		XSSFWorkbook workBook = new XSSFWorkbook(excelFile);
		XSSFSheet sheet = workBook.getSheet(sheetName);
		
		XSSFRow row =  sheet.getRow(rowIndex);
		XSSFCell RowOfNewCellCreated=row.createCell(cellIndex);
		
		RowOfNewCellCreated.setCellValue(data);
		
		FileOutputStream saveFile = new FileOutputStream(excelFilePath);
		workBook.write(saveFile);
		saveFile.close();
	}
	
	
	
	
	
	
	
	
	
	
	
}
