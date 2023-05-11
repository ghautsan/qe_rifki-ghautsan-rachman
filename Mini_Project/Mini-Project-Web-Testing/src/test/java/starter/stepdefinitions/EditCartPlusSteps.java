package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CartPage;
import starter.pages.HomePage;
import starter.pages.LoginPage;
import starter.pages.TransactionPage;

public class EditCartPlusSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Steps
    CartPage cartPage;

    @Given("I am on the login page to edit cart")
    public void onLoginPageToEditCart() {
        loginPage.openPage();
    }

    @When("I login with registered account to edit cart")
    public void loginToEditCart() {
        loginPage.inputEmail("someone@mail.com");
        loginPage.inputPassword("123123");
        loginPage.clickLoginButton();
    }

    @And("I see the home page to edit cart")
    public void onHomePageToEditCart() {
        homePage.validateHomePage();
    }

    @And("I click beli on some product")
    public void clickBeliOnSomeProducts() {
        homePage.clickBeliButtonPs5();
        homePage.clickBeliButtonMarbleTable();
    }

    @And("I click on cart icon to see products")
    public void clickOnCartIcon() {
        homePage.clickCartIcon();
    }

    @And("I click on plus button on products")
    public void clickPlusButton() {
        cartPage.clickPlusButtonPs5();
    }

    @Then("I check total products")
    public void validateTotalProducts() {
        cartPage.validateTotalItemsPs5();
    }
}
