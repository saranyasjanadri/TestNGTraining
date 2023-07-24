package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//Data Provider in TestNG Selenium with internal DataProvider

public class DataProviderDemoTest2 {
	  
	     @Test(dataProvider="create")
         public void test2(String username, String password)
         {
	    	 WebDriverManager.chromedriver().setup();
	    	 WebDriver driver=new ChromeDriver();
	    	 driver.get("https://www.saucedemo.com/");
	    	 
	    	 //DataProvider will provide the username & password
	    	 driver.findElement(By.id("user-name")).sendKeys(username);
	    	 driver.findElement(By.id("password")).sendKeys(password);
	    	 driver.findElement(By.id("login-button")).click();
	    	 driver.close();
	         //System.out.println(username+"===="+password);
         }
	
         
	     
	             
         @DataProvider(name="create")
         public Object[][] dataSet()
         {
        	   return new Object[][]
        	   {
        		   {"standard_user","secret_sauce"},
        		   {"locked_out_user","secret_sauce"},
        		   {"problem_user","secret_sauce"},
        		   {"performance_glitch_user","secret_sauce"}
        	   };
        				   
           }
           
           
           

}
