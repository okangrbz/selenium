package day04_xPathCssLocater;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_xPath {
    public static void main(String[] args) {

        /*
        <img class="s-image" src="https://m.media-amazon.com/images/I/714WyPeY5dL._AC_UY218_.jpg"
        srcset="https://m.media-amazon.com/images/I/714WyPeY5dL._AC_UY218_.jpg 1x,
        https://m.media-amazon.com/images/I/714WyPeY5dL._AC_UY327_FMwebp_
        QL65_.jpg 1.5x, https://m.media-amazon.com/images/I/714WyPeY5dL._AC_UY436_FMwebp_QL65_.jpg 2x,
         https://m.media-amazon.com/images/I/714WyPeY5dL._AC_UY545_FMwebp_QL65_.jpg 2.5x,
          https://m.media-amazon.com/images/I/714WyPeY5dL._AC_UY654_FMwebp_QL65_.jpg 3x"
           alt="Sponsored Ad - Bike Seat, Extra Comfortable Bikes Saddle with The Shockproof
           Cushion, Accessories Bikes Seats for Padded B..." data-image-index="1" data-image-load=""
        data-image-latency="s-product-image" data-image-source-density="1">
         */


        System.setProperty("webdriver.chrome.driver", "src/resourcess/driver/chromedriver");
        WebDriver driver = new ChromeDriver();



    }
}
