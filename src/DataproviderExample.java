import org.testng.annotations.DataProvider;

public class DataproviderExample {

    @DataProvider(name = "loginDataProvider")
    public Object[][] getData() {
        Object[][] data = {{"abc@gmail@com", "abc"}, {"xyz@gmail.com", "xyz"}, {"mno@gmail.com", "mno"}};
        return data;
    }
}
