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


    @FindBy(id = "field-seat-type-1")
    public WebElement becomeACertifiedInstructor;

    @FindBy(id = "field-specialty-22")
    public WebElement classroomCulture;

    @FindBy(id = "field-program-type")
    public WebElement programTypeDropDown;

    @FindBy(id = "field-date-range")
    public WebElement fieldDatePicker;

    @FindBy(id = "field-city-or-zip-code")
    public WebElement locationInputBox;

    @FindBy(id = "field-within")
    public WebElement withinDropDown;

    @FindBy(id = "field-language-English")
    public WebElement englishCheckBox;

    @FindBy(xpath = "//button[@class='apply-filters-button']")
    public WebElement applyFilters;









}
