package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest2 
{
	 WebDriver driver;
	 @Test
	 void loginTest() throws InterruptedException
	  {
		  WebDriverManager.chromedriver().setup();
		  driver =new ChromeDriver();
		  driver.get("https://www.saucedemo.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.id("user-name")).sendKeys("standard_user");
		  driver.findElement(By.id("password")).sendKeys("secret_sauce");
		  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		  Assert.assertEquals(driver.getTitle(),"Swag Labs");
		  Thread.sleep(5000);
	  
	  }
	 
	 @AfterMethod
	 void teardown()
	 {
		 driver.quit();
	 }
}
