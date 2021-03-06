package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Tik501Factory {

	final WebDriver driver;
	 
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:nutritionForm:inputFirstName']")
	public WebElement FirstName;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:nutritionForm:inputLastName']")
	public WebElement LastName;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:nutritionForm:inputEmail']")
	public WebElement Email;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:nutritionForm:inputPhone']")
	public WebElement Phone;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:nutritionForm:serviceTypeSelect']/select")
	public WebElement ServiceType;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:nutritionForm:reasonForVisitSelect']")
	public WebElement ReasonforVisit;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:nutritionForm:paymentTypeSelect']")
	public WebElement PaymentType;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:nutritionForm:regionSelect']/div/div[2]/select[@id='j_id0:nutritionForm:selectedRegionGId']")
	public WebElement RegionBooking;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:nutritionForm:selectedLocationGId']")
	public WebElement Location;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:nutritionForm:nutritionEventSelect']/div[2]/select[@id='j_id0:nutritionForm:dateTimeGSelectedId']")
	public WebElement DateTimeselect;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:nutritionForm:nutritionEventSelect1']/div[2]/a[1]")
	public WebElement EnglishConsentForm;
 
	@FindBy(how = How.XPATH, using = ".//input[@value='Book Appointment']")
	public WebElement BookAppointmentButton;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='patient-input-name-English']")
	public WebElement PatientName;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='walk_signature_canvas']")
	public WebElement Signature;
	
	@FindBy(how = How.XPATH, using = ".//button[contains(.,'Acknowledge')]")
	public WebElement Acknowledge;
	
	@FindBy(how = How.XPATH, using = ".//h1[contains(.,'  Appointment Confirmation')]")
	public WebElement Appointment_Confirmation;
	
	
// This is a constructor, as every page need a base driver to find web elements
	public Tik501Factory(WebDriver driver)
	{
		this.driver = driver;
		}
}
