package com.Automation.GmailNew.BaseTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
public WebDriver driver;
	
	String browser ="firefox";		
	
	public Login objLogin = null;
	public Inbox objInbox = null;
	public Compose objCompose = null;
	public SentEmaill objSentEmail = null;
	
	
	@BeforeSuite
	public void launchingBrowser(){
		driver = BrowserFactory.getBrowser("chrome");
		
		objLogin = new Login(driver);
		objInbox = new Inbox(driver);
		objCompose = new Compose(driver);
		objSentEmail = new SentEmaill(driver);
	}
	
	@AfterSuite
	public void killDriver(){
		BrowserFactory.closeAllDriver();
	}

}
