package stater.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetOrder {
    protected static String url = "https://altashop-api.fly.dev/api/";
    protected String bearerToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkpvaG4gRG9lIiwiRW1haWwiOiJzb21lb25lQG1haWwuY29tIn0.WvBSxcQEqqniC1v08LzkrHcELegs0b7vtjGPWiaEWcI";
    @Step("I set GET api endpoints get order")
    public String setApiEndpointsGetOrder() {
        return url + "orders/12888";
    }

    @Step("I send GET HTTP request")
    public void sendGetHttpRequestGetOrder() {
        SerenityRest.given().header("Authorization", "Bearer " + bearerToken).get(setApiEndpointsGetOrder());
    }

    @Step("I receive valid data for detail product")
    public void validateDataDetailPostGetOrder() {
//        restAssuredThat(response -> response.body("'data'.'ID'", equalTo(12888)));
    }
}
