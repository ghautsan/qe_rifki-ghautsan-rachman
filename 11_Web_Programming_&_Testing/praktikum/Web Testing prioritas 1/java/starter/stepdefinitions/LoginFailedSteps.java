package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class LoginFailedSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Given("I am on the login page to failed login")
    public void onTheLoginPageToFailedLogin() {
        loginPage.openPage();
        loginPage.validateOnLoginPage();
    }
    @When("I input valid username to failed login")
    public void inputValidUserNameToFailedLogin() {
        loginPage.inputUserName("standard_user");
    }
    @And("I input invalid password")
    public void inputInvalidPassword() {
        loginPage.inputPassword("secret_sauce123");
    }
    @And("I click login button to failed login")
    public void clickLoginButtonToFailedLogin() {
        loginPage.clickLoginButton();
    }
    @Then("I am still on the login page")
    public void stillOnLoginPage() {
        loginPage.validateOnLoginPage();
    }
}