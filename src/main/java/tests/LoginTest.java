package tests;

import com.google.common.annotations.VisibleForTesting;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    @Test
    public void login () {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver4mac");
        WebDriver driver = new ChromeDriver();
        driver.get("https://4stay.com/");
    }

}
