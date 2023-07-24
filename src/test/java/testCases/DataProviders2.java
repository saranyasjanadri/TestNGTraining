package testCases;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

//Data providers with If else condition

public class DataProviders2 {

	    @DataProvider(name="create")
        public Object[][] dataSet(Method m)
        {
	       Object[][] testdata=null;
	       
	       
	       if(m.getName().equals("test"))
	       {
 	       testdata= new Object[][]
 	       {
 		     {"username1","passcode1"},
 		     {"username2","passcode2"},
 		     {"username3","passcode3"},
 		     {"username4","passcode4"}
 	       };
	       }
 	       
	       
 	       else if(m.getName().equals("test1"))
	       {
	       testdata= new Object[][]
	       {
		     {"username1","passcode1","test1"},
		     {"username2","passcode2","test2"},
		     {"username3","passcode3","test3"},
		     {"username4","passcode4","test4"}
	       };
 		   }
	       
	       
 	       else if(m.getName().equals("test2"))
	       {
	       testdata= new Object[][]
	       {
		     {"username1","passcode1","test1"},
		     {"username2","passcode2","test2"},
		     {"username3","passcode3","test3"},
		     {"username4","passcode4","test4"}
	       };
		   }
	       
 	       else if(m.getName().equals("test3"))
	       {
	       testdata= new Object[][]
	       {
		     {"username1","passcode1","test1","four1"},
		     {"username2","passcode2","test2","four2"},
		     {"username3","passcode3","test3","four3"},
		     {"username4","passcode4","test4","four4"}
	       };
		   }
	       
	       
	       return testdata;
       
        }
	       

}
