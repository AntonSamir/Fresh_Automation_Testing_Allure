package stepDefinition;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.LoginPage.*;

public class LoginPage {

    @When("User enters the log in details")
    public void user_successfully_enters_the_log_in_details() throws InterruptedException {
        sendkeys_Email();
        sendkeys_password();

    }

    @Then("User should be able to view the Login details page")
    public void user_clicks_on_new_registration_button() throws InterruptedException {
        click_NewRegister_btn();
    }

}
