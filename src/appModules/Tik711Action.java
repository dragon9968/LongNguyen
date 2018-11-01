package appModules;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import Utility.*;
import net.bytebuddy.implementation.bytecode.Throw;
import pageObjects.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Tik711Action {

	public static void Create_MCI_Request(WebDriver driver) throws Exception {
		
		Tik711_Factory Tik711F = PageFactory.initElements(driver, Tik711_Factory.class);
		
		try {
		Utils.takeScreenshot(driver, "Step1");	
		Tik711F.Get_Started.click();
		Log.info("Click on Get Started button");
		
		Thread.sleep(3000);
		}
		catch (Exception e) {
			Log.error("Unable to find Get Started button");
			throw(e);
		}
		
		
		try {
		Select Brand = new Select(Tik711F.Select_Brand);
		Brand.selectByIndex(1);
		Log.info("Choose a Brand to submit request");
		Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find Brand selectbox");
			throw(e);
		}
		
		
		try {
		Select Event = new Select(Tik711F.Select_Event);
		Event.selectByIndex(1);
		Log.info("Choose a Event to submit request");	
		Thread.sleep(2000);
		Utils.takeScreenshot(driver,"Step2");	

		} 
		catch (Exception e) {
			Log.error("Unable to find Event selectbox");
			throw(e);
		}
		
		
		try {
			Tik711F.Next_btn.click();
			Log.info("Click on Next button");
			Thread.sleep(3000);
		}
		catch (Exception e) {
			Log.error("Unable to find Next button");
			throw(e);
		}
		
		
		try {
		Thread.sleep(2000);
		Select CM = new Select(Tik711F.Select_CM);
		CM.selectByIndex(1);
		Log.info("Choose a Central Market to submit request");	
		Thread.sleep(2000);
		}
		catch (Exception e) {
			Log.error("Unable to find Central Market selectbox");
			throw(e);
		}
		
		
		
		try {
			Tik711F.Next_btn.click();
			Log.info("Click on Next button");
			Thread.sleep(3000);
		}
		catch (Exception e) {
			Log.error("Unable to find Next button");
			throw(e);
		}
		
		
		try {
			Tik711F.Organization_Name.sendKeys("MRV_Testing_Auto");
			Log.info("Enter Organization Name");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find Organization Name textfield");
			throw(e);
		}
		
		
		try {
			Select IRS = new Select(Tik711F.IRS_selectbox);
			IRS.selectByIndex(1);
			Log.info(" Is your organization an Internal Revenue Service (IRS) pre-validated non-profit or public tax-exempt organization, as defined under Section 501(c)?");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find IRS selectbox");
			throw(e);
		}
		
		try {
			Tik711F.TIN.sendKeys("12-1234567");
			Log.info("Enter Organization 501(c) Federal Taxpayer ID Number (TIN)");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find TIN textfield");
			throw(e);
		}
		
		try {
			Tik711F.Contact_FirstName.sendKeys("Long Fr");
			Log.info("Enter Contact First Name");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find Contact First Name textfield");
			throw(e);
		}
		
		try {
			Tik711F.Contact_LastName.sendKeys("Long Ls");
			Log.info("Enter Contact Last Name");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find Contact Last Name textfield");
			throw(e);
		}
		
		try {
			Tik711F.Contact_PhoneNumber.sendKeys("555-555-5555");
			Log.info("Enter Phone Number");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find Phone Number textfield");
			throw(e);
		}
		
		try {
			Tik711F.Contact_Email.sendKeys("dragon9968@gmail.com");
			Log.info("Enter Contact Email");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find Contact Email textfield");
			throw(e);
		}
		
		try {
			Tik711F.Organization_Address.sendKeys("02 Quang Trung");
			Log.info("Enter Organization Address ");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find Organization Address textfield");
			throw(e);
		}
		
		try {
			Tik711F.Organization_City.sendKeys("Da Nang");
			Log.info("Enter Organization City ");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find Organization City textfield");
			throw(e);
		}
		
		try {
			Select State = new Select(Tik711F.Organization_State);
			State.selectByIndex(1);
			Log.info("Select Organization State");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find Organization State selectbox");
			throw(e);
		}
		
		try {
			Tik711F.Organization_ZipCode.sendKeys("98101");
			Log.info("Enter Organization Zip Code");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find Organization Organization Zip Code textfield");
			throw(e);
		}
		
		/*try {
			Select State = new Select(Tik711F.Organization_County);
			State.selectByIndex(1);
			Log.info("Select Organization County");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find Organization County selectbox");
			throw(e);
		}*/
		
		try {
			Tik711F.Organization_MailingAddress_checkbox.click();
			Log.info("Tick on 'Organization Mailing Address is the Same as Above'");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find Organization Mailing Address checkbox");
			throw(e);
		}
		
		try {
			Tik711F.Save_Continue_btn.click();
			Log.info("Click on Save and Continue button");
			Thread.sleep(2000);
		}
		catch (Exception e) {
			Log.error("Unable to find Continue button");
			throw(e);
		}
		
		try {
			Select Primary = new Select(Tik711F.Organization_Primary_Area_selectbox);
			Primary.selectByIndex(1);
			Log.info("Which of the following best represents your organization's PRIMARY area of focus?");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find Organization_Primary_Area_selectbox");
			throw(e);
		}
		
		try {
			Tik711F.Organization_Found.sendKeys("2018");
			Log.info("Enter Organization Found");
			Thread.sleep(2000);
		}
		catch (Exception e) {
			Log.error("Unable to find Organization Found textfield");
			throw(e);
		}
		
		try {
			Tik711F.Organization_Mission.sendKeys("test");
			Log.info("Enter Organization Mission");
			Thread.sleep(2000);
		}
		catch (Exception e) {
			Log.error("Unable to find Organization Mission textfield");
			throw(e);
		}
		
		
		try {
			Tik711F.Organization_Provide.sendKeys("test");
			Log.info("Enter Organization Provide");
			Thread.sleep(2000);
		}
		catch (Exception e) {
			Log.error("Unable to find Organization Provide textfield");
			throw(e);
		}
		
		try {
			Select Donation = new Select(Tik711F.Organization_DonationReceived_selectbox);
			Donation.selectByIndex(1);
			Log.info("Has your organization received a donation from us in the past?");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find Organization_DonationReceived_selectbox");
			throw(e);
		}
		
		try {
			Select Voluntee = new Select(Tik711F.Partner_Volunteer_selectbox);
			Voluntee.selectByIndex(1);
			Log.info("Do any of our Partners (employees) currently volunteer with or serve on the board of your organization?");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find Partner_Volunteer_selectbox");
			throw(e);
		}
		
		try {
			Select Support = new Select(Tik711F.Organization_Support_selectbox);
			Support.selectByIndex(1);
			Log.info("Is your organization presently supported by another grocery retailer?");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find Organization_Support_selectbox");
			throw(e);
		}
		
		try {
			Select Agency = new Select(Tik711F.Organization_Agency_selectbox);
			Agency.selectByIndex(1);
			Log.info("Is your organization a United Way agency?");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find Organization_Agency_selectbox");
			throw(e);
		}
		
		try {
			Tik711F.Save_Continue_btn.click();
			Log.info("Click on Save and Continue button");
			Thread.sleep(2000);
		}
		catch (Exception e) {
			Log.error("Unable to find Continue button");
			throw(e);
		}
		
		try {
			Tik711F.Request_Pertain_checkbox.click();
			Log.info("Check any of the following if your request pertains to:");
			Thread.sleep(2000);
		}
		catch (Exception e) {
			Log.error("Unable to find Request_Pertain_checkbox");
			throw(e);
		}
		
		try {
			Select primary = new Select(Tik711F.Primary_Purpose_selectbox);
			primary.selectByIndex(1);
			Log.info("What is the PRIMARY purpose of this request?");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find Primary_Purpose_selectbox");
			throw(e);
		}
		
		try {
			Select eventtype = new Select(Tik711F.Type_Event_selectbox);
			eventtype.selectByIndex(1);
			Log.info("Please indicate the type of event.");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find Type_Event_selectbox");
			throw(e);
		}
		
		try {
			Tik711F.Event_Program.sendKeys("Event Program Auto Testing");
			Log.info("Enter Event Program");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find Event_Program textfield");
			throw(e);
		}
		
		try {
			Tik711F.Event_Date.sendKeys("Oct 3, 2018");
			Log.info("Enter Event Date");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find Event Date textfield");
			throw(e);
		}
		
		try {
			Tik711F.Event_Program_Describe.sendKeys("test");
			Log.info("Enter Event Program Describe");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find Event_Program_Describe textfield");
			throw(e);
		}
		
		try {
			Tik711F.Requesting_support_checkbox.click();
			Log.info("What type of support are you requesting?");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find Requesting_support_checkbox");
			throw(e);
		}
		
		try {
			Select intend = new Select(Tik711F.Intend_Donation_selectbox);
			intend.selectByIndex(1);
			Log.info("* How do you intend to use this donation?");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find Intend_Donation_selectbox");
			throw(e);
		}
		
		try {
			Select par1 = new Select(Tik711F.Participate_attend_the_event_selectbox);
			par1.selectByIndex(1);
			Log.info("How many people are expected to participate/attend the event?");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find Participate_attend_the_event_selectbox");
			throw(e);
		}
		
		try {
			Select par2 = new Select(Tik711F.Participate_attend_the_event_last_year_selectbox);
			par2.selectByIndex(1);
			Log.info("How many people participated/attended the event last year?");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find Participate_attend_the_event_last_year_selectbox");
			throw(e);
		}
		
		try {
			Tik711F.Date_Decision.sendKeys("Oct 5, 2018");
			Log.info("Choose Date Decision");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find Date Decision");
			throw(e);
		}
		
		try {
			Tik711F.Event_Program_Indicate_checkbox.click();
			Log.info("Please indicate how you plan to promote your event/program");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find Event_Program_Indicate_checkbox");
			throw(e);
		}
		
		try {
			Select material = new Select(Tik711F.Event_Program_Materials_selectbox);
			material.selectByIndex(1);
			Log.info("If approved, do you plan to use our logo in your event/program materials?");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find Event_Program_Materials_selectbox");
			throw(e);
		}
		
		try {
			Select advertising = new Select(Tik711F.Organization_Advertising_selectbox);
			advertising.selectByIndex(1);
			Log.info("Will our organization receive any advertising for this event/program?");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find Organization_Advertising_selectbox");
			throw(e);
		}
		
		try {
			Tik711F.Organization_Contribution.sendKeys("test");
			Log.info(" If approved, how will your organization recognize our contribution?");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find Organization_Contribution textfield");
			throw(e);
		}
		
		try {
			Select comm = new Select(Tik711F.Community_Investment_selectbox);
			comm.selectByIndex(1);
			Log.info("How did your organization hear about our Community Investment Program?");
			Thread.sleep(1000);
		}
		catch (Exception e) {
			Log.error("Unable to find Community_Investment_selectbox");
			throw(e);
		}
		
		try {
			Tik711F.Save_Continue_btn.click();
			Log.info("Click on Save and Continue button");
			Thread.sleep(3000);
		}
		catch (Exception e) {
			Log.error("Unable to find Continue button");
			throw(e);
		}
		
		try {
			Tik711F.Save_Continue_btn.click();
			Log.info("Click on Save and Continue button");
			Thread.sleep(3000);
		}
		catch (Exception e) {
			Log.error("Unable to find Continue button");
			throw(e);
		}
		
		try {
			Tik711F.Submit_btn.click();
			Log.info("Click on Submit button");
			Thread.sleep(2000);
		}
		catch (Exception e) {
			Log.error("Unable to find Submit button");
			throw(e);
		}
	}
	
}
