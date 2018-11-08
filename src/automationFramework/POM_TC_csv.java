package automationFramework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import Utility.Constant;
import Utility.ExcelUtils;
import Utility.Log;
import appModules.SignIn_Action;

public class POM_TC_csv {
private static WebDriver driver = null;
	
	@Test
	public static void main() throws Exception {
		
		CSVReader reader = new CSVReader(new FileReader(Constant.Path_TestData + Constant.Csv_TestData));
		//BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream(Constant.Path_TestData + Constant.Csv_TestData)));
		CSVWriter writer = null;
		//PrintWriter pw = null;
	    //StringBuilder sb = new StringBuilder();
		String [] csvCell;
		//String line = null;
		DOMConfigurator.configure("log4j.xml");
		Log.startTestCase("Selenium_Test_001");
		//while loop will be executed till the last line In CSV.
		  while ((csvCell = reader.readNext()) != null) { 
			  //while((line = r.readLine()) != null) {
			   driver = new ChromeDriver();
			    Log.info("Start Chrome");
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    driver.get(Constant.URL);
			    Log.info("Open Url");
			    driver.manage().window().maximize();
			    Log.info("Maximum the Window");
		   String Email = csvCell[1];
		   String Password = csvCell[2]; 
		   String Result = csvCell[3];
		   //int Rs = Integer.parseInt(Result);
		   SignIn_Action.Execute_1(driver, Email, Password);
		   Log.info("Login Unuccessfully");  
		   List<String[]> csvBody = reader.readAll();
		   for(int i=0; i<csvBody.size(); i++){
	            String[] strArray = csvBody.get(i);
	            for(int j=0; j<strArray.length; j++){
	                if(strArray[j].equalsIgnoreCase("1")){ //String to be replaced
	                    csvBody.get(i)[j] = "Updated_date"; //Target replacement
	                }
	            }
	        }
		   //if(Result.equalsIgnoreCase("1")){ //String to be replaced
			//   line.replace(Result, "Pass");
		   //}
		   writer= new CSVWriter(new FileWriter(Constant.Path_TestData + Constant.Csv_TestData));
		   writer.writeAll(csvBody);
	       writer.flush();
	       writer.close();
		   
		  /*
		   
		  pw= new PrintWriter(new File(Constant.Path_TestData + Constant.Csv_TestData));
		  sb.append("Pass", Rs, 4);

		  pw.write(sb.toString());
	         
	      pw.write(sb.toString());
	      pw.close();*/
	        
		   driver.close();
		  }
		  
		Thread.sleep(2000);
		Log.endTestCase("Selenium_Test_001");
		
	}

}
