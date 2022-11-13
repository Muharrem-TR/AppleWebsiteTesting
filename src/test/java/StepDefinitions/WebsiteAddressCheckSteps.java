package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WebsiteAddressCheckSteps {

    DialogContent dc=new DialogContent();

    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));

    @Given("Click store from the Apple Footer menu")
    public void clickStoreFromTheAppleFooterMenu() {
        dc.findAndClick("altBilgiMenuStore");
    }

    @When("Check the url of the menus under Shopping and Detailed Information")
    public void checkTheUrlOfTheMenusUnderShoppingAndDetailedInformation() {
        String[] urller={"store","mac","ipad","iphone","watch","airpods","tv-home","airtag","accessories"};

        wait.until(ExpectedConditions.urlContains("apple"));
        String siteURL= GWD.getDriver().getCurrentUrl();

        int yanlis=0; int donguSayisi=0;
        for (int i = 0; i < urller.length; i++) {
            donguSayisi++;
            if (siteURL.contains(urller[i])){
                break;
            }else {
                yanlis++;
            }
        }
        Assert.assertTrue("Hata: Site doğrulanamadı. Eşleşen URL yok.",!(donguSayisi==yanlis));
        dc.findAndClick("anaSayfa");
    }

    @Given("Click Mac from the Apple Footer menu")
    public void clickMacFromTheAppleFooterMenu() {
        dc.findAndClick("altBilgiMenuMac");
    }

    @Given("Click Ipad from the Apple Footer menu")
    public void clickIpadFromTheAppleFooterMenu() {
        dc.findAndClick("altBilgiMenuIpad");
    }

    @Given("Click Iphone from the Apple Footer menu")
    public void clickIphoneFromTheAppleFooterMenu() {
        dc.findAndClick("altBilgiMenuIphone");
    }

    @Given("Click watch from the Apple Footer menu")
    public void clickWatchFromTheAppleFooterMenu() {
        dc.findAndClick("altBilgiMenuWatch");
    }

    @Given("Click airpods from the Apple Footer menu")
    public void clickAirpodsFromTheAppleFooterMenu() {
        dc.findAndClick("altBilgiMenuAirpods");
    }

    @Given("Click tv and home from the Apple Footer menu")
    public void clickTvAndHomeFromTheAppleFooterMenu() {
        dc.findAndClick("altBilgiMenuTvandHome");
    }

    @Given("Click airtag from the Apple Footer menu")
    public void clickAirtagFromTheAppleFooterMenu() {
        dc.findAndClick("altBilgiMenuAirtag");
    }

    @Given("Click accessories from the Apple Footer menu")
    public void clickAccessoriesFromTheAppleFooterMenu() {
        dc.findAndClick("altBilgiMenuAccessories");
    }
}