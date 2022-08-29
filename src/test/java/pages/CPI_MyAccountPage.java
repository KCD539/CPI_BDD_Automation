package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CPI_MyAccountPage {

    public CPI_MyAccountPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='field-email']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@id='field-password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[contains(., 'Sign In')]")
    public WebElement signIn;

    @FindBy(xpath = "//span[contains(., 'Invalid email and/or password combination.')]")
    public WebElement alertMessage;

}
