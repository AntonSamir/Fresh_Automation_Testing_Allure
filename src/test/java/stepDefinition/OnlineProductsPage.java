package stepDefinition;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.OnlineProductsPage.click_offer;
import static pages.OnlineProductsPage.frist_offer;

public class OnlineProductsPage {

    @When("User clicks on Offer")
    public void user_clicks_on_Formal_Shoes_drop_down() throws InterruptedException {
        click_offer();
    }
    @Then("User should be able to view the Products")
    public void user_should_be_able_to_view_the_Products() {
        frist_offer();
    }

}
