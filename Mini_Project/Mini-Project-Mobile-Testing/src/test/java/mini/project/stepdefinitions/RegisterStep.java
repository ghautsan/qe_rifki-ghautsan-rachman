package mini.project.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mini.project.pages.RegisterScreen;
import net.thucydides.core.annotations.Steps;

public class RegisterStep {
    @Steps
    RegisterScreen registerScreen;


    @Given("new user on the home page")
    public void onTheHomePage() {
        registerScreen.onHomePage();
    }

    @When("new user click login link")
    public void clickLoginLink() {
        registerScreen.clickOnLogin();
    }

    @And("new user click register link")
    public void clickRegisterLink() {
        registerScreen.clickRegister();
    }

    @And("new user input full name on fullname field")
    public void inputNameField() {
        registerScreen.inputNameField();
    }

    @And("new user input email on email field")
    public void inputEmailField() {
        registerScreen.inputEmailField();
    }

    @And("new user input password on password field")
    public void inputPasswordField() {
        registerScreen.inputPasswordField();
    }

    @And("new user click register button")
    public void clickRegisterButton() {
        registerScreen.clickRegisterButton();
    }

    @Then("new user see home page")
    public void goToHomePage() {
        registerScreen.onHomePage();
    }
}
