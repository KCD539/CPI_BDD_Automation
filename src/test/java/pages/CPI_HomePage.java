package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class CPI_HomePage {
    public CPI_HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /**
    Store WebElements for the homepage here

     */

    @FindBy(id = "p_lt_WebPartZone7_ZoneA_pageplaceholder_p_lt_WebPartZone3_Section_Content_StickyBottomCTA_StickyCtaMainButtonText")
    public WebElement findTrainingLink;

    @FindBy(id = "navbarContent")
    public static List<WebElement> mainNavBar;

}
