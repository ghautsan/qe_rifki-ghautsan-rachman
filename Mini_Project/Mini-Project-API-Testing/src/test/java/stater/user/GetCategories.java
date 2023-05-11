package stater.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetCategories {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set GET api endpoints")
    public String setApiEndpoints() {
        return url + "categories/12505";
    }

    @Step("I send GET HTTP request")
    public void sendGetHttpRequest() {
        SerenityRest.given().get(setApiEndpoints());
    }

    @Step("I receive valid data for detail product")
    public void validateDataDetailPost() {
        restAssuredThat(response -> response.body("'data'.'ID'", equalTo(12505)));
    }
}
