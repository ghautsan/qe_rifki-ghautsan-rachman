package stater.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllOrder {
    protected static String url = "https://altashop-api.fly.dev/api/";
    protected String bearerToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkpvaG4gRG9lIiwiRW1haWwiOiJzb21lb25lQG1haWwuY29tIn0.WvBSxcQEqqniC1v08LzkrHcELegs0b7vtjGPWiaEWcI";

    @Step("I set GET api endpoints get all order")
    public String setApiEndpointsGetAllOrder() {
        return url + "orders";
    }

    @Step("I send GET HTTP request get all order")
    public void sendGetHttpRequestGetAllOrder() {
        SerenityRest.given().header("Authorization", "Bearer " + bearerToken).get(setApiEndpointsGetAllOrder());
    }

    @Step("I receive valid HTTP response code 200 get all order")
    public void validateHttpResponseCode200GeAlltOrder() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
