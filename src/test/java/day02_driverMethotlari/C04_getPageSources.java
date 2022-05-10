package day02_driverMethotlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_getPageSources {
    public static void main(String[] args) {

        //amazon sitesine gidip kaynak codelarinda "spend less" yazdigini test yapin

        System.setProperty("webdriver.chrome.driver", "src/resourcess/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.amazon.com");
        String sayfaKaynakCodlari = driver.getPageSource();//kaynak kodlarini alir
        String aranankelime="Gateway";

        System.out.println(sayfaKaynakCodlari);

        if (sayfaKaynakCodlari.contains(aranankelime)){
            System.out.println("Kaynak codu testi PASSED");
        }else {
            System.out.println("kaynak kodunda aranan kelime yok Test FAILD");
        }

        driver.close();

    }
}
