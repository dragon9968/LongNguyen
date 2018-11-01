package automationFramework;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Utility.*;
import appModules.SFLoginAction;
import appModules.Tik551Action;
import pageObjects.BAUBassClass;
import org.apache.log4j.xml.DOMConfigurator;

public class Ticket551 extends BAUBassClass{

	public String sTestCaseName;
	
	@Test (priority = 1)
	public void TransferItems() throws Exception {
		sTestCaseName = "Test_001";
		 try {
			  DOMConfigurator.configure("log4j.xml");
			  Log.startTestCase("Ticket551_Start_TransferItem_WHStoSite_Testcase001");
			  SFLoginAction.SFLogin(driver, BAUConstant.SFUsername, BAUConstant.SFPassword);
			  Thread.sleep(3000);
			  Tik551Action.WHS_to_Site(driver);
			  		
			  Log.endTestCase("Ticket551_End_TransferItem_WHStoSite_Testcase001");
			  
	          Reporter.log("Transfer Items from WHS to Site Successfully");

			
		} catch (Exception e) {
			
			Utils.takeScreenshot(driver, sTestCaseName);
			  // This will print the error log message
			  Log.error(e.getMessage());
			  throw new Exception("Test Case Failed because of Verification");
			  // Again throwing the exception to fail the test completely in the TestNG results
			
		}
			 
		
	}
}
