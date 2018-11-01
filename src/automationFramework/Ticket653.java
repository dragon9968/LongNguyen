package automationFramework;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Utility.*;
import appModules.SFLoginAction;
import appModules.Tik551Action;
import appModules.Tik653Action;
import pageObjects.BAUBassClass;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Ticket653 extends BAUBassClass{

	public static String sTestCaseName;
	@Test (priority = 1)
	public static void Timecard() throws Exception{
		
		sTestCaseName = "Test_001";
		 try {
			  DOMConfigurator.configure("log4j.xml");
			  Thread.sleep(3000);
			  Log.startTestCase("Ticket653_Start_CreateTimeCard_Testcase001");
			  //SFLoginAction.SFLogin(driver, BAUConstant.SFUsername, BAUConstant.SFPassword);
			  Thread.sleep(3000);
			  Tik653Action.Create_Time_Card(driver);

			  		
			  Log.endTestCase("Ticket653_End_CreateTimeCard_Testcase001");
			  
	          Reporter.log("Create the Time Card Successfully");

			
		} catch (Exception e) {
			
			Utils.takeScreenshot(driver, sTestCaseName);
			  // This will print the error log message
			  Log.error(e.getMessage());
			  throw new Exception("Test Case Failed because of Verification");
			  // Again throwing the exception to fail the test completely in the TestNG results
			
		}
		
	}
	

}
