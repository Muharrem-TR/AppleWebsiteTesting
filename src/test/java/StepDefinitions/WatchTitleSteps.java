package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class WatchTitleSteps {
    DialogContent dc=new DialogContent();
    @And("Click function control")
    public void clickFunctionControl(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++)
            dc.findAndClick(listElement.get(i));


    }
    String homePage;
    @And("Verification function check")
    public void verificationFunctionCheck(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++)
            dc.findAndContainsText(listElement.get(i).get(0), listElement.get(i).get(1));

    }

}
