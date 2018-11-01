package pageObjects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Utility.Constant;
import Utility.Log;
import Utility.BAUConstant;

public class BAUBassClass {
	public static WebDriver driver = null;
	@BeforeSuite
	public static WebDriver initialiBrowser() {
		
		try {
		System.setProperty("webdriver.chrome.driver", BAUConstant.exePath);
		//System.setProperty("webdriver.gecko.driver", BAUConstant.exePath);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	    driver = new ChromeDriver(options);//disable notification popup
	    //driver = new FirefoxDriver();
	   // Log.info("Start Chrome Browser");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get(BAUConstant.MagrabcertURL);
	    //Log.info("Open Magrabcert Sandbox");

	    driver.manage().window().maximize();
	    //Log.info("Maximum the Window");
	    }
		catch (Exception e){
			Log.error("Class Utils | Method OpenBrowser | Exception desc : "+e.getMessage());
		}
		return driver;		
	}
	
        public static WebDriver MCI_External_Login() {
		
		try {
		System.setProperty("webdriver.chrome.driver", BAUConstant.exePath);
		//System.setProperty("webdriver.gecko.driver", BAUConstant.exePath);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	    driver = new ChromeDriver(options);//disable notification popup
	    //driver = new FirefoxDriver();
	   // Log.info("Start Chrome Browser");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get(BAUConstant.MCIURL);
	    //Log.info("Open Magrabcert Sandbox");

	    driver.manage().window().maximize();
	    //Log.info("Maximum the Window");
	    }
		catch (Exception e){
			Log.error("Class Utils | Method OpenBrowser | Exception desc : "+e.getMessage());
		}
		return driver;		
	}
	
	//@AfterSuite
	//public void closeBrowser() {
	//	driver.quit();
	//}

}
