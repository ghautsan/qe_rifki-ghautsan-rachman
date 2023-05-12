package stater.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetHello {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set GET api endpoints get hello")
    public String setApiEndpointsGetHello() {
        return url + "hello";
    }

    @Step("I send GET HTTP request get hello")
    public void sendGetHttpRequestGetHello() {
        SerenityRest.given().get(setApiEndpointsGetHello());
    }

    @Step("I receive valid HTTP response code 200 get hello")
    public void validateHttpResponseCode200GetHello() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
