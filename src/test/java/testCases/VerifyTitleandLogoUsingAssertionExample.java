package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleandLogoUsingAssertionExample
{
  WebDriver driver;
  
  @BeforeClass
  void setup()
  {
	  WebDriverManager.chromedriver().setup();
	  driver =new ChromeDriver();
	  driver.get("https://www.orangehrm.com/");
	  driver.manage().window().maximize();
  }
  
  
  
  @Test(priority=1)
  void logoTest()
  {
	  WebElement logo=driver.findElement(By.xpath("//img[@alt='OrangeHRM Logo']"));
	  //Assert.assertTrue(logo.isDisplayed(),"Logo not displayed on the page");
	  Assert.assertFalse(logo.isDisplayed(),"Logo displayed on the page");
  
  }
  
  
  
  @Test(priority=2)
  void homepageTitle()
  {
	  String title=driver.getTitle();
	  Assert.assertEquals(title,"OrangeHRM","Title is not matched");
  }
  
  
  
  @Test
  void teardown()
  {
	  //driver.close();
  }
 
	
}
