package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class HomeScreen extends BasePageObject {
    private By viewUser() {
        return MobileBy.xpath("//android.support.v7.widget.LinearLayoutCompat[@index='0']");
    }

    @Step
    public void onHomePage() {
        waitUntilVisible(viewUser()).isDisplayed();
    }
}
