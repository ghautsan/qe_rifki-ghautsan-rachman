package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasKey;

public class Login {
    protected String url = "https://fakestoreapi.com/";

    @Step("I set POST api endpoints")
    public String setPostApiEndpoint() {
        return url + "auth/login";
    }
    @Step("I send POST HTTP request")
    public void sendPostHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "mor_2314");
        requestBody.put("password", "83r5^_");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
    }

    @Step("I receive valid HTTP response code 200")
    public void validHttpresponse200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for login")
    public void validateDataLogin() {
        restAssuredThat(response -> response.body("$", hasKey("token")));
    }
}