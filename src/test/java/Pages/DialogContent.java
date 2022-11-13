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
