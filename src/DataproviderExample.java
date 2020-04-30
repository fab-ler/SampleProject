import org.testng.annotations.Test;

public class DataproviderExample {

    @Test(dataProvider = "loginDataProvider", dataProviderClass = CustomDataProvider.class)
    public void loginTest(String email, String pwd) {
        System.out.println(email + " " + pwd);
    }
}
