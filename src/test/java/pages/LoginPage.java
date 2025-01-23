package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class LoginPage extends BrowserDriver {

    public static String password_text_id = "email";
    public static String login_btn_id ="password";
    public static String newregister_btn_xpath ="//*[@id=\"main\"]/div/section/div[1]/span/form/button";

    public static void sendkeys_Email() throws InterruptedException {
        driver.findElement(By.id(password_text_id)).sendKeys("antonsamy21@gmail.com");
    }
    public static void sendkeys_password() throws InterruptedException {
        driver.findElement(By.id(login_btn_id)).sendKeys("123456789POqw//");
    }

    public static void click_NewRegister_btn() throws InterruptedException {
        driver.findElement(By.xpath(newregister_btn_xpath)).click();
    }
}
