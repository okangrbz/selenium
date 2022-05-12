package day03_locateurs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_FindElement {
    public static void main(String[] args) {

        //amazon sayfasinda kactane link bulundugunu yazdir

        System.setProperty("webdriver.chrome.driver","src/resourcess/driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://amazon.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        List<WebElement> linkListesi=driver.findElements(By.tagName("a"));

        System.out.println("sayfadaki link sayisi : "+linkListesi.size());
        driver.close();
    }
}
