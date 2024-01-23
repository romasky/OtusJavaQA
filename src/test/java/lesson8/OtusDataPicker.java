package lesson8;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OtusDataPicker {

    @Test
    public void testOtusTakeScreenshot() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://jqueryui.com/datepicker/");

        driver.switchTo().frame(
                driver.findElement(By.cssSelector("iframe.demo-frame")));

        setDatepicker(driver, "#datepicker", "02/20/2022");
        driver.quit();
    }

    public void setDatepicker(WebDriver driver, String cssSelector, String date) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement datePicker = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(cssSelector)));

        ((JavascriptExecutor) driver).executeScript(
                String.format("$('%s').datepicker('setDate', '%s')", cssSelector, date), datePicker);

//        WebElement el = driver.findElement(By.cssSelector("#myid"));
    }
}
