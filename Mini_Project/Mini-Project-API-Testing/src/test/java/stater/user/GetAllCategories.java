package stater.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllCategories {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set GET api endpoints all categories")
    public String setApiEndpointsAllCategories() {
        return url + "categories";
    }

    @Step("I send GET HTTP request all categories")
    public void sendGetHttpRequestAllCategories() {
        SerenityRest.given().get(setApiEndpointsAllCategories());
    }

    @Step("I receive valid HTTP response code 200 all categories")
    public void validateHttpResponseCode200AllCategories() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
