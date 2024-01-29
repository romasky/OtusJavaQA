package lesson7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;




public class TestAlertExample {

    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeEach
    public void start() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    public void stop() {
        driver.quit();
    }

    @Test
    public void alertExample(){

        driver.get("https://www.tutorialspoint.com/javascript/javascript_dialog_boxes.htm");
        // Вызовите метод для выполнения JavaScript кода
        driver.switchTo().frame(driver.findElement(By.cssSelector("[src='/javascript/src/alert_dialog_box.htm']")));

        // Нахождение кнопки
        WebElement button = driver.findElement(By.cssSelector("body > form:nth-child(2) > input:nth-child(1)"));

        // Выполнение клика на кнопку с помощью JavaScript
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);

        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println(alertText);
        alert.accept();
    }

    @Test
    public void alertNextExample(){
        driver.get("https://javascript.ru/alert");
        driver.findElement(By.cssSelector("[value='Запустить'")).click();
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println(alertText);
        alert.accept();
    }

    @Test
    public void promptNextExample(){
        driver.get("https://javascript.ru/prompt");
        driver.findElement(By.cssSelector("[value='Запустить'")).click();
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        alert.sendKeys("100");
        alert.accept();
        System.out.println(alertText);
        alert.accept();
    }
}
