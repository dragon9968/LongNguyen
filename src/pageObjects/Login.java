package pageObjects;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import Utility.Log;

public class Login {
	
	private static WebElement element = null;
	
	public static WebElement txt_Email (WebDriver driver) {
		
		try {
			element = driver.findElement(By.id("emailInputOrg"));
		    Log.info("Email textbox found");
			
		    } 
		   catch (Exception e) 
		    {
			Log.info("Email textbox notfound");
			throw(e);
		    }
		
	   return element;
	   }
	
	

	   public static WebElement txt_Password (WebDriver driver) {
		   element = driver.findElement(By.id("passInputOrg"));
			Log.info("Password textbox found");   
	   return element;
	   }
	
	   public static WebElement btn_Send (WebDriver driver) {
		   element = driver.findElement(By.id("sendEmailBtOrg"));
		   Log.info("SendEmail button found");
	   return element;
	   }
	   
	   public static WebElement actualwronginfo_message (WebDriver driver) {
		   element = driver.findElement(By.xpath("//*[@id='loginOrgForm']//*[@id='notExistError']"));
		   
	   return element;
	   }
	   public static WebElement actualinputemail_message (WebDriver driver) {
		   element = driver.findElement(By.xpath("//*[@id='loginOrgForm']/div[1]/label"));
		   
	   return element;
	   }
	   public static WebElement actualinputpass_message (WebDriver driver) {
		   element = driver.findElement(By.xpath("//*[@id='loginOrgForm']/div[2]/label[1]"));
		   
	   return element;
	   }
	   
	   
	   
	   //Using OnlineStore
	   public static WebElement txtbx_UserName(WebDriver driver) throws Exception{
       	try{
	            element = driver.findElement(By.id("log"));
	            Log.info("Username text box is found on the Login Page");
       	}catch (Exception e){
          		Log.error("UserName text box is not found on the Login Page");
          		throw(e);
          		}
          	return element;
           }
       
       public static WebElement txtbx_Password(WebDriver driver) throws Exception{
       	try{
	        	element = driver.findElement(By.id("pwd"));
	            Log.info("Password text box is found on the Login page");
       	}catch (Exception e){
       		Log.error("Password text box is not found on the Login Page");
          		throw(e);
          		}
          	return element;
       }
       
       public static WebElement btn_LogIn(WebDriver driver) throws Exception{
       	try{
	        	element = driver.findElement(By.id("login"));
	            Log.info("Submit button is found on the Login page");
       	}catch (Exception e){
       		Log.error("Submit button is not found on the Login Page");
          		throw(e);
          		}
          	return element;
       }
}
