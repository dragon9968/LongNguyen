package automationFramework;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Utility.*;

import appModules.Tik501Action;
import pageObjects.BaseClass1;
import pageObjects.Tik501Factory;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.support.PageFactory;


public class Ticket501 extends BaseClass1{
	
	public String sTestCaseName;
	
	@Test (priority = 1)
	public void BookNutritionAppointment() throws Exception{
		
		  sTestCaseName = "Test_001";
		  try {
			  DOMConfigurator.configure("log4j.xml");
			  Log.startTestCase("Ticket501_Booking_Successull_Testcase001");
			  
			  Tik501Action.BookNutritionAppointment(driver);
			  		
			  Log.endTestCase("Ticket501_Booking_Successull_Testcase001");
			  Thread.sleep(5000);
	          Reporter.log("Patient Booked Appointment Successfully");

			
		} catch (Exception e) {
			
			Utils.takeScreenshot(driver, sTestCaseName);
			  // This will print the error log message
			  Log.error(e.getMessage());
			  throw new Exception("Test Case Failed because of Verification");
			  // Again throwing the exception to fail the test completely in the TestNG results
			
		}
			 
		
	}

}
