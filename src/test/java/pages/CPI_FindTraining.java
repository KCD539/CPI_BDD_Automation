package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class CPI_FindTraining {

    public CPI_FindTraining(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "")
    public WebElement applyFilters;

    @FindBy(id = "")
    public List<WebElement> iWantToCheckBoxes;

    @FindBy(id = "")
    public List<WebElement> CPITrainingProgramsCheckBoxes;

    @FindBy(id = "")
    public WebElement newElementHere;







}
