package stepDefinition;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;

import static pages.AdminPage.*;
import static pages.LoginPage.*;

public class Admin_Page {

    @Given("User navigates to the Admin page")
    public void user_navigates_to_the_Admin_page() throws InterruptedException {
        Allure.getLifecycle().getCurrentTestCase();
        Navigate_Website();
        Thread.sleep(200);
        sendkeys_Username();
        sendkeys_password();
        click_login_btn();
        Thread.sleep(200);
    }
    @When("navigates to Admin")
    public void Click_on_Admin_Btn() throws InterruptedException {
        click_Admin();
    }
    @And("navigates to Add new Admin")
    public void Click_on_New_Admin_Btn() throws InterruptedException {
        Add_User();
        verify_Record_Count_Increase();
    }
    @Then("navigates to Search and Delete new Admin")
    public void user_should_be_able_to_view_the_Products() throws InterruptedException {
        Search_User();
        Delete_User();
        verify_Record_Count_Decrease();
    }

}
