package starter.Transaction;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class TransactionGET {

    protected String token = "";
    protected String url = "https://bearuang.me/";

    @Step("I want success auth with existing account to get transaction")
    public void wantSuccessAuthWithExistingAccountToGetTransaction() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "wantrikasmawit4@gmail.com");
        requestBody.put("password", "1234567");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post("https://bearuang.me/user/login");
        Response resp = SerenityRest.lastResponse();
        this.token = resp.getBody().jsonPath().get("token");


    }

    @Step("I set Get Api Transaction endpoint")
    public String setGetApiTransactionEndpoint() {
        return url + "transaksi/user";


    }

    @Step("I send Get Transaction endpoint")
    public void sendGetTransactionEndpoint() {
        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").get(setGetApiTransactionEndpoint());


    }
    @Step("I set Get Api Transaction endpoint invalid url")
    public String setGetApiTransactionEndpointInvalidUrl() {
        return url + " ";


    }
    @Step("I send Get Transaction endpoint invalid url")
    public void sendGetTransactionEndpointInvalidUrl() {
        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").get(setGetApiTransactionEndpointInvalidUrl());



    }
    @Step("I receive invalid Transaction http response code 404")
    public void receiveInvalidTransactionHttpResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));

    }

}
