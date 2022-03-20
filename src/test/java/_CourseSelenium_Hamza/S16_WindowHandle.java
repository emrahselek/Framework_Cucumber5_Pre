package _CourseSelenium_Hamza;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.Set;

public class S16_WindowHandle {

    @Test
    public void test1() throws InterruptedException {

       Driver.getDriver().get("https://www.w3schools.com/colors/colors_picker.asp");

       WebElement facabookLink = Driver.getDriver().findElement(By.xpath("//a[@title='Facebook']"));
       facabookLink.click();

       Driver.getDriver().getWindowHandle();
       Thread.sleep(3000);

       Set<String> handles = Driver.getDriver().getWindowHandles();

        Object[] array = handles.toArray();
        String sonSayfaninHandleDegeri = array[array.length-1].toString();
        System.out.println();

        Driver.getDriver().switchTo().window(sonSayfaninHandleDegeri);

    }
}
