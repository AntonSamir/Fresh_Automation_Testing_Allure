package stepDefinition;


import io.cucumber.java.en.Given;
import io.qameta.allure.Allure;

import static pages.HomePage.*;

public class HomePage {
    @Given("User navigates to the Signin page")
    public void user_navigates_to_the_Signin_page() throws InterruptedException {
        Allure.getLifecycle().getCurrentTestCase();
        Navigate_Website();
        click_Login();
    }

    @Given("User navigates to the Login page")
    public void user_navigates_to_the_login_page() throws InterruptedException {
        Allure.feature("Given");
        Allure.addAttachment("HTML Snapshot","text/html", driver.getPageSource(), "html");
        Navigate_Website();
        click_Login();
    }

    @Given("User navigates to the Online products page")
    public void user_navigates_to_the_Online_product_page() throws InterruptedException {
        Allure.getLifecycle().getCurrentTestCase();
        Navigate_Website();
    }

}
