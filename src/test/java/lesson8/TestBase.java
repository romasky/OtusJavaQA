package lesson8;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@SuppressWarnings("ALL")
public class TestBase {

    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeEach
    public void start() {

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    public void stop() {
        driver.quit();
        //driver = null;
    }
}