package _CourseSelenium_Hamza;

import org.junit.Test;
import utilities.Driver;

public class S12_Exceptions {

    @Test
    public void test(){
        Driver.getDriver().get("http://amazon.com");

        /**
         #EXCEPTION
         1) WebDriverException
         2) TimeoutException        -> It means to have any problem about time.
         3) NoSuchElementException  -> doesn't find web element. check locating of element
         4) NoAlertPresentException -> if you work on the alert, and any roblem about it, they give us that exception
         5) NoSuchWindowException   -> doesn't find second window or page
         6) NoSuchFrameException
         7) ElementNotSelectableException -> It can find the element but Not selected. "tiklanamadi"

         There are more exceptions but those one populer.
         */


    }



}
