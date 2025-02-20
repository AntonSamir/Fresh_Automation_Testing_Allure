package stepDefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;

import static pages.LoginPage.*;

public class LoginPage {

    @Given("User navigates to the Login page")
    public void user_navigates_to_the_Admin_page() throws InterruptedException {
        Allure.getLifecycle().getCurrentTestCase();
        Navigate_Website();
        Thread.sleep(200);
    }
    @When("User Enter Username&password")
    public void user_successfully_enters_the_log_in_details() throws InterruptedException {
        sendkeys_Username();
        sendkeys_password();

    }

    @Then("User should be able to view the Login details page")
    public void user_clicks_on_Login_button() throws InterruptedException {
        click_login_btn();
    }

}
