package com.Automation.GmailNew.BaseTest;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class TakesScreenshotUtility {
	
	public static  void getScreenshot(WebDriver driver, String screenshotname) {
		
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			
             File  src =	ts.getScreenshotAs(OutputType.FILE);

             FileUtils.copyFile(src , new File("./Screenshot/"+screenshotname+".png"));
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
	
	}

}
