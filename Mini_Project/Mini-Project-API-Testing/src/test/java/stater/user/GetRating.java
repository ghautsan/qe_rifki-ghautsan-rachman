package stater.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetRating {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set GET api endpoints")
    public String setApiEndpointsGetRating() {
        return url + "products/1/ratings";
    }

    @Step("I send GET HTTP request")
    public void sendGetHttpRequestGetRating() {
        SerenityRest.given().get(setApiEndpointsGetRating());
    }

    @Step("I receive valid data for detail product")
    public void validateDataProductRating() {
        restAssuredThat(response -> response.body("data", equalTo(2)));
    }
}
