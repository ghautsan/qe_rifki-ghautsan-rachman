package stater.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class CreateComment {
    protected String url = "https://altashop-api.fly.dev/api/";

    protected String bearerToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkpvaG4gRG9lIiwiRW1haWwiOiJzb21lb25lQG1haWwuY29tIn0.WvBSxcQEqqniC1v08LzkrHcELegs0b7vtjGPWiaEWcI";

    @Step("I set POST api endpoints")
    public String setPostApiEndpointCreateComment() {
        return url + "products/1/comments";
    }
    @Step("I send POST HTTP request")
    public void sendPostHttpRequestCreateComment() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("content", "barang ini sangat bagus");

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + bearerToken)
                .body(requestBody.toJSONString())
                .post(setPostApiEndpointCreateComment());
    }

    @Step("I receive valid HTTP response code 200")
    public void receiveHttpResponseCode201CreateComment() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
