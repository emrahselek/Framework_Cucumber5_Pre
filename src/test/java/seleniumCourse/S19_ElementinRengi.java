package seleniumCourse;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class S19_ElementinRengi {

    @Test
    public void test6(){

        Driver.getDriver().get("http://www.w3schools.com/");
        WebElement learnHtml = Driver.getDriver().findElement(By.linkText("Learn HTML"));
        // #04AA6D

        String arkaplanrengi = learnHtml.getCssValue("background-color");
        System.out.println(arkaplanrengi); // rgba(4, 170, 109, 1)
        // https://www.w3schools.com/colors/colors_converter.asp
        // then you can check on the page to make sure the color
        boolean esitmi = arkaplanrengi.equals("rgba(4, 170, 109, 1)");
        Assert.assertTrue(esitmi);

    }

}
