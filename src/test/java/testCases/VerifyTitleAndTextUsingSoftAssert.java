package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import commons.CommonDataSetup;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleAndTextUsingSoftAssert extends CommonDataSetup
{
	//Assert.equals--> is hard assert in which the script stops executing
	//from the assertion failure at that particular point, 
	//and it doesn't execute any further asserts/steps in the script.
	
	//SoftAssert.equals--> is soft assert in which the script will
	//continue even after the failure happens(The failure will be recorded)
   
	@Test
	public void titleTest()
    {
		
	//Creating object for the SoftAssert class	
    SoftAssert softassert=new SoftAssert();
	
    String expectedTitle="Electronics, Cars,fgg Fashion, Collectibles & More | eBay";
	String expectedText="Search123";
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
    driver.get("https://www.ebay.com/");
    driver.manage().window().maximize();
   
    
    String actualTitle=driver.getTitle();
    System.out.println("Verifying Title");
    softassert.assertEquals(actualTitle, expectedTitle, "Title verification failed");
    
    
    //xpath for search button
    String actualText=driver.findElement(By.xpath("//input[@id='gh-btn']")).getAttribute("value");
    System.out.println("Verifying Text");
    softassert.assertEquals(actualText, expectedText,"Text verification failed");
    
    System.out.println("Closing Browser");
    driver.close();
    
    
    //With the soft assert all the lines are being executed but the
    //title verification error  happened is not reported at all.
   
    //To report any assertion failure in the particular test case
    //add assertAll() at the end.
    softassert.assertAll();
    }


}
