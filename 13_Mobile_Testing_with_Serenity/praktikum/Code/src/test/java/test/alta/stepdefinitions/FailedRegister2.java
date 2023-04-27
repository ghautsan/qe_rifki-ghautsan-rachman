package test.alta.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.alta.pages.LoginScreen;
import test.alta.pages.RegisterScreen;

public class FailedRegister2 {

    @Steps
    LoginScreen loginScreen;

    @Steps
    RegisterScreen registerScreen;

    @Given("new user on the loginpage to register")
    public void onTheLoginPage() {
        loginScreen.isOnLoginPage();
    }

    @When("new user tap register link")
    public void clickRegisterLink() {
        registerScreen.clickRegisterLink();
    }

    @And("new user input name on name field to register")
    public void inputNameField() {
        registerScreen.inputNameField();
    }

    @And("new user input used email to register")
    public void inputEmailField() {
        registerScreen.usedEmailField();
    }

    @And("new user input password to register")
    public void inputPasswordField() {
        registerScreen.inputPasswordField();
    }

    @And("new user input confirm password to register")
    public void confirmPassword() {
        registerScreen.confirmPassword();
    }

    @And("new user click register to check")
    public void clickRegisterButton() {
        registerScreen.clickRegisterButton();
    }

    @Then("new user see error {string} message")
    public void errorMessage(String message) {
        Assert.assertEquals(message, registerScreen.getEmailSnackbarMessage());
    }
}
