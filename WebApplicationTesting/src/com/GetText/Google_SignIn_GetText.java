package com.GetText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_SignIn_GetText {
	
	public static void main(String[] args) {
		
		WebDriver driver;		
		String applicationUrlAddress="http://google.com";
			
			System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
			driver = new ChromeDriver(); // Creating an object
			
			driver.get(applicationUrlAddress);
			
		WebElement signInElement=driver.findElement(By.linkText("Sign in"));
				
		// Get the text of an Element - Sign In
	String	signInElement_Text=signInElement.getText();
System.out.println(" The text of an Element Sign In is : "+signInElement_Text);
				
 // Using the same variable signInElement - performing another operation- click 
			signInElement.click();

// * Whenever we save any identified element into a variable-using the variable	
	// we can perform multiple Operations
			
			//driver.close();
	}

}
