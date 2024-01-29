package lesson8;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class TestOtusActions {

    @Test
    public void testOtusActions()  {

        WebDriver driver;
        driver = new FirefoxDriver();
        //goto url
        driver.get("https://material.angular.io/cdk/drag-drop/examples");
        driver.manage().window().maximize();
        //Call take screenshot function
        WebElement drag = driver.findElement(By.xpath("//div[@class=\"cdk-drag example-box\" and contains(text(), \"Drag me around\")]"));
        // Прокрутка вниз
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", drag);
        new Actions(driver)
            .moveToElement(drag)
            .clickAndHold()
            .moveByOffset(400, 100)
            .release()
            .perform();
        driver.quit();
    }
}
