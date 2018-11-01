package appModules;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import Utility.*;
import pageObjects.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class SFLoginAction {
 
	public static void SFLogin(WebDriver driver, String sEmail, String sPassword) throws Exception {
		LoginPageFactory SFLoginF = PageFactory.initElements(driver, LoginPageFactory.class);	
		try {
			SFLoginF.SFUserName.sendKeys(sEmail);
			 Log.info("Input Username" );
			SFLoginF.SFPassword.sendKeys(sPassword); 
			 Log.info("Input Password" );
			 Thread.sleep(1000);
			SFLoginF.SFLogin.click(); 
			 Thread.sleep(3000);
			 Log.info("Click on Login button" );
		} catch (Exception e) {
		 Log.error("Unable to Login into system due to wrong Username or Password");
		 throw(e);
		}	
	}
	
	public static void MCI_ExternalUser_Login(WebDriver driver, String sEmail, String sPassword) throws Exception {
		LoginPageFactory SFLoginF = PageFactory.initElements(driver, LoginPageFactory.class);	
		try {
			SFLoginF.MCIUserName.sendKeys(sEmail);
			 Log.info("Input Username" );
			SFLoginF.MCIPassword.sendKeys(sPassword); 
			 Log.info("Input Password" );
			 Thread.sleep(1000);
			SFLoginF.MCILogin.click(); 
			 Thread.sleep(3000);
			 Log.info("Click on Login button" );
		} catch (Exception e) {
		 Log.error("Unable to Login into system due to wrong Username or Password");
		 throw(e);
		}	
	}
}
