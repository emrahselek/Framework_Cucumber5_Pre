package _CourseSelenium_Hamza;

import org.junit.Test;

public class S18_TestNG_oncelikler {

//    @Test(priority=1)
//    public void method1(){
//        System.out.println("Method1");
//    }

    @Test()
    public void method2(){
        System.out.println("Method2");
    }

    @Test()
    public void A_method3(){
        System.out.println("Method3");
    }


    @org.testng.annotations.Test(priority = 1 )
    public void test6(){
        System.out.println("Test 1");
    }


}
