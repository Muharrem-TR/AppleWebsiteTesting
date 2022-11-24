package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MacComparison {

    DialogContent dc=new DialogContent();

    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));

    @When("Click on the Mac Header and comparing")
    public void clickOnTheMacHeaderAndComparing() {
        dc.findAndClick("macHeader");
        dc.findAndClick("comparing");
    }

    @And("Select three Mac models through the selectors")
    public void SelectThreeMacModelsThroughTheSelectors() {
        dc.findAndSelect("leftSelector","MacBook Air (M1, 2020)");
        dc.findAndSelect("middleSelector","MacBook Air (M2, 2022)");
        dc.findAndSelect("rightSelector","13 inç MacBook Pro (M2, 2022)");



    }
}
