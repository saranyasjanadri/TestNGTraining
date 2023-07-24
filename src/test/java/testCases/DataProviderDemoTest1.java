package testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//Data Provider in TestNG/Data Driven Testing with internal DataProvider

//DataProvider helps with data-driven test cases that carry the same
//methods but can be run multiple times with different data sets.

//DataProvider in TestNG that allows us to pass multiple parameters
//to a single test in a single execution.




public class DataProviderDemoTest1 {
	
	     //We can refer the DataProviderName or DataProvider method name
	     //Based on the number of parameters passed by the DataProvider 
	     //method this test method will repeat multiple times,without
	     //any looping statement.
	     @Test(dataProvider="dataSet")
         
	     public void test(String username, String password)
         {
	         System.out.println(username+"===="+password);
         }
	     
	     
	     @Test(dataProvider="dataSet1")
         public void test1(String username, String password, String test)
         {
	         System.out.println(username+"===="+password+"===="+test);
         }
	     
	     
	     
	     @Test(dataProvider="create")
         public void test2(String username, String password, String test)
         {
	         System.out.println(username+"===="+password+"===="+test);
         }
	
         
	     
	     
	     
	     //Type1:
        
	     @DataProvider
	     public Object[][] dataSet()
	     {
		   //To define the data we are trying to pull from this DataProvider
		   //we need to declare the Multi dimensional Object array
		
		   Object[][] dataset = new Object[4][2];
		
		
		   //Data allocation to the multi dimensional array
		   //1st row
		   dataset[0][0]="user1";
		   dataset[0][1]="password1";
		
		   //2nd row
		   dataset[1][0]="user2";
		   dataset[1][1]="password2";
				
		   //3rd row
		   dataset[2][0]="user3";
		   dataset[2][1]="password3";
				
		   //4th row
		   dataset[3][0]="user4";
		   dataset[3][1]="password4";
		
		   return dataset;	
		   }
         
         
         
	     
	     
	     
	     
         
           //Type2:
         
           @DataProvider
           public Object[][] dataSet1()
           {
        	   return new Object[][]
        	   {
        		   {"username1","passcode1","test1"},
        		   {"username2","passcode2","test2"},
        		   {"username3","passcode3","test3"},
        		   {"username4","passcode4","test4"}
        	   };
        				   
           }
           
           
           
           
           
           
           
           
           //Type3:
           @DataProvider(name="create")
           public Object[][] dataSet2()
           {
        	   return new Object[][]
        	   {
        		   {"username1","passcode1","test1"},
        		   {"username2","passcode2","test2"},
        		   {"username3","passcode3","test3"},
        		   {"username4","passcode4","test4"}
        	   };
        				   
           }
           
           
           

}
