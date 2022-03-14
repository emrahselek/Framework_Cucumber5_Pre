package seleniumCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.List;

public class S4_findElement {

    public static void main(String[] args) {

        /**
         findElement(By.className("nav-left));
         --> Tek bir tane element bulur ve ilk elementi getirir.

         findElements(By.className("nav-left));
         --> Gordugu tum elementleri bulur ve liste halinde getirir.
         --> list<WebElement>


         */


        Driver.getDriver().get("http://amazon.com");
        //findElement
        String emrah = Driver.getDriver().findElement(By.className("nav-left")).getText();
        System.out.println(emrah);

        //findelements
        List<WebElement> emo = Driver.getDriver().findElements(By.className("nav-left"));

    }

}
