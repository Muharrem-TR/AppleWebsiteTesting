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


    @FindBy(css = "li[class='ac-gn-item ac-gn-item-menu ac-gn-mac']")
    private WebElement macHeader;
    @FindBy(css = "li[class='chapternav-item chapternav-item-compare']")
    private WebElement comparing;
    @FindBy(css = "select[id='selector-0']")
    private WebElement leftSelector;
    @FindBy(css = "select[id='selector-1']")
    private WebElement middleSelector;
    @FindBy(css = "select[id='selector-2']")
    private WebElement rightSelector;

    @FindBy(css = "a[class$='watch'][data-analytics-title='watch']")
    private WebElement watchTitle;

    @FindBy(css = "span[class='chapternav-label']")
    private List<WebElement> comparing1;

    @FindBy(xpath = "//p[text()='Macera dolu saatler.']")
    private WebElement maceraSaatlerVerify;

    @FindBy(id = "film-watch-ultra")
    private WebElement ultraFilmButton;

    @FindBy(css = "button[class='modal-close']")
    private WebElement modalCloseButton;

    @FindBy(xpath = "(//span[text()='Daha fazla bilgi'])[2]")
    private WebElement dahaFazlaLink;

    @FindBy(css = "h2[class$='hero-headline']")
    private WebElement series8Verify;

    @FindBy(css = "a[data-analytics-title='compare all models']")
    private WebElement comparingLink;

    @FindBy(css = "a[class$='compare-models']")
    private WebElement comparingModelsLink;

    @FindBy(id = "modal-header")
    private WebElement appleTitleVerify;

    @FindBy(css = "h3[class$='device-title']")
    private List<WebElement> appleModelsVerify;

    @FindBy(css = "div[class='featured-section-headline']")
    private List<WebElement> modelsFeatureVerify;
    @FindBy(id = "tabnav-item-display-series-8-41mm-trigger")
    private WebElement kasa41mmButton;

    @FindBy(id = "tabnav-item-display-se-40mm-trigger")
    private WebElement kasa40mmButton;

    @FindBy(css = "li[class='colornav-item']>button")
    private List<WebElement> colorsButton;
    @FindBy(css = "div[class='specs-headline']")
    private WebElement teknikTitleVerify;

    @FindBy(css = "button[class='accordion-header-content']")
    private List<WebElement> subTitlesButton;

    @FindBy(css = "div[class$='accordion-item-headline']")
    private WebElement SubVerify1;
    @FindBy(xpath = "(//div[@class='with-list-bullet'])[7]")
    private WebElement SubVerify2;

    @FindBy(xpath = "(//div[@class='with-list-bullet'])[17]")
    private WebElement SubVerify3;

    @FindBy(css = "span[class$='feature-label']")
    private WebElement SubVerify4;

    @FindBy(css = "div[class^='chip-series-copy accordion-item-copy feature-label']")
    private WebElement SubVerify5;
    @FindBy(css = "div[class^='connectivity-series-copy']")
    private WebElement SubVerify6;

    @FindBy(css = "div[class^='power-series-copy']")
    private WebElement SubVerify7;

    @FindBy(css = "div[class^='environmental-features-series-copy']")
    private WebElement SubVerify8;



    WebElement myElement;

    public void findAndSend(String strElement, String value) {

        switch (strElement) {
            //case "eMail": myElement = eMail; break;

        }
        sendKeysFunction(myElement, value);
    }
    int cntx=0;
    int cnty=0;
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

            case "macHeader": myElement = macHeader; break;
            case "comparing": myElement = comparing; break;

            case "watchTitle": myElement = watchTitle; break;
            case "ultraFilmButton": myElement = ultraFilmButton; break;
            case "modalCloseButton":GWD.Bekle(5);myElement = modalCloseButton; break;
            case "dahaFazlaLink":myElement = dahaFazlaLink; break;
            case "comparingLink":myElement = comparingLink; break;
            case "comparingModelsLink":myElement = comparingModelsLink; break;
            case "kasa41mmButton":myElement = kasa41mmButton; break;
            case "kasa40mmButton":myElement = kasa40mmButton; break;
            case "colorsButton":myElement = colorsButton.get(cntx++); break;
            case "subTitlesButton":myElement = subTitlesButton.get(cnty++); break;


        }
        clickFunction(myElement,"mid");
    }
    int cnt1=0;
    int cnt2=0;
    int cnt3=0;
    public void findAndContainsText(String strElement, String text) {

        switch (strElement) {
            //case "eMail": myElement = eMail; break;
            case "comparing1":System.out.println("Verification passed: "+comparing1.get(cnt1).getText());
                myElement = comparing1.get(cnt1++); break;
            case "maceraSaatlerVerify": myElement = maceraSaatlerVerify; break;
            case "series8Verify": myElement = series8Verify; break;
            case "appleTitleVerify": myElement = appleTitleVerify; break;
            case "appleModelsVerify":System.out.println("Verification passed: "+appleModelsVerify.get(cnt2).getText());
                myElement = appleModelsVerify.get(cnt2++);break;
            case "modelsFeatureVerify":System.out.println("Verification passed: "+modelsFeatureVerify.get(cnt3).getText());
                myElement = modelsFeatureVerify.get(cnt3++);break;
            case "teknikTitleVerify":myElement = teknikTitleVerify;break;
            case "SubVerify1":myElement = SubVerify1;break;
            case "SubVerify2":myElement = SubVerify2;break;
            case "SubVerify3":myElement = SubVerify3;break;
            case "SubVerify4":myElement = SubVerify4;break;
            case "SubVerify5":myElement = SubVerify5;break;
            case "SubVerify6":myElement = SubVerify6;break;
            case "SubVerify7":myElement = SubVerify7;break;
            case "SubVerify8":myElement = SubVerify8;break;
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

    public void specialFindAndClick(String strElement, double scrollingPrecision) {

        // Gerektiğinde nokta atışı hedefe gitmesi için
        //case "anaSayfa": myElement = anaSayfa; break;
        // dc.specialFindAndClick("anaSayfa",virgülKoyupDoubleBirDeğerGitin)  //dc.specialFindAndClick("anaSayfa",1.3)

        switch (strElement) {
            //case "anaSayfa": myElement = anaSayfa; break;

        }
        clickFunction(myElement,scrollingPrecision);
    }

    public void findAndSelect(String strElement, String text) {
        switch (strElement) {
            case "leftSelector": myElement = leftSelector;break;
            case "middleSelector": myElement = middleSelector;break;
            case "rightSelector": myElement = rightSelector;break;
        }
        selectFunction(myElement,text);
    }
}
