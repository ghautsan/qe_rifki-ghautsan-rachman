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

public class EditCartMinusSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Steps
    CartPage cartPage;

    @Given("I am on the login page to edit cart minus")
    public void onLoginPageToPayMinus() {
        loginPage.openPage();
    }

    @When("I login with registered account to edit cart minus")
    public void loginToEditCartMinus() {
        loginPage.inputEmail("someone@mail.com");
        loginPage.inputPassword("123123");
        loginPage.clickLoginButton();
    }

    @And("I see the home page to edit cart minus")
    public void onHomePageToEditCartMinus() {
        homePage.validateHomePage();
    }

    @And("I click beli on some product minus")
    public void clickBeliOnSomeProductsMinus() {
        homePage.clickBeliButtonPs5();
        homePage.clickBeliButtonMarbleTable();
        homePage.clickBeliButtonMarbleTable();
        homePage.clickBeliButtonMarbleTable();
    }

    @And("I click on cart icon to see products minus")
    public void clickOnCartIconMinus() {
        homePage.clickCartIcon();
    }

    @And("I click on minus button on products")
    public void clickMinusButton() {
        cartPage.clickMinusButtonMarbleTable();
    }

    @Then("I check total products minus")
    public void validateTotalProductsMinus() {
        cartPage.validateTotalItemsMarbleTable();
    }
}
