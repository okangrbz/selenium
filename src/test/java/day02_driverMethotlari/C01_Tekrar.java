package day02_driverMethotlari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.xml.sax.ext.Locator2;

public class C01_Tekrar {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resourcess/driver/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com");


    }
}
