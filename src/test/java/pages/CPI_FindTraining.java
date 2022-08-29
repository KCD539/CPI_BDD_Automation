package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CPI_FindTraining {

    public CPI_FindTraining(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "")
    public WebElement applyFilters;

    @FindBy(id = "field-seat-type-1")
    public WebElement becomeACretifiedInstructor;

    @FindBy(id = "field-specialty-22")
    public WebElement classroomCulture;

    @FindBy(id = "")
    public List<WebElement> CPITrainingProgramsCheckBoxes;

    @FindBy(id = "")
    public WebElement newElementHere;







}
