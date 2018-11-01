package automationFramework;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Utility.*;

import appModules.*;
import pageObjects.*;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class Ticket711{
	
	public String sTestCaseName;
	public WebDriver driver ;
	
	//Tik-711
	@Test (priority = 1)
	public void MyCommunityRequest() throws Exception {
		 
		sTestCaseName = "Test_001";
		  try {
			  DOMConfigurator.configure("log4j.xml");
			  Log.startTestCase("Ticket711_MCIRequest_Successull_Testcase001");
			  driver = BAUBassClass.MCI_External_Login();
			  Thread.sleep(5000);
			  SFLoginAction.MCI_ExternalUser_Login(driver, BAUConstant.MCI_Username, BAUConstant.MCI_Password);
			  Thread.sleep(3000);
			  Tik711Action.Create_MCI_Request(driver);
			  Log.endTestCase("Ticket711_MCIRequest_Successull_Testcase001");
			  Thread.sleep(5000);
	          Reporter.log("Customer make a MCI request Successfully");

			
		} catch (Exception e) {
			
			Utils.takeScreenshot(driver,sTestCaseName);
			  // This will print the error log message
			  Log.error(e.getMessage());
			  throw new Exception("Test Case Failed because of Verification");
			  // Again throwing the exception to fail the test completely in the TestNG results
			
		}
	}

}
