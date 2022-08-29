package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.CPI_FindTraining;
import pages.CPI_HomePage;
import pages.CPI_MyAccountPage;
import utils.Driver;

public class Hooks {

   public static WebDriver driver;
   public static CPI_HomePage cpi_homePage;
   public static CPI_FindTraining cpi_findTraining;

   public static CPI_MyAccountPage cpi_myAccountPage;
    @Before
    public void setup(){
        driver = Driver.getDriver();
        cpi_homePage = new CPI_HomePage(driver);
        cpi_findTraining = new CPI_FindTraining(driver);
        cpi_myAccountPage = new CPI_MyAccountPage(driver);
    }
    @After
    public void teardown(Scenario scenario){
        System.out.println("Scenario = " + scenario.getName() + "\nStatus = " +  scenario.getStatus());
        try{
            if(scenario.isFailed()){
                byte[] screenshot = ((TakesScreenshot)Driver.getDriver())
                        .getScreenshotAs(OutputType.BYTES);

                scenario.embed(screenshot, "image/png");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            Driver.quitDriver();
        }
    }
}