package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q4_pageDownliCozum {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://testpages.herokuapp.com/styled/index.html");


        JavascriptException js= (JavascriptException) driver;

        driver.findElement(By.id("calculatetest")).click();


        driver.findElement(By.id("number2")).sendKeys("50");
        driver.findElement(By.id("number1")).sendKeys("20");
        driver.findElement(By.id("calculate")).click();

        WebElement sonuc = driver.findElement(By.id("answer"));
        System.out.println("sonuc : " + sonuc.getText());

        driver.close();


    }

}
