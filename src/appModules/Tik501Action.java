package appModules;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import Utility.*;
import pageObjects.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class Tik501Action {
	
	public static void BookNutritionAppointment (WebDriver driver) throws Exception{
		
		   Tik501Factory Tik501F = PageFactory.initElements(driver, Tik501Factory.class);
		   
		   Tik501F.FirstName.sendKeys(Tik501Constant.FirstName);
	   	   Log.info("Step1: Input FirstName" );
	   	   Thread.sleep(1000);
	   	   
	   	   Tik501F.LastName.sendKeys(Tik501Constant.LastName);
	   	   Log.info("Step2:Input LastName" );
	   	   Thread.sleep(1000);
	   	   
	   	   Tik501F.Email.sendKeys(Tik501Constant.Email);
	   	   Log.info("Step3:Input Email" );
	       Thread.sleep(1000);
	   	
	   	   Tik501F.Phone.sendKeys(Tik501Constant.Phone);
	       Log.info("Step4:Input Phone" );
	       Thread.sleep(1000);
	       
	       Select ST = new Select(Tik501F.ServiceType);
		   ST.selectByVisibleText(Tik501Constant.ServiceType);
		   Log.info("Step5:Choose Service Type");
		   Thread.sleep(1000);
		   
		   Select RS = new Select(Tik501F.ReasonforVisit);
		   RS.selectByVisibleText(Tik501Constant.ReasonforVisit);
		   Log.info("Step6:Choose Reason For Visit" );
		   Thread.sleep(1000);
		   
		   Select PT = new Select(Tik501F.PaymentType);
		   PT.selectByVisibleText(Tik501Constant.PaymentType);
		   Log.info("Step7:Choose Payment Type" );
		   Thread.sleep(2000);
		   
		   Select RG = new Select(Tik501F.RegionBooking);
		   RG.selectByVisibleText(Tik501Constant.RegionBooking);
		   Log.info("Step8:Choose Region" );
		   Thread.sleep(2000);
		   
		   Select LO = new Select(Tik501F.Location);
		   LO.selectByVisibleText(Tik501Constant.Location);
		   Log.info("Step9:Choose Location" );
		   Thread.sleep(3000);
		   
		   Select DT = new Select(Tik501F.DateTimeselect);
		   DT.selectByValue(Tik501Constant.Datetimeselect);
		   Log.info("Step10:Select DateTime" );
		   Thread.sleep(1000);
		   
		   Tik501F.EnglishConsentForm.click();
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		   Thread.sleep(2000);


	   	   Tik501F.PatientName.sendKeys("test");
	       Log.info("Step11:Input PatientName" );
	       Thread.sleep(1000);
	       
	       Tik501F.Signature.click();
	       Tik501F.Signature.click();
	       Tik501F.Signature.click();
	       Tik501F.Signature.click();
	       Tik501F.Signature.click();
	       Log.info("Step12:Signature the name" );
	       Thread.sleep(1000);
	       
	       Tik501F.Acknowledge.click();
	       Log.info("Step13:Click on Acknowledge button" );
	       Thread.sleep(2000);
	       
	       Tik501F.BookAppointmentButton.click();
	       Log.info("Step14:Click on Book Appointment button" );
	       Thread.sleep(2000);
	       
	       Reporter.log("Input all valid required field* and Acknowledge the Consent form");
	       String test = Tik501F.Appointment_Confirmation.getText();
	       if(Tik501Constant.AppointmentBookingConfirmation.equals(Tik501F.Appointment_Confirmation.getText())) 
	       {
	    	   System.out.println(test);
	    	   Log.info("Patient has booked Appoinment successfully" );
		       Thread.sleep(1000);
	       }
	       else {
	    	   Log.info("Booked Appoinment failed" );
		       Thread.sleep(1000);
	            }
	       
	       
	}

}
