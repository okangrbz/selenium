package day02_driverMethotlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_manegeMethotlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resourcess/driver/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//acilana kadar max bekleme suresi
        driver.get("https://amaazon.com");

        /*
        ilerde wait konusunu daha genis olarak ele alacagiz
        Bir sayfa acilirken ilk basta sayfanin icerisinde bulunan elementlere gore
        bir yuklenme suresine ihtiyac vardir
        veya bir web elementinin kullanilabilmesi icin zamana ihtiyac olabilir
        implicitlyWait() bize sayfanin yuklenmesi ve sayfadaki elementlere ulasim icin beklenecek
        MAXIMUM bekleme sureyi belirleme olanagi tanir

         */

        Thread.sleep(1500);//bu meth net 15 sn bekletir yukaridaki meth ise yuleme bitince kapatir 15 sn den az sa bile yukleme bitince kapanir
        driver.close();
    }
}
