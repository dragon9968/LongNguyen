package pageObjects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import Utility.Constant;
import Utility.Log;
import Utility.BAUConstant;

public class Worktik2BassClass {
	public static WebDriver driver = null;
	@BeforeTest
	public void initialiBrowser() {
		
		try {
		System.setProperty("webdriver.chrome.driver", Constant.exePath);
	    driver = new ChromeDriver();
	    Log.info("Start Chrome Browser1111");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get(BAUConstant.MagrabcertBookingURL);
	    Log.info("Open Nutrition Appointment Booking Page");

	    driver.manage().window().maximize();
	    Log.info("Maximum the Window");
	}
		catch (Exception e){
			Log.error("Class Utils | Method OpenBrowser | Exception desc : "+e.getMessage());
		}
/*
	@AfterSuite
	public void closeBrowser() {
	driver.quit();
	}
*/
}
}
