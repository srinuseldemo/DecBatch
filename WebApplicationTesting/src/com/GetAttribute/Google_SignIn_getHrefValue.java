package com.GetAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Google_SignIn_getHrefValue {
	
	public static void main(String[] args) {
		
		WebDriver driver;		
		String applicationUrlAddress="http://google.com";
			
	System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
	driver = new ChromeDriver(); // Creating an object
			
	driver.get(applicationUrlAddress);
	
	// sign In Element Properties
// <a class="gb_7 gb_8 gb_de gb_dd" href="https://accounts.google.com/
	//https://www.google.com/&amp;ec=GAZAmgQ" target="_top">Sign in</a>
	
  By signInL=By.linkText("Sign in");	
  
  WebElement signIn=driver.findElement(signInL);
  
// String  signInAttributeValue=signIn.getAttribute("href");
    String  signInAttributeValue=signIn.getAttribute("class");
System.out.println(" The attribute value of Sign In Element is : "
														+signInAttributeValue);
        String signIn_Text=signIn.getText();
        System.out.println(" The text of an element Sign In is : "+signIn_Text);
        
        signIn.click();

        String signInWebPage_Title=driver.getTitle();
System.out.println(" The title of the SignIn WebPage is : "+signInWebPage_Title);
        
          driver.quit();
		
	}

}
