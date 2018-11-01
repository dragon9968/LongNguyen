package pageObjects;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import Utility.Log;

public class HomePage {

	private static WebElement element = null;
	
   public static WebElement lnk_Login (WebDriver driver) {
	   element = driver.findElement(By.xpath("//*[contains(text(),'LOG IN')]"));
	   Log.info("LOG IN Button found");
   return element;
   }
   
   public static WebElement lnk_SignUp (WebDriver driver) {
	   element = driver.findElement(By.xpath("//*[@id='create_account']"));
	   Log.info("SIGN UP Button found");
   return element;
   }
   
   public static WebElement lnk_Plan (WebDriver driver) {
	   element = driver.findElement(By.xpath("//*[@id='form-Main']/div[3]/div/div[2]/div[2]"));
	   Log.info("CHOOSE YOUR PLAN found");
   return element;
   }
   
   public static WebElement EIN (WebDriver driver) {
	   element = driver.findElement(By.xpath("//*[@id='id_ein']"));
	   Log.info("EIN found");
   return element;
   }
   public static WebElement Org_Name (WebDriver driver) {
	   element = driver.findElement(By.xpath("//*[@id='id_org_name']"));
	   Log.info("ORG NAME found");
   return element;
   }
   public static WebElement Primary_Address (WebDriver driver) {
	   element = driver.findElement(By.xpath("//*[@id='id_org_address1']"));
	   Log.info("ORG Address found");
   return element;
   }
   public static WebElement City (WebDriver driver) {
	   element = driver.findElement(By.xpath("//*[@id='id_city']"));
	   Log.info("City found");
   return element;
   }
   public static WebElement Zip (WebDriver driver) {
	   element = driver.findElement(By.xpath("//*[@id='id_zipcode']"));
	   Log.info("Zip found");
   return element;
   }
   public static WebElement State (WebDriver driver) {
	   element = driver.findElement(By.xpath("//*[@id='id_state']"));
	   Log.info("State found");
   return element;
   }
   public static WebElement Category (WebDriver driver) {
	   element = driver.findElement(By.xpath("//*[@id='id_category_id']"));
	   Log.info("Category found");
   return element;
   }
   public static WebElement Mission (WebDriver driver) {
	   element = driver.findElement(By.xpath("//*[@id='id_mission']"));
	   Log.info("Mission Statement found");
   return element;
   }
   public static WebElement FirstName (WebDriver driver) {
	   element = driver.findElement(By.xpath("//*[@id='id_ct_fist_name']"));
	   Log.info("Firstname found");
   return element;
   }
   public static WebElement LastName (WebDriver driver) {
	   element = driver.findElement(By.xpath("//*[@id='id_ct_last_name']"));
	   Log.info("Lastname found");
   return element;
   }
   public static WebElement Email (WebDriver driver) {
	   element = driver.findElement(By.xpath("//*[@id='id_email']"));
	   Log.info("Email found");
   return element;
   }
   public static WebElement PhoneNumber (WebDriver driver) {
	   element = driver.findElement(By.xpath("//*[@id='id_ct_phone']"));
	   Log.info("Phone Number found");
   return element;
   }
   public static WebElement Password (WebDriver driver) {
	   element = driver.findElement(By.xpath("//*[@id='id_password1']"));
	   Log.info("Password found");
   return element;
   }
   public static WebElement Confirm_Password (WebDriver driver) {
	   element = driver.findElement(By.xpath("//*[@id='id_password2']"));
	   Log.info("Confirm_Password found");
   return element;
   }
   
   public static WebElement IAM_ORG (WebDriver driver) {
	   element = driver.findElement(By.xpath("//*[@id='signup-options']/a[1]"));
	   Log.info("IAMORG found");
   return element;
   }
   
   public static WebElement UploadLogoButton (WebDriver driver) {
	   element = driver.findElement(By.xpath("//*[@id='registerOrganizationForm']/fieldset/div[2]/div[2]/div[1]/label[2]/span"));
	   Log.info("UploadLogoButton found");
   return element;
   }
 //*[@id='crop-btn']
   public static WebElement Cropbutton (WebDriver driver) {
	   element = driver.findElement(By.xpath("//*[@id='crop-btn']"));
	   Log.info("CropButon found");
   return element;
   }
      
   


   public static WebElement lnk_BtOrg (WebDriver driver) {
	   element = driver.findElement(By.id("organizationBt"));
	   Log.info("ORG Button found");
   return element;
   }
   
   
   //using Online Store app
   public static WebElement lnk_MyAccount(WebDriver driver){
      
       	 element = driver.findElement(By.xpath(".//*[@id='account']/a"));
            Log.info("My Account link is found on the Home Page");
      	return element;
   }
   
   public static WebElement main_Category(WebDriver driver){
	      
     	 element = driver.findElement(By.xpath("//a[contains(.,'Product Category')]"));
          Log.info("Product Category link is found on the Home Page");
        	return element;

 }
   
   public static WebElement sub_Category(WebDriver driver){
	      
   	     element = driver.findElement(By.xpath("//a[@href='http://store.demoqa.com/products-page/product-category/accessories/']"));
          Log.info("Accessories link is found on the Home Page");
         	return element;

}
   
   public static WebElement lnk_LogOut(WebDriver driver) { 
	   
       	element = driver.findElement(By.id("account_logout"));
           Log.info("Log Out link is found on the Home Page");
      	return element;
   }

}


