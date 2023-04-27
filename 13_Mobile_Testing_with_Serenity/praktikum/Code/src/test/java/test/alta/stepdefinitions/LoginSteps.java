package test.alta.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.alta.pages.HomeScreen;
import test.alta.pages.LoginScreen;
import test.alta.pages.RegisterScreen;

public class LoginSteps {
    @Steps
    LoginScreen loginScreen;

    @Steps
    HomeScreen homeScreen;

    @Given("valid user on the login page")
    public void onLoginPage() {
        loginScreen.isOnLoginPage();
    }

    @When("valid user input {string} on email field")
    public void inputEmail(String email) {
        loginScreen.inputEmail(email);
    }

    @And("valid user input {string} on password field")
    public void inputPassword(String password) {
        loginScreen.inputPassword(password);
    }

    @And("valid user click login button")
    public void clickLoginButton() {
        loginScreen.clickLoginButton();
    }

    @Then("user see home page")
    public void seeHomePage() {
        homeScreen.onHomePage();
    }
}