package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Tik711_Factory {
	public WebDriver driver;

	@FindBy(how = How.XPATH, using = ".//a[contains(.,'Get Started')]")
	public WebElement Get_Started;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='slds-form-element__control']/select[@size='1']")
	public WebElement Select_Brand;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='slds-select_container']/select[@class='slds-select']")
	public WebElement Select_Event;
	
	@FindBy(how = How.XPATH, using = ".//button[contains(.,'Next')]")
	public WebElement Next_btn;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='slds-form-element__control']/select[@size='1']")
	public WebElement Select_CM;
	
	
	//Contact Information
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/label[1]//*[@type='text']")
	public WebElement Organization_Name;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/div[7]//*[@class='slds-form-element__control']/select[@size='1']")
	public WebElement IRS_selectbox;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/label[4]//*[@type='text']")
	public WebElement TIN;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/label[6]//*[@type='text']")
	public WebElement Contact_FirstName;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/label[7]//*[@type='text']")
	public WebElement Contact_LastName;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/label[9]//*[@type='text']")
	public WebElement Contact_PhoneNumber;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/label[11]//*[@type='text']")
	public WebElement Contact_Email;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/label[12]//*[@type='text']")
	public WebElement Organization_Address;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/label[14]//*[@type='text']")
	public WebElement Organization_City;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/div[20]//*[@class='slds-form-element__control']/select[@size='1']")
	public WebElement Organization_State;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/label[15]//*[@type='text']")
	public WebElement Organization_ZipCode;
	
	//@FindBy(how = How.XPATH, using = ".//*[@class='body']/div[22]//*[@class='slds-form-element__control']/select[@size='1']")
	//public WebElement Organization_County;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/div[24]//*[@class='slds-checkbox_faux']")
	public WebElement Organization_MailingAddress_checkbox;
	
	@FindBy(how = How.XPATH, using = ".//button[contains(.,'Save & Continue')]")
	public WebElement Save_Continue_btn;
	
	//Organization Information
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/div[4]//*[@class='slds-form-element__control']/select[@size='1']")
	public WebElement Organization_Primary_Area_selectbox;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/label[1]//*[@type='text']")
	public WebElement Organization_Found;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/label[2]//*[@role='textbox']")
	public WebElement Organization_Mission;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/label[3]//*[@role='textbox']")
	public WebElement Organization_Provide;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/div[9]//*[@class='slds-form-element__control']/select[@size='1']")
	public WebElement Organization_DonationReceived_selectbox;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/div[12]//*[@class='slds-form-element__control']/select[@size='1']")
	public WebElement Partner_Volunteer_selectbox;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/div[15]//*[@class='slds-form-element__control']/select[@size='1']")
	public WebElement Organization_Support_selectbox;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/div[18]//*[@class='slds-form-element__control']/select[@size='1']")
	public WebElement Organization_Agency_selectbox;
	
	//Request Detail
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/div[4]//*[@class='slds-checkbox_faux']")
	public WebElement Request_Pertain_checkbox;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/div[6]//*[@class='slds-form-element__control']/select[@size='1']")
	public WebElement Primary_Purpose_selectbox;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/div[8]//*[@class='slds-form-element__control']/select[@size='1']")
	public WebElement Type_Event_selectbox;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/label[2]//*[@type='text']")
	public WebElement Event_Program;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/label[4]//*[@type='text']")
	public WebElement Event_Date;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/label[5]//*[@role='textbox']")
	public WebElement Event_Program_Describe;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/div[15]//*[@class='slds-checkbox_faux']")
	public WebElement Requesting_support_checkbox;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/div[19]//*[@class='slds-form-element__control']/select[@size='1']")
	public WebElement Intend_Donation_selectbox;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/div[21]//*[@class='slds-form-element__control']/select[@size='1']")
	public WebElement Participate_attend_the_event_selectbox;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/div[23]//*[@class='slds-form-element__control']/select[@size='1']")
	public WebElement Participate_attend_the_event_last_year_selectbox;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/label[8]//*[@type='text']")
	public WebElement Date_Decision;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/div[26]//*[@class='slds-checkbox_faux']")
	public WebElement Event_Program_Indicate_checkbox;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/div[28]//*[@class='slds-form-element__control']/select[@size='1']")
	public WebElement Event_Program_Materials_selectbox;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/div[31]//*[@class='slds-form-element__control']/select[@size='1']")
	public WebElement Organization_Advertising_selectbox;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/label[11]//*[@role='textbox']")
	public WebElement Organization_Contribution;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='body']/div[35]//*[@class='slds-form-element__control']/select[@size='1']")
	public WebElement Community_Investment_selectbox;
	
	@FindBy(how = How.XPATH, using = ".//button[contains(.,'Submit')]")
	public WebElement Submit_btn;
	
	public Tik711_Factory (WebDriver driver) {
		this.driver = driver;
	}
}
	