package log4J;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.log4testng.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;

public class log4jExample 

{

	public static void main(String[] args)
	{
		
		 //We need to create logger object/instance for Logger class
		 //which is present in the jar file (Log4J.jar)
		 //so we need to pass class name for
		 Logger logger =Logger.getLogger("log4jExample");
		 
		 //For xml file
		 DOMConfigurator.configure("log4j.xml");
		 
		 
		 //For properties file
		 //PropertyConfigurator.configure(“Log4j.properties”);
		 
		 
		 WebDriverManager.chromedriver().setup();
 		 WebDriver driver =new ChromeDriver();
 		 
 		 
 		 
 		 //Whatever we are writing by using comments we are using those 
 		 //with logger.info method
 		 logger.info("Browser opened");
 		 driver.get("http://newtours.demoaut.com/");
 		 driver.manage().window().maximize();
 		 
 		 
 		 
 		 logger.info("Clicked on Register");
 		 driver.findElement(By.linkText("Register")).click();
 		 
 		 
 		 
 		 logger.info("Entering contact information");
 		 driver.findElement(By.name("firstName")).sendKeys("Pavan");
 		 driver.findElement(By.name("lastName")).sendKeys("Kumar");
 		 driver.findElement(By.name("phone")).sendKeys("1234567890");
 		 driver.findElement(By.name("userName")).sendKeys("pavan@gmail.com");
 		 
 		 
 		 
 		 logger.info("Entering mailing information");
 		 driver.findElement(By.name("address1")).sendKeys("Nizampet");
 		 driver.findElement(By.name("address2")).sendKeys("Kukatpally");
 		 driver.findElement(By.name("city")).sendKeys("Hyderabad");
 		 driver.findElement(By.name("state")).sendKeys("AP");
 		 driver.findElement(By.name("postalcode")).sendKeys("500073");
 		 
 		 
 		 
 		 logger.info("Selecting country");
 		 Select dropcountry=new Select(driver.findElement(By.name("country")));
 		 dropcountry.selectByVisibleText("INDIA");
 		 
 		 
 		 
 		 
 		 logger.info("Entering the information");
 		 driver.findElement(By.name("email")).sendKeys("training2");
 		 driver.findElement(By.name("password")).sendKeys("training1");
 		 driver.findElement(By.name("confirmPassword")).sendKeys("training1");
 		 
 		 
 		 
	     logger.info("Clicking on register link");
	     driver.findElement(By.name("register")).click();
	     
	     
	     
	     logger.info("Validation started");
	     if(driver.getPageSource().contains("Thank you for registration"))
	     {
	    	 System.out.println("You registeration success-TEST PASSED");
	    	 logger.info("Validation done");
	    	 
	     }
	     else
	     {
	    	 System.out.println("Your registeration failed-TEST FAILED");
	    	 logger.info("Validation done");
	     }
	     
	     
	     
	     logger.info("Exit Test");
	     driver.quit();
	     
	}
	
	
}
