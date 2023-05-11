package mini.project.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mini.project.pages.LoginScreen;
import net.thucydides.core.annotations.Steps;

public class LoginStep {
    @Steps
    LoginScreen loginScreen;

    @Given("valid user on the home page")
    public void onLoginPage() {
        loginScreen.onHomePage();
    }

    @When("valid user click login link")
    public void clickLoginLink() {
        loginScreen.clickLoginLink();
    }

    @When("valid user input {string} on email field")
    public void inputEmail(String email) {
        loginScreen.inputEmailField(email);
    }

    @And("valid user input {string} on password field")
    public void inputPassword(String password) {
        loginScreen.inputPasswordField(password);
    }

    @And("valid user click login button")
    public void clickLoginButton() {
        loginScreen.clickLoginButton();
    }

    @Then("user see home page")
    public void seeHomePage() {
        loginScreen.onHomePage();
    }
}
