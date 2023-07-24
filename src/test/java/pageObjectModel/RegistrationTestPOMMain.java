package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationTestPOMMain
{

	@Test
	public  void verifyFlightReg()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		
		
		//We have to create the object for the page elements(RegistrationPagePOMType1)
		//class and pass the driver as the parameter. so this driver will be 
		//captured by the constructor of that class and then driver will 
		//be assigned in the page element class.
		RegistrationPagePOMType1 RGPage = new RegistrationPagePOMType1(driver);
		
	    driver.get("https://newtours.demoaut.com/");
	    driver.manage().window().maximize();
	    
	    RGPage.clickRegLink();
	    RGPage.setFirstName("Shrish");
	    RGPage.setLastName("SJ");
	    RGPage.setPhone("123456789");
	    RGPage.setEmail("Shrish@gmail.com");
	    RGPage.setAddress1("KrishnaNagar");
	    RGPage.setAddress2("BellaryRoad");
	    RGPage.setCity("Hospet");
	    RGPage.setState("Karnataka");
	    RGPage.setPostalCode("583201");
	    RGPage.setCountry("INDIA");
	    RGPage.setUserName("ShrishSJ");
	    RGPage.setPassword("Shrish123");
	    RGPage.setConfirmPassword("Shrish123");
	    RGPage.clickRegBtn();
	    
	    //Validation
	    
	    if(driver.getPageSource().contains("Thank you for registration"))
        {
	       System.out.println("Your Registration Successful");
        }
        else
        {
           System.out.println("Your Registration Failed");
        }
	    
	    driver.close();
	    
	}
}
