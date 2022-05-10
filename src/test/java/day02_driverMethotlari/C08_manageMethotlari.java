package day02_driverMethotlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08_manageMethotlari {
    public static void main(String[] args)  {

        System.setProperty("webdriver.chrome.driver","src/resourcess/driver/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        //maximize iken boyut ve konumu al
        System.out.println("maximize konum : "+driver.manage().window().getPosition());
        System.out.println("maximize boyut : "+driver.manage().window().getSize());


        //fullescreen iken boyut ve konumu al
        driver.manage().window().fullscreen();
        System.out.println("fullescreen konum : "+driver.manage().window().getPosition());
        System.out.println("fullescreen boyut : "+driver.manage().window().getSize());




    }
}
