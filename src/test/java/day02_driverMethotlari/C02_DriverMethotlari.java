package day02_driverMethotlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethotlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resourcess/driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.
                manage().//bu methtot yonrtim methodudur
                window().//yonetim meth pencere ayarlarini yapabiliriz
                maximize();//browser i tam sayfa yapiyor

        driver.get("https://www.amazon.com");
        System.out.println("actual titre : "+driver.getTitle());//bu meth basligi dondurur
        System.out.println("actuel url : "+driver.getCurrentUrl());//bu meth ise url baglantisini dondurur

        driver.close();//sayfayi kapatmak icin



    }
}
