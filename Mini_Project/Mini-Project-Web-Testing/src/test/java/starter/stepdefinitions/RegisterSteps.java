package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;
import starter.pages.RegisterPage;

public class RegisterSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    RegisterPage registerPage;

    @Given("I am on the login page to register")
    public void onLoginPageToRegister() {
        loginPage.openPage();
    }

    @When("I click register")
    public void clickRegister() {
        loginPage.clickRegisterLink();
    }

    @And("I input name on name field")
    public void inputNameOnNameField() {
        registerPage.inputNameField();
    }

    @And("I input email on email field")
    public void inputEmailOnEmailField() {
        registerPage.inputEmailField();
    }

    @And("I input password on password field")
    public void inputPasswordOnPasswordField() {
        registerPage.inputPasswordField();
    }

    @And("I click register button")
    public void clickRegisterButton() {
        registerPage.clickRegisterButton();
    }

    @Then("I am back to login page")
    public void successCreateAccount() {
        loginPage.validateOnLoginPage();
    }
}
