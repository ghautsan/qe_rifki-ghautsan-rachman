package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Cart {
    protected String url = "https://fakestoreapi.com/";

    @Step("I set PUT api endpoints")
    public String setPutApiEndpoints() {
        return url + "carts/5";
    }

    @Step("I send PUT HTTP request")
    public void sendPutHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("id", 5);
        requestBody.put("'products'.'0'.'quantity'", 5);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutApiEndpoints());
    }

    @Step("I receive valid data for updated user")
    public void validateUpdateCart() {
        restAssuredThat(response -> response.body("id", equalTo(5)));
    }
}
