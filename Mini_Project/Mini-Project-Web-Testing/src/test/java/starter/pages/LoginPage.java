package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By emailField() {
        return By.id("input-18");
    }

    private By passwordField() {
        return By.id("input-21");
    }

    private By loginButton() {
        return By.xpath("//span[.='Login']");
    }

    private By registerLink() {
        return By.linkText("Register");
    }

    private By errorMessage() {
        return By.xpath("//div[@class='v-alert__content']");
    }

    @Step
    public void openPage() {
        open();
    }

    @Step
    public void validateOnLoginPage() {
        $(loginButton()).isDisplayed();
    }

    @Step
    public void inputEmail(String username) {
        $(emailField()).type(username);
    }

    @Step
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton() {
        $(loginButton()).click();
    }

    @Step
    public void clickRegisterLink() {
        $(registerLink()).click();
    }

    @Step
    public void errorMessageAppear() {
        $(errorMessage()).isDisplayed();
    }
}
