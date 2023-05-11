package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DetailProductPage;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class ViewDetailProductSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Steps
    DetailProductPage detailProductPage;

    @Given("I am on the login page to view detail product")
    public void onLoginPageToViewProduct() {
        loginPage.openPage();
    }

    @When("I login with registered account")
    public void loginAccount() {
        loginPage.inputEmail("someone@mail.com");
        loginPage.inputPassword("123123");
        loginPage.clickLoginButton();
    }

    @And("I see the home page")
    public void onHomePage() {
        homePage.validateHomePage();
    }

    @And("I click on detail product")
    public void inputEmailOnEmailField() {
        homePage.clickDetailProduct();
    }

    @Then("I see the product detail")
    public void successCreateAccount() {
        detailProductPage.onProductDetail();
    }
}
