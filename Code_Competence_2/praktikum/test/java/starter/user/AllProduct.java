package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class AllProduct {
    protected static String url = "https://fakestoreapi.com/";
    @Step("I set GET api endpoints")
    public String setApiEndpoints() {
        return url + "products  ";
    }

    @Step("I send GET HTTP request")
    public void sendGetHttpRequest() {
        SerenityRest.given().get(setApiEndpoints());
    }
}

