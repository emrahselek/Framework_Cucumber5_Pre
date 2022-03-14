package seleniumCourse;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import java.io.File;
import java.io.IOException;

public class S13_Screenshot {

    @Test
    public void test(){
        Driver.getDriver().get("http://amazon.com");

        screenshotX("amazon_TC001");

    }

    public void screenshotX(String isim){
        TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver(); // Bir nesne olusturduk interface 'den
        File kaynak = takesScreenshot.getScreenshotAs(OutputType.FILE);// takescreenshot method sayesinde screen aldikve kendi bunyesine kaydetti

        File goruntu = new File(System.getProperty("user.dir") + "/" + isim + ".png");//Bulundugumuz konumda bir klasor actik ve daha sonra screenshot bu dosyaya kaydedecegiz

        try {
            FileUtils.copyFile(kaynak,goruntu); // kaynak tan goruntu dosyasini icin kopyalama islemi yapiliyor
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
