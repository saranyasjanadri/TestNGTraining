package testCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionExample
{
  //SoftAssert softassert =new SoftAssert();
	SoftAssert softassert =new SoftAssert();
	SoftAssert softassert2 =new SoftAssert();
 
	
  @Test
  void demoTest1()
  {
	  softassert.assertTrue(true);//passed
	  //If this gets failed then it will just logs the failure/error
	  //message and continues the execution with rest of the statement.
	  softassert.assertEquals("welcome", "Welcome");//false-failed
	  softassert.assertEquals("selenium", "selenium");//true-passed
	  System.out.println("Successfully Passed");
	  softassert.assertAll();
	    
  }
  
  
  
  
  
  
  //One of the issue with soft assert is when you use the same object
  //(softassert)of the SoftAssert class in the multiple test methods 
  //all the tests also gets failed eventhough the assert condition
  //returns true
  //To resolve this we have to create different objects for each test method 
  @Test
  void demoTest2()
  {
	  //softassert.assertEquals("selenium123", "selenium123");//true-passed
	  //softassert.assertAll();
	  
	  
	  softassert2.assertEquals("selenium123", "selenium123");//true-passed
	  softassert2.assertAll();
  }
}
