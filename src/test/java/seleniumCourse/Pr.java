package seleniumCourse;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Pr {

    @Test
    public void testo(){

        //1.way - Implicit Wait
        Driver.getDriver().manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

        //2.wait- Explicit Wait
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),30);
        WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='asaada']")));




    }
}
