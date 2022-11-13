package Pages;

import Utilities.GWD;
import junit.framework.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Parent {

    public void sendKeysFunction(WebElement element, String value) {
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(value);
    }

    public void waitUntilVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element) {
//        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
//        js.executeScript("arguments[0].scrollIntoView();", element);

        //--------------------------------------------------------------------------------------------------------------

        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();

        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/2));";

        js.executeScript(scrollElementIntoMiddle, element);

//WebElement element = driver.findElement(By.xxx("xxxx"));

//String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
//                                            + "var elementTop = arguments[0].getBoundingClientRect().top;"
//                                            + "window.scrollBy(0, elementTop-(viewPortHeight/2));";

//((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, element);

//    String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
//            + "var elementTop = arguments[0].getBoundingClientRect().top;"
//            + "window.scrollBy(0, elementTop-(viewPortHeight/2));";

//        js.executeScript(scrollElementIntoMiddle, element);
    }

    public void clickFunction(WebElement element){
        scrollToElement(element);
        waitUntilClickable(element);
        element.click();
    }

    public void waitUntilClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void verifyContainsText(WebElement element, String text) {
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));
    }

    public List<WebElement> waitVisibleListAllElement(List<WebElement> elementList) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfAllElements(elementList));
        return elementList;
    }

    public void actionFunction(WebElement element){
        Actions actions=new Actions(GWD.getDriver());
        Action action=actions.moveToElement(element).click().build();
        action.perform();
    }

}
