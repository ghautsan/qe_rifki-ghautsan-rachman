package stater.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteProducts {
    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set DELETE api endpoints")
    public String setDeleteApiEndpoints() {
        return url + "products/33144";
    }

    @Step("I send DELETE HTTP request")
    public void sendDeleteHttpRequest() {
        SerenityRest.given().delete(setDeleteApiEndpoints());
    }

    @Step("I receive valid HTTP response code 200 from delete")
    public void validateHttpResponse200() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
