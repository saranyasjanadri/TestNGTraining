package testCases;

import org.testng.annotations.Test;

//Using External DataProviders1

public class DataProviderDemoTest3 {
	
	     @Test(dataProvider="dataSet",dataProviderClass=DataProviders1.class)
         public void test(String username, String password)
         {
	         System.out.println(username+"===="+password);
         }
	     
	     
	     @Test(dataProvider="dataSet1",dataProviderClass=DataProviders1.class)
         public void test1(String username, String password, String test)
         {
	         System.out.println(username+"===="+password+"===="+test);
         }
	     
	     
	     
	     @Test(dataProvider="create",dataProviderClass=DataProviders1.class)
         public void test2(String username, String password, String test)
         {
	         System.out.println(username+"===="+password+"===="+test);
         }
	
         
	     
	     
	   
}
