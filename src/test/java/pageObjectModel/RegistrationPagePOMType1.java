package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



//This class contains only page objects elements and element methods
//but the values are coming from the main class.In future if element 
//properties changed we can change only in this class easily.

//This is just supported class and we cannot execute this.

//Method1:POM
public class RegistrationPagePOMType1
{
	
      //Here we just created the driver object but not initiated.
	  //This will get the driver object from the another class (main class)
	  //where operational methods are defined.
      WebDriver driver;
      
      
      
      //Locators for every element and for each element we need to write
      //one method.
      By RegLink=By.linkText("REGISTER");
      By FirstName=By.name("firstName");
      By LastName=By.name("lastName");
      By phone=By.name("phone");
      By email=By.name("userName");
      By address1=By.name("address1");
      By address2=By.name("address2");
      By city=By.name("city");
      By state=By.name("state");
      By postalcode=By.name("postalCode");
      By country=By.name("country");
      By username=By.name("email");
      By password=By.name("password");
      By confirmPassword=By.name("confirmPassword");
      By registerBtn=By.name("register");
      
      
      
      //This is an Constructor and driver is initiated in this.
      //So we will get the driver from outside main class and assign 
      //the driver to the driver element. 
      //This will take care of creation of the driver.
      //[Constructor name will be the same as the class name.
      //It will execute whenever we create the object for the particular class]
      RegistrationPagePOMType1(WebDriver d)
      {
    	  driver=d;
      }
      
      
      
      public void clickRegLink()
      {
    	  driver.findElement(RegLink).click();
      }
      
      
      public void setFirstName(String fname)
      {
    	 driver.findElement(FirstName).sendKeys(fname); 
      }
      
      
      public void setLastName(String lname)
      {
    	 driver.findElement(LastName).sendKeys(lname); 
      }
      
      
      public void setPhone(String ph)
      {
    	 driver.findElement(phone).sendKeys(ph); 
      }
      
      public void setEmail(String mail)
      {
    	 driver.findElement(email).sendKeys(mail); 
      }
      
      public void setAddress1(String addr1)
      {
    	 driver.findElement(address1).sendKeys(addr1); 
      }
      
      public void setAddress2(String addr2)
      {
    	 driver.findElement(address2).sendKeys(addr2); 
      }
      
      public void setCity(String ci)
      {
    	  driver.findElement(city).sendKeys(ci); 
      }
      
      
      public void setState(String st)
      {
    	  driver.findElement(state).sendKeys(st); 
      }
      
      public void setPostalCode(String pcode)
      {
    	  driver.findElement(postalcode).sendKeys(pcode); 
      }
      
      public void setCountry(String cn)
      {
    	  WebElement con=driver.findElement(country);
    	  Select drop=new Select(con);
    	  drop.selectByVisibleText(cn);
      }
      
      public void setUserName(String uname)
      {
    	  driver.findElement(username).sendKeys(uname); 
      }
      
      public void setPassword(String passwrd)
      {
    	  driver.findElement(password).sendKeys(passwrd); 
      }
      
      public void setConfirmPassword(String confirmpasswrd)
      {
    	  driver.findElement(confirmPassword).sendKeys(confirmpasswrd); 
      }
      
      public void clickRegBtn()
      {
    	  driver.findElement(registerBtn).click(); 
      }
}
