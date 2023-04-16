package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.*;

public class UserSteps {
    @Steps
    Login login;

    @Steps
    AllProduct allProduct;

    @Steps
    Cart cart;

    @Steps
    DeleteUser deleteUser;

    @Given("I set POST api endpoints")
    public void setPostApiEndpoints() {
        login.setPostApiEndpoint();
    }

    @When("I send POST HTTP request")
    public void sendPostHttpRequest() {
        login.sendPostHttpRequest();
    }

    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttp200() {
        login.validHttpresponse200();
    }

    @And("I receive valid data for login")
    public void validateDataLogin() {
        login.validateDataLogin();
    }

    @Given("I set GET api endpoints")
    public void setGetApiEndpoints() {
        allProduct.setApiEndpoints();
    }

    @When("I send GET HTTP request")
    public void sendGetHttpRequest() {
        allProduct.sendGetHttpRequest();
    }

    @Given("I set PUT api endpoints")
    public void setGetApiEndpointsToGetCart() {
        cart.setPutApiEndpoints();
    }

    @When("I send PUT HTTP request")
    public void sendGetHttpRequestToGetCart() {
        cart.sendPutHttpRequest();
    }

    @And("I receive valid data for updated cart")
    public void receiveValidDataForCart() {
        cart.validateUpdateCart();
    }

    @Given("I set DELETE api endpoints")
    public void setDeleteApiEndpoints() {
        deleteUser.setDeleteApiEndpoints();
    }

    @When("I send DELETE HTTP request")
    public void sendDeleteHttpRequest() {
        deleteUser.sendDeleteHttpRequest();
    }

    @Then("I receive valid HTTP response code 204")
    public void receiveValidHttp204() {
        deleteUser.validateHttpResponse204();
    }
}