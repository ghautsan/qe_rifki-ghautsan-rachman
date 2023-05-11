package mini.project.pages;

import io.appium.java_client.MobileBy;
import mini.project.pageobject.BasePageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginScreen extends BasePageObject {
    private By title() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Products\"]");
    }

    private By loginLink() {
        return MobileBy.xpath("//android.widget.Button[@index='1']");
    }


    private By emailField() {
        return MobileBy.xpath("//android.widget.EditText[@index='1']");
    }

    private By passwordField() {
        return MobileBy.xpath("//android.widget.EditText[@index='2']");
    }

    private By loginButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    }

    private By assertPs5() {
        return MobileBy.xpath("(//android.view.View[@content-desc=\"Sony PS5\n" + "play has no limits\n" + "Rp 299\"])[1]");
    }

    private By snackbarError() {
        return MobileBy.AccessibilityId("Email atau password tidak valid.");
    }

    private By snackbarEmail() {
        return MobileBy.AccessibilityId("email can not empty");
    }

    private By snackbarPassword() {
        return MobileBy.AccessibilityId("password can not empty");
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
    public void onHomePage() {
        waitUntilVisible(title()).isDisplayed();
    }

    @Step
    public void validateLoginPage() {
        waitUntilPresence(loginButton());
    }

    @Step
    public void validatePs5() {
        waitUntilPresence(assertPs5());
    }

    @Step
    public String getSnackbarMessage() {
        return waitUntilVisible(snackbarError()).getText();
    }

    @Step
    public String getErrorMessage() {
        waitUntilVisible(snackbarEmail()).getText();
        return waitUntilVisible(snackbarPassword()).getText();
    }
}
