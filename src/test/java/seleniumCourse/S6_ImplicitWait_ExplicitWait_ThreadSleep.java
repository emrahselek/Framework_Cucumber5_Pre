package seleniumCourse;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class S6_ImplicitWait_ExplicitWait_ThreadSleep {

    @Test
    public void test01() throws InterruptedException {

        Driver.getDriver().get("http://amazon.com");
        // 1. Implicitly Wait -> Dinamik wait from selenium. It is to wait for Driver
        // 2. Explicit Wait   -> Static wait from selenium. It is for specific Web Element
        // 3. Thread.sleep    -> Static wait from Java. It is for specific element.


        // 1) implicit Wait:
        // driver'a uygulariz ve tum element arama islemlerinde bekleme komutu verririz.
        // asagidaki ornekte oldugu gibi. Burada en fazla 1000 saniye kadar bekleme limiti var.
        // dinamik bekleme de diyebiliriz.
        // Driver class dauyguluyoruz, bu frameworkta tabi.

        Driver.getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);


        // 2) Explicit Wait
        // ozel bir element arama islemi sirasinda kullandigimiz ve herhangi bir kosul yazabildigimiz bekleme turudur.
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
        WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='logo']")));

        //elementToBeClickable gibi ozel kosullarda eklenebiliyor. yani Logo1 diye, tiklanabilir bir element
        WebElement logo1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("div[@id='logo1'']")));

        // 3) Thread.sleep():
        Thread.sleep(1000);



    }
}
