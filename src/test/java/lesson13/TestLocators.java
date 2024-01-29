package lesson13;

import lesson8.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestLocators extends TestBase {

    @Test
    public void myFirstTest() {
        driver.navigate().to("https://otus.ru/");

       /* By.linkText - это метод в Selenium WebDriver, который используется для нахождения элементов по текстовому
         содержимому ссылки. Он ищет элементы по точному совпадению текста ссылки. */
        WebElement link = driver.findElement(By.linkText("О нас"));
        link.click();

        /* By.tagName выполняет поиск на веб-странице первого элемента с тегом <select> и возвращает его в
        качестве объекта типа WebElement.  Этот метод часто используется при автоматизации тестирования веб-приложений
        для нахождения выпадающих списков (тег <select>) на странице и взаимодействия с ними,
        таким образом, позволяя выбирать опции в таких списках. */

        WebElement form2 = driver.findElement(By.tagName("select"));
        form2.click();

        WebElement choose = driver.findElement(By.cssSelector(""));

        WebElement form1 = driver.findElement(By.id("login-form"));
        WebElement form3 = driver.findElement(By.className("login"));
        WebElement form4 = driver.findElement(By.cssSelector("form.login"));
        WebElement form5 = driver.findElement(By.cssSelector("#login-form"));

        WebElement field1 = driver.findElement(By.name("username"));
        WebElement field2 = driver.findElement(By.xpath("//input[@name='username']"));


        List<WebElement> links = driver.findElements(By.tagName("select"));

        
    }
}