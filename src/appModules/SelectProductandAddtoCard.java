package appModules;

import Utility.Log;
import Utility.Utils;
import pageObjects.HomePage;
import pageObjects.HomePageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class SelectProductandAddtoCard {
  
	
	public static void SelectProductAddtoCard(WebDriver driver) throws Exception {
		
		HomePageFactory HomePageF = PageFactory.initElements(driver, HomePageFactory.class);	
		try {
			Utils.hoverOnElement(driver,HomePageF.main_Category, HomePageF.sub_Category);
			Log.info("Hover on Product Category and Click on Accessories" );
		} catch (Exception e) {
			throw(e);
		}
		
		Thread.sleep(3000);
		HomePageF.btn_AddToCart.click();
 	   Log.info("Click Add to Cart button" );

		Thread.sleep(3000);
		HomePageF.btn_GoToCart.click();
 	   Log.info("Open Cart page" );

	       Reporter.log("Select Product and Add to Cart Ok");

	}
}
