package stater.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Register {
    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST api endpoints register")
    public String setPostApiEndpointRegister() {
        return url + "auth/register";
    }
    @Step("I send POST HTTP request register")
    public void sendPostHttpRequestRegister() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "tyes@mail.com");
        requestBody.put("password", "231123");
        requestBody.put("fullname", "tyes ajh");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());
    }


    @Step("I receive valid HTTP response code 200 register")
    public void receiveHttpResponseCode200Register() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
