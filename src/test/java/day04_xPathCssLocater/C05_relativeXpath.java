package day04_xPathCssLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C05_relativeXpath {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resourcess/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html#");

        WebElement bastinWe=driver.findElement(By.id("pid6_thumb"));
        WebElement selierWe=driver.findElement(By.id("pid11_thumb"));

        WebElement mountiWe=driver.findElement(RelativeLocator.with(By.tagName("img")).below(bastinWe).
                toLeftOf(selierWe));
        System.out.println(mountiWe.getAttribute("id"));//pid10_thumb


    }
}
