package com.Automation.GmailNew.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Inbox extends BasePage{

public Inbox(WebDriver webDriver){
		
		super(webDriver);
		
	}
	
	@FindBy(xpath="//span[@class='nU ']/a[contains(text(),'Inbox')]")
	WebElement inboxLink;

	@FindBy(xpath="//div[contains(text(),'COMPOSE')]")
	WebElement composeBtn;	
	
	
	@FindBy(xpath="//div[@class='vh']")
	WebElement emailSentLabel;
	
	@FindBy(xpath="//a[@title='Sent Mail']")
	WebElement sentEmailLink;
	
	
	public boolean verifyGmailInbox(){
		
		flag = false;
		
		try{
			Thread.sleep(2000);
			if(inboxLink.isDisplayed()){
				flag = true;
			}
			
		}
		catch(Exception e){
			
		}
		
		
		return flag;
	}
	
	public boolean clickOnComposeLink(){
		
		flag = false;
		
		try{
			composeBtn.click();
			flag = true;
			
		}
		catch(Exception e){
			
		}
		
		return flag;
	}
	
public boolean clickOnSentEmailLink(){
		
		flag = false;
		
		try{
			sentEmailLink.click();
			flag = true;
			
		}
		catch(Exception e){
			
		}
		
		return flag;
	}
	
	
	public boolean emailSentMessage(){
		
		flag = false;
		
		try{			
			
			String emailSentMessage = emailSentLabel.getText();
			
			if(emailSentMessage.equalsIgnoreCase("Your message has been sent. View message")){
				System.out.println("Email Sent successfully");
				flag = true;
			}
			else{
				System.out.println("Email not sent");
			}
			
			
		}
		catch(Exception e){
			
		}
		
		return flag;
	}
	
	
	
	
	
	
	
}
