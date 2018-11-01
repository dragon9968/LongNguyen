package pageObjects;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import Utility.Log;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.How;

public class HomePageFactory {
	
	final WebDriver driver;
	 
	@FindBy(how = How.XPATH, using = ".//*[@id='account']/a")
	public WebElement lnk_MyAccount;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='account_logout']/a")
	public WebElement lnk_LogOut;
	
	@FindBy(how = How.XPATH, using = ".//a[contains(.,'Product Category')]")
	public WebElement main_Category;
	
	@FindBy(how = How.XPATH, using = ".//a[@href='http://store.demoqa.com/products-page/product-category/accessories/']")
	public WebElement sub_Category;
	
	@FindBy(how = How.XPATH, using = ".//a[contains(.,'Magic Mouse')]")
	public WebElement product_Name;
	
	@FindBy(how = How.XPATH, using = ".//span[contains(.,'$150.00')]")
	public WebElement product_Price;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='default_products_page_container']/div[3]/div[2]/form/div[2]/div[1]/span/input")
	public WebElement btn_AddToCart;
	
	@FindBy(how = How.XPATH, using = ".//*[@class ='cart_icon']//*[text()='Cart']")
	public WebElement btn_GoToCart;
 
 
// This is a constructor, as every page need a base driver to find web elements
 
	public HomePageFactory(WebDriver driver)
 
	{
 
		this.driver = driver;
 
		}

}
