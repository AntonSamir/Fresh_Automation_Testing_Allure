package pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;

public class AdminPage extends BrowserDriver {

    public static String Admin_btn_xpath = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a";
    public static String Record_Count_xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span";

    public static String Add_User_btn_xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button";
    public static String Add_User_type = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div";
    public static String Admin_type = "//div[@role='listbox']//span[text()='Admin']";
    public static String Add_Status_type = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div";
    public static String Enable_type = "//div[@role='listbox']//span[text()='Enabled']";
    public static String Employee_Type = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input";
    public static String Employee_Name = "(//div[@role='listbox']//span)[1]";
    public static String Username = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input";
    public static String Password = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input";
    public static String Confirm_Password = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input";
    public static String Save_Btn = "/html/body/div[1]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]";
    public static String Search_Username ="/html/body/div[1]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input";
    public static String Add_User_type_Search = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div";
    public static String Admin_type_Search = "//div[@role='listbox']//span[text()='Admin']";
    public static String Add_Status_type_Search = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div";
    public static String Enable_type_Search = "//div[@role='listbox']//span[text()='Enabled']";
    public static String Employee_Type_Search = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input";
    public static String Employee_Name_Search = "(//div[@role='listbox']//span)[1]";
    public static String Search_Btn ="/html/body/div[1]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]";
    public static String Delete_Btn ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[6]/div/button[1]";
    public static String Confirm_Delete_Btn ="//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]";
    static int initialCount = 0;
    public static int lastKnownCount = 0;

    public static void click_Admin() throws InterruptedException {
        driver.findElement(By.xpath(Admin_btn_xpath)).click();
        Thread.sleep(2000);

        initialCount = get_Record_Count();
        System.out.println("Initial Record Count: " + initialCount);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement addUserButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Add_User_btn_xpath)));

        addUserButton.click();
        Thread.sleep(2000);
    }
    public static int get_Record_Count() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement recordCountElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Record_Count_xpath)));

        String recordText = recordCountElement.getText();
        String recordCount = recordText.replaceAll("[^0-9]", "");

        return Integer.parseInt(recordCount);
    }

    // Add a new user
    public static void Add_User() throws InterruptedException {
        driver.findElement(By.xpath(Add_User_type)).click();
        Thread.sleep(200);
        driver.findElement(By.xpath(Admin_type)).click();
        driver.findElement(By.xpath(Employee_Type)).sendKeys("a");
        Thread.sleep(2000);
        driver.findElement(By.xpath(Employee_Name)).click();
        driver.findElement(By.xpath(Add_Status_type)).click();
        driver.findElement(By.xpath(Enable_type)).click();
        driver.findElement(By.xpath(Username)).sendKeys("Antpr");
        driver.findElement(By.xpath(Password)).sendKeys("123456789QWpo//");
        driver.findElement(By.xpath(Confirm_Password)).sendKeys("123456789QWpo//");
        driver.findElement(By.xpath(Save_Btn)).click();

        Thread.sleep(5000);
    }

    public static void verify_Record_Count_Increase() {
        int newCount = get_Record_Count();
        System.out.println("New Record Count: " + newCount);

        if (newCount == initialCount + 1) {
            System.out.println("✅ Test Passed: The number of records Increased by 1.");
        } else {
            System.out.println("❌ Test Failed: Expected " + (initialCount + 1) + ", but got " + newCount);
        }

        lastKnownCount = newCount;
    }
    public static void Search_User() throws InterruptedException {
        driver.findElement(By.xpath(Search_Username)).sendKeys("Antpr");
        driver.findElement(By.xpath(Add_User_type_Search)).click();
        Thread.sleep(200);
        driver.findElement(By.xpath(Admin_type_Search)).click();
        driver.findElement(By.xpath(Employee_Type_Search)).sendKeys("a");
        Thread.sleep(2000);
        driver.findElement(By.xpath(Employee_Name_Search)).click();
        driver.findElement(By.xpath(Add_Status_type_Search)).click();
        Thread.sleep(200);
        driver.findElement(By.xpath(Enable_type_Search)).click();
        driver.findElement(By.xpath(Search_Btn)).click();
        Thread.sleep(2000);
    }
    public static void Delete_User() throws InterruptedException {
        driver.findElement(By.xpath(Delete_Btn)).click();
        driver.findElement(By.xpath(Confirm_Delete_Btn)).click();
        Thread.sleep(2000);

    }
    public static void  verify_Record_Count_Decrease() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement recordCountElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(Record_Count_xpath))
        );
        String recordText = recordCountElement.getText();
        if (recordText.contains("No Records Found")) {
            System.out.println("No Records Found – already deleted.");
            lastKnownCount = 0;
        } else {
            String numericCount = recordText.replaceAll("[^0-9]", "");
            int newCount = Integer.parseInt(numericCount);
            System.out.println("New Record Count after deletion: " + newCount);

            if (newCount == lastKnownCount - 1) {
                System.out.println("✅ Test Passed: The number of records decreased by 1.");
            } else {
                System.out.println("❌ Test Failed: Expected " + (lastKnownCount - 1) + ", but got " + newCount);
            }

            lastKnownCount = newCount;
        }
    }

}




