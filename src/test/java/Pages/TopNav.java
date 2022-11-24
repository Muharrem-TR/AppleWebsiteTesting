//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Pages;

import Utilities.GWD;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopNav extends Parent {
    @FindBy(xpath = "//ul[@class='ac-gn-list']/li[2]")
    private WebElement store;
    @FindBy(xpath = "//ul[@class='ac-gn-list']/li[3]")
    private WebElement mac;
    @FindBy(xpath = "//ul[@class='ac-gn-list']/li[4]")
    private WebElement iPad;
    @FindBy(xpath = "//ul[@class='ac-gn-list']/li[5]")
    private WebElement iPhone;
    @FindBy(xpath = "//ul[@class='ac-gn-list']/li[6]")
    private WebElement watch;
    @FindBy(xpath = "//ul[@class='ac-gn-list']/li[7]")
    private WebElement airPods;
    @FindBy(xpath = "//ul[@class='ac-gn-list']/li[8]")
    private WebElement tVveEv;
    @FindBy(xpath = "//ul[@class='ac-gn-list']/li[9]")
    private WebElement yalnizcaAppleda;
    @FindBy(xpath = "//ul[@class='ac-gn-list']/li[10]")
    private WebElement aksesuarlar;
    @FindBy(xpath = "//ul[@class='ac-gn-list']/li[11]")
    private WebElement destek;
    @FindBy(xpath = "//ul[@class='ac-gn-list']/li")
    public List<WebElement> topNavList;
    @FindBy(xpath = "//span[@class='chapternav-label']")
    public List<WebElement> topNavProductList;
    WebElement myElement;

    public TopNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "Store" : myElement = store;break;
            case "Mac": myElement = mac;break;
            case "iPad": myElement = iPad;break;
            case "iPhone": myElement = iPhone;break;
            case "Watch": myElement = watch;break;
            case "AirPods": myElement = airPods;break;
            case "TV ve Ev": myElement = tVveEv;break;
            case "Yalnızca Apple’da": myElement = yalnizcaAppleda;break;
            case "Aksesuarlar": myElement = aksesuarlar;break;
            case "Destek": myElement = destek;
        }

        clickFunction(myElement);
    }

    public String randomClick(short num) {
        switch (num) {
            case 3: myElement = mac;break;
            case 4: myElement = iPad;break;
            case 5: myElement = iPhone;break;
            case 6: myElement = watch;break;
            case 7: myElement = airPods;break;
            case 8: myElement = tVveEv;break;
            case 9: myElement = yalnizcaAppleda;break;
        }

        clickFunction(myElement);
        return myElement.getText();
    }
}
