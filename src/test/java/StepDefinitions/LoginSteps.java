package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginSteps {

    DialogContent dc=new DialogContent();

    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));

    @Given("Go to Apple website \\(Turkey)")
    public void goToAppleWebsiteTurkey() {
        GWD.getDriver().get("https://www.apple.com/tr/");
        GWD.getDriver().manage().window().maximize();
    }

    @Then("Verify that you are on the right site")
    public void verifyThatYouAreOnTheRightSite() {
        wait.until(ExpectedConditions.urlContains("apple"));
        String siteURL= GWD.getDriver().getCurrentUrl();
        Assert.assertTrue(siteURL.contains("www.apple.com/tr/"));
    }

}
