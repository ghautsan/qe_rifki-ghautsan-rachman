package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.IsiPulsaPage;
import starter.pages.LoginPage;


public class PilihProdukSteps {

    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Steps
    IsiPulsaPage isiPulsaPage;

    @Given("I am on the login page to buy product")
    public void onTheLoginPageToBuyProduct() {
        loginPage.openPage();
        loginPage.validateOnLoginPage();
    }
    @When("I input valid email to buy product")
    public void inputValidEmailToBuyProduct() {
        loginPage.inputEmail("");
    } //isi email anda
    @And("I input valid password to buy product")
    public void inputValidPasswordToBuyProduct() {
        loginPage.inputPassword("");
    } //isi password anda
    @And("I click login button to buy product")
    public void clickLoginButtonToBuyProduct() {
        loginPage.clickLoginButton();
    }
    @And("I am on the home page to buy product")
    public void onTheHomePageToBuyProduct() {

    }
    @And("I Click on pulsa button")
    public void clickOnPulsaButton() {
        homePage.chooseProduct();
    }
    @And("I fill valid phone number")
    public void fillValidPhoneNumber() {
        isiPulsaPage.inputPhoneNumber("");
    } //isi nomor telppn yang benar
    @Then("I choose the product")
    public void chooseTheProduct() {
        isiPulsaPage.chooseProductOne();
    }
}
