package stater.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Login {
    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST api endpoints to login")
    public String setPostApiEndpointToLogin() {
        return url + "auth/login";
    }
    @Step("I send POST HTTP request to login")
    public void sendPostHttpRequestToLogin() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "someone@mail.com");
        requestBody.put("password", "123123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointToLogin());
    }


    @Step("I receive valid HTTP response code 200 to login")
    public void receiveHttpResponseCode200ToLogin() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
