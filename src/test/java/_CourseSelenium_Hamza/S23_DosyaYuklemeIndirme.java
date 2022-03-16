package _CourseSelenium_Hamza;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.io.File;

public class S23_DosyaYuklemeIndirme {


    @Test
    public void dosyaIndirme() throws InterruptedException {
        Driver.getDriver().get("https://demoqa.com/upload-download");
        WebElement downloadButton = Driver.getDriver().findElement(By.id("downloadButton"));
        downloadButton.click();
        Thread.sleep(5000);

        //Burdada indirdigimizi verify yapiyoruz
        File file = new File("C:\\Users\\BelomeX\\Downloads\\sampleFile.jpeg");
        boolean varmi = file.exists();
        System.out.println(varmi);
        Assert.assertTrue(varmi);

    }

    @Test
    public void dosyaYukleme(){
        Driver.getDriver().get("https://demoqa.com/upload-download");
        WebElement fileUploadInput = Driver.getDriver().findElement(By.id("uploadFile"));
        //yuklemek istedigimiz dosyanin uzantisinin sendKeys methodu ile yapiyoruz.
        fileUploadInput.sendKeys("C:\\Users\\BelomeX\\Downloads\\sampleFile.jpeg");

    }

}
