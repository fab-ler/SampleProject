import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {
    @Test
    void setup() {
        System.out.println("open browser");
    }

    @Test
    void searchCustomer() {
        System.out.println("this is search customer test");
    }

    @Test
    void addCustomer() {
        System.out.println("this is customer add test");
        Assert.assertEquals(1, 1);
    }

    @Test
    void teardown() {
        System.out.println("close browser");
    }
}
