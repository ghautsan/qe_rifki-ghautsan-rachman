package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Given("I am on the login page")
    public void onLoginPage() {
        loginPage.openPage();
    }

    @When("I input email")
    public void inputEmail() {
        loginPage.inputEmail("someone@mail.com");
    }

    @And("I input password")
    public void inputPassword() {
        loginPage.inputPassword("123123");
    }

    @And("I click login")
    public void clickLogin() {
        loginPage.clickLoginButton();
    }

    @Then("I am on the home page")
    public void onTheHomePage() {
        homePage.validateHomePage();
    }
}
