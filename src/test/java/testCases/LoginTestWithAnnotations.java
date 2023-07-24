package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commons.CommonDataSetup;

public class LoginTestWithAnnotations extends CommonDataSetup 
{
	
	
	   //Runs before all the tests in the class
	   @BeforeTest
	   public void loginToApplication()
	   {
		   System.out.println("Login to application");
	   }
	   
	   
	   
	   //Runs after all the tests
	   @AfterTest
	   public void logoutFromApplication()
	   {
		   System.out.println("Logout from application");
	   }
	   
	   
	   
	   //Ex:Database connection needs to be established before/prior each of the
	   //test & once the test is executed DB connection should
	   //be disconnected.
	   //In this case BeforeMethod & AfterMethod annotation is needed.
	   
	   //Runs before each test method
	   @BeforeMethod
	   public void connectToDB()
	   {
		   System.out.println("DB connected");
	   }
	   
	   
	   
	   //Runs after each method
	   @AfterMethod
	   public void disconnectFromDB()
	   {
		   System.out.println("DB disconnected");
	   }
	   
	   
	   
	   
	   
	   
	   //Here Test is the annotation & 
	   //priority,description & groups are the attributes of the test annotation
	  
	   @Test(priority=1,description="This is login test",groups="regression")
       public void aTest1()
       {
    	   System.out.println("Test1");
       }
	  
	   
	   
	   
	   
	   @Test(priority=2,description="This is logout test")
	   public void aTest2()
	   {
		   System.out.println("Test2");
	   }
}
