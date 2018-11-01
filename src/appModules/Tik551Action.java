package appModules;
import java.util.ArrayList;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Utility.*;
import pageObjects.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Tik551Action {
	
	public static int SerialNumber = 0;
	public static void WHS_to_Site(WebDriver driver) throws Exception {
		
	    Tik551_Factory Tik551F = PageFactory.initElements(driver, Tik551_Factory.class);
	    
		driver.navigate().to(BAUConstant.MSA_ReportUrl);
		Log.info("Open MyService App" );
		Thread.sleep(3000);
		
		Tik551F.ItemInventory_Tab.click();
		Log.info("Click on Inventory Tab" );
		Thread.sleep(3000);
		
		Tik551F.NewBtn_ItemInventory.click();
		Log.info("Create a New Item Inventory" );
		Thread.sleep(3000);
		
		Tik551F.NextBtn_ItemInventory.click();
		Log.info("Choose Bulk Item Creation" );
		Thread.sleep(1000);
		
	    SerialNumber = Utils.random_value();
	    Tik551F.Serial_Number.sendKeys("Automation" + SerialNumber);
	    Log.info("Input Serial Number" );
		Thread.sleep(1000);
		
		Tik551F.Product_Name.sendKeys(BAUConstant.ProductName);
		Log.info("Choose Product Name" );
		Thread.sleep(2000);
		
		Tik551F.Product_Name_Lookup.click();
		Thread.sleep(1000);
		
		Tik551F.Product_Detail.sendKeys(BAUConstant.ProductDetail);
		Log.info("Choose Product Detail" );
		Thread.sleep(2000);
		
		Tik551F.Product_Detail_Lookup.click();
		Thread.sleep(1000);
		
		Tik551F.Inventory_Location.sendKeys(BAUConstant.InventoryLocation);
		Log.info("Choose Inventory Location" );
		Thread.sleep(1000);
		
		Tik551F.Inventory_Location_Lookup.click();
		Thread.sleep(1000);
		
		Tik551F.MinMax.sendKeys(BAUConstant.MinMax);
		Log.info("Choose MinMax" );
		Thread.sleep(2000);
		
		Tik551F.MinMax_Lookup.click();
		Thread.sleep(1000);
		
		Tik551F.SaveItemInv_Btn.click();
		Log.info("Click Save button" );
		Thread.sleep(3000);
		
		String Inventory_Location = Tik551F.Inventory_Location_Detail1.getText();
		String Quantity_Available = Tik551F.Qty_available_output.getText();
		if(Inventory_Location.equals(BAUConstant.InventoryLocation)) {
			Log.info("(Verify)Inventory Location is " + Inventory_Location);
			Log.info("(Verify)Quantity_Available is " +Quantity_Available);
		}
		else {
			Log.info("Inventory Location is incorrect");
		}
		
		Thread.sleep(3000);
		//String winHandleBefore = driver.getWindowHandle();
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);  
		Tik551F.ItemTransfer_Tab.sendKeys(selectLinkOpeninNewTab);
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1)); //switches to new tab
	    Thread.sleep(5000);
	    // Switch back to original browser (first window)
	    //driver.switchTo().window(winHandleBefore);
		
        Tik551F.NewBtn_ItemTransfer.click();
        Log.info("Create a New Item Transfer");
        Thread.sleep(2000);
        
        Tik551F.WHS_Site_radiobtn.click();
        Log.info("Choose WHS to Site");
        Thread.sleep(2000);
        
        Tik551F.NextBtn_ItemTransfer.click();
        Log.info("Click Next button");
        Thread.sleep(2000);
        
        Tik551F.Search_Location.sendKeys(BAUConstant.FromLocation);
        Log.info("Choose From Location");
        Thread.sleep(2000);
        
        Tik551F.Search_Location_Lookup.click();
        Thread.sleep(1000);
        
        Tik551F.Search_Location_2.sendKeys(BAUConstant.ToLocation);
        Log.info("Choose To Location");
        Thread.sleep(2000);
        
        Tik551F.Search_Location2_Lookup.click();
        Thread.sleep(1000);
        
        Tik551F.Scan_Item.sendKeys("Automation" + SerialNumber);
        Log.info("Scan Item to Transfer");
        Thread.sleep(1000);
        
        Tik551F.Save_ItemTransferBtn.click();
        Log.info("Click Save button");
        Thread.sleep(7000);
        
        
        driver.switchTo().window(tabs.get(0)); //switches to first tab
        Thread.sleep(5000);
        driver.navigate().refresh();
        
        Inventory_Location= Tik551F.Inventory_Location_Detail2.getText();
        //Assert.assertEquals(Inventory_Location, BAUConstant.ToLocation);
        Log.info("Inventory Location after transfer is " + Inventory_Location);
			
		
}
	}
