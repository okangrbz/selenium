package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Q3 {
    // ...Exercise3...
// go to url : https://www.techlistic.com/p/selenium-practice-form.html
//fill the firstname
//fill the firstname
//check the gender
//check the experience
//fill the date
//choose your profession -> Automation Tester
//choose your tool -> Selenium Webdriver
//choose your continent -> Antartica
//choose your command  -> Browser Commands
//click submit button
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//button[@id='ez-accept-all']")).click();

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("admin");

        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("passe");

        driver.findElement(By.xpath("//input[@id='sex-0']")).click();

        driver.findElement(By.xpath("//input[@id='exp-3']")).click();

        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("16/05/2022");

        driver.findElement(By.xpath("//input[@id='profession-1']")).click();

        driver.findElement(By.xpath("//input[@id='tool-2']")).click();

       WebElement select=driver.findElement(By.xpath("//select[@id='continents']"));
        Select slc=new Select(select);

        slc.selectByVisibleText("Antartica");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//option[. = 'Browser Commands']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();


    }

}
