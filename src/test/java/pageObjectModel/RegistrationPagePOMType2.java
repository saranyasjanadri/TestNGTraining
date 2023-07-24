package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


//Method2:POM
public class RegistrationPagePOMType2
{
	
	WebDriver driver;
	
	//Syntax1:how-->is a variable How-->is a class
	@FindBy(how =How.LINK_TEXT, using="REGISTER")
	WebElement RegLink;
	
	
	//Syntax2:
	@FindBy(name="firstName")
	WebElement FirstName;
	
	@FindBy(name="lastName")
	WebElement LastName;
	
	@FindBy(name="phone")
	WebElement phone;
	
	@FindBy(name="userName")
	WebElement email;
	
	@FindBy(name="address1")
	WebElement address1;

	@FindBy(name="address2")
	WebElement address2;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state;
	
	@FindBy(name="postalCode")
	WebElement postalCode;
	
	@FindBy(name="country")
	WebElement country;
	
	@FindBy(name="email")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="confirmPassword")
	WebElement confirmpassword;
	
	@FindBy(name="register")
	WebElement registerBtn;
	
	RegistrationPagePOMType2(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);//additional method
	}
	
	public void clickRegLink()
    {
	   RegLink.click();
    }

	public void setFirstName(String fname)
    {
	   FirstName.sendKeys(fname);
    }
	
	public void setLastName(String lname)
    {
	   LastName.sendKeys(lname);
    }
	
	
	public void setPhone(String ph)
    {
	   phone.sendKeys(ph);
    }
	
	public void setemail(String mail)
    {
	   email.sendKeys(mail);
    }
	
	public void setAddress1(String addr1)
    {
	   address1.sendKeys(addr1);
    }
	
	public void setAddress2(String addr2)
    {
	   address2.sendKeys(addr2);
    }
	
	public void setCity(String ci)
    {
	   city.sendKeys(ci);
    }
	
	public void setState(String st)
    {
	   state.sendKeys(st);
    }
	
	public void setPostalCode(String pcode)
    {
	   postalCode.sendKeys(pcode);
    }
	
    public void setCountry(String cn)
    {
	  Select drop =new Select(country);
	  drop.selectByVisibleText(cn);
    }

    public void setUserName(String uname)
    {
	   userName.sendKeys(uname);
    }

    public void setPassword(String passwrd)
    {
	   password.sendKeys(passwrd);
    }
   
    public void setConfirmPassword(String passwrd)
    {
	   confirmpassword.sendKeys(passwrd);
    }
   
    public void clickRegBtn()
    {
	   registerBtn.click();
    }
}
