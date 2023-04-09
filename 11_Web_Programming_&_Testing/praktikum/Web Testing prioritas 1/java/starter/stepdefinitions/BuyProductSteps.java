package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.*;

public class BuyProductSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Steps
    CheckoutPage checkoutPage;

    @Steps
    CheckoutInformationPage checkoutInformationPage;

    @Steps
    CheckoutOverviewPage checkoutOverviewPage;

    @Steps
    CheckoutComplete checkoutComplete;

    @Given("I am on the login page to buy product")
    public void onTheLoginPageToBuyProduct() {
        loginPage.openPage();
        loginPage.validateOnLoginPage();
    }
    @When("I input valid username to buy product")
    public void inputValidUserNameToBuyProduct() {
        loginPage.inputUserName("standard_user");
    }
    @And("I input valid password to buy product")
    public void inputValidPasswordToBuyProduct() {
        loginPage.inputPassword("secret_sauce");
    }
    @And("I click login button to buy product")
    public void clickLoginButtonToBuyProduct() {
        loginPage.clickLoginButton();
    }
    @And("I am on the home page to buy product")
    public void onTheHomePageToBuyProduct() {
        homePage.validateOnHomePage();
    }
    @And("I click on the product")
    public void clickOnProduct() {
        homePage.clickOnAddToCartButton();
        homePage.clickOnCartButton();
    }
    @And("I click on checkout")
    public void clickOnCheckout() {
        checkoutPage.validateOnCheckoutPage();
        checkoutPage.clickOnCheckoutButton();
    }
    @And("I input valid first name")
    public void inputValidFirstName() {
        checkoutInformationPage.validateOnCheckoutInformationPage();
        checkoutInformationPage.inputFirstName("Rifki Ghautsan");


    }
    @And("I input valid last name")
    public void inputValidLastName() {
        checkoutInformationPage.inputLastName("Rachman");
    }
    @And("I input valid postal code")
    public void inputValidPostalCode() {
        checkoutInformationPage.inputPostalCode("12312");
    }
    @And("I click on continue")
    public void clickOnContinue() {
        checkoutInformationPage.clickContinueButton();
    }
    @And("I click on finish")
    public void clickOnFinish() {
        checkoutOverviewPage.validateOnCheckoutOverviewPage();
        checkoutOverviewPage.clickFinishButton();
    }
    @Then("I am on checkout complete page")
    public void onCheckoutCompletePage() {
        checkoutComplete.validateOnCheckoutCompletePage();
        checkoutComplete.clickOnBackToHomeButton();
    }
}