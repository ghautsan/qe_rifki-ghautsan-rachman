package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class FailedLogin4Steps {
    @Steps
    LoginPage loginPage;

    @Given("I am on the login page email and password field empty")
    public void onLoginPageEmptyFields() {
        loginPage.openPage();
    }

    @When("I input email email and password field empty")
    public void inputEmailEmptyFields() {
        loginPage.inputEmail("");
    }

    @And("I input password email and password field empty")
    public void inputPasswordEmptyFields() {
        loginPage.inputPassword("");
    }

    @And("I click login email and password field empty")
    public void clickLoginEmptyFields() {
        loginPage.clickLoginButton();
    }

    @Then("I am on the home page email and password field empty")
    public void onTheHomePageEmptyFields() {
        loginPage.errorMessageAppear();
    }
}
