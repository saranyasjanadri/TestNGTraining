package testCases;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest1
{
  WebDriver driver;
  
  @Test
  void logoTest() throws InterruptedException
  {
	  WebDriverManager.chromedriver().setup();
	  driver =new ChromeDriver();
	  driver.get("https://www.ebay.com/");
	  driver.manage().window().maximize();
	  WebElement logo=driver.findElement(By.xpath("//img[@id='gh-logo']"));
	  Assert.assertTrue(logo.isDisplayed(),"Logo not displayed on the page");
	  Thread.sleep(5000);
  
  }
  
  
  
  @Test
  void homepageTitle() throws InterruptedException
  {
	  WebDriverManager.chromedriver().setup();
	  driver =new ChromeDriver();
	  driver.get("https://www.ebay.com/");
	  driver.manage().window().maximize();
	  String title=driver.getTitle();
	  Assert.assertEquals(title,"Electronics, Cars, Fashion, Collectibles & More | eBay","Title is not matched");
	  Thread.sleep(5000);
  }
  
  
  
  @AfterMethod
  void teardown()
  {
	  driver.quit();
  }
 
	
}
