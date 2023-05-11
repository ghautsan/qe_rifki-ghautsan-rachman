package mini.project.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mini.project.pages.LoginScreen;
import net.thucydides.core.annotations.Steps;

public class LoginInvalidAccountStep {
    @Steps
    LoginScreen loginScreen;

    @Given("invalid user on the home page")
    public void onLoginPageInvalidAccount() {
        loginScreen.onHomePage();
    }

    @When("invalid user click login link")
    public void clickLoginLinkInvalidAccount() {
        loginScreen.clickLoginLink();
    }

    @When("invalid user input {string} on email field")
    public void inputEmailInvalidAccount(String email) {
        loginScreen.inputEmailField(email);
    }

    @And("invalid user input {string} on password field")
    public void inputPasswordInvalidAccount(String password) {
        loginScreen.inputPasswordField(password);
    }

    @And("invalid user click login button")
    public void clickLoginButtonInvalidAccount() {
        loginScreen.clickLoginButton();
    }

    @Then("user get error message")
    public void stayOnLoginPage() {
        loginScreen.getSnackbarMessage();
    }
}
