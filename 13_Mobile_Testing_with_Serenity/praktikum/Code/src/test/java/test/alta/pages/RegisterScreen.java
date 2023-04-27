package test.alta.pages;

import com.github.javafaker.Faker;
import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class RegisterScreen extends BasePageObject {
    public String name = createRandomName();

    public String password = "password";
    private By registerLink() {
        return MobileBy.id("textViewLinkRegister");
    }

    private By nameField() {
        return MobileBy.id("textInputEditTextName");
    }

    private By emailField() {
        return MobileBy.id("textInputEditTextEmail");
    }

    private By passwordField() {
        return MobileBy.id("textInputEditTextPassword");
    }

    private By confirmPasswordField() {
        return MobileBy.id("textInputEditTextConfirmPassword");
    }

    private By registerButton() {
        return MobileBy.id("appCompatButtonRegister");
    }

    private By snackbarMessage() {
        return MobileBy.id("snackbar_text");
    }

    private By snackbarEmailMessage() {
        return MobileBy.id("snackbar_text");
    }

    private By textView() {
        return MobileBy.xpath("//android.widget.TextView[@index='0']");
    }

    @Step
    public void clickRegisterLink() {
        onClick(registerLink());
    }

    @Step
    public void inputNameField() {
        Faker faker = new Faker();
        name = faker.name().firstName();
        onType(nameField(), name);
    }

    @Step
    public void inputEmailField() {
        onType(emailField(), name + "@gmail.com");
    }

    @Step
    public void usedEmailField() {
        onType(emailField(), "rifki@gmail.com");
    }

    @Step
    public void inputPasswordField() {
        onType(passwordField(), password);
    }

    @Step
    public void confirmPassword() {
        onType(confirmPasswordField(), password);
    }

    @Step
    public void invalidConfirmPassword() {
        onType(confirmPasswordField(), "123");
    }

    @Step
    public void clickRegisterButton() {
        onClick(registerButton());
    }

    @Step
    public String getSnackbarMessage() {
        return waitUntilVisible(snackbarMessage()).getText();
    }

    @Step
    public String getEmailSnackbarMessage() {
        return waitUntilVisible(snackbarEmailMessage()).getText();
    }

    @Step
    public void textViewAppear() {
        waitUntilVisible(textView()).isDisplayed();
    }

    public String createRandomName() {
        Faker faker = new Faker();
        return faker.name().firstName();
    }
}
