package mini.project.pages;

import com.github.javafaker.Faker;
import io.appium.java_client.MobileBy;
import mini.project.pageobject.BasePageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class RegisterScreen extends BasePageObject {
    public String createRandomName() {
        Faker faker = new Faker();
        return faker.name().firstName();
    }

    public String name = createRandomName();

    public String password = "password";

    private By title() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Products\"]");
    }

    private By loginLink() {
        return MobileBy.xpath("//android.widget.Button[@index='1']");
    }

    private By registerLinkButton() {
        return MobileBy.AccessibilityId("Register");
    }

    private By nameField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }

    private By emailField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }

    private By passwordField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");
    }

    private By registerButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    }

    private By snackbarError() {
        return MobileBy.AccessibilityId("Gagal :(");
    }

    @Step
    public void onHomePage() {
        waitUntilVisible(title()).isDisplayed();
    }

    @Step
    public void clickOnLogin() {
        onClick(loginLink());
    }

    @Step
    public void clickRegister() {
        onClick(registerLinkButton());
    }

    @Step
    public void inputNameField() {
        Faker faker = new Faker();
        name = faker.name().firstName();
        onClick(nameField());
        onType(nameField(), name);
    }

    @Step
    public void inputEmailField() {
        onClick(emailField());
        onType(emailField(), name + "@email.com");
    }

    @Step
    public void inputPasswordField() {
        onClick(passwordField());
        onType(passwordField(), password);
    }

    @Step
    public void clickRegisterButton() {
        onClick(registerButton());
    }

    @Step
    public void getErrorMessage() {
        waitUntilVisible(snackbarError());
    }
}
