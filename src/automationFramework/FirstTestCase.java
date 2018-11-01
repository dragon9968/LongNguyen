package automationFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.*;
import pageObjects.HomePage;
import pageObjects.Login;

import org.apache.log4j.Logger;
 
import org.apache.log4j.xml.DOMConfigurator;

public class FirstTestCase {

	private static Logger Log = Logger.getLogger(FirstTestCase.class.getName());
	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		// Create a new instance of the Firefox driver
		/*DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
				WebDriver driver = new FirefoxDriver(capabilities);*/
	
		DOMConfigurator.configure("log4j.xml");
		
	    //String exePath = "C:\\Automation Code\\driver\\chromedriver_win32\\chromedriver.exe";
		//String exePath = "C:\\Automation Code\\driver\\geckodriver-v0.19.1-win64\\geckodriver.exe";
		//System.setProperty("webdriver.chrome.driver", exePath);
		//System.setProperty("webdriver.gecko.driver", exePath);
	    driver = new ChromeDriver();
		//driver = new FirefoxDriver();
				
		        //Launch the Online Store Website
				driver.get("https://heb--magrabcert.lightning.force.com");
				Log.info("Launch Magrabcert sandbox Website");

		        // Print a Log In message to the screen
		        System.out.println("Successfully opened the website www.Store.Demoqa.com");
		        
		        // full screen
		        driver.manage().window().maximize();

				//Wait for 5 Sec
				Thread.sleep(2000);
				driver.findElement(By.xpath(".//*[@id='idp_section_buttons']/button")).click();
				Thread.sleep(1000);
				Runtime.getRuntime().exec("C:\\Automation Code\\authentication.exe");
				 
			    Thread.sleep(5000);

				/*
				String title = driver.getTitle();
				System.out.println("Title of the page is : " + title);		       
				// Close the driver
		       // driver.quit();
				String bien = "salesforce";
				driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys(bien);
				boolean staus = driver.findElement(By.xpath(".//*[@id='lst-ib']")).isDisplayed();
				System.out.println("check : " + staus);	
				boolean staus1 = driver.findElement(By.xpath(".//*[@id='lst-ib']")).isEnabled();
				System.out.println("check : " + staus1);		
				boolean staus2 = driver.findElement(By.xpath(".//*[@id='lst-ib']")).isSelected();
				System.out.println("check : " + staus2);	
				
				Thread.sleep(3000);
				String linkText = driver.findElement(By.xpath(".//*[@class='sbsb_g']/span[1]//*[@class='lsb']")).getText();
				System.out.println("get text : " + linkText);	
				String tagName = driver.findElement(By.xpath(".//*[@class='sbsb_g']/span[1]//*[@class='lsb']")).getTagName();
				System.out.println("get tab name : " + tagName);
				String atttribute = driver.findElement(By.xpath(".//*[@class='sbsb_g']/span[1]//*[@class='lsb']")).getAttribute("class");
				System.out.println("get tab name : " + atttribute);
				Thread.sleep(2000);

				driver.findElement(By.xpath(".//*[@class='sbsb_g']/span[1]//*[@class='lsb']")).click();*/
					

				
				
				driver.navigate().to("https://www.donortiles.com/");
				//driver.navigate().back();
				//driver.navigate().forward();
				//driver.findElement(By.xpath("//*[contains(text(),'LOG IN')]")).click();
				Thread.sleep(3000);
				
				
				//Use pageObjects
				
				HomePage.lnk_Login(driver).click();
				Thread.sleep(2000);
				//driver.findElement(By.id("organizationBt")).click();
				HomePage.lnk_BtOrg(driver).click();
				
				//driver.findElement(By.id("emailInputOrg")).sendKeys("dragon9968@gmail.com");
				//driver.findElement(By.id("passInputOrg")).sendKeys("123456");
				//driver.findElement(By.id("sendEmailBtOrg")).click();
				Login.txt_Email(driver).sendKeys("dragon9968@gmail.com");
				Login.txt_Password(driver).sendKeys("123456");
				Login.btn_Send(driver).click();
				Thread.sleep(3000);
				
				
				String expectedMessage ="You've entered your email/password incorrectly. Please try again.";
				String actualMessage = driver.findElement(By.xpath("//*[@id='loginOrgForm']//*[@id='notExistError']")).getText();
				System.out.println("message : " + actualMessage);

				Assert.assertEquals(actualMessage, expectedMessage);
				// Assert.assertTrue(actualMessage.contains(expectedMessage));
				if(actualMessage.contains(expectedMessage))
				{
					System.out.println("System has displayed error message");
					}
					else
					{
					System.out.println("There is no notice message");	
					}
				
				Thread.sleep(2000);
				driver.findElement(By.xpath(".//*[@class='close login-close-Bt']")).click();




	}

}
