package com.OHMApplicationTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OrangeHRM_LogInTest extends BaseTest{
	
	FileInputStream file;
	XSSFWorkbook workBook; 
	XSSFSheet sheet;
	
	Row row;
	Cell userNameRowOfCell;
	
	FileInputStream propertiesFile;
	Properties prop;
	FileOutputStream fileOutPutStream;
	
	Logger log = Logger.getLogger("OrangeHRM_LogInTest");
		
	@Test(priority=1)
	public void logInPageValidation()
	{
		PropertyConfigurator.configure("Log4j.properties");
		
		// validating the LogIn WebPage
		// Title Validation
		String expectedTitle_OrangeHRMApplicationLogInPage="OrangeHRM";
	//System.out.println(" The title of OrangeHRM Application "
		//					+expectedTitle_OrangeHRMApplicationLogInPage);
		
		log.info(" The title of OrangeHRM Application "
							+expectedTitle_OrangeHRMApplicationLogInPage);
		
		String actualTitle_OrangeHRMApplicationLogInPage=driver.getTitle();
	//System.out.println(" The actual title of OrangeHRm Application is : "
		//						+actualTitle_OrangeHRMApplicationLogInPage);

		log.info("The actual title of OrangeHRm Application is : "
							+actualTitle_OrangeHRMApplicationLogInPage);
		
		//if(actualTitle.equals(expectedTitle))
if(actualTitle_OrangeHRMApplicationLogInPage.equals
								(expectedTitle_OrangeHRMApplicationLogInPage))
		{
			// System.out.println(" Title matched - PASS ");
	log.info(" Title matched - PASS ");
		}
		else
		{
			// System.out.println(" Title not matched - FAIL ");
			log.error("Title not matched - FAIL ");
		}
				
		// LogIn Page Url Address Validation
		// orangehrm-4.2.0.1
		
String expected_OrangeHRMApplicationLogInPageUrlAddress=
													"orangehrm-4.2.0.1";
/*
System.out.println(" The Expected OrangeHRM Application LogIn "
		+ "Page Url Address is : "+
		expected_OrangeHRMApplicationLogInPageUrlAddress);
*/
	log.info("The Expected OrangeHRM Application LogIn "
		+ "Page Url Address is : "+
		expected_OrangeHRMApplicationLogInPageUrlAddress);

String actual_OrangeHRMApplicationLogInPageUrlAddress=driver.getCurrentUrl();

/*
System.out.println(" The Actual OrangeHRM Application LogIn Page Url "
		+ "Address is :"+actual_OrangeHRMApplicationLogInPageUrlAddress);
*/
   log.info(" The Actual OrangeHRM Application LogIn Page Url "
		+ "Address is :"+actual_OrangeHRMApplicationLogInPageUrlAddress);

if(actual_OrangeHRMApplicationLogInPageUrlAddress.contains
							(expected_OrangeHRMApplicationLogInPageUrlAddress))
		{
	/*
			System.out.println(" OrangeHRM Application LogIn Page URL"
					+ " Address Matched - PASS");
	*/
	log.info(" OrangeHRM Application LogIn Page URL"
					+ " Address Matched - PASS");
		}
		else
		{
			/*
			System.out.println("OrangeHRM Application LogIn Page URL"
					+ " Address NOT Matched - FAIL");
			*/
			
			log.error("OrangeHRM Application LogIn Page URL"
					+ " Address NOT Matched - FAIL");
		}
		
		String expected_OrangeHRM_LogInPageText="LOGIN Panel";
		
		/*
System.out.println("The expected Text of OrangeHRM Application LogIn "
		+ "Page is :"+expected_OrangeHRM_LogInPageText);
		*/
	
		log.info("The expected Text of OrangeHRM Application LogIn "
		+ "Page is :"+expected_OrangeHRM_LogInPageText);
		
		By orangeHRM_LogInPageTextL=By.id("logInPanelHeading");
WebElement orangeHRM_LogInPageText=driver.findElement(orangeHRM_LogInPageTextL);
	String actual_OrangeHRM_LogInPageText=orangeHRM_LogInPageText.getText();
		
	/*
	System.out.println("The Actual Text of OrangeHRM Application"
			+ " LogIn Page is :"+actual_OrangeHRM_LogInPageText);
	*/
	
	log.info("The Actual Text of OrangeHRM Application"
			+ " LogIn Page is :"+actual_OrangeHRM_LogInPageText);
	
		if(expected_OrangeHRM_LogInPageText.equals
				(actual_OrangeHRM_LogInPageText))
		{
			//System.out.println(" LogIn Page Text found - PASS");
			
			log.info(" LogIn Page Text found - PASS  ");
		}
		else
		{
			// System.out.println(" LogIn Page Text Not Found - FAIL ");
			
			log.info("LogIn Page Text Not Found - FAIL");
		}

	}
	
	@Test(priority=2)
	public void logInFuncationalityTest() throws IOException
	{
		// Excel File Identification
		file = new FileInputStream
			("C:\\Users\\srinivas1\\Desktop\\Dec9amBatch\\OrangeHRM\\src\\main\\java\\com\\ApplicationTestDataFiles\\OHRM_LogInTestData.xlsx");
		workBook= new XSSFWorkbook(file);
		sheet = workBook.getSheet("Sheet1");
		
		row  =sheet.getRow(1);
		userNameRowOfCell =row.getCell(0);	  
		  String userNameTestData=userNameRowOfCell.getStringCellValue();
		  System.out.println(userNameTestData);
		  
		  Cell passwordRowOfCell=row.getCell(1);
		  String passwordTestData=passwordRowOfCell.getStringCellValue();
		  System.out.println(passwordTestData);
		
		  // Identifying the Properties File
		  propertiesFile= new FileInputStream
				  ("C:\\Users\\srinivas1\\Desktop\\Dec9amBatch\\OrangeHRM\\src\\main\\java\\com\\Config\\OHRMApplication.properties");
		  // creating an Object for Properties class 
		  prop= new Properties();
		// Loading the Properties file
		  prop.load(propertiesFile);
		  
		  // identifying the Property of an element based on Property File
		  By userNameL=By.id((prop.getProperty("userNameProperty")));
			
			WebElement userName=driver.findElement(userNameL);
			userName.sendKeys(userNameTestData);
		
			By passwordL=By.name(prop.getProperty("passwordProperty"));
			WebElement password=driver.findElement(passwordL);
			password.sendKeys(passwordTestData);
			
		By logInButtonL=By.className(prop.getProperty("logInButtonProperty"));
			 WebElement logInButton=driver.findElement(logInButtonL);
			 logInButton.click();
	}

	
		@Test(priority=3)
	public void OHRMApplicationHomePageValidation() throws IOException, InterruptedException
	{

		 String expected_OrangeHRMApplicationHomePageText="Admin";
System.out.println(" The Expected Text of the OrangeHRM Application HomePage is"
						+ " :"+expected_OrangeHRMApplicationHomePageText);
		 
		 By welComeAdminL=By.id("welcome");
		 WebElement welComeAdmin=driver.findElement(welComeAdminL);
	 String actual_OrangeHRMApplicationHomePage_Text=welComeAdmin.getText();
System.out.println(" THe actual Text of The OrangeHRM Application HomPage is :"
										+actual_OrangeHRMApplicationHomePage_Text);
		 
	if(actual_OrangeHRMApplicationHomePage_Text.contains
									(expected_OrangeHRMApplicationHomePageText))
		 {
			 System.out.println("OrangeHRM HomePage Text Found- PASS");
			 
			 // Writing the Result of the validation to Excel Sheet
			 // Into A Row of a Cell 
			 
			// Row newRow=sheet.createRow(1); // new Row should not be created
			  // because already the Row is existing
			 // we Should only create a New Cell in the Existing Row
			 Cell rowOfNewCell=row.createCell(2);
		 rowOfNewCell.setCellValue("OrangeHRM HomePage Text Found- PASS");
			 
		 }
		 else
		 {
			 System.out.println("OrangeHRM HomePage  Text Not Found - FAIL");
			 
			// Writing the Result of the validation to Excel Sheet
					 // Into A Row of a Cell 
		 Cell rowOfNewCell=row.createCell(2);
		rowOfNewCell.setCellValue("OrangeHRM HomePage  Text Not Found - FAIL");
		 }
	fileOutPutStream= new FileOutputStream("C:\\Users\\srinivas1\\Desktop\\Dec9amBatch\\OrangeHRM\\src\\main\\java\\com\\ApplicationTestResultFiles\\OHRMApplicationLogInTestResultFile.xlsx");
		 workBook.write(fileOutPutStream);
		 welComeAdmin.click();
		 
		 // Synchronization 
		// Thread.sleep(10000); //- Java Wait 
		 
		 By logOutL=By.linkText("Logout");
		 
		 WebDriverWait wait = new WebDriverWait(driver, 20);
		 // ExpectedConditions is a class of Selenium WebDriver
		 wait.until(ExpectedConditions.visibilityOfElementLocated(logOutL));
		  		  
		 WebElement logOut=driver.findElement(logOutL);
		 logOut.click();

	}

}
