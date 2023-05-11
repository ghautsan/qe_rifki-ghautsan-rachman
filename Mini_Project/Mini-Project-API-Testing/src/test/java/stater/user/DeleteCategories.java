package stater.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteCategories {
    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set DELETE api endpoints")
    public String setDeleteApiEndpointsDeleteCategories() {
        return url + "categories/1";
    }

    @Step("I send DELETE HTTP request")
    public void sendDeleteHttpRequestDeleteCategories() {
        SerenityRest.given().delete(setDeleteApiEndpointsDeleteCategories());
    }

    @Step("I receive valid HTTP response code 200 from delete")
    public void validateHttpResponse200DeleteCategories() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
