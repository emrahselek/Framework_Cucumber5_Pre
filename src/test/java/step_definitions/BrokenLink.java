//package step_definitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import utilities.Driver;
//
//import java.io.IOException;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.Iterator;
//import java.util.List;
//
//public class BrokenLink {
//
//    HttpURLConnection huc = null;
//    String url = "";
//    String pageURL = "https://bizimadresimiz.com";
//    List<WebElement> links = Driver.getDriver().findElements(By.tagName("a"));
//    // <a href="asdf.html">
//// <a href="deneme.html">
//// <a href="ttttt.html">
//    Iterator<WebElement> it = links.iterator();
//
//while(it.hasNext()){
//
//        url = it.next().getAttribute("href");
//
//        if(url == null || url.isEmpty()){
//            System.out.println("The linked element has invalid href url.");
//            continue;
//        }
//
//        if(!url.startsWith(pageURL)){
//            System.out.println("URL belongs to another domain, skipping it.");
//            continue;
//        }
//
//        try {
//            huc = (HttpURLConnection)(new URL(url).openConnection());
//
//            huc.setRequestMethod("HEAD");
//
//            huc.connect(); // connecting to the url
//
//            int responseCode = huc.getResponseCode(); // reading the response code on firing the url
//
//            if(responseCode >= 400){
//                System.out.println(url+" is a broken link");
//            }else{
//                System.out.println(url+" is a valid link");
//            }
//
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//}
