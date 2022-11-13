package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "a[id='ac-gn-firstfocus']")
    private WebElement anaSayfa;

    @FindBy(css = "ul[class='ac-gf-directory-column-section-list'] [data-analytics-title='store']")
    private WebElement altBilgiMenuStore;

    @FindBy(css = "ul[class='ac-gf-directory-column-section-list'] [data-analytics-title='mac']")
    private WebElement altBilgiMenuMac;

    @FindBy(css = "ul[class='ac-gf-directory-column-section-list'] [data-analytics-title='ipad']")
    private WebElement altBilgiMenuIpad;

    @FindBy(css = "ul[class='ac-gf-directory-column-section-list'] [data-analytics-title='iphone']")
    private WebElement altBilgiMenuIphone;

    @FindBy(css = "ul[class='ac-gf-directory-column-section-list'] [data-analytics-title='watch']")
    private WebElement altBilgiMenuWatch;

    @FindBy(css = "ul[class='ac-gf-directory-column-section-list'] [data-analytics-title='airpods']")
    private WebElement altBilgiMenuAirpods;

    @FindBy(css = "ul[class='ac-gf-directory-column-section-list'] [data-analytics-title='tv and home']")
    private WebElement altBilgiMenuTvandHome;

    @FindBy(css = "ul[class='ac-gf-directory-column-section-list'] [data-analytics-title='airtag']")
    private WebElement altBilgiMenuAirtag;

    @FindBy(css = "ul[class='ac-gf-directory-column-section-list'] [data-analytics-title='accessories']")
    private WebElement altBilgiMenuAccessories;



    WebElement myElement;

    public void findAndSend(String strElement, String value) {

        switch (strElement) {
            //case "eMail": myElement = eMail; break;

        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {

        switch (strElement) {
            case "anaSayfa": myElement = anaSayfa; break;
            case "altBilgiMenuStore": myElement = altBilgiMenuStore; break;
            case "altBilgiMenuMac": myElement = altBilgiMenuMac; break;
            case "altBilgiMenuIpad": myElement = altBilgiMenuIpad; break;
            case "altBilgiMenuIphone": myElement = altBilgiMenuIphone; break;
            case "altBilgiMenuWatch": myElement = altBilgiMenuWatch; break;
            case "altBilgiMenuAirpods": myElement = altBilgiMenuAirpods; break;
            case "altBilgiMenuTvandHome": myElement = altBilgiMenuTvandHome; break;
            case "altBilgiMenuAirtag": myElement = altBilgiMenuAirtag; break;
            case "altBilgiMenuAccessories": myElement = altBilgiMenuAccessories; break;

        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {

        switch (strElement) {
            //case "eMail": myElement = eMail; break;

        }
        verifyContainsText(myElement, text);
    }

    public void actionAndClick (String strElement){
        switch (strElement){
            //case "ssss":myElement=sss;break;

        }
        actionFunction(myElement);
    }

    public WebElement getMyElement(String strElement) {
        switch (strElement){
            //case "garantiDahaFazlaBtn":myElement=garantiDahaFazlaBtn;break;

        }
        return myElement;
    }

}
