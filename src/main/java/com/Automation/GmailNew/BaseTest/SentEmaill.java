package com.Automation.GmailNew.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SentEmaill extends BasePage{
	
	public SentEmaill(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}

	
	
	@FindBy(xpath="//span[@id=':92']")
	WebElement getSubject;
	
	@FindBy(xpath="//td[@class='xW xY ']/span[@id=':91']")
	WebElement getSentTime;
	
public boolean verifySentEmail(){
		
		flag = false;
		
		try{		
			
			
			Thread.sleep(2000);
			
			String subject = getSubject.getText();
			String time = getSentTime.getText();
			
			if(subject.equalsIgnoreCase("Test Mail from Thomson Reuters")){
				System.out.println("Email sent successfully and email received at :"+time);
				
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
