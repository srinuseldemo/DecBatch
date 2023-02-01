package com.Links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_SignInTest {
	
	public static void main(String[] args) {
		WebDriver driver;		
String applicationUrlAddress="http://google.com";
	
	System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	driver = new ChromeDriver(); // Creating an object
	
	driver.get(applicationUrlAddress);
	
// <a  href="https://e=le.com/&amp;ec=GAZAmgQ" target="_top">Sign in</a>
	
	// a - anchor Tag 
	// href = attribute
	// value=https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;continue=https://www.google.com/&amp;ec=GAZAmgQ" target="_top
	
	// when an element properties contains a tag and href attribute then the
	// type of element is Link
// if the element is of Type Link then either user linkText() of partialLinkTex()

	//driver.findElement(By.linkText("Sign in")).click();
	            // OR
	//driver.findElement(By.partialLinkText("Sign")).click();
	           // OR - Should be as below 
	WebElement signInElement=driver.findElement(By.linkText("Sign in"));
	
	signInElement.click();
	
	driver.close();
			
	}
}
