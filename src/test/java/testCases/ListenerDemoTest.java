package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import commons.BaseTest;

public class ListenerDemoTest extends BaseTest 
{
	
  //If we reference the retry analyzer in the particular testng.xml file
  //then no need to use this below annotation for each and every
  //test cases in the class
  // @Test(retryAnalyzer=commons.Retry.class)
  @Test
  public void launchApp()
  {
	  driver.get("https://ebay.com");
	  
	  //To fail the test case
	  Assert.assertTrue(false);
  }
  
  
}
