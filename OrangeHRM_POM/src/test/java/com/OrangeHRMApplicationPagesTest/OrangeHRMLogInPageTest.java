package com.OrangeHRMApplicationPagesTest;

import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.OrangeHRMApplicationPages.OrangeHRMLogInPage;
import com.Utility.Log;

public class OrangeHRMLogInPageTest extends BaseTest   {
	
	OrangeHRMLogInPage lip ;	
	
	@Test(priority=1,description="OrangeHRM Application LogInPanelTexvalidation")
	public void logInPanelTextValidationTest()
	{
		 lip = new OrangeHRMLogInPage();
		lip.logInPanelTextValidation();
		
	Log.info("Valdation of LogInPanel Text in OrangeHRM Application "
												+ "LogIn Page Successful");
			
	}
	
	@Test(priority=2,description="OrangeHRM Application LogIn Validation")
	public void logInTest()
	{
		 lip = new OrangeHRMLogInPage();
		 lip.logIn("srini", "Q@Trainer7");
		 
		 Log.info("Successfully Navigated to OrangeHRM Application HomePage ");
		 
	}
	
@Test(priority=3,description="OrangeHRM Application LogIn Page Logo Validation")
	public void OrangeHRMLogoValidationTest()
	{
		 lip = new OrangeHRMLogInPage();
		 lip.OrangeHRMLogoValidation();
 Log.info("Validation of OrangeHRM Logo in OrangeHRM Application LogIn "
 														+ "Page Successfull");
	}
}
