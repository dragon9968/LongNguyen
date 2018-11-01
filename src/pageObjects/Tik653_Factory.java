package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Tik653_Factory {
	public WebDriver driver;
	
	@FindBy(how = How.XPATH, using = ".//span[contains(text(),'Recently Viewed')]")
	public WebElement Recently_Viewed;
	
	@FindBy(how = How.XPATH, using = ".//span[contains(.,'Testing TimeCard')]")
	public WebElement TimeCard_View;
	
	@FindBy(how = How.XPATH, using = ".//div[contains(@title,'New')]")
	public WebElement New_btn;
	
	
	@FindBy(how = How.XPATH, using = ".//input[@title='Search People']")
	public WebElement Partner;
	
	@FindBy(how = How.XPATH, using = ".//div[@title='mrv 3']")
	public WebElement Partner_Lookup;
	
	@FindBy(how = How.XPATH, using = ".//button[@title='Save']")
	public WebElement SaveTimeCard_btn;
	
	@FindBy(how = How.XPATH, using = ".//a[@title='Work']")
	public WebElement Work_btn;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='slds-form slds-form_stacked slds-is-editing']/div[1]//*[@class='select']")
	public WebElement Day_of_Week;
	
	@FindBy(how = How.XPATH, using = ".//a[contains(.,'Mon')]")
	public WebElement Monday_select;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='slds-form-element__control']//*[@type='checkbox']")
	public WebElement Fill_in_rest_of_week_checkbox;
	
	
	@FindBy(how = How.XPATH, using = ".//*[@class='modal-container slds-modal__container']/div[3]/button[2]")
	public WebElement Save_Work_btn;
	
	@FindBy(how = How.XPATH, using = ".//a[@title='Edit']")
	public WebElement Edit_btn;
	
	@FindBy(how = How.XPATH, using = ".//div[@data-value='After Hours / Weekend Service']")
	public WebElement Overtime_Category;
	
	@FindBy(how = How.XPATH, using = ".//button[@title='Move selection to Chosen']")
	public WebElement Add_OvC;
	
	@FindBy(how = How.XPATH, using = ".//textarea[contains(@class,' textarea')]")
	public WebElement Overtime_Summary;
	
	@FindBy(how = How.XPATH, using = ".//button[@title='Save']")
	public WebElement Edit_Save_btn;
	
	@FindBy(how = How.XPATH, using = ".//div[@title='Submit For Approval']")
	public WebElement Submit_btn;
	
	@FindBy(how = How.XPATH, using = ".//span[contains(.,'Started')]")
	public WebElement Created_Timecard_Status;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='slds-form-element__control slds-grid itemBody']//*[text()='Submitted']")
	public WebElement Submit_Timecard_Status;
	
	@FindBy(how = How.XPATH, using = ".//span[contains(.,'Approved')]")
	public WebElement Approval_Timecard_Status;
	
	@FindBy(how = How.XPATH, using = ".//span[contains(.,'Approved')]")
	public WebElement Approved_Timecard_Status;
	
	@FindBy(how = How.XPATH, using = ".//button[contains(.,'Notifications')]")
	public WebElement Notification_bell;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='scroller']/ul/li[1]//*[@class='notification-link']")
	public WebElement Notification_Timecard_Requested;
	
	@FindBy(how = How.XPATH, using = ".//div[@title='Approve']")
	public WebElement Approve_btn;
	
	@FindBy(how = How.XPATH, using = ".//button[contains(.,'Approve')]")
	public WebElement Approve;

	
	public Tik653_Factory(WebDriver driver)
	{
		this.driver = driver;
	
	}
	
	
}




