package seleniumCourse;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class S10_PageObjectModel_POM {
    // POM: WebElement havuzu olusturma ve
    // ilgili web elementi tekra tekrar bulmak yerine
    // page clasindan yani havuzdan cagiriyoruz.

    AmazonPage amazonPage = new AmazonPage();

    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get("http://amazon.com");
        Thread.sleep(3000);
        amazonPage.aramaKutusu.sendKeys("iphone" + Keys.ENTER);
    }
}

class AmazonPage{
    // Butun Web elementlerimiz bu class'a koyuyoruz,
    // Ve bu class'tan object olusturarak cagiriyoruz.

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;

}
