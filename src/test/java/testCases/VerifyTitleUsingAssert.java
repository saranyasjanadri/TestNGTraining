package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import commons.CommonDataSetup;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleUsingAssert extends CommonDataSetup
{
    @Test
	public void titleTest()
    {
	String expectedTitle="Electronics, Cars, Fashion, Collectibles & More | eBay";
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
    driver.get("https://www.ebay.com/");
    driver.manage().window().maximize();
   
    String actualTitle=driver.getTitle();
    Assert.assertEquals(actualTitle, expectedTitle);
    driver.close();
    }


}
