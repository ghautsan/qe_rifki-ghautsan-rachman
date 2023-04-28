package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.user.LoginPost;
import starter.user.RegisterPost;

public class UserSteps {
    @Steps
    RegisterPost registerPost;

    @Steps
    LoginPost loginPost;

    @Given("I set POST api endpoints")
    public void setPostApiEndpoints() {
        registerPost.setPostApiEndpoint();
    }

    @When("I send POST HTTP request")
    public void sendPostHttpRequest() {
        registerPost.sendPostHttpRequest();
    }

    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttp200() {
        registerPost.receiveHttpResponseCode200();
    }

    @And("I receive valid data for new user")
    public void validateDataNewUser() {
        registerPost.validateDataNewUser();
    }

    @Given("I set POST api endpoints to login")
    public void setPostApiEndpointsToLogin() {
        loginPost.setPostApiEndpointToLogin();
    }

    @When("I send POST HTTP request to login")
    public void sendPostHttpRequestToLogin() {
        loginPost.sendPostHttpRequestToLogin();
    }

    @Then("I receive valid HTTP response code 200 to login")
    public void receiveValidHttp200ToLogin() {
        loginPost.receiveHttpResponseCode200ToLogin();
    }

    @And("I receive valid login data")
    public void validateLoginData() {
        loginPost.validateLoginData();
    }
}
