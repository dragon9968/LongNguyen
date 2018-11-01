package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Tik551_Factory {
	
	final WebDriver driver;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='oneHeader']/div[3]/one-appnav/div/one-app-nav-bar/nav/ul/li[3]/a")
	public WebElement ItemInventory_Tab;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='oneHeader']/div[3]/one-appnav/div/one-app-nav-bar/nav/ul/li[4]/a")
	public WebElement ItemTransfer_Tab;
	
	@FindBy(how = How.XPATH, using = ".//div[contains(@title,'New')]")
	public WebElement NewBtn_ItemInventory;
	
	@FindBy(how = How.XPATH, using = ".//button[contains(.,'Next')]")
	public WebElement NextBtn_ItemInventory;
	
	@FindBy(how = How.XPATH, using = ".//div[contains(@title,'New')]")
	public WebElement NewBtn_ItemTransfer;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='changeRecordTypeRightColumn slds-form-element__control']/lightning-input[5]/div/span//*[@class='slds-radio_faux']")
	public WebElement WHS_Site_radiobtn;
	
	@FindBy(how = How.XPATH, using = ".//button[contains(.,'Next')]")
	public WebElement NextBtn_ItemTransfer;
	
	
	//element Item Inventory
	@FindBy(how = How.XPATH, using = ".//*[@class='uiInput uiInputText uiInput--default uiInput--input']//input[@data-interactive-lib-uid='5']")
	public WebElement Serial_Number;
	
	@FindBy(how = How.XPATH, using = ".//input[@title='Search Product Master']")
	public WebElement Product_Name;
	
	@FindBy(how = How.XPATH, using = ".//div[@title='LONG SER']")
	public WebElement Product_Name_Lookup;
	
	@FindBy(how = How.XPATH, using = ".//input[@title='Search Product Details']")
	public WebElement Product_Detail;
	
	@FindBy(how = How.XPATH, using = ".//div[@title='5555']")
	public WebElement Product_Detail_Lookup;
	
	@FindBy(how = How.XPATH, using = ".//input[@title='Search Location']")
	public WebElement Inventory_Location;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='outputLookupContainer forceOutputLookupWithPreview']//a[contains(text(),'LONG1')]")
	public WebElement Inventory_Location_Detail1;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='outputLookupContainer forceOutputLookupWithPreview']//a[contains(text(),'LONG3')]")
	public WebElement Inventory_Location_Detail2;
	
	@FindBy(how = How.XPATH, using = ".//div[contains(@title,'LONG1')]")
	public WebElement Inventory_Location_Lookup;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='uiOutputNumber']")
	public WebElement Qty_available_output;
	
	@FindBy(how = How.XPATH, using = ".//input[@title='Search MinMax']")
	public WebElement MinMax;
	
	@FindBy(how = How.XPATH, using = ".//div[contains(@title,'LONG SER@LONG1')]")
	public WebElement MinMax_Lookup;
	
	@FindBy(how = How.XPATH, using = ".//button[@title='Save']")
	public WebElement SaveItemInv_Btn;
	
	//element Item Transfer
	@FindBy(how = How.XPATH, using = ".//*[@class='slds-form slds-is-editing']/div[1]//input[@title='Search Location']")
	public WebElement Search_Location;
	
	@FindBy(how = How.XPATH, using = ".//div[@title='LONG1']")
	public WebElement Search_Location_Lookup;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='slds-form slds-is-editing']/div[2]//input[@title='Search Location']")
	public WebElement Search_Location_2;
	
	@FindBy(how = How.XPATH, using = ".//div[@title='LONG3']")
	public WebElement Search_Location2_Lookup;
	
	@FindBy(how = How.XPATH, using = ".//*[@class='ql-editor ql-blank slds-rich-text-area__content slds-text-color_weak slds-grow']")
	public WebElement Scan_Item;
	
	@FindBy(how = How.XPATH, using = ".//button[text()= 'Save']")
	public WebElement Save_ItemTransferBtn;
	
	
	
	
	// This is a constructor, as every page need a base driver to find web elements
		public Tik551_Factory(WebDriver driver)
		{
			this.driver = driver;
			}
}
