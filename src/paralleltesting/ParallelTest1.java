package paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ParallelTest1 {

    WebDriver driver;

    @Test
    void logoTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Assert.assertTrue(logo.isDisplayed(), "Logo not displayed on the page");
        Thread.sleep(2000);
    }

    @Test
    void homePageTitle() throws InterruptedException {
        System.out.println("homePageTitle. Thread id  -->: " + Thread.currentThread().getId());
        System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        String title = driver.getTitle();
        Assert.assertEquals(title, "OrangeHRM", "Title is not matched");
        Thread.sleep(5000);
        driver.close();
    }

    @AfterTest
    void tearDoown() {
        driver.quit();
    }

}
