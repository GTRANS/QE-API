package starter.Product;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class BuyProductGET {

    protected String token = "";
    protected String url = "https://bearuang.me/";


    @Step("I want success auth with existing account to buy product")
    public void wantSuccessAuthWithExistingAccountToBuyProduct() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "wantrikw@gmail.com");
        requestBody.put("password", "1234567");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post("https://bearuang.me/user/login");
        Response resp = SerenityRest.lastResponse();
        this.token = resp.getBody().jsonPath().get("token");

    }
    @Step("I set Get Api Buy Product endpoint")
    public String setGetApiBuyProductEndpoint() {
        return url + "produk/pilih?kategori=1&provider=2";

    }
    @Step("I send Get Buy Product endpoint")
    public void sendGetBuyProductEndpoint() {

        SerenityRest.given().header("Authorization", "Bearer " + this.token).get(setGetApiBuyProductEndpoint());

    }
    @Step("I receive valid Buy Product HTTP response code 200")
    public void receiveValidBuyProductHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));


}

    protected String link = "https://bearuang.me/";

    @Step("I set Get Api Buy Product endpoint without ID")
    public String setGetApiBuyProductEndpointWithoutID() {
        return link + "";


    }
    @Step("I send Get Buy Product endpoint without ID")
    public void sendGetBuyProductEndpointWithoutID() {
        SerenityRest.given().get(setGetApiBuyProductEndpointWithoutID());


    }
    @Step("I receive invalid Buy Product HTTP response code 404")
    public void receiveInvalidBuyProductHttpResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));


    }
    @Step("I receive error message to buy product")
    public void receiveErrorMessageToBuyProduct() {
        restAssuredThat(response -> response.body("'message'", equalTo("Not Found")));

    }
}