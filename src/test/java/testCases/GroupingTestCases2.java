package testCases;

import org.testng.annotations.Test;

import commons.CommonDataSetup;



public class GroupingTestCases2 extends CommonDataSetup
{
	
     @Test(priority=1,groups="regression")
     public void aTest1()
     {
  	   System.out.println("Test1");
     }
	  
     
	 
	 @Test(priority=2,groups="regression")
     public void bTest2()
     {
  	   System.out.println("Test2");
     }
	  
	 
	 
	 @Test(groups={"regression","bvt"})
     public void bTest3()
     {
  	   System.out.println("Test3");
     }
	  
	 
	 
	 @Test(groups="bvt")
     public void bTest4()
     {
  	   System.out.println("Test4");
     }
	
	 
}
