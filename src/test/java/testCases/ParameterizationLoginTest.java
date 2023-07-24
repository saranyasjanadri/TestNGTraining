package testCases;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



//Externalize or Parameterize into external xml file or test suite file
//Passing/Reading Parameter from TestNG.xml(testng2.xml) file
public class ParameterizationLoginTest {
	
	
	public static WebDriver driver;
	
	
	@Parameters({"browser","url"})//This values are coming from testng2.xml file
	@Test
	public void launchApplication(String browser,String app)
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
			
			driver.get(app);
			//driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	        driver.close();
	}
	

}
