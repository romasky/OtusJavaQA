package lesson8;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;


public class OtusScrollByJS extends TestBase {

    @Test
    public void testScroll() 					
    {		
        WebDriver driver = new FirefoxDriver();			
        		
        //Creating the JavascriptExecutor interface object by Type casting		
        JavascriptExecutor js = (JavascriptExecutor)driver;		
        		
        //Launching the Site.		
        driver.get("http://moneyboats.com/");			
     
        //Maximize window		
        driver.manage().window().maximize();		
        		
        //Vertical scroll down by 600  pixels		
        js.executeScript("window.scrollBy(0,600)");	
        // Refresh window
        js.executeScript("document.location.reload(true);");
        //quit driver		
        driver.quit();
    }		
    //скролл с загрузкой
    public void scrollPageToTheBottom() throws InterruptedException {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        // Добавлено ожидание, чтобы дать странице время прокрутиться
        Thread.sleep(5000);
    }

}