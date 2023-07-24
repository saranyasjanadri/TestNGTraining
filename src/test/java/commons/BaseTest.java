package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;



//Step1:To create the base class(commons.BaseTest.java)
//Externalize  the driver initialization into the base class

//Step2:To create the test case(testCases.ListenerDemoTest.java)
//Extended the base class in the test case and use the driver reference

//Step3:To create the test utility to capture the screenshot
//(utilities.testUtills.java)
//In utilities if there are any methods requires the driver reference 
//then extend the testUtils to Base class where you have the driver reference
//In the listeners we have used the methods from the utilities

//Step4:Provide the reference of the listener in your TestNG test suite 
//you are trying to execute
public class BaseTest 
{
  public static WebDriver driver=null;
  
  @BeforeSuite
  public void launchBrowser()
  {
	  WebDriverManager.firefoxdriver().setup();
	  driver=new FirefoxDriver();
  }
  
  @AfterSuite
  public void closingBrowser()
  {
	  driver.close();
  }
}
