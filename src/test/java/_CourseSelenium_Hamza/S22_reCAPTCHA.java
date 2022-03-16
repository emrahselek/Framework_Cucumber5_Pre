package _CourseSelenium_Hamza;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class S22_reCAPTCHA {

    /**
     * reCAPTCHA:
        Burada once sayfadaki yerleri dolduruyoruz, daha sonra recaptcha
        geldigimizde testi sure koyuyruz ve bekletiyoruz, bekleme surecinde manual olarak
        kendimiz dogrulama yapiyoruz ve daha sonra test kaldigi yerden devam ediyor.


     */

    @Test
    public void test1() throws InterruptedException {
        Driver.getDriver().get("https://www.google.com/recaptcha/api2/demo");
        WebElement submit = Driver.getDriver().findElement(By.id("recaptcha-demo-submit"));
        Thread.sleep(15000);
        submit.click();


    }

}
