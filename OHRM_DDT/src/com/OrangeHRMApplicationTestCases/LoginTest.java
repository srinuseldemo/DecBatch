package com.OrangeHRMApplicationTestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ExcelCommonMethods.ExcelOperationMethods;
import com.OrangeHRMApplication.BaseTest;
import com.Utitlity.Log;
import com.Utitlity.Screenshot;

public class LoginTest extends BaseTest {
									// Path of Excel file with the Test Data
	String excelTestDataFilePath="C:\\Users\\srinivas1\\Desktop\\Dec9amBatch\\OHRM_DDT\\src\\com\\ApplicationTestDataFiles\\OrangeHRM_LoginTestDataFile.xlsx";
	
	@Test(priority=1)
	public void validateLoginPageTest() throws IOException {
		
By loginPageHeaderTextLocator = By.id
								(property.getProperty("loginPageHeaderText"));
WebElement loginPageHeaderTextElement =driver.findElement
												(loginPageHeaderTextLocator);
	String actual_LoginPageHeaderText = loginPageHeaderTextElement.getText();
		
	ExcelOperationMethods.setRowOfCellValue
		(excelTestDataFilePath, "Sheet1", 1, 1, actual_LoginPageHeaderText);
		
String expected_LoginPageHeaderText = ExcelOperationMethods.getRowOfCellValue
									(excelTestDataFilePath, "Sheet1", 1, 0);
	
	if (actual_LoginPageHeaderText.equals(expected_LoginPageHeaderText)) 
	{
		ExcelOperationMethods.setRowOfCellValue(excelTestDataFilePath,
		"Sheet1", 1, 2,
		"Successfully navigated to OrangeHRM Application login page - PASS");
	Log.info(" Validation of OrangeHRM Application LogIn Page Successful ");
			
		} else {
			ExcelOperationMethods.setRowOfCellValue
			(excelTestDataFilePath, 
			"Sheet1", 1, 2,
			"Failed to navigated to OrangeHRM Application login page -FAIL");
		Log.info(" Validation of OrangeHRM Application LogIn Page Failed");
		}
	}

	@Test(priority=2)
	public void loginFunctionalityTest() throws IOException {
		
	int rowIndex=1;
	while(true) {
		try {
		String userName = ExcelOperationMethods.getRowOfCellValue
							(excelTestDataFilePath, "Sheet1", rowIndex, 3);
		String password = ExcelOperationMethods.getRowOfCellValue
							(excelTestDataFilePath, "Sheet1", rowIndex, 4);
				
		By userNameLocator =By.id(property.getProperty("userNameProperty"));
				
		WebElement userNameElement = driver.findElement(userNameLocator);
		userNameElement.clear();
		userNameElement.sendKeys(userName);
				
		By passwordLocator =By.name(property.getProperty("passwordProperty"));
				
		WebElement passwordElement = driver.findElement(passwordLocator);
		passwordElement.clear();
		passwordElement.sendKeys(password);

		rowIndex++;
				
	By loginButtonLocator = By.className(property.getProperty
													("loginButtonProperty"));
		driver.findElement(loginButtonLocator).click();
				
		if (isInvalid())
		{
		// login page
			Screenshot.takeScreenshot(driver, userName+password);
			Log.info("Failed to login to OrangeHRM Appliication -"
								+ " Captured Screenshot of error web page");
		} 
		else
		{
			// home page
			validateHomePageTest();
			logOut();
			Log.info("Successfully logged into OrangeHRM Appliication ");
					
		}
				
	}
		catch (Exception e)
		{
			break;
		}
	}
}
	
	private boolean isInvalid() {
		
		try {
			By invalidErrorMessageLocator= By.id(property.getProperty
										("loginPageInvalidErrorMessage"));
		return driver.findElement(invalidErrorMessageLocator).isDisplayed();
		} 
		catch (Exception e)
		{
			return false;
		}
	
	}
	
		public void validateHomePageTest() throws IOException {
		
		By welcomeAdminLocator= By.id(property.getProperty
										("homePageWelcomeProperty"));
		String actual_HomePageText =driver.findElement
									 (welcomeAdminLocator).getText();
		ExcelOperationMethods.setRowOfCellValue
				(excelTestDataFilePath, "Sheet1", 1, 6, actual_HomePageText);
	
	String expected_HomePageText = ExcelOperationMethods.getRowOfCellValue
								(excelTestDataFilePath, "Sheet1", 1, 5);
	
		if (actual_HomePageText.contains(expected_HomePageText))
		{
		ExcelOperationMethods.setRowOfCellValue
		(excelTestDataFilePath, 
				"Sheet1", 1, 7,
				"Successfully navigated to home page - PASS");
		Log.info("Successfully navigated to home page - PASS");
		} 
		else
		{
			ExcelOperationMethods.setRowOfCellValue
			(excelTestDataFilePath,
					"Sheet1", 1, 7,
					"Failed to navigated to home page - FAIL");
			Log.info("Failed to navigated to home page - FAIL");
		}
	
	}
	
	public void logOut() {
	By welcomeAdminLocator= By.id(property.getProperty
												("homePageWelcomeProperty"));
		driver.findElement(welcomeAdminLocator).click();
		
		By logOutLocator = By.linkText(property.getProperty
											("logOutLinkTextProperty"));
		driver.findElement(logOutLocator).click();
		Log.info("Successfully logout from the OrangeHRM Login Functionality");
	}
}
