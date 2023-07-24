package testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import commons.CommonDataSetup;

public class SkipTestcases extends CommonDataSetup 
{
	  Boolean datasetup=false;
	  
	  
	  //Example Scenario1:Using attribute
	  //If the test case is still improgress and not be completed.
	  //so you don't want somebody to pull the test case.
	  //enabled-->This attribute is used to skip the test cases to be executed forcefully.
	  //This test case wont be recorded becoz this is not even ready for execution
	  //so it wont be picked for execution.
     
	  //We can skip the test method from xml file by using <exclude>
	  //tag inside the<methods>tag in the <class> tag
	 
	  
	  //By default enabled property will be true 
	  @Test(enabled=false)
      public void skipTest1()
      {
	    System.out.println("Skipping this test as it is not completed");
      }
      
      
	  
	  
	  
      //Example Scenario2:Forcefully Skip
      
      @Test
      public void skipTest2()
      {
	    System.out.println("Skipping this test forcefully");
	    throw new SkipException("Skipping the test");
      }
      
      
      
      
      
      //Example Scenario3:Conditional skip
     
      //I want to execute some functionality or some transaction
      //but once i login to a portal,b4 I run that particular transaction 
      //I need certain data(customer detail) to be available to perform 
      //that transaction.
      //Customer detail itself are not been setup correctly,so in that case
      //I don't want to execute the transaction step
      
      @Test
      public void skipTest3()
      {
    	
	    System.out.println("Skipping this test based on the condition");
	    if(datasetup==true)
	    {
	    	System.out.println("Execute the test");
	    }
	    else
	    {
	    	System.out.println("Do not execute further steps");
	    	throw new SkipException("Do not execute further steps");
	    	
	    }
      }
}
