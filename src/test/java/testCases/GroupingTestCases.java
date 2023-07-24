package testCases;

import org.testng.annotations.AfterClass;


import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import commons.CommonDataSetup;

//@Listeners(commons.Listeners.class)

//We can classify/categorize the test cases and group it in method
//level or class level

@Test(groups="user-registration")
public class GroupingTestCases extends CommonDataSetup
{
	 //Ex:If the particular test case requires very unique information
	 //or unique setup to be done prior to running all the test cases that
	 //we have,is specified in that particular class file.
	
	
	 //In this class we have 4 test cases and these test cases depends on
	 //very specific type of data creation,for ex user should be registered 
	 //with certain attributes or certain  type of data which is very unique
	 //to this 4 test cases then we can call beforeClass method always first
	 //and then run the test cases then call the afterClass method to clean
	 //up the created data  
	
	
	 @BeforeClass
	 public void beforeclass()
	 {
		System.out.println("Run this before class");
	 }
	
	
	 @AfterClass
	 public void afterclass()
	 {
		System.out.println("Run this after class");
	 }
	
	 
	 
	 
	 
	 
	 
	 
	 
	 //In cases where we have the group of test cases dependent on
	 //particular steps then we use beforeGroups & afterGroups
	 @BeforeGroups(value="regression")
	 public void beforeGroup()
	 {
		System.out.println("Run this method before regression");
	 }
	
	
	 @AfterGroups(value="regression")
	 public void afterGroup()
	 {
		System.out.println("Run this method after regression");
	 }
	
	 
	 
	 
	 
	 
	
     @Test(priority=1,groups="regression")
     public void aTest1()
     {
  	   System.out.println("Test1");
     }
	  
     
	 
	 @Test(priority=2,groups={"regression","sanity"})
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
