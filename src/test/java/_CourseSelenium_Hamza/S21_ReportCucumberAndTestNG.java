package _CourseSelenium_Hamza;

public class S21_ReportCucumberAndTestNG {

    /**

     Her iki framework'ta iki yontem var:
     1. POM.xml file dosyasina dependency eklerek
     2. Yada Kendi default ozelliginden faydalanilarak.

     Asagida default olarak gosterilmistir....

     TestNG Report: after execute test, testng create a folder automatically that name "test-output".
     For setup: Click ( RUN  + Edit Configurations + Listeners + Use default report )

     Cucumber Report: Create Runner class ve plugin yapiyoruz.
         @CucumberOptions(
                         plugin = {"json:target/json-report/cucumber.json",
                         "html:target/default-html-reports.html",
                         "junit:target/xml-report/cucumber.xml"},


     Daha sonrada reporta acmak icin(Html):
     Target -> default-html-report.html dosyasinin uzerinde saga tiklayain
     -> Open in  -> Browser -> Chrome or other browser sec.


     */


}
