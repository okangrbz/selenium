package day03_locateurs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebelementMethotlari {
    public static void main(String[] args) {
        /*
        1-amazon.com a gidip arama kutusunu locate edin
        2-arama kutusununtag name iniin input oldugunu test edin
        3-arama kutusunun name attiribu sunundegerinin oldugunu test edin
         */
        System.setProperty("webdriver.chrome.driver", "src/resourcess/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1-amazon.com a gidip arama kutusunu locate edin
        driver.get("https://amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        //2-arama kutusununtag name iniin input oldugunu test edin
        String expexcttedTagname = "input";
        String actualTagname = aramaKutusu.getTagName();

        if (expexcttedTagname.equals(actualTagname)) {
            System.out.println("tagname testi PASSED");
        } else {
            System.out.println("tagname testi FAILED");
        }

        //3-arama kutusunun name attiribu sunundegerinin oldugunu test edin

        String expectedNameDegeri = "field-keywords";
        String actualNameDegeri = aramaKutusu.getAttribute("name");

        if (expectedNameDegeri.equals(actualNameDegeri)) {
            System.out.println("name attribut testi PASSED");
        } else {
            System.out.println("name attribut testi FAILED");
        }


        driver.close();

        /*

        WebelementIsmi.gettagname() --> daha once locate ettigimiz bir web elementin
        tag name ini dondurur
        WebelementIsmi.getAttribute(attiributIsmi)--> daha once locate ettigimiz bir web elementin
        attiribute unu dondurur.

        burada onemli olan Webelementleri daha once localiser etmek lazim.
         */

    }
}
