package stater.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class CreateNewProduct {
    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST api endpoints")
    public String setPostApiEndpoint() {
        return url + "products";
    }
    @Step("I send POST HTTP request")
    public void sendPostHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Sepeda Listrik");
        requestBody.put("description", "Sepeda listrik ngebut");
        requestBody.put("price", 250);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
    }


    @Step("I receive valid HTTP response code 200 new product")
    public void receiveHttpResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

//    @Step("I receive valid data for new post")
//    public void validateDataNewPost() {
//        restAssuredThat(response -> response.body("name", equalTo("Sepeda Listrik")));
//        restAssuredThat(response -> response.body("description", equalTo("Sepeda listrik ngebut")));
//        restAssuredThat(response -> response.body("price", equalTo(250)));
//    }
}
