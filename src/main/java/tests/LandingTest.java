package tests;

import com.google.common.annotations.VisibleForTesting;
import domain.Pages.HomePage;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    @Test
    public void login () {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver4mac");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.phptravels.net");
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        HomePage hp = new PageFactory().initElements(driver, HomePage.class);
        Assert.assertTrue(hp.isCallTextDisplayed());
    }



}
