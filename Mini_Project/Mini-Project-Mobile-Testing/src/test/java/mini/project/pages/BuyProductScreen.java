package mini.project.pages;

import io.appium.java_client.MobileBy;
import mini.project.pageobject.BasePageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;


public class BuyProductScreen extends BasePageObject {
    private By title() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Products\"]");
    }

    private By loginLink() {
        return MobileBy.xpath("//android.widget.Button[@index='1']");
    }


    private By emailField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }

    private By passwordField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }

    private By loginButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    }

    private By product1() {
        return MobileBy.xpath("//android.view.View[@index='0']");
    }

    private By product2() {
        return MobileBy.xpath("//android.view.View[@index='1']");
    }

    private By product3() {
        return MobileBy.xpath("//android.view.View[@index='0']");
    }

    private By beliProduct1() {
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[1]");
    }

    private By beliProduct2() {
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[2]");
    }

    private By beliProduct3() {
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[3]");
    }

    private By cartIcon() {
        return MobileBy.AccessibilityId("3");
    }

    @Step
    public void onHomePage() {
        waitUntilVisible(title()).isDisplayed();
    }

    @Step
    public void clickLoginLink() {
        onClick(loginLink());
    }

    @Step
    public void inputEmailField(String email) {
        onClick(emailField());
        onType(emailField(), email);
    }

    @Step
    public void inputPasswordField(String password) {
        onClick(passwordField());
        onType(passwordField(), password);
    }

    @Step
    public void clickLoginButton() {
        onClick(loginButton());
    }

    @Step
    public void buyProducts() {
        waitUntilVisible(product1());
        waitUntilVisible(product2());
        waitUntilVisible(product3());
        onClick(beliProduct1());
        onClick(beliProduct2());
        onClick(beliProduct3());
    }

    @Step
    public void validateCart() {
        waitUntilPresence(cartIcon());
    }
}
