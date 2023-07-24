package testCases;

import org.testng.annotations.Test;

//Using External DataProviders2 with If else condition

public class DataProviderDemoTest4 {
	
	     @Test(dataProvider="create",dataProviderClass=DataProviders2.class)
         public void test(String username, String password)
         {
	         System.out.println(username+"===="+password);
         }
	     
	     
	     @Test(dataProvider="create",dataProviderClass=DataProviders2.class)
         public void test1(String username, String password, String test)
         {
	         System.out.println(username+"===="+password+"===="+test);
         }
	     
	     
	     
	     @Test(dataProvider="create",dataProviderClass=DataProviders2.class)
         public void test2(String username, String password, String test)
         {
	         System.out.println(username+"===="+password+"===="+test);
         }
	
	     
	     
	     
	     @Test(dataProvider="create",dataProviderClass=DataProviders2.class)
         public void test3(String username, String password, String test,String test1)
         {
	         System.out.println(username+"===="+password+"===="+test+"===="+test1);
         }
	
	     
	     
	   
}
