package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class LogoutSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Given("I am on the login page to test logout")
    public void onLoginPageTestLogout() {
        loginPage.openPage();
    }

    @When("I input email to login")
    public void inputEmailToLogin() {
        loginPage.inputEmail("someone@mail.com");
    }

    @And("I input password to login")
    public void inputPasswordToLogin() {
        loginPage.inputPassword("123123");
    }

    @And("I click login to test logout")
    public void clickLoginTestLogout() {
        loginPage.clickLoginButton();
    }

    @And("I click profile icon")
    public void clickProfileIcon() {
        homePage.clickProfileIcon();
    }

    @And("I click logout")
    public void clickLogout() {
        homePage.clickLogoutButton();
    }

    @Then("I am back on the login page")
    public void onTheLoginPage() {
        loginPage.validateOnLoginPage();
    }
}
