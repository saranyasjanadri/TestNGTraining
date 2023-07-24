package testCases;

import org.testng.annotations.DataProvider;



//Move TestNG DataProvider into different file
public class DataProviders1 {
	
	@DataProvider
    public Object[][] dataSet()
    {
	   //To define the data we are trying to pull from this DataProvider
	   //we need to declare the Multi dimensional Object array
	
	   Object[][] dataset = new Object[4][2];
	
	
	   //Data allocation to the multi dimensional array
	   //1st row
	   dataset[0][0]="user1";
	   dataset[0][1]="password1";
	
	   //2nd row
	   dataset[1][0]="user2";
	   dataset[1][1]="password2";
			
	   //3rd row
	   dataset[2][0]="user3";
	   dataset[2][1]="password3";
			
	   //4th row
	   dataset[3][0]="user4";
	   dataset[3][1]="password4";
	
	   return dataset;	
	   }
    
	
	   @DataProvider
       public Object[][] dataSet1()
       {
  	      return new Object[][]
  	     {
  		   {"username1","passcode1","test1"},
  		   {"username2","passcode2","test2"},
  		   {"username3","passcode3","test3"},
  		   {"username4","passcode4","test4"}
  	     };
  				   
       }
	
	
	    @DataProvider(name="create")
        public Object[][] dataSet2()
        {
 	       return new Object[][]
 	       {
 		     {"username1","passcode1","test1"},
 		     {"username2","passcode2","test2"},
 		     {"username3","passcode3","test3"},
 		     {"username4","passcode4","test4"}
 	       };
 				   
        }

}
