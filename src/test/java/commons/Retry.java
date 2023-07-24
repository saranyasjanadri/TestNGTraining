package commons;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

//If test cases fail because of either environmental issue or some 
//synchronization issue and you don't want to rerun those test cases
//manually and you want to retry those failures automatically in case 
//the test case fails and retry for couple of times before you actually
//want to see the final result

//TestNG is helpful in implementing the Retry mechanism for particular
//test case or across all of the failures/or for the whole project
//when you implement as a listener
public class Retry implements IRetryAnalyzer
{
  private int retryCount=0;
  private static final int maxRetryCount=4;
  public boolean retry(ITestResult result)
  {
	  if(retryCount < maxRetryCount)
	  {
		  retryCount++;
		  return true;
	  }
	  return false;
  }
  
	
  
}
