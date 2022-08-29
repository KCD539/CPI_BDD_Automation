package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.CPI_FindTraining;
import pages.CPI_HomePage;
import utils.ActionsUtil;
import utils.Driver;
import static steps.Hooks.*;

public class CPI_Steps {

    @Then("user clicks on {string} link")
    public void user_clicks_on(String link) {
        switch (link) {
            case "FIND TRAINING":

                cpi_homePage.findTrainingLink.click();
                break;
            case "APPLY FILTERS":

                cpi_findTraining.applyFilters.click();
                break;
            default:
                System.out.println("Link text is not properly defined in the feature file!!!");
        }
    }

    @Then("under {string} user selects {string} in checkbox")
    public void under_user_selects_in_checkbox(String title, String fieldCheckBox) {
        WebElement element = driver.findElement(By.xpath("//h4[contains(text(),'"+ title +"')]"));
        ActionsUtil.moveToElement(element);
        switch (fieldCheckBox) {
            case "Become a Certified Instructor":
               cpi_findTraining.becomeACretifiedInstructor.click();
                break;
            case "Classroom Culture":
                cpi_findTraining.classroomCulture.click();
                break;
            default:
                System.out.println("Link text is not properly defined in the feature file!!!");
        }


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
            System.out.println(CPI_HomePage.mainNavBar.get(i).getText());
            Assert.assertEquals(siteHeader.asList().get(i), CPI_HomePage.mainNavBar.get(i).getText());
        }
    }







}
