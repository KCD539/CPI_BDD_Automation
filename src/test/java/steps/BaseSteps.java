package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import static steps.Hooks.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import utils.Waiter;

public class BaseSteps {
    /**
     Reusable steps
     * Home page URL
     * Clicks link on home page
     * Post click URL

     */

    @Given("user navigates to {string}")
    public void user_navigates_to(String homePageUrl) {
        driver.get(homePageUrl);
    }

    @Then("user should see the title {string}")
    public void element_visible(String title){
        Waiter.waitUntilTitleIs(driver, 5, title);
        Assert.assertEquals(title, driver.getTitle());

    }

}