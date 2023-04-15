package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.*;


public class PilihMetodePembayaranSteps {

    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Steps
    IsiPulsaPage isiPulsaPage;

    @Steps
    PembayaranPage pembayaranPage;


    @Given("I am on the login page to choose payment method")
    public void onTheLoginPageToChoosePaymentMethod() {
        loginPage.openPage();
        loginPage.validateOnLoginPage();
    }
    @When("I input valid email to choose payment method")
    public void inputValidEmailToChoosePaymentMethod() {
        loginPage.inputEmail("");
    } //isi email anda
    @And("I input valid password to choose payment method")
    public void inputValidPasswordToChoosePaymentMethod() {
        loginPage.inputPassword("");
    } // isi password anda
    @And("I click login button to choose payment method")
    public void clickLoginButtonToChoosePaymentMethod() {
        loginPage.clickLoginButton();
    }
    @And("I am on the home page to choose payment method")
    public void onTheHomePageToChoosePaymentMethod() {

    }
    @And("I Click on pulsa button to choose payment method")
    public void clickOnPulsaButtonToChoosePaymentMethod() {
        homePage.chooseProduct();
    }
    @And("I fill valid phone number to choose payment method")
    public void fillValidPhoneNumberToChoosePaymentMethod() {
        isiPulsaPage.inputPhoneNumber("");
    } //isi nomor telpon yang benar
    @And("I choose the product to choose payment method")
    public void chooseTheProductToChoosePaymentMethod() {
        isiPulsaPage.chooseProductOne();
    }
    @And("I choose the payment method")
    public void chooseThePaymentMethod() {
        pembayaranPage.chooseMethodPayment();
    }
    @And("I click bayar sekarang")
    public void clickBayarSekarang() {
        pembayaranPage.clickPaymentButton();
    }
    @Then("I am on the checkout page")
    public void onTheCheckoutPage() {
    }
}
