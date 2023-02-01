package com.MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_YourOrders_Click {
	
	public static void main(String[] args) {
		
		WebDriver driver;		
		String applicationUrlAddress="http://amazon.in";
			
	System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver(); // Creating an object
		
		//System.setProperty("webdriver.gecko.driver", "./FireFoxDriver/geckodriver.exe");
		//driver = new FirefoxDriver();
		
		driver.get(applicationUrlAddress);
		
		// Maximization of the Window
		driver.manage().window().maximize();
		
		// Mouse Hover onto HelloSignIn Element
		// Identifying properties of HelloSignIn Element
		// id="nav-link-accountList"
		
		By helloSignInL=By.id("nav-link-accountList");
		WebElement helloSignIn=driver.findElement(helloSignInL);
		
//MouseHover Operation onto HelloSignIn Element - done using Actions Class
		Actions action = new Actions(driver);
		action.moveToElement(helloSignIn).build().perform();;
			
		// Automating Your Orders Element(Hidden Element) - Type of Element Link
		// linkText - Your Orders
 // Since Your Ordres is an hiddent Element - first performing MouseHover 
// Operation onto "HelloSignIn"	- making the "Your Orders" Element(which is under
// test) Visible and then Recognization of "Your Orders" - performing Operation		
		By yourOrdersL=By.linkText("Your Orders");
		WebElement yourOrders=driver.findElement(yourOrdersL);
		yourOrders.click();
	}
}
