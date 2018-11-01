package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Utility.Constant;
import Utility.Log;


public class BaseClass {
	public static WebDriver driver = null;
	public static boolean bResult;
	//public  BaseClass(WebDriver driver){
	//	BaseClass.driver = driver;
	//	BaseClass.bResult = true;
	//}

	@BeforeSuite
	public void initialiBrowser() {
		
		
		System.setProperty("webdriver.chrome.driver", Constant.exePath);
	    driver = new ChromeDriver();
	    Log.info("Start Chrome Browser");
	}
	  

	/*@AfterSuite
	public void closeBrowser() {
	driver.quit();
	}
	*/
		
	}


