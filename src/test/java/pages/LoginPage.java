package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

public class LoginPage extends BrowserDriver {

    public static String Username_Class = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input";
    public static String Password_xpath ="/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input";
    public static String Login_btn_xpath ="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button";

    public static void Navigate_Website() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(5000);
    }
    public static void sendkeys_Username() {
        driver.findElement(By.xpath(Username_Class)).sendKeys("Admin");
    }
    public static void sendkeys_password() {
        driver.findElement(By.xpath(Password_xpath)).sendKeys("admin123");
    }

    public static void click_login_btn() throws InterruptedException {
        driver.findElement(By.xpath(Login_btn_xpath)).click();
        Thread.sleep(1000);
    }
}
