package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class FailedLogin2Steps {
    @Steps
    LoginPage loginPage;

    @Given("I am on the login page wrong email")
    public void onLoginPageWrongEmail() {
        loginPage.openPage();
    }

    @When("I input email wrong email")
    public void inputEmailWrongEmail() {
        loginPage.inputEmail("someone@email.com");
    }

    @And("I input password wrong email")
    public void inputPasswordWrongEmail() {
        loginPage.inputPassword("123123");
    }

    @And("I click login wrong email")
    public void clickLoginWrongEmail() {
        loginPage.clickLoginButton();
    }

    @Then("I am on the home page wrong email")
    public void onTheHomePageWrongEmail() {
        loginPage.errorMessageAppear();
    }
}
