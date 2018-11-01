package automationFramework;

import org.testng.annotations.Test;

import Utility.*;
import appModules.SignIn_Action;
import pageObjects.*;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;


public class POM_NG {
	
	public WebDriver driver;
	

 /*
	 @Test(priority=1)
  public void Login1() throws Exception {
		 Log.startTestCase("Selenium_Test_001");
	  SignIn_Action.Execute_1(driver,Constant.Email,Constant.Password);
	
	  Log.info("System display error message as below");

		
	    String actualMessage = Login.actualwronginfo_message(driver).getText();
		System.out.println("message : " + actualMessage);

		Assert.assertEquals(actualMessage, Constant.expectedMessage);
	
		if(actualMessage.contains(Constant.expectedMessage))
		{
			//System.out.println("System has displayed error message");
			 Log.info(Constant.expectedMessage);

			}
			else
			{
			//System.out.println("There is no notice message");	
				Log.info("There is no notice message");
			}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@class='close login-close-Bt']")).click();
		Thread.sleep(2000);
		Log.endTestCase("Selenium_Test_001");
  }
	 @Test(priority=2)
  public void Login2() throws Exception {
		 Log.startTestCase("Selenium_Test_002");
	  SignIn_Action.Execute_2(driver,Constant.Email,Constant.Password);
	
	  Log.info("System display error message as below");

		
	    String actualinputemail_message = Login.actualinputemail_message(driver).getText();
	    String actualinputpass_message = Login.actualinputpass_message(driver).getText();
		System.out.println("message : " + actualinputemail_message);
		System.out.println("message : " + actualinputpass_message);


		Assert.assertEquals(actualinputemail_message, Constant.expectedMessage1);
		Assert.assertEquals(actualinputpass_message, Constant.expectedMessage1);
	
		if(actualinputemail_message.contains(Constant.expectedMessage1))
		{
			if(actualinputpass_message.contains(Constant.expectedMessage1))
			{
			 Log.info(Constant.expectedMessage1);
			}
			
			}
			else
			{			
				Log.info("There is no notice message");
			}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@class='close login-close-Bt']")).click();
		Thread.sleep(2000);
		Log.endTestCase("Selenium_Test_002");
  }
	 */
	 @Test(priority=1)
  public void SignUp() throws Exception {
		 Log.startTestCase("Selenium_Test_003");
	     SignIn_Action.SignUp(driver);
		 Log.endTestCase("Selenium_Test_003");
  }
	 
	 
  
  @BeforeClass
  public void beforeMethod() throws Exception{
	  
	  DOMConfigurator.configure("log4j.xml");

	
	  System.setProperty("webdriver.chrome.driver", Constant.exePath);
	    driver = new ChromeDriver();
	    Log.info("Start Chrome Browser");
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get(Constant.URL);
	    Log.info("Open Donor Tiles link");

	    driver.manage().window().maximize();
	    Log.info("Maximum the Window");
	 
	   //Utils.OpenBrowser();
  }

  @AfterClass
  public void afterMethod() {
  }

}
