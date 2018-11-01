package automationFramework;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import pageObjects.Worktik2BassClass;
import Utility.Log;
import appModules.*;
import pageObjects.*;

public class POM_NG2 extends Worktik2BassClass {
	
	@Test (priority = 1)
	public void CheckOut() throws Exception{
		
		  DOMConfigurator.configure("log4j.xml");

		  Log.startTestCase("Selenium_Test_003");
		
		  CheckOutAction.CheckOut_Action(driver);

		  Log.endTestCase("Selenium_Test_003");
	}
		
	@Test (priority = 2)
	public void Payment() throws Exception{
		

		  Log.startTestCase("Selenium_Test_004");
		
		  CheckOutAction.Payment_Action(driver);

		  Log.endTestCase("Selenium_Test_004");
	}
	
}
