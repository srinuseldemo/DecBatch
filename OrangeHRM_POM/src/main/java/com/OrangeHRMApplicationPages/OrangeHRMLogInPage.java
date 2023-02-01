package com.OrangeHRMApplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.BaseTest.BaseTest;
import com.Utility.Log;



public class OrangeHRMLogInPage extends BaseTest {
	
//Should be provided with the Information of identification the Elements of the WebPage
	//                       AND
	// The Operations that should be performed on the Elements - Methods
	
	// WebElement logInPanel=driver.findElement(By.id("logInPanelHeading"));
	
	// An Object Repository Class
	
	public OrangeHRMLogInPage() //it is a constructor
	// class name similar to Method name
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="logInPanelHeading")
	WebElement logInPanel;
	
	@FindBy(id="txtUsername")
	WebElement useName;
	
	@FindBy(name="txtPassword")
	WebElement password;
	
	@FindBy(className = "button" )
	WebElement logInButton;
	
	@FindBy(xpath = "//*[@id=\"divLogo\"]/img")
	WebElement orangeHRMLogInPageLogo;
	
	public void logInPanelTextValidation()
	{
		String expected_LogInPageText="LOGIN Panel";
	//	System.out.println(" The expected text of LogIn Page is :- "					+expected_LogInPageText);
		Log.info(" The expected text of LogIn Page is :- "
												+expected_LogInPageText);
				
		String actual_LogInPageText=logInPanel.getText();
	//System.out.println(" The actual text of LogIn Page is :- "											+actual_LogInPageText);
		Log.info(" The actual text of LogIn Page is :- "+actual_LogInPageText);
	
		/*
		if(actual_LogInPageText.equals(expected_LogInPageText))
		{
		// System.out.println(" Successfully navigated to LogIn Page - PASS ");
			Log.info(" Successfully navigated to LogIn Page - PASS ");
			
		}
		else
		{
			// System.out.println(" Failed to navigated to LogIn Page - FAIL");
			Log.info(" Failed to navigated to LogIn Page - FAIL");
		}
	*/
		
	Assert.assertEquals(actual_LogInPageText, expected_LogInPageText, 
									" LogInPage LogIn Panel Text not matched");
		
		Log.info("Assert True - LogInPage LogIn Panel Validation Successfull ");
	
						// OR
		/*
		SoftAssert ast = new SoftAssert(); 
		
		ast.assertEquals(actual_LogInPageText, expected_LogInPageText, 
									" LogInPage LogIn Panel Text not matched");
			
		*/
			
	}
		
	public void logIn(String userNameText,String passwordText)
	{
		useName.sendKeys(userNameText);
		password.sendKeys(passwordText);
		logInButton.click();
				
	}
	
	public void OrangeHRMLogoValidation()
	{
		
		boolean flag=orangeHRMLogInPageLogo.isDisplayed();
		// Image/Logo Validation
		if(flag)
		{
			System.out.println(" OrangeHRM Logo Existing on the LogIn page - PASS");
		}
		else
		{
			System.out.println("OrangeHRM Logo NOT Existing on the LogIn page - FAIL");
		}
		
Assert.assertTrue(flag, "OrangeHRM Application Logo Not Existing - FAIL");
	}
}
