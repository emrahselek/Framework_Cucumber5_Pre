package seleniumCourse;

import org.junit.Assert;
import org.junit.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;

public class S5_Assert {

    @Test
    public void test1(){
        Driver.getDriver().get("http://amazon.com");

        String title = Driver.getDriver().getTitle();
        // Hard Assertion
        // Herhangi bir satidaki assertionda bir hata varsa eger sistem fail verir ve execution devam etmez.
        Assert.assertEquals(title,"amazon");


        // Soft Assertion  (Verify Assert)
        // assertionda hata olsa bile sistem calismaya devam eder ve daha sonra butun hatalari gosterir.
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(title,"amazon");

    }


}
