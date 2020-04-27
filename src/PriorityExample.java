import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 0)
    void TestOne() {
        System.out.println("this is testONE");
    }

    @Test(priority = 1)
    void TestTwo() {
        System.out.println("this is testTWO");
    }

    @Test(priority = 2)
    void TestTree() {
        System.out.println("this is testTREE");
    }

    @Test(priority = 3)
    void TestFour() {
        System.out.println("this is testFOUR");
    }
}
