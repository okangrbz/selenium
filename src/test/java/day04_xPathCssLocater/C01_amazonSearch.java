package day04_xPathCssLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_amazonSearch {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resourcess/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1-google web den amazon sayfasina git

        driver.get("https://amazon.com");

        //2-"city bike" ara

        WebElement aramaCubugu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaCubugu.sendKeys("city bike" + Keys.ENTER);


        //3- amazonda gorulen ilgili sonuclarin listesini yazdir

        List<WebElement> sonucTxt = driver.findElements(By.className("sg-col-inner"));


        WebElement sonucyazisiElementi = sonucTxt.get(0);
        String sonuc= sonucyazisiElementi.getText().replace("1-16 of ","").replace(" results for \"city bike\"","");

        System.out.println("aradiginiz urun "+sonuc+ " kere gecmektedir");
        //4-add  i tiklayin

        List<WebElement> urunResimleri = driver.findElements(By.className("s-image"));
        WebElement ilkUrunResmi = urunResimleri.get(0);
        ilkUrunResmi.click();

        WebElement addButon = driver.findElement(By.id("add-to-cart-button"));
        addButon.click();

    }


}
/*
<img class="s-image" src="https://m.media-amazon.com/images/I/714WyPeY5dL._
AC_UY218_.jpg" srcset="https://m.media-amazon.com/images/I/714WyPeY5dL._
AC_UY218_.jpg 1x, https://m.media-amazon.com/images/I/714WyPeY5dL._AC_UY327_
FMwebp_QL65_.jpg 1.5x, https://m.media-amazon.com/images/I/714WyPeY5dL._AC_UY436_
FMwebp_QL65_.jpg 2x, https://m.media-amazon.com/images/I/714WyPeY5dL._AC_UY545_FMwebp_QL65_.
jpg 2.5x, https://m.media-amazon.com/images/I/714WyPeY5dL._AC_UY654_FMwebp_QL65_.jpg 3x" alt="Sponsored Ad - Bike Seat, Extra Comfortable Bikes Saddle with The Shockproof Cushion, Accessories Bikes Seats for Padded B..." data-image-index="1" data-image-load=""
data-image-latency="s-product-image" data-image-source-density="1">
 */
