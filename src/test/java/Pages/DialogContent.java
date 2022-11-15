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

    @FindBy(css = "ul[class='ac-gf-directory-column-section-list'] [data-analytics-title='apple music']")
    private WebElement altBilgiMenuAppleMusic;

    @FindBy(css = "ul[class='ac-gf-directory-column-section-list'] [data-analytics-title='apple arcade']")
    private WebElement altBilgiMenuAppleArcade;

    @FindBy(css = "ul[class='ac-gf-directory-column-section-list'] [data-analytics-title='icloud']")
    private WebElement altBilgiMenuICloud;

    @FindBy(css = "ul[class='ac-gf-directory-column-section-list'] [data-analytics-title='apple books']")
    private WebElement altBilgiMenuAppleBooks;

    @FindBy(css = "ul[class='ac-gf-directory-column-section-list'] [data-analytics-title='apple podcasts']")
    private WebElement altBilgiMenuApplePodcasts;

    @FindBy(css = "ul[class='ac-gf-directory-column-section-list'] [data-analytics-title='app store']")
    private WebElement altBilgiMenuAppleStore;

    @FindBy(css = "ul[class='ac-gf-directory-column-section-list'] [data-analytics-title='accessibility']")
    private WebElement altBilgiMenuAccessibility;

    @FindBy(css = "ul[class='ac-gf-directory-column-section-list'] [data-analytics-title='environment']")
    private WebElement altBilgiMenuEnvironment;

    @FindBy(css = "ul[class='ac-gf-directory-column-section-list'] [data-analytics-title='privacy']")
    private WebElement altBilgiMenuPrivacy;

    @FindBy(css = "ul[class='ac-gf-directory-column-section-list'] [data-analytics-title='supplier responsibility']")
    private WebElement altBilgiMenuSupplierResponsibility;

    @FindBy(css = "ul[class='ac-gf-directory-column-section-list'] [data-analytics-title='newsroom']")
    private WebElement altBilgiMenuNewsroom;

    @FindBy(css = "ul[class='ac-gf-directory-column-section-list'] [data-analytics-title='apple leadership']")
    private WebElement altBilgiMenuAppleLeadership;

    @FindBy(css = "ul[class='ac-gf-directory-column-section-list'] [data-analytics-title='career opportunities']")
    private WebElement altBilgiMenuCareerOpportunities;

    @FindBy(css = "ul[class='ac-gf-directory-column-section-list'] [data-analytics-title='warranty']")
    private WebElement altBilgiMenuWarranty;

    @FindBy(css = "ul[class='ac-gf-directory-column-section-list'] [data-analytics-title='ethics and compliance']")
    private WebElement altBilgiMenuEthicsAndCompliance;

    @FindBy(css = "ul[class='ac-gf-directory-column-section-list'] [data-analytics-title='events']")
    private WebElement altBilgiMenuEvents;

    @FindBy(css = "ul[class='ac-gf-directory-column-section-list'] [data-analytics-title='contact apple']")
    private WebElement altBilgiMenuContactApple;



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
            case "altBilgiMenuAppleMusic": myElement = altBilgiMenuAppleMusic; break;
            case "altBilgiMenuAppleArcade": myElement = altBilgiMenuAppleArcade; break;
            case "altBilgiMenuICloud": myElement = altBilgiMenuICloud; break;
            case "altBilgiMenuAppleBooks": myElement = altBilgiMenuAppleBooks; break;
            case "altBilgiMenuApplePodcasts": myElement = altBilgiMenuApplePodcasts; break;
            case "altBilgiMenuAppleStore": myElement = altBilgiMenuAppleStore; break;
            case "altBilgiMenuAccessibility": myElement = altBilgiMenuAccessibility; break;
            case "altBilgiMenuEnvironment": myElement = altBilgiMenuEnvironment; break;
            case "altBilgiMenuPrivacy": myElement = altBilgiMenuPrivacy; break;
            case "altBilgiMenuSupplierResponsibility": myElement = altBilgiMenuSupplierResponsibility; break;
            case "altBilgiMenuNewsroom": myElement = altBilgiMenuNewsroom; break;
            case "altBilgiMenuAppleLeadership": myElement = altBilgiMenuAppleLeadership; break;
            case "altBilgiMenuCareerOpportunities": myElement = altBilgiMenuCareerOpportunities; break;
            case "altBilgiMenuWarranty": myElement = altBilgiMenuWarranty; break;
            case "altBilgiMenuEthicsAndCompliance": myElement = altBilgiMenuEthicsAndCompliance; break;
            case "altBilgiMenuEvents": myElement = altBilgiMenuEvents; break;
            case "altBilgiMenuContactApple": myElement = altBilgiMenuContactApple; break;

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
