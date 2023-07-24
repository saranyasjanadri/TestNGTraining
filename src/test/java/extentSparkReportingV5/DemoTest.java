package extentSparkReportingV5;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class DemoTest
{
	  //This is in global level so that all methods can access it
	  //directory where output is to be printed
	  ExtentSparkReporter spark = new ExtentSparkReporter("Extentreport.html");
	  ExtentReports extent = new ExtentReports();
 
	   @Test
       public void f1()
       {
	      ExtentTest test=extent.createTest("Launch Browser and website")
	      .assignAuthor("Shriya").assignCategory("Smoke test")
	      .assignDevice("Chrome");
	      
	      
	      test.log(Status.PASS,"user launched website");
	      test.pass("user launched website verified");
       }
  
  
  
       @Test
       public void f2()
       {
    	   ExtentTest test=extent.createTest("Verify login")
    		.assignAuthor("Ram").assignCategory("Regression test")
    		.assignDevice("Safari");
    	   
    	   
    	   test.info("alerts displaying");
    	   test.pass("user logged into application");
    	   test.warning("Reset password alerts displaying");
       }
  
  
       @Test
       public void f3() 
       {
    	   ExtentTest test=extent.createTest("Verify login Dashboard")
    		.assignAuthor("Shriya").assignCategory("Functional test")
    	    .assignDevice("IE");
    	   
    	   
    	   test.skip("Verify Dashboard skipped");
       }
  
  
       @Test
       public void f4() 
       {
    	   ExtentTest test=extent.createTest("Verify user sent emails from test application")
    	   .assignAuthor("Shrish").assignCategory("Bussiness test")
 	       .assignDevice("Edge");
    	   
    	   
    	   test.fail("Unable to email due to server down time");
       }
  
  
       @Test
       public void f5() 
       {
    	   ExtentTest test=extent.createTest("Verify Reports and Analytics")
    	   .assignAuthor("Rajesh").assignCategory("Smoke test")
 	       .assignDevice("Edge");
    	   
    	   
    	   test.fail("Reports getting crashed");
       }
  
  
       @Test
       public void f6()
       {
    	   ExtentTest test=extent.createTest("Verify logout feature")
    	   .assignAuthor("Shriya").assignCategory("Smoke test")
 	       .assignDevice("Safari");
    	   
    	   
    	   test.pass("user logged out from application");
    	   test.pass("user is redirected to login page");
       }
  
  
       @BeforeTest
       public void beforeTest() 
       {
	  
	  
	   //For single report type
	   extent.attachReporter(spark);
	  
	   //For multiple report type
	   //extent.attachReporter(spark,Klov,Logger);
	  
	   //In before test we can launch the browser details
       }
  

  
       @AfterTest
       public void afterTest()
       {
    	   //Flush output to HTML file
    	   //Writes test information from all the test cases into the sparker reporter
    	   extent.flush();
       }

}
