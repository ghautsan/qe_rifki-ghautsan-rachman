package mini.project.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mini.project.pages.BuyProductScreen;
import net.thucydides.core.annotations.Steps;

public class BuyProductStep {

    @Steps
    BuyProductScreen buyProductScreen;

    @Given("valid user on the home page buy product")
    public void onLoginPageBuyProduct() {
        buyProductScreen.onHomePage();
    }

    @When("valid user click login link buy product")
    public void clickLoginLinkBuyProduct() {
        buyProductScreen.clickLoginLink();
    }

    @When("valid user input {string} on email field buy product")
    public void inputEmailBuyProduct(String email) {
        buyProductScreen.inputEmailField(email);
    }

    @And("valid user input {string} on password field buy product")
    public void inputPasswordBuyProduct(String password) {
        buyProductScreen.inputPasswordField(password);
    }

    @And("valid user click login button buy product")
    public void clickLoginButtonBuyProduct() {
        buyProductScreen.clickLoginButton();
    }

    @And("user click on some products")
    public void clickSomeProducts() {
        buyProductScreen.buyProducts();
    }

    @Then("number items on cart increase")
    public void seeCart() {
        buyProductScreen.validateCart();
    }
}
