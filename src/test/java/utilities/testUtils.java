package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import commons.BaseTest;

//This testUtils class requires driver reference,
//so we have to reference the testUtils to the BaseClass(BaseTest.java)


public class testUtils extends BaseTest
{
  public void getScreenshot()throws IOException
  {
	  Date currentdate= new Date();
	  System.out.println(currentdate);
	  String screenshotfilename=currentdate.toString().replace(" ","-").replace(":","-");		
	  File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screenshotFile,new File("C://screenshot//"+ screenshotfilename +".png")); 
  }
}
