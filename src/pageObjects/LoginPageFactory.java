package pageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import Utility.Log;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.How;

public class LoginPageFactory {

	
	public WebDriver driver;
	 
   //Using OnlineStore app	
	@FindBy(how = How.ID, using = "log")
	public WebElement txtbx_UserName;
	@FindBy(how = How.ID, using = "pwd")
	public WebElement txtbx_Password;
	@FindBy(how = How.ID, using = "login")
	public WebElement btn_LogIn;
	
	
   //Using Salesforce app
	@FindBy(how = How.XPATH, using = ".//*[@id='idp_hint']/button")
	public WebElement LoginSSO;
	
	@FindBy(how = How.ID, using = "username")
	public WebElement SFUserName;
	
	@FindBy(how = How.ID, using = "password")
	public WebElement SFPassword;
	
	@FindBy(how = How.ID, using = "Login")
	public WebElement SFLogin;
	
	//Using MCI login
	@FindBy(how = How.XPATH, using = ".//input[@placeholder='Email']")
	public WebElement MCIUserName;
	
	@FindBy(how = How.XPATH, using = ".//input[@placeholder='Password']")
	public WebElement MCIPassword;
	
	@FindBy(how = How.XPATH, using = ".//button[@type='button']")
	public WebElement MCILogin;
	
	public LoginPageFactory(WebDriver driver)
	    {
		this.driver = driver;
		}
}
