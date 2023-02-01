package com.BrowsersAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BrowsersTesting {
	
	public static void main(String[] args) {
		
		// Automating Chrome Browser
System.setProperty("webdriver.chrome.driver",//path of the location of driverFile
	"C:\\Users\\srinivas1\\Desktop\\Dec9amBatch\\WebApplicationTesting\\"
	+ "browserDriverFiles\\chromedriver.exe");
		ChromeDriver chromeDriver = new ChromeDriver();
		
		// automating MicroSoft Edge Browser
System.setProperty("webdriver.edge.driver", "C:\\Users\\srinivas1\\Desktop\\Dec9amBatch\\WebApplicationTesting\\browserDriverFiles\\msedgedriver.exe");
 	EdgeDriver edgeDriver = new EdgeDriver();

 		// Automating Opera Browser
System.setProperty("webdriver.opera.driver",
									".\\browserDriverFiles\\operadriver.exe");
    OperaDriver operaDriver = new OperaDriver();
      
     // Automating fireFox Browser
System.setProperty("webdriver.gecko.driver",
										"./browserDriverFiles/geckodriver.exe");
    FirefoxDriver firefoxDriver = new FirefoxDriver();
				
	}
}
