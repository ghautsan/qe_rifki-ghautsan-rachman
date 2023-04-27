package test.alta.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.alta.pages.LoginScreen;
import test.alta.pages.RegisterScreen;

public class FailedRegister1 {
    @Steps
    LoginScreen loginScreen;

    @Steps
    RegisterScreen registerScreen;

    @Given("new user on the login page to register")
    public void onTheLoginPage() {
        loginScreen.isOnLoginPage();
    }

    @When("new user click register link to register")
    public void clickRegisterLink() {
        registerScreen.clickRegisterLink();
    }

    @And("new user input name")
    public void inputNameField() {
        registerScreen.inputNameField();
    }

    @And("new user input email")
    public void inputEmailField() {
        registerScreen.inputEmailField();
    }

    @And("new user input password")
    public void inputPasswordField() {
        registerScreen.inputPasswordField();
    }

    @And("new user input wrong confirm password")
    public void confirmPassword() {
        registerScreen.invalidConfirmPassword();
    }

    @And("new user click register button to check")
    public void clickRegisterButton() {
        registerScreen.clickRegisterButton();
    }

    @Then("new user see failed message")
    public void validateFailedMessage() {
        registerScreen.textViewAppear();
    }
}
