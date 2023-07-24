package commons;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class CustomListeners implements ITestListener
{
   //ITestListener contains all the below methods predefined.
   //Now the CustomListeners class implements the ITestListener class
   //and overriding the body of these methods as per our requirement.
	
	
   //This belongs to ITestListener and will execute before starting
   //of test set/batch
   public void onStart(ITestContext arg)
   {
	   //getName() will gives the name of the test method
	   System.out.println("Starts Test execution.."+arg.getName());
   }
   

   //This belongs to ITestListener and will execute after starting
   //of test set/batch
   public void onFinish(ITestContext arg)
   {
	   System.out.println("Finish Test execution.."+arg.getName());
   }
   
   
   //This belongs to ITestListener and will execute before the main test
   //start ie)@Test
   public void onTestStart(ITestResult arg0)
   {
	   System.out.println("Starting test.."+arg0.getName());
   }
   
   
   //This belongs to ITestListener and will execute when a test is skipped
   public void onTestSkipped(ITestResult arg0)
   {
	   System.out.println("Skipped test.."+arg0.getName());
   }
   
   
   //This belongs to ITestListener and will execute when a test is passed
   public void onTestSuccess(ITestResult arg0)
   {
	   System.out.println("Passed test.."+arg0.getName());
   }
   

   //This belongs to ITestListener and will execute when a test is failed
   public void onTestFailure(ITestResult arg0)
   {
	   System.out.println("Failed test.."+arg0.getName());
   }
   
   

   //Eventhough if you are not implementing this body we have to define 
   //that method,becoz ITestListener is an interface.
   //Whenever you are trying to implementing this interface we must address
   //all the methods within the class.
   public void OnTestFailedButWithinSuccessPercentage(ITestResult arg0)
   {
	
   }
}
