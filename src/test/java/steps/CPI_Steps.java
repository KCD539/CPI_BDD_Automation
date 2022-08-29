package steps;

import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.DropdownHandler;

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
            case "My Account":
                cpi_homePage.myAccount.click();
                break;
            case "Sign In":
                cpi_myAccountPage.signIn.click();
                break;
            default:
                System.out.println("Link text is not properly defined in the feature file!!!");
        }
    }

    @Then("under {string} user selects {string} in checkbox")
    public void under_user_selects_in_checkbox(String title, String fieldCheckBox) {
        switch (fieldCheckBox) {
            case "Become a Certified Instructor":
               cpi_findTraining.becomeACertifiedInstructor.click();
                break;
            case "Classroom Culture":
                cpi_findTraining.classroomCulture.click();
                break;
            case "English":
                cpi_findTraining.englishCheckBox.click();
                break;
            default:
                System.out.println("Link text is not properly defined in the feature file!!!");
        }


    }

    @Then("under {string} user selects {string} from dropdown")
    public void under_user_selects_from_dropdown(String title, String value){
        switch (value){
            case "Classroom Culture Training (New for 2022)":
                DropdownHandler.selectOptionByVisibleText(cpi_findTraining.programTypeDropDown, value);
                break;
            case "100 miles":
                DropdownHandler.selectOptionByVisibleText(cpi_findTraining.withinDropDown, value);
                break;
            default:
                System.out.println("The text is not defined from the dropdown!!!");
        }


    }

    @Then("under {string} user selects {string} from calendar")
    public void under_user_selects_and_from_calendar(String title, String dateRange){
        WebElement element = driver.findElement(By.xpath("//h4[contains(text(),'"+ title +"')]"));
        cpi_findTraining.fieldDatePicker.sendKeys(dateRange);
        element.click();

    }

    @Then("under {string} user types {string} in input box")
    public void under_user_types_in_input_box(String title, String field) {
        switch (title){
            case "EMAIL":
                cpi_myAccountPage.emailInput.sendKeys(field);
                break;
            case "PASSWORD":
                cpi_myAccountPage.passwordInput.sendKeys(field);;
                break;
            case "Location":
                cpi_findTraining.locationInputBox.sendKeys(field);
                break;
            default:
                System.out.println("The field is not defined !!!");
        }
    }

    @Then("user should see Main Menu navigation items")
    public void user_should_see_Main_menu_navigation_items(DataTable siteHeader) {
        for(int i = 0; i < siteHeader.asList().size(); i++){
                Assert.assertEquals(siteHeader.asList().get(i), cpi_homePage.mainNavBar.get(i).getText());
        }
    }


    @Then("user should see alert {string} message")
    public void userShouldSeeAlertMessage(String message) {
        Assert.assertEquals(message, cpi_myAccountPage.alertMessage.getText());
    }
}
