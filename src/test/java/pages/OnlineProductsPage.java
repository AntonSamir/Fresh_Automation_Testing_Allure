package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class OnlineProductsPage extends BrowserDriver {
    public static String Offers_xpath = "/html/body/div[1]/div/div/header/div/div[2]/div[1]/ul/li[7]/a/span";

    public static String frist_Offer_xpath = "/html/body/div[1]/div/div/main/div/div/div[1]/div/div[2]/div[4]/div[1]/div[2]/div[1]/button/span";

    public static void click_offer() throws InterruptedException {
        driver.findElement(By.xpath(Offers_xpath)).click();
        Thread.sleep(200);
    }

    public static void frist_offer() {
        driver.findElement(By.xpath(frist_Offer_xpath)).click();
    }
}

