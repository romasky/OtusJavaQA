package lesson8;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class OtusActions {

    @Test
    public void testOtusActions() throws Exception{

        WebDriver driver;
        driver = new FirefoxDriver();
        //goto url
        driver.get("https://material.angular.io/cdk/drag-drop/examples");
        //Call take screenshot function
        WebElement drag = driver.findElement(By.xpath("//*[@id=\"cdk-drag-drop-free-drag-position\"]/div/div[2]/cdk-drag-drop-free-drag-position-example/div"));
        new Actions(driver)
            .moveToElement(drag)
            .clickAndHold()
            .moveByOffset(100, 100)
            .release()
            .perform();
        driver.quit();
    }
}
