package day04_xPathCssLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_xPath {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resourcess/driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

       //2- Add Element butonuna basin

       driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();//tek seferlik kullanacak sak webelemnt olusturmadan
        //direk sonulna .clic() ekleyerek clik yapabiliriz


       //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deletButon=driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deletButon.isDisplayed()){
            System.out.println("delet butonu testi PASSED");
        }else {
            System.out.println("delet butonu testi FAILED");
        }
       //4- Delete tusuna basin
        deletButon.click();
       //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        WebElement addRemove=driver.findElement(By.xpath("//h3"));

        if (addRemove.isDisplayed()){
            System.out.println("Add/remove testi PASSED");
        }else {
            System.out.println("Add/remove testi FAILD");
        }

        driver.close();
    }

    
}
