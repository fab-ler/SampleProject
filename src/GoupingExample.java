import org.testng.annotations.Test;

public class GoupingExample {
    @Test(groups = {"regression"})
    void test1() {
        System.out.println("This is test1...");
    }

    @Test(groups = {"regression"})
    void test2() {
        System.out.println("This is test2...");
    }

    @Test(groups = {"sanity"})
    void test3() {
        System.out.println("This is test3...");
    }


    @Test(groups = {"sanity"})
    void test4() {
        System.out.println("This is test4...");
    }

    @Test(groups = {"regression", "sanity"})
    void test5() {
        System.out.println("This is test5...");
    }
}
