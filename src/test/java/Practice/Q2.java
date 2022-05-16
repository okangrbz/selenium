package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q2 {

    //  ...Exercise2...
//  1-driver olusturalim
//  2-java class'imiza chromedriver.exe'yi tanitalim
//  3-driver'in tum ekrani kaplamasini saglayalim
//  4-driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
//    söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
//  5-"sahibinden.com" adresine gidelim
//  6-bu web adresinin sayfa basligini(title) ve adres(url)ini alalim
//  7-title ve url'nin "Oto" kelimesinin icerip icermedigini kontrol edelim
//  8-Ardindan "gittigidiyor.com" adresine gidelim
//  9-bu adresin basligini alalim ve "Sitesi" kelismesini icerip icermedigini
//    kontrol edelim
//  10-Bi onceki web sayfamiza geri donelim
//  11-sayfayi yenileyelim
//  12-Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
//  13-En son adim olarak butun sayfalarimizi kapatmis olalim


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resourcess/driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https:/sahibinden.com");
        String titre=driver.getTitle();
        System.out.println("Sahibinden titre : "+titre);
        String url=driver.getCurrentUrl();
        System.out.println("Sahibinden url : "+url);
        Thread.sleep(1500);

        if (titre.contains("Oto")&&url.contains("Oto")){
            System.out.println("titre ve url Oto iceriyor");
        }else {
            System.out.println("titre ve url Oto icermiyor");
        }
        Thread.sleep(1500);
        driver.get("https://gittigidiyor.com");
        titre=driver.getTitle();
        if (titre.contains("Sitesi")){
            System.out.println("titre de istenilen ifade gecmektedir");
        }else {
            System.out.println("titre de istenilen ifade icermemektedir");

        }
        driver.navigate().back();
        Thread.sleep(1500);
        driver.navigate().refresh();
        Thread.sleep(1500);
        driver.navigate().forward();
        Thread.sleep(1500);
        driver.close();
        driver.quit();


    }


}
