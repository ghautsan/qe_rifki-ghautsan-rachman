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

public class PaymentSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Steps
    CartPage cartPage;

    @Steps
    TransactionPage transactionPage;

    @Given("I am on the login page to pay")
    public void onLoginPageToPay() {
        loginPage.openPage();
    }

    @When("I login with registered account to pay")
    public void loginToPay() {
        loginPage.inputEmail("someone@mail.com");
        loginPage.inputPassword("123123");
        loginPage.clickLoginButton();
    }

    @And("I see the home page to pay")
    public void onHomePageToPay() {
        homePage.validateHomePage();
    }

    @And("I click beli on product")
    public void clickBeli() {
        homePage.clickBeliButtonPs5();
    }

    @And("I click on cart icon")
    public void clickOnCart() {
        homePage.clickCartIcon();
    }

    @And("I click on bayar button")
    public void clickOnBayar() {
        cartPage.clickBayarButton();
    }

    @Then("I see the transaction page")
    public void validateOnTransactionPage() {
        transactionPage.validateOnTransactionPage();
    }
}
