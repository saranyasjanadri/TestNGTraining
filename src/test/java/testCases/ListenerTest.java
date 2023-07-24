package testCases;

import org.testng.Assert;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//Based on the status of these test methods,we can execute certain number
//of post actions(after execution of the test methods what should be done).
//That can be done by using TestNG Listeners.




//To integrate ListenerTest class and CustomListeners class 

//Type1:Without using TestNG xml file
//We need to add the listener annotation and specify the class which
//contains all the listener methods(CustomListeners) at the test class
//level as @Listeners(commons.CustomListeners.class).
//Whenever these methods in the ListenerTest class are executing,
//immediately the methods which are defined in the CustomListener class
//will be triggered and executed.



//Type2:Using TestNG xml file
//While integrating with xml file we no need to specify
//@Listeners(commons.CustomListeners.class) in the ListenerTest
//We have to add <Listeners> tag in the xml file and have to add
//the class name attribute(commons.CustomListener) inside the <listener>tag


@Listeners(commons.CustomListeners.class)
public class ListenerTest
{

	@Test
	void test1()
	{
		System.out.println("This is test1");
		Assert.assertEquals("A", "A");
	}
	
	@Test
	void test2()
	{
		System.out.println("This is test2");
		Assert.assertEquals("A", "B");
	}
	
	@Test
	void test3()
	{
		System.out.println("This is test3");
		throw new SkipException("This is skip exception");
	}
}
