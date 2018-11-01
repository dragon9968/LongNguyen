package pageObjects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Utility.Constant;
import Utility.Log;
import Utility.Tik501Constant;

public class BaseClass1 {
	public static WebDriver driver = null;
	@BeforeSuite
	public void initialiBrowser() {
		
		System.setProperty("webdriver.chrome.driver", Constant.exePath);
	    driver = new ChromeDriver();
	    Log.info("Start Chrome Browser1111");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get(Tik501Constant.URL);
	    Log.info("Open Nutrition Appointment Booking Page");

	    driver.manage().window().maximize();
	    Log.info("Maximum the Window");
	}
	  
/*
	@AfterSuite
	public void closeBrowser() {
	driver.quit();
	}
*/
}
