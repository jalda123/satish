package com.Automation.GmailNew.BaseTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage{

public Inbox objInbox = null;
	
	public Login(WebDriver webDriver){
		super(webDriver);
		objInbox = new Inbox(driver);		
	}
	
	@FindBy(id="identifierId")
	private WebElement username;
	
	@FindBy(xpath="//Content[@class='CwaK9']/span")
	WebElement userNameBtnNext;
	
	@FindBy(name="password")
	WebElement password;
	
	
	public boolean loginIntoGmail(String userName,String passWord){
		
		flag = false;
		
		try{	
			
			driver.get("http://gmail.com");
			
			driver.manage().window().maximize();
			
	
			
			username.sendKeys(userName);
			
			userNameBtnNext.click();			
			
			Thread.sleep(5000);
			
			password.sendKeys(passWord);
			
			userNameBtnNext.click();
			
			Thread.sleep(5000);			
			
			flag = objInbox.verifyGmailInbox();
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return flag;
	}
	
	
	
}
