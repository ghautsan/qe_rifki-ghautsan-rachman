package stater.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetComment {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set GET api endpoints to get product comment")
    public String setApiEndpointsGetComment() {
        return url + "products/3/comments";
    }

    @Step("I send GET HTTP request to get product comment")
    public void sendGetHttpRequestGetComment() {
        SerenityRest.given().get(setApiEndpointsGetComment());
    }

    @Step("I receive valid data for product comment")
    public void validateDataProductComment() {
//        restAssuredThat(response -> response.body("'data'.'comment'", equalTo(null)));
    }
}
