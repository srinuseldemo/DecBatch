package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM_LogInTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;		
String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	
	System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	driver = new ChromeDriver(); // Creating an object
	
	driver.get(applicationUrlAddress);
	
	// validating the LogIn WebPage
	// Title Validation
	String expectedTitle_OrangeHRMApplicationLogInPage="OrangeHRM";
	System.out.println(" The title of OrangeHRM Application "+expectedTitle_OrangeHRMApplicationLogInPage);
	
	String actualTitle_OrangeHRMApplicationLogInPage=driver.getTitle();
	System.out.println(" The actual title of OrangeHRm Application is : "+actualTitle_OrangeHRMApplicationLogInPage);

	//if(actualTitle.equals(expectedTitle))
	if(actualTitle_OrangeHRMApplicationLogInPage.equals(expectedTitle_OrangeHRMApplicationLogInPage))
	{
		System.out.println(" Title matched - PASS ");
	}
	else
	{
		System.out.println(" Title not matched - FAIL ");
	}
	
	
	// LogIn Page Url Address Validation
	// orangehrm-4.2.0.1
	
	String expected_OrangeHRMApplicationLogInPageUrlAddress="orangehrm-4.2.0.1";
	System.out.println(" The Expected OrangeHRM Application LogIn Page Url Address is : "+expected_OrangeHRMApplicationLogInPageUrlAddress);
	
	String actual_OrangeHRMApplicationLogInPageUrlAddress=driver.getCurrentUrl();
	System.out.println(" The Actual OrangeHRM Application LogIn Page Url Address is :"+actual_OrangeHRMApplicationLogInPageUrlAddress);
	
	if(actual_OrangeHRMApplicationLogInPageUrlAddress.contains(expected_OrangeHRMApplicationLogInPageUrlAddress))
	{
		System.out.println(" OrangeHRM Application LogIn Page URL Address Matched - PASS");
	}
	else
	{
		System.out.println("OrangeHRM Application LogIn Page URL Address NOT Matched - FAIL");
	}
	
	String expected_OrangeHRM_LogInPageText="LOGIN Panel";
	System.out.println("The expected Text of OrangeHRM Application LogIn Page is :"+expected_OrangeHRM_LogInPageText);
	
	By orangeHRM_LogInPageTextL=By.id("logInPanelHeading");
	WebElement orangeHRM_LogInPageText=driver.findElement(orangeHRM_LogInPageTextL);
	String actual_OrangeHRM_LogInPageText=orangeHRM_LogInPageText.getText();
	
	System.out.println("The Actual Text of OrangeHRM Application LogIn Page is :"+actual_OrangeHRM_LogInPageText);
	
	if(actual_OrangeHRM_LogInPageText.equals(expected_OrangeHRMApplicationLogInPageUrlAddress))
	{
		System.out.println(" LogIn Page Text found - PASS");
	}
	else
	{
		System.out.println(" LogIn Page Text Not Found - FAIL ");
	}
	
/*
	<input name="txtUsername" id="txtUsername" type="text">

 	locator = id
 	Selector = txtUsername
 
 	attribute=id
 	value=txtUsername
	
*/
	//identification of recognization of an Element - UserName
	// on the identified Element - perform the Operation
	driver.findElement(By.id("txtUsername")).sendKeys("srini");
	
// <input name="txtPassword"  autocomplete="off" type="password">
	
	// locator = name
	// Selector = txtPassword
	
	driver.findElement(By.name("txtPassword")).sendKeys("Q@Trainer7");
	
	// <input type="submit"  class="button"  value="LOGIN">
	
	// locator = class
	// selector = button
	
	driver.findElement(By.className("button")).click();
	
	// Validating Orange HRM Application HomePage
			
	 String expectedTitle_OrangeHRMApplicationHomePage="OrangeHRM";
System.out.println(" The title of the OrangeHRm Application is : "+expectedTitle_OrangeHRMApplicationHomePage);
	 
String actualTitle_OrangeHRMApplicationHomePage=driver.getTitle();
	 System.out.println(" The actual title of the webPage is : "+actualTitle_OrangeHRMApplicationHomePage);
	 
	 //if(actualTitle.equals(expectedTitle))
	 if(actualTitle_OrangeHRMApplicationHomePage.equals(expectedTitle_OrangeHRMApplicationHomePage))
	 {
		 System.out.println(" OrangeHRM Application Home Page Title matched - PASS");
	 }
	 else
	 {
		 System.out.println(" OrangeHRM Application Home Page Title matched-- FAIL ");
	 }
	 
	 String expected_OrangeHRMApplicationHomePageText="Admin";
	 System.out.println(" The Expected Text of the OrangeHRM Application HomePage is :"+expected_OrangeHRMApplicationHomePageText);
	 
	 By welComeAdminL=By.id("welcome");
	 WebElement welComeAdmin=driver.findElement(welComeAdminL);
	 String actual_OrangeHRMApplicationHomePage_Text=welComeAdmin.getText();
	 System.out.println(" THe actual Text of The OrangeHRM Application HomPage is :"+actual_OrangeHRMApplicationHomePage_Text);
	 
	 if(actual_OrangeHRMApplicationHomePage_Text.contains(expected_OrangeHRMApplicationHomePageText))
	 {
		 System.out.println("OrangeHRM HomePage Text Found- PASS");
	 }
	 else
	 {
		 System.out.println("OrangeHRM HomePage  Text Not Found - FAIL");
	 }
	 
	 welComeAdmin.click();
	 
	 // Synchronization 
	 
	 Thread.sleep(5000);
	 
// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
	 
	 By logOutL=By.linkText("Logout");
	 WebElement logOut=driver.findElement(logOutL);
	 logOut.click();
	 
	driver.close();
	
	}

}
