package automationFramework;

import org.testng.annotations.Test;

import Utility.Constant;
import Utility.Log;
import Utility.Utils;
import appModules.SelectProductandAddtoCard;
import appModules.SignIn_Action;
import appModules.CheckOutAction;
import pageObjects.Worktik2BassClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class POM_NG1 extends Worktik2BassClass {
	//public WebDriver driver;
	public String sTestCaseName;
	
  @Test (priority = 1)
  public void LoginOnlineStore() throws Exception{
	  sTestCaseName = "Test_001";
		
	  try {
		  DOMConfigurator.configure("log4j.xml");
		  Log.startTestCase("Selenium_Test_001");
		  //Thread.sleep(3000);
		  SignIn_Action.LoginOnlineStore(driver, Constant.Username,Constant.Password);
		  // driver.findElement(By.xpath("//a[@title='My Account']")).click();
		  //driver.navigate().to("https://www.donortiles.com/");
	      //Utils.hoverOnElement(mainelement, subelement);
		  //SelectProductandAddtoCard.SelectProductAddtoCard(driver);
		  Log.endTestCase("Selenium_Test_001");
		  Thread.sleep(7000);
		
	} catch (Exception e) {
		
		Utils.takeScreenshot(driver, sTestCaseName);
		  // This will print the error log message
		  Log.error(e.getMessage());
		  throw new Exception("Test Case Failed because of Verification");
		  // Again throwing the exception to fail the test completely in the TestNG results
		
	}
		 
	  
	  
  }
  
  @Test (priority = 2)
  public void SelectProductandAddtoCart() throws Exception{
	  
		  
		  Log.startTestCase("Selenium_Test_002");
		 
		  SelectProductandAddtoCard.SelectProductAddtoCard(driver);
		  Thread.sleep(3000);
		  
		  //CheckOutAction.CheckOut_Action(driver);

		  Log.endTestCase("Selenium_Test_002");
  }
/*
  @Test (priority = 3)
  public void CheckOut() throws Exception{
	  
		  
		  Log.startTestCase("Selenium_Test_003");
	  
		  CheckOutAction.CheckOut_Action(driver);

		  Log.endTestCase("Selenium_Test_003");
  }
  */
/*  
  @BeforeMethod
  public void beforeClass() {
	  
	  DOMConfigurator.configure("log4j.xml");
	  	
	 /* System.setProperty("webdriver.chrome.driver", Constant.exePath);
	    driver = new ChromeDriver();
	    Log.info("Start Chrome Browser");
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get(Constant.URL1);
	    Log.info("Open Donor Tiles link");

	    driver.manage().window().maximize();
	    Log.info("Maximum the Window");

		  driver = Utils.navigate();
  }
  
  

  @AfterMethod
  public void afterClass() {
  }
*/
}
