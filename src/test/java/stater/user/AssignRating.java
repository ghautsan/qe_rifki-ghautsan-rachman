package stater.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class AssignRating {
    protected String url = "https://altashop-api.fly.dev/api/";

    protected String bearerToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkpvaG4gRG9lIiwiRW1haWwiOiJzb21lb25lQG1haWwuY29tIn0.WvBSxcQEqqniC1v08LzkrHcELegs0b7vtjGPWiaEWcI";

    @Step("I set POST api endpoints")
    public String setPostApiEndpointAssignRating() {
        return url + "products/33143/ratings";
    }
    @Step("I send POST HTTP request")
    public void sendPostHttpRequestAssignRating() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("data", 5);

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + bearerToken)
                .body(requestBody.toJSONString())
                .post(setPostApiEndpointAssignRating());
    }


    @Step("I receive valid HTTP response code 200")
    public void receiveHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }
//
//    @Step("I receive valid data for new post")
//    public void validateDataRating() {
//        restAssuredThat(response -> response.body("data", equalTo(5)));
//    }
}
