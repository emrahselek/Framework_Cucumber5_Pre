package _CourseSelenium_Hamza;

import utilities.Driver;

public class S7_DriverMethods {

    public static void main(String[] args) throws InterruptedException {
        /**
         Driver methodlari:
         .get()             -> istenilen sayfalara gitmek icin
         .navigate()        -> icerisindeki methodlar ile islemler yapabildigimiz yardimci bolum
         .findElement()     -> bir tane element bulmak icin
         .finElements()     -> tum elementleri bulmak icin
         .getTitle()        -> acik olan sayfanin basligni almak icin
         .close()           -> acik olan sekmeyi kapatmak icin
         .quit()            -> acik olan tum sekmeleri kapatmak icin
         .manage()          -> driver ayarlarini gerceklestirdigimiz method
         .switchTo()        -> ilgli sekmeye yada bolume gecis yapabildigimiz method
         .getWindowHandles()-> acik olan tum sekmelerin benzersiz id degerlerini aldigimiz method
         .getWindowHandle() -> sadece uzerinde bulundugumuz sayfanin id degerini aliriz
         .getCurrentUrl()   -> uzerinde bulundugumuz sayfanin adresini almak icin
         .getPageSource()   -> aci olan sayfanin kaynak kodlarini getiren method

         */

        Driver.getDriver().get("http://amazon.com");

        String currentUrl = Driver.getDriver().getCurrentUrl();
        System.out.println("current page: " + currentUrl);

        Driver.getDriver().navigate().to("http://ebay.com");
        Thread.sleep(2000);
        Driver.getDriver().navigate().refresh();


    }
}
