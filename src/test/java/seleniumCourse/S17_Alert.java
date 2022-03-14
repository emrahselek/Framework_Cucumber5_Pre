package seleniumCourse;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class S17_Alert {

    @Test
    public void test1() throws InterruptedException {

        Driver.getDriver().get("https://www.tutorialsteacher.com/codeeditor?cid=js-2");

        Driver.getDriver().switchTo().alert().accept();
        Thread.sleep(500);
        Driver.getDriver().switchTo().alert().accept();
        Thread.sleep(500);
        Driver.getDriver().switchTo().alert().accept();
        Thread.sleep(500);
        // dismiss()    -> alerti reddetme
        // accept()     -> alerti kabul etme
        // sendKeys()   -> input'un icerisine yazi ekler

        Thread.sleep(3000);

        WebElement homeLink = Driver.getDriver().findElement(By.xpath("//a[@title='TutorialsTeacher.com Home']"));
        homeLink.click();


    }
}
