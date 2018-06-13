package com.Automation.GmailNew;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Automation.GmailNew.BaseTest.BaseTest;
import com.Automation.GmailNew.BaseTest.TakesScreenshotUtility;

public class VerifyingTitle extends BaseTest{
	
	public boolean result = false;
	
	@BeforeTest
	
	public void Login() {
		result = objLogin.loginIntoGmail("saikumar.seleniumpractice@gmail.com", "Welcome123$");
	}
	
	@Test
	
	public void verifyTitle() {
		
		String title =driver.getTitle();
		
		Assert.assertEquals(title, "gmail");
	}
	
	@AfterMethod
	
	public void tearDown(ITestResult result) {
		
		if(result.getStatus()==ITestResult.FAILURE) {
			
			TakesScreenshotUtility.getScreenshot(driver, result.getName());
		}
		
	}

}
