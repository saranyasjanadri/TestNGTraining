package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ManageDependencyExample 
{
   @Test
   void startCar()
   {
	   System.out.println("Car started");
	   //If this test method fails the other methods depends on this
	   //will be skipped.
	   Assert.fail();
   }
   
   @Test(dependsOnMethods= {"startCar"})
   void driveCar()
   {
	   System.out.println("Car driving");
   }
   
   @Test(dependsOnMethods= {"driveCar"})
   void stopCar()
   {
	   System.out.println("Car stopped");
   }
   
   //By adding the property alwaysRun=true it doesn't gets skipped 
   //eventhough it is depending on other methods
   @Test(dependsOnMethods= {"driveCar","stopCar"},alwaysRun=true)
   void parkCar()
   {
	   System.out.println("Car parked");
   }
}
