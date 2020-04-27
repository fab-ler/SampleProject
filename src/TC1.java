import org.testng.annotations.*;

public class TC1 {
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
    void test1() {
        System.out.println("this is test1");
    }

    @Test
    void test2() {
        System.out.println("this is test 2");
    }

    @BeforeTest
    void beforetest() {
        System.out.println("execute before the test");
    }

    @AfterTest
    void afterTest() {
        System.out.println("execute after the test");
    }

    @BeforeSuite
    void beforesuite() {
        System.out.println("before suite");
    }

    @AfterSuite
    void aftersuite() {
        System.out.println("after suite");
    }
}
