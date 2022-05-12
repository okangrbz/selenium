package day03_locateurs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Locateur {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resourcess/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //amazona gidip nutella aratalim

        driver.navigate().to("https://amazon.com");//amazona goturur

        //findElement(By....locator)--> istedigimiz web elementini bize dondurur
        //bizde o webelementini kullanmak icin bir objeye assigne aderiz
        //WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));//arama kutusuna gidiyor
        WebElement aramaKutusu = driver.findElement(By.name("field-keywords"));
       /*
       WebElement aramaKutusu=driver.findElement(By.className("nav-search-field")); -->bu locator calismadi
       locator alirken gozumuzden kacan detaylar olabilir
       aldigimiz bir locator calismazsa alternativ locatorlar denemeliyiz

        */

        /*
        <input type="text" id="twotabsearchtextbox" value="nutella" name="field-keywords" autocomplete="off" placeholder=""
        class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search">
         */
        //herhangi bir web elementine istedigimiz yaziyi yolmak istersek
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);//arama kutusuna nutella yazdirdik ve keys enter anahtari ile enter a tikladi


    }
}
