package com.TestNG;
import org.testng.annotations.Test;
public class TestNGExample1 {
	
	@Test(priority=1) // its a Test Case
	// If a class has multiple Test cases than the order of the execution 
	// should be set - using priority
	// If Priority is not set - then the test cases will be executed in the
	// alphabetical Order of the given Test case Names(Method Names)
	public void gmailApplicationLaunch()
	{
			System.out.println(" Gmail Application Launch Successful ");
	}
	
	@Test(priority=2)
	public void gmailInBoxTest()
	{
		System.out.println(" Inbox functionality Test Successful ");
	}
	
	// the default status of the a Test case is - enabled=true
	// TestNG overLooks this current Test at the time of Test Execution
	@Test(enabled=false) 
	public void gmailComposeMailTest()
	{
		System.out.println(" ComposeMail functionality Test Successful ");
	}
	
	@Test(priority=4)
	public void gmailSentMailTest()
	{
		System.out.println(" SentMail functionality Test Successful ");
	}
	
}
