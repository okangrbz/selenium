package day01_giris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ilkClass {
    public static void main(String[] args) throws InterruptedException {


        /*
        en ilkel haliyel bir automation yapmak icin
        classimiza automasyon icin gerekli olan webdriver in yerini gostermemiz gerekir
        bunun icin java kutuphanesinden Systhem.setproprty() meth kullanmaliyiz
        meth 2 parametre istemektedir
        ilki
         */
        System.setProperty("webdriver.chrome.driver","src/resourcess/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        Thread.sleep(2000);
        driver.get("https://facebook.com");
        driver.getPageSource();

        driver.close();//kapatmak icin kullanilir
        
        
    }
}
