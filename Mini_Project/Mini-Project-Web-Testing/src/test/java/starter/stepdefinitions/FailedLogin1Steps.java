package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class FailedLogin1Steps {
    @Steps
    LoginPage loginPage;

    @Given("I am on the login page invalid account")
    public void onLoginPageInvalidAccount() {
        loginPage.openPage();
    }

    @When("I input email invalid account")
    public void inputEmailInvalidAccount() {
        loginPage.inputEmail("rifki@mail.com");
    }

    @And("I input password invalid account")
    public void inputPasswordInvalidAccount() {
        loginPage.inputPassword("rifkikfir");
    }

    @And("I click login invalid account")
    public void clickLoginInvalidAccount() {
        loginPage.clickLoginButton();
    }

    @Then("I am on the home page invalid account")
    public void onTheHomePageInvalidAccount() {
        loginPage.errorMessageAppear();
    }
}
