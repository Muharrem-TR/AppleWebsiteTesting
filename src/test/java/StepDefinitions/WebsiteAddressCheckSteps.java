package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class WebsiteAddressCheckSteps {

    DialogContent dc=new DialogContent();

    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));

    String passGec="pass";

    @Given("URL control of the links under the heading of {string}")
    public void urlControlOfTheLinksUnderTheHeadingOf(String ShoppingAndDetailedInformation) {

        if (passGec.equals(ShoppingAndDetailedInformation)){
            passGec="passGecildi";
        }else {
            dc.findAndClick(ShoppingAndDetailedInformation);
        }
    }

    @Given("URL control of the links under the {string} heading")
    public void urlControlOfTheLinksUnderTheHeading(String Services) {

        if (passGec.equals(Services)){
            passGec="passGecildi";
        }else {
            dc.findAndClick(Services);
        }
    }

    @When("Check the url of the menus under Shopping and Detailed Information")
    public void checkTheUrlOfTheMenusUnderShoppingAndDetailedInformation() {

        if (passGec.equals("passGecildi")){
            passGec="pass";
        }else {

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
    }

    @When("Check the url of the menus under services")
    public void checkTheUrlOfTheMenusUnderServices() {

        if (passGec.equals("passGecildi")){
            passGec="pass";
        }else {

            String[] urller={"apple-music","apple-arcade","icloud","apple-books","apple-podcasts","app-store"};

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
    }

    @Given("URL checking of links under {string}")
    public void urlCheckingOfLinksUnder(String AppleValues) {

        if (passGec.equals(AppleValues)){
            passGec="passGecildi";
        }else {
            dc.findAndClick(AppleValues);
        }
    }

    @When("Check the url of the menus under Apple's Values")
    public void checkTheUrlOfTheMenusUnderAppleSValues() {

        if (passGec.equals("passGecildi")){
            passGec="pass";
        }else {

            String[] urller={"accessibility","environment","privacy","supplier-responsibility"};

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
    }

    @Given("URL check of links under {string}")
    public void urlCheckOfLinksUnder(String AboutApple) {

        if (passGec.equals(AboutApple)){
            passGec="passGecildi";
        }else {
            dc.findAndClick(AboutApple);
        }
    }

    @When("Check the url of the menus under About Apple")
    public void checkTheUrlOfTheMenusUnderAboutApple() {

        if (passGec.equals("passGecildi")){
            passGec="pass";
        }else {

            String[] urller={"newsroom","leadership","careers","warranty","compliance","apple-events","contact"};

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
    }

//    @Given("Click store from the Apple Footer menu")
//    public void clickStoreFromTheAppleFooterMenu() {
//        dc.findAndClick("altBilgiMenuStore");
//    }
//
//    @Given("Click Mac from the Apple Footer menu")
//    public void clickMacFromTheAppleFooterMenu() {
//        dc.findAndClick("altBilgiMenuMac");
//    }
//
//    @Given("Click Ipad from the Apple Footer menu")
//    public void clickIpadFromTheAppleFooterMenu() {
//        dc.findAndClick("altBilgiMenuIpad");
//    }
//
//    @Given("Click Iphone from the Apple Footer menu")
//    public void clickIphoneFromTheAppleFooterMenu() {
//        dc.findAndClick("altBilgiMenuIphone");
//    }
//
//    @Given("Click watch from the Apple Footer menu")
//    public void clickWatchFromTheAppleFooterMenu() {
//        dc.findAndClick("altBilgiMenuWatch");
//    }
//
//    @Given("Click airpods from the Apple Footer menu")
//    public void clickAirpodsFromTheAppleFooterMenu() {
//        dc.findAndClick("altBilgiMenuAirpods");
//    }
//
//    @Given("Click tv and home from the Apple Footer menu")
//    public void clickTvAndHomeFromTheAppleFooterMenu() {
//        dc.findAndClick("altBilgiMenuTvandHome");
//    }
//
//    @Given("Click airtag from the Apple Footer menu")
//    public void clickAirtagFromTheAppleFooterMenu() {
//        dc.findAndClick("altBilgiMenuAirtag");
//    }
//
//    @Given("Click accessories from the Apple Footer menu")
//    public void clickAccessoriesFromTheAppleFooterMenu() {
//        dc.findAndClick("altBilgiMenuAccessories");
//    }
//
//    @Given("Click apple music from the Apple Footer menu")
//    public void clickAppleMusicFromTheAppleFooterMenu() {
//        dc.findAndClick("altBilgiMenuAppleMusic");
//    }
//
//    @Given("Click apple arcade from the Apple Footer menu")
//    public void clickAppleArcadeFromTheAppleFooterMenu() {
//        dc.findAndClick("altBilgiMenuAppleArcade");
//    }
//
//    @Given("Click iCloud from the Apple Footer menu")
//    public void clickICloudFromTheAppleFooterMenu() {
//        dc.findAndClick("altBilgiMenuiCloud");
//    }
//
//    @Given("Click apple books from the Apple Footer menu")
//    public void clickAppleBooksFromTheAppleFooterMenu() {
//        dc.findAndClick("altBilgiMenuAppleBooks");
//    }
//
//    @Given("Click apple podcasts from the Apple Footer menu")
//    public void clickApplePodcastsFromTheAppleFooterMenu() {
//        dc.findAndClick("altBilgiMenuApplePodcasts");
//    }
//
//    @Given("Click app store from the Apple Footer menu")
//    public void clickAppStoreFromTheAppleFooterMenu() {
//        dc.findAndClick("altBilgiMenuAppleStore");
//    }

}