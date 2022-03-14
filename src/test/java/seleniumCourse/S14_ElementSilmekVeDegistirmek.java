package seleniumCourse;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class S14_ElementSilmekVeDegistirmek {

    @Test
    public void tets1() throws InterruptedException {

        Driver.getDriver().get("http://amazon.com");

        // 1)Input icerisindeki degeri silme:
        WebElement aramakutusu = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("iphone");
        Thread.sleep(3000);
        aramakutusu.clear();

        // 2)Input disinda, bir elementi degisitirmek ici Javascript'den faydalaniyoruz.
        WebElement uyari = Driver.getDriver().findElement(By.cssSelector(".a-size-base._top-banner-text-link_desktopStyle_banner-text__3mqYM"));
        //uyari.clear(); -> calismaz. cunku clear() sadece bir inputun icindeki degeri siler.
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].innerText = 'Merhaba'",uyari);
        js.executeScript("arguments[0].innerText = ''",uyari);





    }


}
