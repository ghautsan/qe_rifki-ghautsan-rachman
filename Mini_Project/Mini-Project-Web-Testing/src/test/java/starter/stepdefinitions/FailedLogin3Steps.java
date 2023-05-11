package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class FailedLogin3Steps {
    @Steps
    LoginPage loginPage;

    @Given("I am on the login page wrong password")
    public void onLoginPageWrongPassword() {
        loginPage.openPage();
    }

    @When("I input email wrong password")
    public void inputEmailWrongPassword() {
        loginPage.inputEmail("someone@mail.com");
    }

    @And("I input password wrong password")
    public void inputPasswordWrongPassword() {
        loginPage.inputPassword("1231231");
    }

    @And("I click login wrong password")
    public void clickLoginWrongPassword() {
        loginPage.clickLoginButton();
    }

    @Then("I am on the home page wrong password")
    public void onTheHomePageWrongPassword() {
        loginPage.errorMessageAppear();
    }
}
