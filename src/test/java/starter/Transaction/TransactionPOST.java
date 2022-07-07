package starter.Transaction;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class TransactionPOST {

    protected String token = "";
    protected String url = "https://bearuang.me/";

    @Step("I want success auth with existing account to transaction")
    public void wantSuccessAuthWithExistingAccountToTransaction() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "wantrikw@gmail.com");
        requestBody.put("password", "1234567");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post("https://bearuang.me/user/login");
        Response resp = SerenityRest.lastResponse();
        this.token = resp.getBody().jsonPath().get("token");


    }
    @Step("I set Post Api Transaction endpoint")
    public String setPostApiTransactionEndpoint() {
        return url + "transaksi/bank";


    }
    @Step("I send Post Transaction endpoint")
    public void sendPostTransactionEndpoint() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("user_id", 6);
        requestBody.put("produk_id", 6);
        requestBody.put("bank", "bca");

        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiTransactionEndpoint());


    }
    @Step("I receive valid Transaction http response code 200")
    public void receiveValidTransactionHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));


    }
    @Step("I send Post Transaction endpoint invalid user ID")
    public void sendPostTransactionEndpointInvalidUserID() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("user_id", 9);
        requestBody.put("produk_id", 9);
        requestBody.put("bank", "bca");

        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiTransactionEndpoint());

    }
    @Step("I receive invalid Transaction http response code 500")
    public void receiveInvalidTransactionHttpResponseCode500() {
        restAssuredThat(response -> response.statusCode(500));


    }
    @Step("I send Post Transaction endpoint invalid bank name")
    public void sendPostTransactionEndpointInvalidBankName() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("user_id", 6);
        requestBody.put("produk_id", 6);
        requestBody.put("bank", "abc");

        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiTransactionEndpoint());


    }
    @Step("I receive invalid Transaction http response code 520")
    public void receiveInvalidTransactionHttpResponseCode520() {
        restAssuredThat(response -> response.statusCode(520));


    }
    @Step("I set Post Api Transaction via e-wallet endpoint")
    public String  setPostApiTransactionViaEWalletEndpoint() {
        return url + "transaksi/ewallet";


    }
    @Step("I send Post Transaction via e-wallet endpoint")
    public void sendPostTransactionViaEWalletEndpoint() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("user_id", 6);
        requestBody.put("produk_id", 6);

        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiTransactionViaEWalletEndpoint());

    }
    @Step("I send Post Transaction via e-wallet endpoint invalid ID")
    public void sendPostTransactionViaEWalletEndpointInvalidID() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("user_id", 9);
        requestBody.put("produk_id", 9);

        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiTransactionViaEWalletEndpoint());



    }


}
