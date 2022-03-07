package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AmazonPage;
import utilities.BrowserUtilities;
import utilities.Driver;

public class Amazon_StepsDef {
    AmazonPage amazon = new AmazonPage();

    @And("kullanici New Customer Star Here butonunu tiklar")
    public void kullaniciNewCustomerStarHereButonunuTiklar() {
        BrowserUtilities.waitFor(2);
        amazon.startHere.click();

    }

    @Then("kullanici {string} kismina adini yazacak")
    public void kullaniciKisminaAdiniYazacak(String adi) {
        amazon.yourname.sendKeys(adi);
    }

    @And("kullanici {string} kismina teelfonunu yada email girecek")
    public void kullaniciKisminaTeelfonunuYadaEmailGirecek(String mobilEmail) {
        amazon.mobilEmail.sendKeys(mobilEmail);
    }

    @And("kullanici {string} kismina sifresini girecek")
    public void kullaniciKisminaSifresiniGirecek(String sifre) {
        amazon.password.sendKeys(sifre);
    }

    @And("kullanici {string} kismina tekrardan ayni sifreyi girecek")
    public void kullaniciKisminaTekrardanAyniSifreyiGirecek(String resifre) {
        amazon.rePassword.sendKeys(resifre);
    }

    @Then("kullanici Continue butonuna tiklayacak")
    public void kullaniciContinueButonunaTiklayacak() {
        BrowserUtilities.waitFor(2);
        amazon.continuex.click();
    }

    @Given("kullanici {string} sayfasina erken gider")
    public void kullaniciSayfasinaErkenGider(String webAdres) {
        Driver.getDriver().get(webAdres);
    }

    @And("verifid {string}")
    public void verifid(String text) {
        Assert.assertEquals(amazon.userAccecText.getText(),text);
    }
}
