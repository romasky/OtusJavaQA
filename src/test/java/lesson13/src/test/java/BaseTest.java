package lesson13.src.test.java;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;


public class FactoryTest {
    private final static Logger log = Logger.getLogger(FactoryTest.class.getName());

    @Test

    public void testWebFactory() throws Exception {
        log.info(System.getProperty("browser"));

        String browser = System.getProperty("browser");

        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();


        wd.get("http://www.google.com");
        wd.quit();
    }

    @Test

    public void testWithOptions() throws Exception {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        log.info(System.getProperty("browser"));

        String browser = System.getProperty("browser");

        WebDriver wd = WebDriver    .createNewDriver(browser, options);
        wd.get("http://www.google.com/");
        wd.quit();

    }

}