package com.DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQuery_DragAndDropOpearation {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;		
		String applicationUrlAddress="https://jqueryui.com/droppable/";
				
System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
			driver = new ChromeDriver(); // Creating an object
			
			driver.get(applicationUrlAddress);
			driver.manage().window().maximize();
			
			// id="draggable" - Drag me to My Target element Property
			// id="draggable"
			
		// 	Thread.sleep(10000);
			
// <iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>		
			// Block of the WebPage - its a Frame
			
			By frameOfWebPagel=By.className("demo-frame");
	WebElement frameOfWebPage=driver.findElement(frameOfWebPagel);
	
	driver.switchTo().frame(frameOfWebPage);		
			
			By dragMeToMyTargetL=By.id("draggable");
		WebElement dragMeToMyTarget=driver.findElement(dragMeToMyTargetL);
			
		String dragMeToMyTarget_Text=dragMeToMyTarget.getText();
System.out.println(" The Element dragMeToMyTarget text is :- "
												+dragMeToMyTarget_Text);
					
	// identify the "Drop here" element Property
// <div id="droppable" class="ui-widget-header ui-droppable"><p>Drop here</p>
	
	By dropHereL=By.id("droppable");
	WebElement dropHere=driver.findElement(dropHereL);
	
	// Since drag and drop Operations are done with the Mouse - using  
	// mouse Operation
	Actions action = new Actions(driver);
	action.dragAndDrop(dragMeToMyTarget, dropHere).build().perform();
	
	// exisiting for the Frame of the WebPage
	driver.switchTo().defaultContent();
	
	// Automate ReSizable Element
	// <a href="http://jqueryui.com/resizable/">Resizable</a>
	
	By resizableL=By.linkText("Resizable");
	WebElement resizable=driver.findElement(resizableL);
	resizable.click();
	
	// getting the title of Resizable Webpage
	String resizableWebPageTitle=driver.getTitle();
System.out.println(" The title of the Resizable WebPage is :- "
														+resizableWebPageTitle);
	
	}
}
