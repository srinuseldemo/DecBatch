package com.Utitlity;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
		// Capturing Screen shot
public static void takeScreenshot(WebDriver driver,String imageName) throws IOException {
		TakesScreenshot takeScreenShot =(TakesScreenshot)driver;
		File errorWebPageScreenShot =takeScreenShot.getScreenshotAs
														(OutputType.FILE);
		FileUtils.copyFile(errorWebPageScreenShot, new File
				("./OrangeHRMApplicationErrorScreenshots/"+imageName+".png"));
		
	}
	
	
}
