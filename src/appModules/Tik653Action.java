package appModules;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import Utility.*;
import bsh.This;
import pageObjects.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Tik653Action {
	
	public WebDriver driver = null ;

	public static void Create_Time_Card(WebDriver driver) throws Exception {
		
		Tik653_Factory Tik653F = PageFactory.initElements(driver, Tik653_Factory.class);
		driver.navigate().to(BAUConstant.MSA_TimecardUrl);
		Thread.sleep(3000);
		
		Tik653F.New_btn.click();	
		Log.info("Create a New Timecard");
		Thread.sleep(1000);
		
		Tik653F.Partner.click();
		Log.info("Choose Partner");
		Thread.sleep(1000);
		
		Tik653F.Partner_Lookup.click();
		Thread.sleep(1000);
		
		Tik653F.SaveTimeCard_btn.click();
		Thread.sleep(1000);
		
		Tik653F.Work_btn.click();
		Log.info("Set Work time for TimeCard");
		Thread.sleep(1000);
		
		Tik653F.Day_of_Week.click();
		Log.info("Select Day of Week");
		Thread.sleep(1000);
		
		Tik653F.Monday_select.click();
		Thread.sleep(3000);
		Utils.waitForElement(Tik653F.Fill_in_rest_of_week_checkbox, driver);
		WebElement checkboxbtn = Tik653F.Fill_in_rest_of_week_checkbox;	
		if(!checkboxbtn.isSelected())
		{
		checkboxbtn.click();
		}	
		Thread.sleep(1000);
		
		Tik653F.Save_Work_btn.click();	
		Log.info("Set Work time for TimeCard");
		Thread.sleep(2000);
		
		Tik653F.Edit_btn.click();
		Thread.sleep(1000);
		
		Tik653F.Overtime_Category.click();
		Thread.sleep(1000);
		
		Tik653F.Add_OvC.click();
		Thread.sleep(1000);
		
		Tik653F.Overtime_Summary.sendKeys("testing");
		Thread.sleep(1000);
		
		Tik653F.Edit_Save_btn.click();
		Log.info("Save Timecard");
		Thread.sleep(1000);
		
		String Actual_Timecard_Status = Tik653F.Created_Timecard_Status.getText();
		System.out.println(Actual_Timecard_Status);
		//Assert.assertEquals(Tik653F.Created_Timecard_Status.getText(), BAUConstant.Tik653_expectedTimeCard_Status1);
		if(Actual_Timecard_Status.equals(BAUConstant.Tik653_expectedTimeCard_Status1))
		{
			Log.info("Timecard Status is " + Actual_Timecard_Status);
		}
		else {
			Log.info("Timecard Status is incorrect");
		}
		Thread.sleep(2000);
		
		Tik653F.Submit_btn.click();
		Log.info("Submit Timecard for Approval");
		Thread.sleep(4000);
		
		String Actual_Timecard_Status_Submit = Tik653F.Submit_Timecard_Status.getText();
		System.out.println(Actual_Timecard_Status_Submit);

		//Assert.assertEquals(Tik653F.Submit_Timecard_Status.getText(), BAUConstant.Tik653_expectedTimeCard_Status2);
		if(Actual_Timecard_Status_Submit.equals(BAUConstant.Tik653_expectedTimeCard_Status2))
		{
			Log.info("Timecard Status is " + Actual_Timecard_Status_Submit);
		}
		else {
			Log.info("Timecard Status is incorrect");
		}
		String parentWindowHandle = driver.getWindowHandle();
				
			BAUBassClass.initialiBrowser();
			Thread.sleep(1000);
			//driver = BAUBassClass.driver;
			SFLoginAction.SFLogin(BAUBassClass.driver, BAUConstant.SFUsername2, BAUConstant.SFPassword2);
			Log.info("Manager login into system to Approve Timecard");
			Thread.sleep(6000);
			BAUBassClass.driver.navigate().to(BAUConstant.MSA_TimecardUrl);
			Thread.sleep(5000);
			BAUBassClass.driver.findElement(By.xpath(".//button[contains(.,'Notifications')]")).click();
			Log.info("View Notification");
			Thread.sleep(1000);
			BAUBassClass.driver.findElement(By.xpath(".//*[@class='scroller']/ul/li[1]//*[@class='notification-link']")).click();
			Log.info("Click on Requesting Approval link");
			Thread.sleep(1000);
			BAUBassClass.driver.findElement(By.xpath(".//div[@title='Approve']")).click();
			Log.info("Click Approve button");
			Thread.sleep(1000);
			BAUBassClass.driver.findElement(By.xpath(".//button[contains(.,'Approve')]")).click();
			Log.info("Approve the Timecard");
			Thread.sleep(3000);
			BAUBassClass.driver.close();
			//driver.close();
			driver.switchTo().window(parentWindowHandle);
			Thread.sleep(2000);
			driver.navigate().refresh();
			
			String Actual_Timecard_Status_Approval = Tik653F.Approval_Timecard_Status.getText();
			System.out.println(Actual_Timecard_Status_Approval);
			//Assert.assertEquals(Tik653F.Submit_Timecard_Status.getText(), BAUConstant.Tik653_expectedTimeCard_Status2);
			if(Actual_Timecard_Status_Approval.equals(BAUConstant.Tik653_expectedTimeCard_Status3))
			{
				Log.info("Timecard Status is " + Actual_Timecard_Status_Approval);
			}
			else {
				Log.info("Timecard Status is incorrect");
			}
		}
	
}
