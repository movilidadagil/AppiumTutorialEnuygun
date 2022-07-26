package appium.stepsdefinitions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static appium.runner.CucumberRunnerTest.getDriver;

public abstract class BaseScreen extends MobileElement {

    public BaseScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    protected void waitForInsvisibilityOfElement(By locator) {
        new WebDriverWait(getDriver(), 5)
                .until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    protected void waitForVisibilityOfElement(By locator) {

        new WebDriverWait(getDriver(), 5)
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


    public static void swipe() {
        new TouchAction(getDriver()).press(300, 1000).waitAction().moveTo(300, 50).release().perform();
    }

    public static void swipeInvert() {
        new TouchAction(getDriver()).press(300, 50).waitAction().moveTo(300, 1000).release().perform();
    }

}