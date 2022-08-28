package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import pages.CPI_FindTraining;
import pages.CPI_HomePage;
import utils.Driver;

public class CPI_Steps {

    WebDriver driver;

    CPI_HomePage cpi_HomePage;
    CPI_FindTraining cpi_findTraining;

    @Before
    public void setup(){
        driver = Driver.getDriver();
        cpi_HomePage = new CPI_HomePage();
        cpi_findTraining = new CPI_FindTraining();

    }

    @When("user clicks on {string} link")
    public void user_clicks_on (String key) {
        cpi_HomePage.findTrainingLink.click();
        cpi_findTraining.applyFilters.click();
    }

    @Then("user should be navigated to {string}")
    public void user_should_be_navigated_to(String url) {
        driver.get(url);
    }

    @Then("under {string} user selects {string} in checkbox")
    public void under_user_selects_in_checkbox(String title, String fieldCheckBox){
        // Write code here
    }

    @Then("under {string} user selects {string} from dropdown")
    public void under_user_selects_from_dropdown(String title, String value){
        // Write code here
        //should it be value or field as name?
    }

    @Then("under {string} user selects {string} and {string} from calendar")
    public void under_user_selects_and_from_calendar(String title, String startDate, String endDate){
        // Write code here
    }

    @Then("under {string} user types {string} in input box")
    public void under_user_types_in_input_box(String title, String field) {
        // Write code here
    }

    @Then("user should see Main Menu navigation items")
    public void user_should_see_Main_menu_navigation_items(DataTable siteHeader) {
        for(int i = 0; i < siteHeader.asList().size(); i++){
            Assert.assertEquals(siteHeader.asList().get(i), CPI_HomePage.mainNavBar.get(i).getText());
        }
    }







}
