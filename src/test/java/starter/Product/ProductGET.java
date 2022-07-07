package starter.Product;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;


public class ProductGET {

    protected String token = "";
    protected String url = "https://bearuang.me/";

    @Step("I want success auth with existing account to get product")
    public void wantSuccessAuthWithExistingAccountToGetProduct() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "wantrikw@gmail.com");
        requestBody.put("password", "1234567");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post("https://bearuang.me/user/login");
        Response resp = SerenityRest.lastResponse();
        this.token = resp.getBody().jsonPath().get("token");

    }
    @Step("I set Get Api Product endpoint")
    public String setGetApiProductEndpoint() {
        return url + "produk/1";


    }
    @Step("I send Get Product endpoint")
    public void sendGetProductEndpoint() {

        SerenityRest.given().header("Authorization", "Bearer " + this.token).get(setGetApiProductEndpoint());


    }
    @Step("I receive valid Product HTTP response code 200")
    public void receiveValidProductHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));


}

    protected String link = "https://bearuang.me/";

    @Step("I set Get Api Product endpoint without ID")
    public String setGetApiProductEndpointWithoutID() {
        return link + " ";


    }
    @Step("I send Get Product endpoint without ID")
    public void sendGetProductEndpointWithoutID() {
        SerenityRest.given().get(setGetApiProductEndpointWithoutID());


    }
    @Step("I receive invalid Product HTTP response code 404")
    public void receiveInvalidProductHttpResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));


    }
    @Step("I receive error message")
    public void receiveErrorMessage() {
        restAssuredThat(response -> response.body("'message'", equalTo("Not Found")));


    }
    @Step("I set Get Api Product by category endpoint")
    public String setGetApiProductByCategoryEndpoint() {
        return url + "produk?kategori=1&provider=2";


    }
    @Step("I send Get Product by category endpoint")
    public void sendGetProductByCategoryEndpoint() {

        SerenityRest.given().header("Authorization", "Bearer " + this.token).get(setGetApiProductByCategoryEndpoint());


    }
    @Step("I receive valid Product by category http response code 200")
    public void receiveValidProductByCategoryHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));


    }

}
