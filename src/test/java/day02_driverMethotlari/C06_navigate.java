package day02_driverMethotlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_navigate {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resourcess/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        /*
        Eger testimiz sirasinda birden fazla sayfa arasinda ileri geri hareket edeceksek
        driver.get() yerine driver.navigate().to() method'unu kullaniriz
        ve sonrasinda forward(), back() veya refresh() method'larini kullanabiliriz

        navigate() meth sayfalar arasinda dolasmak icin kullanilir
        ileri geri yenileme
         */
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);

        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);

        //amazona geri donelim
        driver.navigate().back();//amazona gerido,uyor
        Thread.sleep(2000);

        //yeniden face e gidelim
        driver.navigate().forward();
        Thread.sleep(2000);

        //sayfayi yenileyelim
        driver.navigate().refresh();
        Thread.sleep(2000);


        driver.close();//sayfa kapan


    }
}
