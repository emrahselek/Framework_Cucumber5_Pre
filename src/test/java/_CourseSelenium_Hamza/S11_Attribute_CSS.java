package _CourseSelenium_Hamza;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class S11_Attribute_CSS {

    @Test
    public void link(){
        Driver.getDriver().get("http://amazon.com");

        WebElement link = Driver.getDriver().findElement(By.partialLinkText("Customer Service"));

        // Attribute ... degerini ogreniyoruz
        String href = link.getAttribute("href");
        String slot = link.getAttribute("data-csa-c-slot-id");
        System.out.println(href);
        System.out.println(slot);

        //CSS degerinin bulmak:
        String colorM = link.getCssValue("color");
        String font = link.getCssValue("font-size");
        System.out.println(colorM);
        System.out.println(font);

    }


}
