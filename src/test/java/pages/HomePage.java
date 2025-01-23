package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

public class HomePage extends BrowserDriver {

    public static String hamburger_menu_xpath = "//*[@id=\"app\"]/header/div/div[2]/div[1]/div[1]/a";


    public static void Navigate_Website() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://fresh.com.eg/");
        Thread.sleep(20);
    }
    public static void click_Login() throws InterruptedException {
        driver.findElement(By.xpath(hamburger_menu_xpath)).click();
        Thread.sleep(2000);
    }



}
