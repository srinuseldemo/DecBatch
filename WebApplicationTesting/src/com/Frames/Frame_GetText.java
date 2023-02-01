package com.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_GetText {
	
	public static void main(String[] args) {
		
		WebDriver driver;		
		String applicationUrlAddress="https://jqueryui.com/droppable/";
				
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
			driver = new ChromeDriver(); // Creating an object
			
			driver.get(applicationUrlAddress);
			driver.manage().window().maximize();
			
			
			// id="draggable" - Drag me to My Target element Property
			// id="draggable"
			
		// 	Thread.sleep(10000);
			
		// Identifying the Frame of the WebPage	
//<iframe src="/resourcesdefault.html" class="demo-frame"></iframe>		
			// Block of the WebPage - its a Frame
						 
			By frameOfWebPagel=By.className("demo-frame");
	WebElement frameOfWebPage=driver.findElement(frameOfWebPagel);
	
	// Switching into the Frame of the WebPage
	driver.switchTo().frame(frameOfWebPage);		
			
		By dragMeToMyTargetL=By.id("draggable");
	WebElement dragMeToMyTarget=driver.findElement(dragMeToMyTargetL);
			
		String dragMeToMyTarget_Text=dragMeToMyTarget.getText();
System.out.println(" The Element dragMeToMyTarget text is :- "
														+dragMeToMyTarget_Text);
	
	

	}
}
