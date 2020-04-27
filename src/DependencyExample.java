import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {

    @Test
    public void startCar() {
        System.out.println("Car started");
        /*
        should we fail the execution of the this test the whole chain of dependent TC will
        not be executed unless they are marked by an alwaysRun=ture property in test annotation
        */
        Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar"})
    public void driveCar() {
        System.out.println("Car driving");
    }


    @Test(dependsOnMethods = {"driveCar"})
    public void stopCar() {
        System.out.println("Car stopped");
    }

    //alwaysRun = true - this property will forcefully execute the method
    @Test(dependsOnMethods = {"driveCar", "stopCar"}, alwaysRun = true)
    public void parkCar() {
        System.out.println("Car parked");
    }
}
