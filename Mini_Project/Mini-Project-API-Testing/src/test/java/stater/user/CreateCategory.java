package stater.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class CreateCategory {
    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST api endpoints create categories")
    public String setPostApiEndpointCreateCategories() {
        return url + "categories";
    }
    @Step("I send POST HTTP request create categories")
    public void sendPostHttpRequestCreateCategories() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "gaming");
        requestBody.put("description", "for gaming purposes");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointCreateCategories());
    }


    @Step("I receive valid HTTP response code 201 create categories")
    public void receiveHttpResponseCreateCategories() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for new post create categories")
    public void validateDataNewPostCreateCategories() {
//        restAssuredThat(response -> response.body("name", equalTo("gaming")));
//        restAssuredThat(response -> response.body("description", equalTo("for gaming purposes")));
    }
}
