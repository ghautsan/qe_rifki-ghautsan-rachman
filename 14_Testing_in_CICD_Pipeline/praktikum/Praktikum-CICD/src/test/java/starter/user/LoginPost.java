package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginPost {
    protected String url = "https://reqres.in/api/";

    @Step("I set POST api endpoints to login")
    public String setPostApiEndpointToLogin() {
        return url + "login";
    }
    @Step("I send POST HTTP request to login")
    public void sendPostHttpRequestToLogin() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "eve.holt@reqres.in");
        requestBody.put("password", "cityslicka");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointToLogin());
    }


    @Step("I receive valid HTTP response code 200 to login")
    public void receiveHttpResponseCode200ToLogin() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid login data")
    public void validateLoginData() {
        restAssuredThat(response -> response.body("token", equalTo("QpwL5tke4Pnpja7X4")));
    }
}
