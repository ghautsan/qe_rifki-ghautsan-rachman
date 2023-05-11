package stater.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import stater.user.*;

public class UserSteps {
    @Steps
    GetAllProducts getAllProducts;

    @Steps
    CreateNewProduct createNewProduct;

    @Steps
    GetProduct getProduct;

    @Steps
    DeleteProducts deleteProducts;

    @Steps
    AssignRating assignRating;

    @Steps
    GetRating getRating;

    @Steps
    CreateComment createComment;

    @Steps
    GetComment getComment;

    @Steps
    CreateCategory createCategory;

    @Steps
    GetCategories getCategories;

    @Steps
    GetAllCategories getAllCategories;

    @Steps
    DeleteCategories deleteCategories;

    @Steps
    Register register;

    @Steps
    Login login;

    @Steps
    GetUser getUser;

    @Steps
    GetHello getHello;

    @Steps
    CreateOrder createOrder;

    @Steps
    GetAllOrder getAllOrder;

    @Steps
    GetOrder getOrder;

    @Given("I set GET api endpoints")
    public void setGetApiEndpoints() {
        getAllProducts.setApiEndpoints();
    }

    @When("I send GET HTTP request")
    public void sendGetHttpRequest() {
        getAllProducts.sendGetHttpRequest();
    }

    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttpResponse() {
        getAllProducts.validateHttpResponseCode200();
    }


    @Given("I set POST api endpoints")
    public void setPostApiEndpoints() {
        createNewProduct.setPostApiEndpoint();
    }

    @When("I send POST HTTP request")
    public void sendPostHttpRequest() {
        createNewProduct.sendPostHttpRequest();
    }

    @Then("I receive valid HTTP response code 200 after create new product")
    public void receiveValidHttp200NewProduct() {
        createNewProduct.receiveHttpResponse();
    }

    @And("I receive valid data for new post")
    public void validateDataNewPost() {
    }


    @Given("I set GET api endpoints to get product by id")
    public void setGetApiEndpointsToGetProduct() {
        getProduct.setApiEndpoints();
    }

    @When("I send GET HTTP request to get product by id")
    public void sendGetHttpRequestToGetProduct() {
        getProduct.sendGetHttpRequest();
    }

    @And("I receive valid data for product")
    public void receiveValidDataForProduct() {
        getProduct.validateDataDetailPost();
    }


    @Given("I set DELETE api endpoints")
    public void setDeleteApiEndpoints() {
        deleteProducts.setDeleteApiEndpoints();
    }

    @When("I send DELETE HTTP request")
    public void sendDeleteHttpRequest() {
        deleteProducts.sendDeleteHttpRequest();
    }

    @Then("I receive valid HTTP response code 200 from delete")
    public void receiveValidHttp200Delete() {
        deleteProducts.validateHttpResponse200();
    }


    @Given("I set POST api endpoints to assign rating")
    public void setPostApiEndpointsAssignRating() {
        assignRating.setPostApiEndpointAssignRating();
    }

    @When("I send POST HTTP request to assign rating")
    public void sendPostHttpRequestAssignRating() {
        assignRating.sendPostHttpRequestAssignRating();
    }

    @Then("I receive valid HTTP response code 200 assign rating")
    public void receiveValidHttp200AssignRating() {
        assignRating.receiveHttpResponseCode200();
    }

    @And("I receive valid data for new ratings")
    public void validateDataRatings() {
    }


    @Given("I set GET api endpoints to get product rating")
    public void setGetApiEndpointsToGetProductGetRating() {
        getRating.setApiEndpointsGetRating();
    }

    @When("I send GET HTTP request to get product rating")
    public void sendGetHttpRequestToGetProductGetRating() {
        getRating.sendGetHttpRequestGetRating();
    }

    @And("I receive valid data for product rating")
    public void receiveValidDataForProductGetRating() {
        getRating.validateDataProductRating();
    }


    @Given("I set POST api endpoints to create comment")
    public void setPostApiEndpointsCreateComment() {
        createComment.setPostApiEndpointCreateComment();
    }

    @When("I send POST HTTP request to create comment")
    public void sendPostHttpRequestCreateComment() {
        createComment.sendPostHttpRequestCreateComment();
    }

    @Then("I receive valid HTTP response code 200 to create comment")
    public void receiveValidHttp200CreateComment() {
        createComment.receiveHttpResponseCode201CreateComment();
    }


    @Given("I set GET api endpoints to get product comment")
    public void setGetApiEndpointsToGetProductGetComment() {
        getComment.setApiEndpointsGetComment();
    }

    @When("I send GET HTTP request to get product comment")
    public void sendGetHttpRequestToGetProductGetComment() {
        getComment.sendGetHttpRequestGetComment();
    }

    @And("I receive valid data for product comment")
    public void receiveValidDataForProductGetComment() {
        getComment.validateDataProductComment();
    }


    @Given("I set POST api endpoints new categories")
    public void setPostApiEndpointsNewCategories() {
        createCategory.setPostApiEndpointCreateCategories();
    }

    @When("I send POST HTTP request new categories")
    public void sendPostHttpRequestNewCategories() {
        createCategory.sendPostHttpRequestCreateCategories();
    }

    @Then("I receive valid HTTP response code 200 after create new categories")
    public void receiveValidHttp200NewCategories() {
        createCategory.receiveHttpResponseCreateCategories();
    }

    @And("I receive valid data for new categories")
    public void validateDataNewPostNewCategories() {
        createCategory.validateDataNewPostCreateCategories();
    }


    @Given("I set GET api endpoints to get categories by id")
    public void setGetApiEndpointsToGetCategories() {
        getCategories.setApiEndpoints();
    }

    @When("I send GET HTTP request to get categories by id")
    public void sendGetHttpRequestToGetCategories() {
        getCategories.sendGetHttpRequest();
    }

    @And("I receive valid data for categories")
    public void receiveValidDataForCategories() {
        getCategories.validateDataDetailPost();
    }


    @Given("I set GET api endpoints all categories")
    public void setGetApiEndpointsAllCategories() {
        getAllCategories.setApiEndpointsAllCategories();
    }

    @When("I send GET HTTP request all categories")
    public void sendGetHttpRequestAllCategories() {
        getAllCategories.sendGetHttpRequestAllCategories();
    }

    @Then("I receive valid HTTP response code 200 all categories")
    public void receiveValidHttpResponseAllCategories() {
        getAllCategories.validateHttpResponseCode200AllCategories();
    }


    @Given("I set DELETE api endpoints delete existing categories")
    public void setDeleteApiEndpointsDeleteCategories() {
        deleteCategories.setDeleteApiEndpointsDeleteCategories();
    }

    @When("I send DELETE HTTP request delete existing categories")
    public void sendDeleteHttpRequestDeleteCategories() {
        deleteCategories.sendDeleteHttpRequestDeleteCategories();
    }

    @Then("I receive valid HTTP response code 200 from delete existing categories")
    public void receiveValidHttp200DeleteDeleteCategories() {
        deleteCategories.validateHttpResponse200DeleteCategories();
    }


    @Given("I set POST api endpoints register")
    public void setPostApiEndpointsRegister() {
        register.setPostApiEndpointRegister();
    }

    @When("I send POST HTTP request register")
    public void sendPostHttpRequestRegister() {
        register.sendPostHttpRequestRegister();
    }

    @Then("I receive valid HTTP response code 200 after register")
    public void receiveValidHttp200Register() {
        register.receiveHttpResponseCode200Register();
    }


    @Given("I set POST api endpoints to login")
    public void setPostApiEndpointsToLogin() {
        login.setPostApiEndpointToLogin();
    }

    @When("I send POST HTTP request to login")
    public void sendPostHttpRequestToLogin() {
        login.sendPostHttpRequestToLogin();
    }

    @Then("I receive valid HTTP response code 200 to login")
    public void receiveValidHttp200ToLogin() {
        login.receiveHttpResponseCode200ToLogin();
    }


    @Given("I set GET api endpoints get user")
    public void setGetApiEndpointsGetUser() {
        getUser.setApiEndpointsGetUser();
    }

    @When("I send GET HTTP request get user")
    public void sendGetHttpRequestGetUser() {
        getUser.sendGetHttpRequestGetUser();
    }

    @Then("I receive valid HTTP response code 200 get user")
    public void receiveValidHttpResponseGetUser() {
        getUser.validateHttpResponseCode200GetUser();
    }


    @Given("I set GET api endpoints get hello")
    public void setGetApiEndpointsGetHello() {
        getHello.setApiEndpointsGetHello();
    }

    @When("I send GET HTTP request get hello")
    public void sendGetHttpRequestGetHello() {
        getHello.sendGetHttpRequestGetHello();
    }

    @Then("I receive valid HTTP response code 200 get hello")
    public void receiveValidHttpResponseGetHello() {
        getHello.validateHttpResponseCode200GetHello();
    }


    @Given("I set POST api endpoints new order")
    public void setPostApiEndpointsNewOrder() {
        createOrder.setPostApiEndpointCreateOrder();
    }

    @When("I send POST HTTP request new order")
    public void sendPostHttpRequestNewOrder() {
        createOrder.sendPostHttpRequestCreateOrder();
    }

    @Then("I receive valid HTTP response code 200 after create new order")
    public void receiveValidHttp200NewOrder() {
        createOrder.receiveHttpResponseCreateOrder();
    }

//    @And("I receive valid data for new order")
//    public void validateDataNewPostNewOrder() {
//    }


    @Given("I set GET api endpoints get all order")
    public void setGetApiEndpointsGetOrder() {
        getAllOrder.setApiEndpointsGetAllOrder();
    }

    @When("I send GET HTTP request get all order")
    public void sendGetHttpRequestGetOrder() {
        getAllOrder.sendGetHttpRequestGetAllOrder();
    }

    @Then("I receive valid HTTP response code 200 get all order")
    public void receiveValidHttpResponseGetOrder() {
        getAllOrder.validateHttpResponseCode200GeAlltOrder();
    }


    @Given("I set GET api endpoints to get order by id")
    public void setGetApiEndpointsToGetOrder() {
        getOrder.setApiEndpointsGetOrder();
    }

    @When("I send GET HTTP request to get order by id")
    public void sendGetHttpRequestToGetOrder() {
        getOrder.sendGetHttpRequestGetOrder();
    }

    @And("I receive valid data for order")
    public void receiveValidDataForOrder() {
        getOrder.validateDataDetailPostGetOrder();
    }
}
