package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.CPI_HomePage;
import utils.Driver;

public class BaseSteps {

    WebDriver driver;
    @Before
    public void setup(){
        driver = Driver.getDriver();
    }

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
        Assert.assertEquals(title, driver.getTitle());

    }












}