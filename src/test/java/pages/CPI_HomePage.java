package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class CPI_HomePage {

    public CPI_HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    /**
    Store WebElements for the homepage here

     */

    @FindBy(xpath = "//a[.='Find Training']")
    public WebElement findTrainingLink;

    @FindBy(id = "//ul[@class='main-nav navbar-nav mx-auto']")
    public static List<WebElement> mainNavBar;

}
