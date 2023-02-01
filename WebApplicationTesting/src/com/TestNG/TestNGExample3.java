package com.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGExample3 {
	@BeforeMethod
	public void gmailApplicationLaunch()
	{
			System.out.println(" Gmail Application Launch Successful ");
	}
	
	@AfterMethod
	public void gmailApplicationClose()
	{
		System.out.println(" Gmail Application Closed Successfully ");
	}
	
	@Test(priority=1)
	public void gmailInBoxTest()
	{
		System.out.println(" Inbox functionality Test Successful ");
	}
	@Test(enabled=false) 
	public void gmailComposeMailTest()
	{
		System.out.println(" ComposeMail functionality Test Successful ");
	}
	@Test(priority=2)
	public void gmailSentMailTest()
	{
		System.out.println(" SentMail functionality Test Successful ");
	}
	
	@Test(priority=3)
	public void gamilDraftsTest()
	{
		System.out.println(" Drafts functionality Test Successful ");
	}

}
