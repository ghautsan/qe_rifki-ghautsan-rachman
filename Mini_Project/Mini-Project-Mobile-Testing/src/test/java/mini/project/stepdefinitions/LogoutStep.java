package mini.project.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mini.project.pages.LoginScreen;
import net.thucydides.core.annotations.Steps;

public class LogoutStep {
    @Steps
    LoginScreen loginScreen;

    @Given("valid user on the home page logout")
    public void onLoginPageLogout() {
        loginScreen.onHomePage();
    }

    @When("valid user click login link logout")
    public void clickLoginLinkLogout() {
        loginScreen.clickLoginLink();
    }

    @When("valid user input {string} on email field logout")
    public void inputEmailLogout(String email) {
        loginScreen.inputEmailField(email);
    }

    @And("valid user input {string} on password field logout")
    public void inputPasswordLogout(String password) {
        loginScreen.inputPasswordField(password);
    }

    @And("valid user click login button logout")
    public void clickLoginButtonLogout() {
        loginScreen.clickLoginButton();
    }

    @And("valid user on the home page after login")
    public void validateOnTheHomePage() {
        loginScreen.onHomePage();
    }

    @Then("valid user click logout button")
    public void clickLogoutButton() {
        loginScreen.clickLoginLink();
    }
}
