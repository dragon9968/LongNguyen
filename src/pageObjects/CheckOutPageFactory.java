package pageObjects;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import Utility.Log;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
public class CheckOutPageFactory {
	final WebDriver driver;
	 
	@FindBy(how = How.XPATH, using = ".//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[4]")
	public WebElement txt_ProductPrice;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[2]/a")
	public WebElement txt_ProductName;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='checkout_page_container']/div[1]/a/span")
	public WebElement btn_Continue;
	
	
	//Using Payment function
	@FindBy(how = How.XPATH, using = ".//input[@id='wpsc_checkout_form_9']")
	public WebElement txt_Email;
	
	@FindBy(how = How.ID, using = "wpsc_checkout_form_2")
	public WebElement txt_FirstName;
	
	@FindBy(how = How.ID, using = "wpsc_checkout_form_3")
	public WebElement txt_LastName;
	
	@FindBy(how = How.ID, using = "wpsc_checkout_form_4")
	public WebElement txt_Address;
	
	@FindBy(how = How.ID, using = "wpsc_checkout_form_5")
	public WebElement txt_City;
	
	@FindBy(how = How.ID, using = "wpsc_checkout_form_18")
	public WebElement txt_Phone;
	
	@FindBy(how = How.ID, using = "wpsc_checkout_form_7")
	public WebElement drpdwn_Country;
	
	@FindBy(how = How.ID, using = "shippingSameBilling")
	public WebElement chkbx_SameAsBillingAdd;
	
	@FindBy(how = How.XPATH, using = "//input[@value='Purchase']")
	public WebElement btn_Purchase;
	
       		
	// This is a constructor, as every page need a base driver to find web elements
	 
		public CheckOutPageFactory(WebDriver driver)
	 
		{
	 
			this.driver = driver;
	 
			}
}
