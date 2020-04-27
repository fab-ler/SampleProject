import org.testng.annotations.*;

public class TC2 {
    @BeforeClass
    void beforeclass() {
        System.out.println(("beforeclass"));
    }

    @AfterClass
    void afterclass() {
        System.out.println("afterclass");
    }

    @BeforeMethod
    void beforemethod() {
        System.out.println("this is executed before every test method");
    }

    @AfterMethod
    void aftermethod() {
        System.out.println("run after every test method");
    }

    @Test
    void test3() {
        System.out.println("test3");
    }

    @Test
    void test4() {
        System.out.println("test4");
    }
}
