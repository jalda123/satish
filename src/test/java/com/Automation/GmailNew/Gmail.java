package com.Automation.GmailNew;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Automation.GmailNew.BaseTest.BaseTest;

public class Gmail extends BaseTest{
	
public boolean result = false;
	
	@BeforeClass	
	public void verifyGmailInbox(){
		
		
		result = objLogin.loginIntoGmail("saikumar.seleniumpractice@gmail.com", "Welcome123$");
		
	}
	
	@Test
	public void verifyEmailSent(){
		
		if(result){
			
			//click on compose link
			result = objInbox.clickOnComposeLink();
			
			//composing email
			if(result) {
				System.out.println("Clicked on compose link");
				result = objCompose.composeEmail();
			}
			else{
				System.out.println("Failed to click on compose link");
			}
			
			//verify email in sent email
			if(result) {
				System.out.println("Mail sent successfully!");
				result = objInbox.clickOnSentEmailLink();
			}
			else{
				System.out.println("Error occurred while email sent");
			}
			
			if(result){
				System.out.println("Sent Email launched");
				result = objSentEmail.verifySentEmail();
			}
			else{
				System.out.println("Error occurred while clicking on sent email");
			}
			
			if(result){
				System.out.println("Test Case - Passed: Email sent successfully!");
			}
			else{
				System.out.println("Test Case - Failed: Email not sent!");
			}			
			
		}
		else{
			System.out.println("User failed to login into Gmail");
		}
		
		
		

}
}
