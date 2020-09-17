package com.openMRS.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class screenshot {
	
	WebDriver driver;
	
	public screenshot(WebDriver driver)
	{
		
		this.driver = driver;
	}
	
	
	
	public void captureScreenshot(String ssname) throws IOException
	{
		
	
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\tanumay123\\Desktop\\Automation\\Selenium_projects_workspace\\screenshots\\"+ssname+".png"));
		
	}
	
	

}
