import org.testng.annotations.Test;

public class FirstTestCase {

    @Test
    void setup() {
        System.out.println("open browser");
    }

    @Test
    void login() {
        System.out.println("login");
    }

    @Test
    void teardown() {
        System.out.println("close browser");
    }
}
