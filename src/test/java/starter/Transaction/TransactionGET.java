package starter.Transaction;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

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

    @Step("I receive valid Get Transaction http response code 200")
    public void receiveValidGetTransactionHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));


    }

    @Step("I set Get Api Transaction endpoint invalid url")
    public String setGetApiTransactionEndpointInvalidUrl() {
        return url + " ";


    }

    @Step("I send Get Transaction endpoint invalid url")
    public void sendGetTransactionEndpointInvalidUrl() {
        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").get(setGetApiTransactionEndpointInvalidUrl());


    }

    @Step("I receive invalid Get Transaction http response code 404")
    public void receiveInvalidGetTransactionHttpResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));

    }

    @Step("Admin want success auth with existing account to get transaction")
    public void adminWantSuccessAuthWithExistingAccountToGetTransaction() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "admin@gmail.com");
        requestBody.put("password", "123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post("https://bearuang.me/user/login");
        Response resp = SerenityRest.lastResponse();
        this.token = resp.getBody().jsonPath().get("token");

    }

    @Step("Admin set Get Api Data Transaction endpoint")
    public String adminSetGetApiDataTransactionEndpoint() {
        return url + "transaksi?filter=berhasil";

    }

    @Step("Admin send Get Data Transaction endpoint")
    public void adminSendGetDataTransactionEndpoint() {
        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").get(adminSetGetApiDataTransactionEndpoint());


    }

    @Step("Admin receive valid Get Data Transaction http response code 200")
    public void adminReceiveValidGetDataTransactionHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));

    }

    @Step("I set Get Api Data Transaction endpoint")
    public String setGetApiDataTransactionEndpoint() {
        return url + "transaksi?filter=berhasil";

    }

    @Step("I send Get Data Transaction endpoint")
    public void sendGetDataTransactionEndpoint() {
        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").get(setGetApiDataTransactionEndpoint());


    }

    @Step("I receive invalid Get Data Transaction http response code 401")
    public void receiveInvalidGetDataTransactionHttpResponseCode401() {
        restAssuredThat(response -> response.statusCode(401));

    }

    @Step("I receive error message to Get Data Transaction")
    public void receiveErrorMessageToGetDataTransaction() {
        restAssuredThat(response -> response.body("'pesan'", equalTo("bukan admin")));

    }

    @Step("Admin set Get Api Transaction pemasukan endpoint")
    public String adminSetGetApiTransactionPemasukanEndpoint() {
        return url + "transaksi/pemasukan";
    }

    @Step("Admin send Get Transaction pemasukan endpoint")
    public void adminSendGetTransactionPemasukanEndpoint() {
        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").get(adminSetGetApiTransactionPemasukanEndpoint());

    }

    @Step("Admin receive valid Get Transaction pemasukan http response code 200")
    public void adminReceiveValidGetTransactionPemasukanHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));

    }
    @Step("I set Get Api Transaction pemasukan endpoint")
    public String  setGetApiTransactionPemasukanEndpoint() {
        return url + "transaksi/pemasukan";

    }

    @Step("I send Get Transaction pemasukan endpoint")
    public void sendGetTransactionPemasukanEndpoint() {
        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").get(setGetApiTransactionPemasukanEndpoint());


    }

    @Step("I receive invalid Get Transaction pemasukan http response code 401")
    public void receiveInvalidGetTransactionPemasukanHttpResponseCode401() {
        restAssuredThat(response -> response.statusCode(401));


    }

    @Step("I set Get Api Transaction with ID endpoint")
    public String setGetApiTransactionWithIDEndpoint() {
        return url + "transaksi/1";

    }

    @Step("I send Get Transaction with ID endpoint")
    public void sendGetTransactionWithIDEndpoint() {
        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").get(setGetApiTransactionWithIDEndpoint());


    }

    @Step("Admin set Get Api Transaction with ID endpoint")
    public String  adminSetGetApiTransactionWithIDEndpoint() {
        return url + "transaksi/1";

    }

    @Step("Admin send Get Transaction with ID endpoint")
    public void adminSendGetTransactionWithIDEndpoint() {
        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").get(adminSetGetApiTransactionWithIDEndpoint());

    }
    @Step("Admin receive valid Get Transaction http response code 200")
    public void adminReceiveValidGetTransactionHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));

    }
    @Step("I set Get Api Transaction without ID endpoint")
    public String  setGetApiTransactionWithoutIDEndpoint() {
        return url + "transaksi/";
    }

    @Step("I send Get Transaction without ID endpoint")
    public void sendGetTransactionWithoutIDEndpoint() {
        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").get(setGetApiTransactionWithoutIDEndpoint());

    }

    @Step("Admin set Get Api Transaction without ID endpoint")
    public String adminSetGetApiTransactionWithoutIDEndpoint() {
        return url + "transaksi/";
    }

    @Step("Admin send Get Transaction without ID endpoint")
    public void adminSendGetTransactionWithoutIDEndpoint() {
        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").get(adminSetGetApiTransactionWithoutIDEndpoint());

    }

    @Step("Admin receive invalid Get Transaction http response code 404")
    public void adminReceiveInvalidGetTransactionHttpResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }

}
