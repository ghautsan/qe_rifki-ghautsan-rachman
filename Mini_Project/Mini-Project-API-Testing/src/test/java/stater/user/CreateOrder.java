package stater.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class CreateOrder {
    protected String url = "https://altashop-api.fly.dev/api/";

    protected String bearerToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkpvaG4gRG9lIiwiRW1haWwiOiJzb21lb25lQG1haWwuY29tIn0.WvBSxcQEqqniC1v08LzkrHcELegs0b7vtjGPWiaEWcI";

    @Step("I set POST api endpoints create order")
    public String setPostApiEndpointCreateOrder() {
        return url + "orders";
    }
    @Step("I send POST HTTP request create order")
    public void sendPostHttpRequestCreateOrder() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("product", "testing product");
        requestBody.put("quantity", 1);

        SerenityRest.given().header("Content-Type", "application/json").header("Authorization", "Bearer " + bearerToken).body(requestBody.toJSONString()).post(setPostApiEndpointCreateOrder());
    }


    @Step("I receive valid HTTP response code 200 create order")
    public void receiveHttpResponseCreateOrder() {
        restAssuredThat(response -> response.statusCode(200));
    }

//    @Step("I receive valid data for new post create order")
//    public void validateDataNewPostCreateOrder() {
//        restAssuredThat(response -> response.body("product_id", equalTo(2)));
//        restAssuredThat(response -> response.body("quantity", equalTo(1)));
//    }
}
