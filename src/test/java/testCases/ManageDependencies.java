package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;



//There are two ways to manage dependencies in TestNG.
//1)Dependencies with annotations
//2)Dependencies in Xml 
//We can specify your group dependencies in the testng.xml file. 
//You use the <dependencies> tag to achieve this:

/*
<test name="My suite">
<groups>
  <dependencies>
    <group name="c" depends-on="a  b" />
    <group name="z" depends-on="c" />
  </dependencies>
</groups>
</test>

*/

public class ManageDependencies 
{
	@Test
	public void userRegistration()
	{
		System.out.println("This is test1");
		Assert.assertTrue(false);
	}
	
	
	
	//This method depends on the success of the userRegistration
	//So here we can use dependencies with annotation
	
	//Hard Dependencies: All the methods this(userSearch)depends on must 
	//have run and succeeded for this to run.
	//If at least one failure occurred in the dependencies, 
	//it will not be invoked and marked as a SKIP in the report.
	//@Test(dependsOnMethods="userRegistration")
	
	
	//Soft Dependencies:You will always be run after the methods you depend
	//on, even if some of them have failed.
	//This is useful when you just want to make sure that your test methods
	//are run in a certain order but their success doesn't really depend
	//on the success of others.
	@Test(dependsOnMethods="userRegistration",alwaysRun=true)
	public void userSearch()
	{
		
		System.out.println("This is test2");
	}
	
	@Test
	public void userTest3()
	{
		System.out.println("This is test3");
	}
	
	@Test
	public void userTest4()
	{
		System.out.println("This is test4");
	}
 
}
