package com.Automation.GmailNew.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Compose extends BasePage{
	
	public Compose(WebDriver webDriver){
		super(webDriver);		
		
		objInbox = new Inbox(driver);
	}
	
	@FindBy(name="to")
	WebElement toEmailId;
	
	@FindBy(name="subjectbox")
	WebElement subjectEmail;
	
	@FindBy(id=":9f")
	WebElement emailbody;
	
	@FindBy(id=":84")
	WebElement sendEmailBtn;
	
	public boolean composeEmail(){
		
		flag = false;
			
			try{				
				
				Thread.sleep(5000);
				
				toEmailId.sendKeys("saikumar2829@gmail.com");
				
				subjectEmail.sendKeys("Test Mail from Thomson Reuters");
				
				emailbody.sendKeys("Test Email Body");
				
				sendEmailBtn.click();
				
				Thread.sleep(2000);		
				
				flag = objInbox.emailSentMessage();
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
			return flag;
		}
		


}
