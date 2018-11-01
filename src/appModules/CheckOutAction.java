package appModules;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import Utility.ExcelUtils;
import Utility.*;
import pageObjects.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckOutAction {
	
	
	public static String ProductName;
	public static String ProductPrice;

  
	public static void CheckOut_Action(WebDriver driver) throws InterruptedException {
		 CheckOutPageFactory CheckOutPageF = PageFactory.initElements(driver, CheckOutPageFactory.class);
		HomePageFactory HomePageF = PageFactory.initElements(driver, HomePageFactory.class);	

		ProductName = CheckOutPageF.txt_ProductName.getText();
		ProductPrice = CheckOutPageF.txt_ProductPrice.getText();

			
		if (ProductName.equals(HomePageF.product_Name.getText())) {		
			 if (ProductPrice.equals(HomePageF.product_Price.getText()))
			 {
					Thread.sleep(2000);
					  Log.info("Product Name and Price are validated" );
				      CheckOutPageF.btn_Continue.click();
				      Log.info("Click on Continue button" );
			 }
			 else {
					Log.info("Product Price is incorrect" );
				}		
		}
		else {
			Log.info("Product Name is incorrect" );
		}
		
	       Reporter.log("Product was checkout");

}
	
	public static void Payment_Action(WebDriver driver) throws InterruptedException
	{
		 CheckOutPageFactory CheckOutPageF = PageFactory.initElements(driver, CheckOutPageFactory.class);
		 
		 Thread.sleep(3000);
		 CheckOutPageF.txt_Email.clear();
         CheckOutPageF.txt_Email.sendKeys("abc123@yhoo.com");
         Log.info("Input Email" );
         
         CheckOutPageF.txt_FirstName.clear();
         CheckOutPageF.txt_FirstName.sendKeys("long");
         Log.info("Input FirstName" );
         Thread.sleep(1000);
         
         CheckOutPageF.txt_LastName.clear();
         CheckOutPageF.txt_LastName.sendKeys("nguyen");
         Log.info("Input LastName" );
         Thread.sleep(1000);
         
         CheckOutPageF.txt_Address.clear();
         CheckOutPageF.txt_Address.sendKeys("02 Quang Trung");
         Log.info("Input Address" );
         Thread.sleep(1000);
         
         CheckOutPageF.txt_City.clear();
         CheckOutPageF.txt_City.sendKeys("Da Nang");
         Log.info("Input City" );
         Thread.sleep(1000);
         
         Select country = new Select(CheckOutPageF.drpdwn_Country);
         country.selectByVisibleText("Vietnam");
         Log.info("Select Country" );
         Thread.sleep(1000);
         
         CheckOutPageF.txt_Phone.clear();
         CheckOutPageF.txt_Phone.sendKeys("0907584933");
         Log.info("Input Phone Number" );
         Thread.sleep(2000);
         
         if(!CheckOutPageF.chkbx_SameAsBillingAdd.isSelected())
         {
        	 CheckOutPageF.chkbx_SameAsBillingAdd.click();
         }
         Log.info("Tick on Shipping Address checkbox" );
         Thread.sleep(2000);
         
         CheckOutPageF.btn_Purchase.click();
         Log.info("Click on Purchase button" );
		
	       Reporter.log("Payment info have been input and verified");

	}
	
}
