package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class RegistrationPage extends BrowserDriver {

    public static String Create_Account_xpath = "/html/body/div[1]/div/div/main/div/section/div[2]/div/p[3]/a";
    public static String username_text_id = "register-fullName";
    public static String password_text_id = "register-email";
    public static String login_btn_xpath ="//*[@id=\"register-password\"]";
    public static String newregister_btn_id ="register-privacy-and-policy-checkbox";
    public static String newregister_btn_xpath ="//*[@id=\"main\"]/div/section/div[1]/span/form/button";


    public static void Create_Account() throws InterruptedException {
        driver.findElement(By.xpath(Create_Account_xpath)).click();
        Thread.sleep(2000);
    }
    public static void sendkeys_username() throws InterruptedException {
        driver.findElement(By.id(username_text_id)).sendKeys("Anton Samir");
    }

    public static void sendkeys_Email() throws InterruptedException {
        driver.findElement(By.id(password_text_id)).sendKeys("antonsamy21@gmail.com");
    }
    public static void sendkeys_password() throws InterruptedException {
        driver.findElement(By.xpath(login_btn_xpath)).sendKeys("123456789POqw//");
    }

    public static void visibility_user_registration_page() throws InterruptedException
    {
        driver.findElement(By.id(newregister_btn_id)).click();
        driver.findElement(By.xpath(newregister_btn_xpath)).click();
    }
}
