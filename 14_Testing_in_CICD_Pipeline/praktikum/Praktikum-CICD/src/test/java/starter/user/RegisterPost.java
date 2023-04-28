package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class RegisterPost {
    protected String url = "https://reqres.in/api/";

    @Step("I set POST api endpoints")
    public String setPostApiEndpoint() {
        return url + "register";
    }
    @Step("I send POST HTTP request")
    public void sendPostHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "eve.holt@reqres.in");
        requestBody.put("password", "pistol");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
    }


    @Step("I receive valid HTTP response code 200")
    public void receiveHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for new user")
    public void validateDataNewUser() {
        restAssuredThat(response -> response.body("id", equalTo(4)));
        restAssuredThat(response -> response.body("token", equalTo("QpwL5tke4Pnpja7X4")));
    }
}
