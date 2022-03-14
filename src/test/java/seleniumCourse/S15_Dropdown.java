package seleniumCourse;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

import java.util.List;

public class S15_Dropdown {

    @Test
    public void test1() throws InterruptedException {

        Driver.getDriver().get("http://amazon.com");

        WebElement dropdown = Driver.getDriver().findElement(By.id("searchDropdownBox"));

        // Select class'in dan object olusturacagiz
        Select select = new Select(dropdown);

        // tum secenekleri almak icin kullandigimiz method.
        List<WebElement> secenekler = select.getOptions();
        for(WebElement w: secenekler){
            System.out.println(w.getText());
        }

        //Degisik methodlarla secmek:
        select.selectByIndex(1);
        Thread.sleep(3000);
        select.selectByVisibleText("Appliances");
        Thread.sleep(3000);
        select.selectByValue("search-alias=mobile-apps");


        Driver.closeDriver();

    }
}
