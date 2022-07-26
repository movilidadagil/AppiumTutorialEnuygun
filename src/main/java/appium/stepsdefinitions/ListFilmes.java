package appium.stepsdefinitions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;

import java.util.concurrent.TimeUnit;

public class ListFilmes extends BaseScreen {

    @WithTimeout(time = 5000, unit = TimeUnit.SECONDS)
    @AndroidFindBy(id = "home_omdb")
    private MobileElement home_screen;

    @AndroidFindBy(id = "search_title")
    private MobileElement type_name;

    @AndroidFindBy(id = "search")
    private MobileElement btn_search;


    public void home() {
        this.home_screen.isDisplayed();
    }

    public void type_name() {
        this.type_name.sendKeys("spider");
    }

    public void btn_search() {
        this.btn_search.click();
    }


}
