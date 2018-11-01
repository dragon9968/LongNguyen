package automationFramework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class TestNG1 {
	public WebDriver driver;
  @Test
  public void main() throws InterruptedException {
	  
	  Thread.sleep(5000);

		// Step 3 : Select the deselected Radio button (female) for category Sex (Use IsSelected method)
		// Storing all the elements under category 'Sex' in the list of WebLements	
		List<WebElement> rdBtn_Sex = driver.findElements(By.name("sex"));
		
		// Create a boolean variable which will hold the value (True/False)
		boolean bValue = false;
		
		// This statement will return True, in case of first Radio button is selected
		bValue = rdBtn_Sex.get(0).isSelected();
		
		// This will check that if the bValue is True means if the first radio button is selected
		if(bValue == true){
			// This will select Second radio button, if the first radio button is selected by default
			rdBtn_Sex.get(1).click();
		}else{
			// If the first radio button is not selected by default, the first will be selected
			rdBtn_Sex.get(0).click();
		}
		Thread.sleep(3000);
		//Step 4: Select the Third radio button for category 'Years of Exp' (Use Id attribute to select Radio button)
		WebElement rdBtn_Exp = driver.findElement(By.id("exp-2"));
		rdBtn_Exp.click();
		
		// STep 5: Check the Check Box 'Automation Tester' for category 'Profession'( Use Value attribute to match the selection)
		// Find the Check Box or radio button element by Name
		List<WebElement> chkBx_Profession = driver.findElements(By.name("profession"));
		
		// This will tell you the number of Check Boxes are present
		int iSize = chkBx_Profession.size();
		
		// Start the loop from first Check Box to last Check Boxe
		for(int i=0; i < iSize ; i++ ){
			// Store the Check Box name to the string variable, using 'Value' attribute
			String sValue = chkBx_Profession.get(i).getAttribute("value");
			
			// Select the Check Box it the value of the Check Box is same what you are looking for
			if (sValue.equalsIgnoreCase("Automation Tester")){
				chkBx_Profession.get(i).click();
			// This will take the execution out of for loop
			break;
			}
		}
		// Step 6: Check the Check Box 'Selenium IDE' for category 'Automation Tool' (Use cssSelector)
		WebElement CheckBox = driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
		CheckBox.click();
		
		
		// Step 3: Select 'Continents' Drop down ( Use Id to identify the element )
				// Find Select element of "Single selection" using ID locator.
				Select oSelect = new Select(driver.findElement(By.id("continents")));
		 
				// Step 4:) Select option 'Europe' (Use selectByIndex)
				oSelect.selectByVisibleText("Europe");
		 
				// Using sleep command so that changes can be noticed
				Thread.sleep(2000);
		 
				// Step 5: Select option 'Africa' now (Use selectByVisibleText)
				oSelect.selectByIndex(2);
				Thread.sleep(3000);
				
		 
				// Step 6: Print all the options for the selected drop down and select one option of your choice
				// Get the size of the Select element
				List<WebElement> oSize = oSelect.getOptions();
				int iListSize = oSize.size();
		 
				// Setting up the loop to print all the options
				for(int i =0; i < iListSize ; i++){
					// Storing the value of the option	
					String sValue = oSelect.getOptions().get(i).getText();
					// Printing the stored value
					System.out.println(sValue);
					// Putting a check on each option that if any of the option is equal to 'Africa" then select it 
					if(sValue.equals("Africa")){
						oSelect.selectByIndex(i);
						break;
						}
					}	    
		
				Thread.sleep(3000);
				// Step 3: Select 'Selenium Commands' Multiple select box ( Use Name locator to identify the element )
				Select multiSelect = new Select(driver.findElement(By.name("selenium_commands")));
		 
				// Step 4: Select option 'Browser Commands' and then deselect it (Use selectByIndex and deselectByIndex)
				multiSelect.selectByIndex(0); 
				Thread.sleep(2000);
				multiSelect.deselectByIndex(0);
		 
				// Step 5: Select option 'Navigation Commands'  and then deselect it (Use selectByVisibleText and deselectByVisibleText)
				multiSelect.selectByVisibleText("Navigation Commands");
				Thread.sleep(2000);
				multiSelect.deselectByVisibleText("Navigation Commands");
		 
				// Step 6: Print and select all the options for the selected Multiple selection list.
				List<WebElement> bSize = multiSelect.getOptions();
				int bListSize = bSize.size();
		 
				// Setting up the loop to print all the options
				for(int i =0; i < bListSize ; i++){
					// Storing the value of the option	
					String bValue1 = multiSelect.getOptions().get(i).getText();
		 
					// Printing the stored value
					System.out.println(bValue1);
		 
					// Selecting all the elements one by one
					multiSelect.selectByIndex(i);
					Thread.sleep(2000);
					}
		 
				// Step 7: Deselect all
				multiSelect.deselectAll();		
				boolean abc = multiSelect.isMultiple();
				System.out.println(abc);
		// Kill the browser
	//	driver.quit();
  }
  @BeforeMethod
  public void beforeMethod() {
	  

		String exePath = "C:\\Automation Code\\driver\\chromedriver_win32\\chromedriver.exe";
		String url ="http://toolsqa.wpengine.com/automation-practice-form";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		// Put an Implicit wait, 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Launch the URL
		driver.get(url);
      driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.close();
  }

}
