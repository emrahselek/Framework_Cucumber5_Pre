package _CourseSelenium_Hamza;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;

public class S8_S9_Action {

    @Test
    public void test1() throws InterruptedException {

        // Actions class for key and mouse movement. like moving mouse and wait ont the element;.
        Driver.getDriver().get("http://amazon.com");
        Actions actions = new Actions(Driver.getDriver());

        Thread.sleep(2000);
        WebElement hellosign = Driver.getDriver().findElement(By.xpath("//span[text()='Hello, Sign in']"));
        actions.moveToElement(hellosign).perform();


        // 1.way to Scroll down with "ACTION CLASS" :
        Driver.getDriver().get("http://kese.nl");
        Actions act = new Actions(Driver.getDriver());
        act.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.PAGE_DOWN).perform();

        // 2.way to Scroll down with "JAVASCRIPTEXECUTER":
        Driver.getDriver().get("http://ebay.com");
        JavascriptExecutor jsExecutor = ((JavascriptExecutor) Driver.getDriver());
        jsExecutor.executeScript("window.scrollTo(0,300)");//300 px kadar sayfayi asagiya indirmek demek
        Thread.sleep(2000);
        jsExecutor.executeScript("window.scrollTo(0,600)");
        Thread.sleep(2000);
        jsExecutor.executeScript("window.scrollTo(0,900)");
        Thread.sleep(2000);
        jsExecutor.executeScript("window.scrollTo(0,1300)");
        Thread.sleep(2000);
        jsExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");// sayfanin en alt kismina in demek
        Thread.sleep(2000);








    }
}
