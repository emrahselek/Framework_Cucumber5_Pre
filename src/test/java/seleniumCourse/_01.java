package seleniumCourse;


import org.junit.Assert;
import org.junit.Test;
import utilities.Driver;

public class _01 {

    @Test
    public void test1(){
        Driver.getDriver().get("http://amazon.com");
        String title = Driver.getDriver().getTitle();
        Assert.assertEquals(title, "amazon");



    }






}
