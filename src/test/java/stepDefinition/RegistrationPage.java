package stepDefinition;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.RegistrationPage.*;

public class RegistrationPage {
    @When("User Enter Email&password")
    public void user_successfully_enters_the_log_in_details() throws InterruptedException {
        Create_Account();
        sendkeys_username();
        sendkeys_Email();
        sendkeys_password();
    }
    @Then("User should be able to view the Registration page")
    public void user_Registration_page() throws InterruptedException {
        visibility_user_registration_page();
    }

}
