package appModules;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import Utility.ExcelUtils;
import Utility.*;
import pageObjects.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class SignIn_Action {
	
	public static void Execute_1(WebDriver driver) throws Exception {		
		String sEmail = ExcelUtils.getCellData(1, 1);
		String sPassword = ExcelUtils.getCellData(1, 2);  
		HomePage.lnk_Login(driver).click();
		Log.info("CLick Login button");
	    Thread.sleep(2000);
		HomePage.lnk_BtOrg(driver).click();
		Log.info("Click Org button");
		Login.txt_Email(driver).sendKeys(sEmail);
		Log.info("Input Wrong Email");
		Login.txt_Password(driver).sendKeys(sPassword);
		Log.info("Input Wrong Password");
		Login.btn_Send(driver).click();
		Log.info("Click Send button");
		Thread.sleep(3000);	
	}
	
	public static void Execute_2(WebDriver driver, String sEmail, String sPassword) throws Exception {		
		//String sEmail = ExcelUtils.getCellData(1, 1);
		//String sPassword = ExcelUtils.getCellData(1, 2);  
		HomePage.lnk_Login(driver).click();
		Log.info("CLick Login button");
	    Thread.sleep(2000);
		HomePage.lnk_BtOrg(driver).click();
		Log.info("Click Org button");
	    Thread.sleep(2000);
	    Log.info("Dont input Email and Password then click Login button");
		Login.btn_Send(driver).click();
		Log.info("Click Login button");
		Thread.sleep(3000);	
	}
	
	public static void SignUp(WebDriver driver) throws Exception {		
		
		HomePage.lnk_SignUp(driver).click();
		Thread.sleep(2000);
		HomePage.IAM_ORG(driver).click();
		Thread.sleep(2000);

		HomePage.lnk_Plan(driver).click();
		Thread.sleep(5000);
		
		HomePage.EIN(driver).sendKeys("12-3213213");
		Thread.sleep(1000);
		HomePage.Org_Name(driver).sendKeys("LONGMRV");
		Thread.sleep(1000);
		HomePage.Primary_Address(driver).sendKeys("02 Quang Trung");
		Thread.sleep(1000);
		HomePage.City(driver).sendKeys("Da Nang");
		Thread.sleep(1000);
		Select ST = new Select(HomePage.State(driver));
		ST.selectByVisibleText("GA");
		Thread.sleep(1000);
		HomePage.Zip(driver).sendKeys("98104");
		Thread.sleep(1000);
		Select Category = new Select(HomePage.Category(driver));
		Category.selectByVisibleText("Religion");
		Thread.sleep(1000);
		HomePage.Mission(driver).sendKeys("This is testing");
		Thread.sleep(1000);
		HomePage.FirstName(driver).sendKeys("Long");
		Thread.sleep(1000);
		HomePage.LastName(driver).sendKeys("Nguyen");
		Thread.sleep(1000);
		HomePage.PhoneNumber(driver).sendKeys("(312) 312-3123");
		Thread.sleep(1000);
		HomePage.Email(driver).sendKeys("longnguyen222@magrabbit.com");
		Thread.sleep(1000);
		HomePage.Password(driver).sendKeys("Long1234@");
		Thread.sleep(1000);
		HomePage.Confirm_Password(driver).sendKeys("Long1234@");
		Thread.sleep(1000);
		HomePage.UploadLogoButton(driver).click();
		 //put path to your image in a clipboard
	    StringSelection ss = new StringSelection("C:\\Automation Code\\111.jpeg");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

	    //imitate mouse events like ENTER, CTRL+C, CTRL+V
	    Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    
		Thread.sleep(2000);
		HomePage.Cropbutton(driver).click();
		
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,750)", "");
	}
	
   public static void LoginOnlineStore(WebDriver driver, String sUsername, String sPassword) throws Exception {
	   
	   HomePageFactory HomePageF = PageFactory.initElements(driver, HomePageFactory.class);	
	   LoginPageFactory LoginPageF = PageFactory.initElements(driver, LoginPageFactory.class);
	  //HomePage.lnk_MyAccount(driver).click();
	   HomePageF.lnk_MyAccount.click();
   	   Log.info("Click on My Account link" );
   	  
      // Login.txtbx_UserName(driver).sendKeys(sUsername);
    	LoginPageF.txtbx_UserName.sendKeys(sUsername);
    	   Log.info("Input Username" );

      // Login.txtbx_Password(driver).sendKeys(sPassword);
    	LoginPageF.txtbx_Password.sendKeys(sPassword);
 	   Log.info("Input Password" );

       //Utils.waitForElement(HomePage.lnk_LogOut(driver), driver);
      //Utils.hoverOnElement(HomePage.main_Category(driver), HomePage.sub_Category(driver));
       //HomePage.lnk_LogOut(driver).click();
    	LoginPageF.btn_LogIn.click();
 	   Log.info("Click Login button" );

       Reporter.log("SignIn Action is successfully");
		
	}

}
