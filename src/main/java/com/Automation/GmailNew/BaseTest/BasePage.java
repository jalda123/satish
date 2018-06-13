package com.Automation.GmailNew.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends BaseTest{
	
	public WebDriver driver = null;
	public boolean flag = false;	
	
	

	public BasePage(WebDriver webDriver) {

		driver = webDriver;

		PageFactory.initElements(driver, this);
		
		
		
		

	}

}
