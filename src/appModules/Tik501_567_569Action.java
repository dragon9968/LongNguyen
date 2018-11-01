package appModules;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import Utility.*;
import pageObjects.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class Tik501_567_569Action {
	  
	
	//Tik-501 , Tik-569
	public static void BookNutritionAppointment (WebDriver driver) throws Exception{
		   
		   driver.navigate().refresh();
		   Thread.sleep(3000);
		   String currentURL = null;
		   Tik501_567_569Factory Tik501F = PageFactory.initElements(driver, Tik501_567_569Factory.class);
	       
		   Tik501F.FirstName.sendKeys(BAUConstant.FirstName);
	   	   Log.info("Step1: Input FirstName" );
	   	   Thread.sleep(1000);
	   	   
	   	   Tik501F.LastName.sendKeys(BAUConstant.LastName);
	   	   Log.info("Step2: Input LastName" );
	   	   Thread.sleep(1000);
	   	   
	   	   Tik501F.Email.sendKeys(BAUConstant.Email);
	   	   Log.info("Step3: Input Email" );
	       Thread.sleep(1000);
	   	
	   	   Tik501F.Phone.sendKeys(BAUConstant.Phone);
	       Log.info("Step4: Input Phone" );
	       Thread.sleep(1000);
	       
	       Select ST = new Select(Tik501F.ServiceType);
		   ST.selectByVisibleText(BAUConstant.ServiceType);
		   Log.info("Step5: Choose Service Type");
		   Thread.sleep(2000);
		   
		   Select RS = new Select(Tik501F.ReasonforVisit);
		   //RS.selectByVisibleText(Tik501Constant.ReasonforVisit);
		   RS.selectByIndex(3);
		   Log.info("Step6: Choose Reason For Visit" );
		   Thread.sleep(2000);
		   
		   Select PT = new Select(Tik501F.PaymentType);
		   PT.selectByVisibleText(BAUConstant.PaymentType);
		   Log.info("Step7: Choose Payment Type" );
		   Thread.sleep(2000);
		   
		   Select RG = new Select(Tik501F.RegionBooking);
		   RG.selectByVisibleText(BAUConstant.RegionBooking);
		   Log.info("Step8: Choose Region" );
		   Thread.sleep(2000);
		   
		   Select LO = new Select(Tik501F.Location);
		   LO.selectByIndex(1);
		   Log.info("Step9: Choose Location" );
		   Thread.sleep(3000);
		   
		  // WebElement selectDropDown=driver.findElement(By.xpath(".//*[@id='j_id0:nutritionForm:nutritionEventSelect']/div[2]/select[@id='j_id0:nutritionForm:dateTimeGSelectedId']"));
		   Select DT = new Select(Tik501F.DateTimeselect);
		   List<WebElement> option = Tik501F.DateTimeselect.findElements(By.tagName("option"));
			   String valueAttribute = Tik501F.DateTimeselect.getAttribute("value");
			   System.out.println("Attribute of value is : "+ valueAttribute);
			   for(int i=0;i<option.size();i++)
			   {			    
			       String isDisabled=option.get(i).getAttribute("disabled");
			       System.out.println(i + isDisabled);
		    	   String isSelected=option.get(i).getAttribute("selected");
		    	   System.out.println(i + isSelected);
		    	   String value1 = option.get(i).getAttribute("value");	
			       System.out.println(i + " "+ value1);
     		        //Write the required code if disable
			       if(isDisabled == null && isSelected == null) 
                     {	    	   
				       String value = option.get(i).getAttribute("value");	
				       System.out.println(i + " "+ value);
				       Thread.sleep(1000);
			           DT.selectByValue(value);           
			           break;        			    	    	   
			       }
			   }	   
			
		   Log.info("Step10: Select DateTime" );
		   Thread.sleep(3000);
		   
		   //Tik-569
		   Tik501F.EnglishConsentForm.click();
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		   Thread.sleep(2000);

	   	   Tik501F.PatientName.sendKeys("test");
	       Log.info("Step11: Input PatientName" );
	       Thread.sleep(1000);
	       
	       Tik501F.RelationshipName.sendKeys("test");
	       Log.info("Step12: Input RelationshipName" );
	       String Rela_Name = Tik501F.RelationshipName.getAttribute("value");
	       //System.out.println(Rela_Name);
	       Log.info("Verify RelationshipNamee: " +Rela_Name);
	       Thread.sleep(1000);
           
	       Tik501F.PrintedName.sendKeys("test");
	       Log.info("Step13: Input PrintedName" );
	       String Print_Name= Tik501F.PrintedName.getAttribute("value");
	       //System.out.println(Print_Name);
	       Log.info("Verify PrintedName: " +Print_Name);
	       Thread.sleep(1000);
	       
	       // signature the name
	       Utils.signature(driver, Tik501F.Signature);
	       
	       Log.info("Step14: Patien Signature their Name" );
	       Thread.sleep(1000);
	       
	       Tik501F.Acknowledge.click();
	       Log.info("Step15: Click on Acknowledge button" );
	       Thread.sleep(5000);
	       
	       
	       Tik501F.BookAppointmentButton.click();
	       Log.info("Step16: Click on Book Appointment button" );
	       Thread.sleep(3000);
	       
	       Reporter.log("Input all valid required field* and Acknowledge the Consent form");
	       String test = Tik501F.Appointment_Confirmation.getText();
	       currentURL = driver.getCurrentUrl();
	       if(BAUConstant.AppointmentBookingConfirmation.equals(Tik501F.Appointment_Confirmation.getText())) 
	       {
	    	   if(currentURL.equals(BAUConstant.AppointmentConfirmURL))
	    	   {
	    	   System.out.println(test);
	    	   System.out.println(currentURL);
	    	   Log.info("Patient has booked Appoinment successfully" );
	    	   Log.info(currentURL);
		       Thread.sleep(1000);
	       }
	       else {
	    	   Log.info("Booked Appoinment failed" );
		       Thread.sleep(1000);
	            }
	       
	       }
	       
	}
	
	//Tik-567
	public static void CheckWarningPopUp (WebDriver driver) throws Exception{
	
		Tik501_567_569Factory Tik501F = PageFactory.initElements(driver, Tik501_567_569Factory.class);
		Thread.sleep(2000);
		
		Select ST = new Select(Tik501F.ServiceType);
		   ST.selectByVisibleText(BAUConstant.ServiceType);
		   Log.info("Step1: Choose Dietitian Consultation Service Type");
		   Thread.sleep(2000);	
		   
		Tik501F.FindStore.click();   
		Log.info("Step2: Click on Find Store button");
		Thread.sleep(2000);
		
		Tik501F.SearchLocation.click();
		Log.info("Step3: Dont do anything and click Search button");
		Thread.sleep(4000);
		   
		String actualMessage = Tik501F.Alert_FindStorePopup.getText();
		Assert.assertEquals(actualMessage, BAUConstant.Tik567_expectedMessage);
	    if(actualMessage.contains(BAUConstant.Tik567_expectedMessage))
	    {
	    	System.out.println("Step3 Passed");
	    	Log.info("Page display alert message: " +actualMessage);
	    }else
	    {
	        System.out.println("Step3 Failed");
	        Log.info("There is no any alert message");
	    }
	    
	    Tik501F.Yes_btn.click();
	    Thread.sleep(2000);
	    boolean ServiceType = Tik501F.ServiceType.getText().contains("Virtual Consultation");
	    Assert.assertTrue(ServiceType, BAUConstant.Tik567_expectedServiceType);   
	    if(ServiceType == true)
	    {
	    Log.info("Click Yes, returns user to the self scheduler screen with prior entries in place. And select service type is Virtual Consultation.");
	    System.out.println("Step4 Passed");
	    }
	    
	    else {
	    	Log.info("System do not auto select service type is Virtual Consultation");
	    	System.out.println("Step4 Failed");
			
		}
	    
	     
	
	
	
	}
	
	    

}
