import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionsExample {
    WebDriver driver;

    @BeforeClass
    void setup() {
        //Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https   ://opensource-demo.orangehrmlive.com/");
    }

    @Test
    void logoTest() {
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Assert.assertTrue(logo.isDisplayed(), "Logo not displayed");
    }

    @Test
    void homePageTitleTest() {
        String title = driver.getTitle();
        Assert.assertEquals("OrangeHRM111", title, "Title not matched");
    }

    @AfterClass(alwaysRun = true)
    void tearDown() {
        driver.quit();
    }

}
