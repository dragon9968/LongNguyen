package Utility;
import java.io.File;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import Utility.Constant;
import Utility.Log;

public class Utils {
	public static WebDriver driver = null;
	public static int randomInt;


	public static WebDriver OpenBrowser()
	{
		try {
			
			System.setProperty("webdriver.chrome.driver", Constant.exePath);
		    driver = new ChromeDriver();
		    Log.info("Start Chrome Browser");
		    
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.get(Constant.URL);
		    Log.info("Open Donor Tiles link");

		    driver.manage().window().maximize();
		    Log.info("Maximum the Window");
		} catch (Exception e) {
			Log.error("Class Utils | Method OpenBrowser | Exception desc : "+e.getMessage());
		}
		return driver;
	}
	
	public static WebDriver navigate() {
		
       try {
			
			System.setProperty("webdriver.chrome.driver", Constant.exePath);
		    driver = new ChromeDriver();
		    Log.info("Start Chrome Browser");
		    
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.get(Constant.URL1);
		    Log.info("Open Online Store");

		    driver.manage().window().maximize();
		    Log.info("Maximum the Window");
		} catch (Exception e) {
			Log.error("Class Utils | Method OpenBrowser | Exception desc : "+e.getMessage());
		}
		return driver;
		
	}
	
 public static void waitForElement(WebElement element, WebDriver driver){
	
		 WebDriverWait wait = new WebDriverWait(driver, 10);
	     wait.until(ExpectedConditions.elementToBeClickable(element));
	 	}
 
 /*public static void Long_Click(WebElement element, WebDriver driver){
		
    WebElement lol = driver.findElement(By.xpath("//*[contains(text(),'LOG IN')]"));
    lol.click();
 	}*/
	
 public static void hoverOnElement(WebDriver driver,WebElement mainelement,WebElement subelement) {
	 
	 Actions action = new Actions(driver);
     action.moveToElement(mainelement).perform();
     action.moveToElement(subelement);
     action.click();
     action.perform();
 }
 
 public static void signature(WebDriver driver, WebElement element) {
	 
	 Actions builder = new Actions(driver);
     Action drawAction = builder.moveToElement(element, 20, 20) //start points x axis and y axis.
              .clickAndHold()
              .moveByOffset(80, 80)
          	.moveByOffset(50, 20)
          	.moveByOffset(40, 40)
          	.moveByOffset(70, 70)
          	.release()
          	.build();
      drawAction.perform();
}

 public static void switchToTab(WebDriver driver) {
	  //Switching between tabs using CTRL + tab keys.
	  driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
	  //Switch to current selected tab's content.
	  driver.switchTo().defaultContent();  
	 }
 
 public static int random_value() {
	 
	 Random rd = new Random();
		for (int idx = 1000; idx <= 100000; ++idx) {
		randomInt = rd.nextInt(100000);
		}
	return randomInt;
	 
 }
 
 public static void takeScreenshot(WebDriver driver, String filename) throws Exception{

		try{
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    String formatfile =  new SimpleDateFormat("yyyy_MM_dd_hhmmss'.jpg'").format(new Date());

			FileUtils.copyFile(scrFile, new File(Constant.Path_ScreenShot + filename + "_" + formatfile +".jpg"));	
				
		} catch (Exception e){
			Log.error("Class Utils | Method takeScreenshot | Exception occured while capturing ScreenShot : "+e.getMessage());
			throw new Exception();
		}
	}

 
 
 
 
}
