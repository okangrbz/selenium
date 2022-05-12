package day04_xPathCssLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_cssSelecteur {
    public static void main(String[] args) throws InterruptedException {
        //1 ) Bir class oluşturun : Locators_css
        //2 ) Main method oluşturun ve aşağıdaki görevi tamamlayın.
        System.setProperty("webdriver.chrome.driver", "src/resourcess/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //        a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");

        //b. Locate email textbox
        WebElement emailbox = driver.findElement(By.cssSelector("input[type=\"email\"]"));
        //c. Locate password textbox ve
        WebElement passport = driver.findElement(By.cssSelector("input[placeholder=\"Password\"]"));
        //d. Locate signin button
        WebElement sigin = driver.findElement(By.cssSelector("input[type=\"submit\"]"));
        //e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        Thread.sleep(1500);
        //i. Username : testtechproed@gmail.com
        emailbox.sendKeys("testtechproed@gmail.com");
        Thread.sleep(1500);
        //ii. Password : Test1234!
        passport.sendKeys("Test1234!");
        Thread.sleep(1500);
        sigin.click();

        Thread.sleep(1500);
        driver.close();


    }
}
