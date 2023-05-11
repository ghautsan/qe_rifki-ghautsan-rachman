package mini.project.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mini.project.pages.RegisterScreen;
import net.thucydides.core.annotations.Steps;

public class RegisterFailedStep {
    @Steps
    RegisterScreen registerScreen;

    @Given("user on the home page")
    public void onTheHomePage() {
        registerScreen.onHomePage();
    }

    @When("user click login link")
    public void clickLoginLink() {
        registerScreen.clickOnLogin();
    }

    @And("user click register link")
    public void clickRegisterLink() {
        registerScreen.clickRegister();
    }

    @And("user input full name on fullname field")
    public void inputNameField() {
    }

    @And("user input email on email field")
    public void inputEmailField() {
    }

    @And("user input password on password field")
    public void inputPasswordField() {
    }

    @And("user click register button")
    public void clickRegisterButton() {
        registerScreen.clickRegisterButton();
    }

    @Then("user see error message")
    public void goToHomePage() {
        registerScreen.getErrorMessage();
    }
}
