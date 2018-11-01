package automationFramework;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertandWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Create a new instance of the Firefox driver
		 
		String exePath = "C:\\Automation Code\\driver\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
 
        driver.get("http://toolsqa.wpengine.com/handling-alerts-using-selenium-webdriver/");
        driver.manage().window().maximize();

      //This step will result in an alert on screen
     // This step will result in an alert on screen
     // This step will result in an alert on screen
     		WebElement element = driver.findElement(By.xpath("//*[@id='content']/p[11]/button"));
     		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
      
     		Alert promptAlert  = driver.switchTo().alert();
     		String alertText = promptAlert .getText();
     		System.out.println("Alert text is " + alertText);
     		//Send some text to the alert
     		promptAlert .sendKeys("Accepting the alert");
     		Thread.sleep(4000); //This sleep is not necessary, just for demonstration
     		promptAlert .accept();
       // driver.close();
	}

}
