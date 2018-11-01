package automationFramework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Reporter;

public class TestNG {
	public WebDriver driver;
	private static Logger Log = Logger.getLogger(TestNG.class.getName());

  @Test
  public void main() throws InterruptedException {
	  
	  DOMConfigurator.configure("log4j.xml");
	  Thread.sleep(5000);
		
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

		driver.findElement(By.xpath(".//*[@class='sbsb_g']/span[1]//*[@class='lsb']")).click();
			

		Thread.sleep(2000);
		driver.navigate().to("https://www.donortiles.com/");
		//driver.navigate().back();
		//driver.navigate().forward();
		driver.findElement(By.xpath("//*[contains(text(),'LOG IN')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("organizationBt")).click();
		 Reporter.log("Click on Org button | ");
		driver.findElement(By.id("emailInputOrg")).sendKeys("dragon9968@gmail.com");
		driver.findElement(By.id("passInputOrg")).sendKeys("123456");
		driver.findElement(By.id("sendEmailBtOrg")).click();
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
  @BeforeMethod
  public void beforeMethod() {
	  String exePath = "C:\\Automation Code\\driver\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
				
		        //Launch the Online Store Website
				driver.get("http://www.google.com.vn");
				Log.info("Launch the Google Website");


		        // Print a Log In message to the screen
		        System.out.println("Successfully opened the website www.Store.Demoqa.com");
		        
		        // full screen
		        driver.manage().window().maximize();
		       
	  
  }
  
  

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.close();
  }

}
