package automationFramework;

import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Log;

import pageObjects.HomePage;
import pageObjects.Login;
import appModules.*;

public class POM_TC {

	private static WebDriver driver = null;
	
	public static void main(String[] args) throws Exception {
		
		//String exePath = "C:\\Automation Code\\driver\\chromedriver_win32\\chromedriver.exe";
		//ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
		DOMConfigurator.configure("log4j.xml");

		Log.startTestCase("Selenium_Test_001");
		
		System.setProperty("webdriver.chrome.driver", Constant.exePath);
	    driver = new ChromeDriver();
	    Log.info("Start Chrome");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get(Constant.URL);
	    Log.info("Open Url");
	    driver.manage().window().maximize();
	    Log.info("Maximum the Window");
	    
	    /*HomePage.lnk_Login(driver).click();
	    Thread.sleep(2000);
		
		HomePage.lnk_BtOrg(driver).click();
		
		Login.txt_Email(driver).sendKeys("dragon9968@gmail.com");
		Login.txt_Password(driver).sendKeys("123456");
		Login.btn_Send(driver).click();
		Thread.sleep(3000);*/
	    SignIn_Action.Execute_1(driver,Constant.Email,Constant.Password);
	    Log.info("Login Successfully");

		//String expectedMessage ="You've entered your email/password incorrectly. Please try again.";
		//String actualMessage = driver.findElement(By.xpath("//*[@id='loginOrgForm']//*[@id='notExistError']")).getText();
	    String actualMessage = Login.actualwronginfo_message(driver).getText();
		System.out.println("message : " + actualMessage);

		Assert.assertEquals(actualMessage, Constant.expectedMessage);
		// Assert.assertTrue(actualMessage.contains(expectedMessage));
		if(actualMessage.contains(Constant.expectedMessage))
		{
			System.out.println("System has displayed error message");
			}
			else
			{
			System.out.println("There is no notice message");	
			}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@class='close login-close-Bt']")).click();
		Log.endTestCase("Selenium_Test_001");
		//ExcelUtils.setCellData("Pass", 1, 3);
	}
}
