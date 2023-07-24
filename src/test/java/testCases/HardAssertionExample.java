package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssertionExample
{
	@Test
	public void loginTest()
	{
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver =new ChromeDriver();
		  driver.get("https://newtours.demoaut.com/");
		  driver.manage().window().maximize();
		  
		  WebElement usernametxt=driver.findElement(By.name("username"));
		  WebElement passwordtxt=driver.findElement(By.name("password"));
		  
		  //This test is to check whether the text box is displayed or not
		  //Test will only continue,if the below statement is true
		  
		  
		  Assert.assertTrue(usernametxt.isDisplayed());
		  usernametxt.sendKeys("Mercury");
		  
		  Assert.assertTrue(passwordtxt.isDisplayed());
		  passwordtxt.sendKeys("Mercury");
		  
		 
		 /*
		   
		  Assert.assertFalse(usernametxt.isDisplayed());
		  usernametxt.sendKeys("Mercury");
		  
		  Assert.assertFalse(passwordtxt.isDisplayed());
		  passwordtxt.sendKeys("Mercury");
		  
		 */
		  
		  
		  driver.findElement(By.name("login")).click();
		  
		  
		  //Validation
		  String ExpTitle="Find a Flight: Mercury Tours:";
		  
		  //compares both the titles
		  Assert.assertEquals(ExpTitle, driver.getTitle());	
		  
		  driver.close();
		  
	}

}
