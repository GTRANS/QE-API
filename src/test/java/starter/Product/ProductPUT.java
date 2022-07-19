package starter.Product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class ProductPUT {

    protected String token = "";
    protected String url = "https://bearuang.me/";

    @Step("Admin want success auth with existing account to put product")
    public void wantSuccessAuthWithExistingAccountToPutProduct() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "admin@gmail.com");
        requestBody.put("password", "123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post("https://bearuang.me/user/login");
        Response resp = SerenityRest.lastResponse();
        this.token = resp.getBody().jsonPath().get("token");


    }

    @Step("Admin set Put Api Product endpoint")
    public String setPutApiProductEndpoint() {
        return url + "produk/72";


    }

    @Step("Admin send Put Product endpoint")
    public void sendPutProductEndpoint() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("nama", "Pulsa Axis 50k");
        requestBody.put("harga", 52000);
        requestBody.put("nominal", 50000);
        requestBody.put("deskripsi", "Pulsa Axis 50000");

        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutApiProductEndpoint());

    }

    @Step("Admin receive valid Put Product http response code 200")
    public void receiveValidPutProductHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));

    }

    @Step("Admin set Put Api Product endpoint invalid ID")
    public String setPutApiProductEndpointInvalidID() {
        return url + "produk/";

    }

    @Step("Admin send Put Product endpoint invalid ID")
    public void sendPutProductEndpointInvalidID() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("nama", "Pulsa Axis 50k");
        requestBody.put("harga", 52000);
        requestBody.put("nominal", 50000);
        requestBody.put("deskripsi", "Pulsa Axis 50000");

        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutApiProductEndpointInvalidID());


    }

    @Step("Admin receive invalid Put Product http response code 404")
    public void receiveInvalidPutProductHttpResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));


    }

    @Step("Admin receive invalid Put Product http response code 400")
    public void adminReceiveInvalidPutProductHttpResponseCode400() {
        restAssuredThat(response -> response.statusCode(400));


    }

    @Step("Admin receive error message to Put Product")
    public void adminReceiveErrorMessageToPutProduct() {
        restAssuredThat(response -> response.body("'message'", equalTo("missing or malformed jwt")));


    }

    protected String invalidtoken = "ljsiksjbvdjsd ";

    @Step("Admin set Put Api Product endpoint with invalid token")
    public String adminSetPutApiProductEndpointWithInvalidToken() {
        return url + "produk/72";

    }

    @Step("Admin send Put Product endpoint with invalid token")
    public void adminSendPutProductEndpointWithInvalidToken() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("nama", "Pulsa Axis 50k");
        requestBody.put("harga", 52000);
        requestBody.put("nominal", 50000);
        requestBody.put("deskripsi", "Pulsa Axis 50000");

        SerenityRest.given().header("Authorization", "Bearer " + this.invalidtoken).header("Content-Type", "application/json").body(requestBody.toJSONString()).put(adminSetPutApiProductEndpointWithInvalidToken());


    }

    @Step("Admin receive invalid Put Product http response code 401")
    public void adminReceiveInvalidPutProductHttpResponseCode401() {
        restAssuredThat(response -> response.statusCode(401));


    }

    @Step("Admin receive error message to Put this Product")
    public void adminReceiveErrorMessageToPutThisProduct() {
        restAssuredThat(response -> response.body("'message'", equalTo("invalid or expired jwt")));


    }
    @Step("I want success auth with existing account to Put Product")
    public void iWantSuccessAuthWithExistingAccountToPutProduct() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "wantrikw@gmail.com");
        requestBody.put("password", "1234567");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post("https://bearuang.me/user/login");
        Response resp = SerenityRest.lastResponse();
        this.token = resp.getBody().jsonPath().get("token");


    }
    @Step("I set Put Api Product endpoint")
    public String iSetPutApiProductEndpoint() {
        return url + "produk/72";


    }
    @Step("I send Put Product http request")
    public void iSendPutProductHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("nama", "Pulsa Axis 50k");
        requestBody.put("harga", 52000);
        requestBody.put("nominal", 50000);
        requestBody.put("deskripsi", "Pulsa Axis 50000");

        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").body(requestBody.toJSONString()).put(iSetPutApiProductEndpoint());

    }
    @Step("I receive invalid Put Product http response code 401")
    public void iReceiveInvalidPutProductHttpResponseCode401() {
        restAssuredThat(response -> response.statusCode(401));


    }
}