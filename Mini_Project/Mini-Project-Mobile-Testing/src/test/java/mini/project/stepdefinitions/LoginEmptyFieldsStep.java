package mini.project.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mini.project.pages.LoginScreen;
import net.thucydides.core.annotations.Steps;

public class LoginEmptyFieldsStep {
    @Steps
    LoginScreen loginScreen;

    @Given("user on the home page empty fields")
    public void onLoginPageInvalidAccount() {
        loginScreen.onHomePage();
    }

    @When("user click login link empty fields")
    public void clickLoginLinkInvalidAccount() {
        loginScreen.clickLoginLink();
    }

    @And("user click login button empty fields")
    public void clickLoginButtonInvalidAccount() {
        loginScreen.clickLoginButton();
    }

    @Then("user get error message empty fields")
    public void stayOnLoginPage() {
        loginScreen.getErrorMessage();
    }
}
