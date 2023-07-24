package extentSparkReportingV5;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NopCommerceTest 
{
    public WebDriver driver;
    
    
    public ExtentSparkReporter spark;
    public ExtentReports extent;
    public ExtentTest test;
    
    
    // Method to instantiate all the variables created above
    //Before test all these settings will be executed
    @BeforeTest
    public void setupExtent()
    {
      //Path of the Extent report
      spark =new ExtentSparkReporter(System.getProperty("user.dir")+"/test.output/myReport.html");
      //Document Title
      spark.config().setDocumentTitle("Automation Report");
      //Name of the report
      spark.config().setReportName("Functional Report");
      //Theme of the report
      spark.config().setTheme(Theme.DARK);
      
      
      extent=new ExtentReports();
      extent.attachReporter(spark);
      
      //Common informations
      extent.setSystemInfo("Host Name","LocalHost");
      extent.setSystemInfo("OS","Windows10");
      extent.setSystemInfo("Tester Name","Shriya");
      extent.setSystemInfo("Browser Name","Chrome");
      
     }
    
    
     //After test everything will be closed
     @AfterTest
     public void endReport()
     {
    	extent.flush();
     }
     
     
     
     @BeforeMethod
     public void setup()
     {
    	WebDriverManager.chromedriver().setup();
 	    driver =new ChromeDriver();
 	    driver.get("https://demo.nopcommerce.com/");
 	    driver.manage().window().maximize();
     }
     
     
     //Actual test cases
     
     
     @Test
     public void nopCommerceTitleTest() 
     {
    	 //This will create a new entry in the report
    	 test=extent.createTest("nopCommerceTitleTest");
    	 
    	 String title=driver.getTitle();
    	 System.out.println(title);
    	 
    	 //Compares expected title with Actual title
    	 Assert.assertEquals(title, "nopCommerce demo store");
     }
     
     
     
     @Test
     public void nopCommerceLogoTest()
     {
    	 test=extent.createTest("nopCommerceLogoTest");
    	 Boolean status=driver.findElement(By.xpath("//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]")).isDisplayed();
    	 Assert.assertTrue(status);
     }
     
     
     
     @Test
     public void nopCommerceLoginTest()
     {
    	 //Creates Main node entry
    	 test=extent.createTest("nopCommerceLoginTest");
    	 
    	 //This will create sub nodes(entries) inside the main node
    	 //If these both test methods are passed then only the final method
    	 //nopCommerceLoginTest() will be passed
    	 test.createNode("Login with valid input");
    	 Assert.assertTrue(true);
    	 
    	 test.createNode("Login with invalid input");
    	 Assert.assertTrue(true);
    	 
    	 
     }
     
     
     
     @AfterMethod
     public void tearDown(ITestResult result) throws IOException
     {
    	 if(result.getStatus()==ITestResult.FAILURE)
    	 {
    		 //To add name in extent report
    		 //getName() method will dynamically get the name of the test case
    		 test.log(Status.FAIL,"TEST CASE IS FAILED IS" +result.getName());
    	     
    		 //To add error exception in extent report
    		 test.log(Status.FAIL,"TEST CASE FAILED IS " +result.getThrowable());
    	 
    		 //Adding Screenshot to the report when failure occurs
    		 String screenshotPath=NopCommerceTest.getScreenshot(driver, result.getName());
    	     test.addScreenCaptureFromPath(screenshotPath);
    	     
    	 }
    	
    	 else if(result.getStatus()==ITestResult.SKIP)
    	 {
    		 test.log(Status.SKIP,"Test case SKIPPED IS"+result.getName());
    	 }
    	 
    	 else if(result.getStatus()==ITestResult.SUCCESS)
    	 {
    		 test.log(Status.SKIP,"Test case PASSED IS"+result.getName());
    	 }

         //driver.quit();
     }
     
     
     
     
     public static String getScreenshot(WebDriver driver,String screenshotName)throws IOException
     {
    	 
    	 //It creates the date format
    	 String dateName =new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());


    	 TakesScreenshot ts=(TakesScreenshot) driver;
         File source=ts.getScreenshotAs(OutputType.FILE);
         
         
         //After  execution,you could see a folder "FailedTestsScreenshots"
         //under src folder
         
         String destination =System.getProperty("user.dir")+"/Screenshots/"+screenshotName + dateName +".png";
         File finalDestination=new File(destination);
         FileUtils.copyFile(source, finalDestination);
         return destination;
     }
     
    
	
}
