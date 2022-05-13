package day04_xPathCssLocater;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://amazon.com");
       WebElement aramaCubugu= driver.findElement(By.xpath("//input[@type='text']"));

        aramaCubugu.sendKeys("tortinette electrique"+ Keys.ENTER);
        driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();






    }
}
