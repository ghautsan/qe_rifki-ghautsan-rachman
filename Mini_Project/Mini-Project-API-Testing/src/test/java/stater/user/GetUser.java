package stater.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetUser {
    protected static String url = "https://altashop-api.fly.dev/api/";
    protected String bearerToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkpvaG4gRG9lIiwiRW1haWwiOiJzb21lb25lQG1haWwuY29tIn0.WvBSxcQEqqniC1v08LzkrHcELegs0b7vtjGPWiaEWcI";
    @Step("I set GET api endpoints get user")
    public String setApiEndpointsGetUser() {
        return url + "auth/info";
    }

    @Step("I send GET HTTP request get user")
    public void sendGetHttpRequestGetUser() {
        SerenityRest.given().header("Authorization", "Bearer " + bearerToken).get(setApiEndpointsGetUser());
    }

    @Step("I receive valid HTTP response code 200 get user")
    public void validateHttpResponseCode200GetUser() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
