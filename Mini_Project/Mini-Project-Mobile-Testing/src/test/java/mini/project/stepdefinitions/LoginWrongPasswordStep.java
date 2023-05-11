package mini.project.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mini.project.pages.LoginScreen;
import net.thucydides.core.annotations.Steps;

public class LoginWrongPasswordStep {
    @Steps
    LoginScreen loginScreen;

    @Given("user on the home page wrong password")
    public void onLoginPage() {
        loginScreen.onHomePage();
    }

    @When("user click login link wrong password")
    public void clickLoginLink() {
        loginScreen.clickLoginLink();
    }

    @When("user input {string} on email field wrong password")
    public void inputEmail(String email) {
        loginScreen.inputEmailField(email);
    }

    @And("user input {string} on password field wrong password")
    public void inputPassword(String password) {
        loginScreen.inputPasswordField(password);
    }

    @And("user click login button wrong password")
    public void clickLoginButton() {
        loginScreen.clickLoginButton();
    }

    @Then("user get error message wrong password")
    public void stayOnLoginPage() {
        loginScreen.getSnackbarMessage();
    }
}
