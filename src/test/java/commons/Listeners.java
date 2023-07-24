package commons;

import org.testng.ITestListener;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;

import utilities.testUtils;

public class Listeners extends testUtils implements ITestListener 
{
      public void OnTestStart(ITestResult result)
      {
    	  //Prior to starting every test case it will print the name 
    	  //of the method that is being executed
	      Reporter.log("Method name is-"+result.getName());
    	  System.out.println("Test case is starting");
      }
      
      public void OnTestSuccess(ITestResult result)
      {
    	  Reporter.log("Status of execution is-"+result.getStatus());
      }
      
      public void OnTestFailure(ITestResult result)
      {
    	  System.out.println("Test failed-screenshot captured");
    	  
	      try {
			getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
      }
      
      public void OnTestSkipped(ITestResult result)
      {
	
      }
      
      public void OnTestFailedButWithinSuccessPercentage(ITestResult result)
      {
	
      }
      
      public void OnStart(ITestContext context)
      {
	
      }
      
      public void OnFinish(ITestContext context)
      {
	
      }
}
