package com.GetText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementExample {
	
	public static void main(String[] args) {
	
		WebDriver driver;		
		String applicationUrlAddress="http://google.com";
			
			System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
			driver = new ChromeDriver(); // Creating an object
			
			driver.get(applicationUrlAddress);
		
			 
//String signInElementText=driver.findElement(By.linkText("Sign in")).getText();
//System.out.println(signInElementText);
			
			   // OR
/*			
WebElement signInElement=driver.findElement(By.linkText("Sign in"));
String signInElementText=signInElement.getText();
System.out.println(signInElementText);
*/
			 // OR
	// getting the Text of Sign In Element 
By signInLocator=By.linkText("Sign in"); // identifying element with property
WebElement signIn=driver.findElement(signInLocator); //finding element of WebPage
	String singIn_Text=signIn.getText(); // getting text of an Element - Sign in
	System.out.println(" The text of an Element Sign In is : "+singIn_Text);
	
	// performing a click Operation on Sign In Element
	signIn.click();
			
	driver.quit();
		
	}

}
