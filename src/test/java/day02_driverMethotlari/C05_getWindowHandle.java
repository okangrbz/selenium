package day02_driverMethotlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_getWindowHandle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resourcess/driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        System.out.println(driver.getWindowHandle());
        /*CDwindow-6EC5D84F1F6819D05162F7C9C855E5E2    benzersiz olarak acilan window un hash codu
        acilan her bir pencerenin bir hash codu vardir
        bunlar surekli degisir. hash koduna sahipsek su hash koduna git diyebiliriz.

         */

    }
}
