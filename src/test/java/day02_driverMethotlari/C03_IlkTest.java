package day02_driverMethotlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {
    public static void main(String[] args) {

        /*
            -1 https://www.amazon.com url ine gidin
            -2 basligin Amazon kelimesi iceredigini test edin
            -3 URL in "http://www.amazon.com" a esit oldugunu test edin
            -4 sayfayi kapatin
        */

        System.setProperty("webdriver.chrome.driver", "src/resourcess/driver/chromedriver");
        WebDriver drive = new ChromeDriver();

        drive.manage().window().maximize();
        //-1 https://www.amazon.com url ine gidin
        drive.get("http://www.amazon.com");
        //-2 basligin Amazon kelimesi iceredigini test edin

        String actueltitre=drive.getTitle();
        String aranankelime="Amazon";
        if (actueltitre.contains(aranankelime)){
            System.out.println("title testi PASSED");
        }else System.out.println("Titre aranan kelimeyi icermiyor, titre testi FAILD");

        //-3 URL in "http://www.amazon.com" a esit oldugunu test edin
        String url = drive.getCurrentUrl();
        String expectedUrl="https://www.amazon.com/";
        if (url.equals(expectedUrl)){
            System.out.println(("URL testi PASSED"));
        }else System.out.println("ACTUAL URL : "+url+"  URL aranan kelimeyi icermiyor, URL testi FAILD");


        // -4 sayfayi kapatin
        drive.close();

        System.out.println();


    }
}
