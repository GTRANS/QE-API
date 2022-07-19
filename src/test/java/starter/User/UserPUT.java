package starter.User;

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

public class UserPUT {

    protected String token = "";
    protected String url = "https://bearuang.me/";

    @Step("I want success auth with existing account to put data product")
    public void wantSuccessAuthWithExistingAccountToPutDataProduct() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "wantrikw@gmail.com");
        requestBody.put("password", "1234567");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post("https://bearuang.me/user/login");
        Response resp = SerenityRest.lastResponse();
        this.token = resp.getBody().jsonPath().get("token");

    }

    @Step("I set Put Api data product endpoint")
    public String setPutApiDataProductEndpoint() {
        return url + "user";
    }

    @Step("I send Put data product endpoint")
    public void sendPutDataProductEndpoint() {
        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").put(setPutApiDataProductEndpoint());

    }

    @Step("I receive valid data product http response code 200")
    public void receiveValidDataProductHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));


    }

    @Step("I send Put data product http request without token")
    public void sendPutDataProductHttpRequestWithoutToken() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("nama", "Pulsa Axis 50k");
        requestBody.put("nomor_handphone", "082386238470");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutApiDataProductEndpoint());

    }

    @Step("I receive invalid data product http response code 400")
    public void receiveInvalidDataProductHttpResponseCode400() {
        restAssuredThat(response -> response.statusCode(400));

    }

    @Step("I receive error message to put data product")
    public void receiveErrorMessageToPutDataProduct() {
        restAssuredThat(response -> response.body("'message'", equalTo("missing or malformed jwt")));

    }

    @Step("Admin want success auth with existing account to put data product")
    public void adminWantSuccessAuthWithExistingAccountToPutDataProduct() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "admin@gmail.com");
        requestBody.put("password", "123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post("https://bearuang.me/user/login");
        Response resp = SerenityRest.lastResponse();
        this.token = resp.getBody().jsonPath().get("token");


    }

    @Step("Admin set Put Api data product endpoint")
    public String adminSetPutApiDataProductEndpoint() {
        return url + "user";


    }

    @Step("Admin send Put data product endpoint")
    public void adminSendPutDataProductEndpoint() {
        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").put(adminSetPutApiDataProductEndpoint());


    }
    @Step("Admin receive valid data product http response code 200")
    public void adminReceiveValidDataProductHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));


    }
    @Step("Admin send Put data product http request without token")
    public void adminSendPutDataProductHttpRequestWithoutToken() {
        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").put(adminSetPutApiDataProductEndpoint());



    }
    @Step("Admin receive invalid data product http response code 400")
    public void adminReceiveInvalidDataProductHttpResponseCode400() {
        restAssuredThat(response -> response.statusCode(400));


    }
    @Step("Admin receive error message to put data product")
    public void adminReceiveErrorMessageToPutDataProduct() {
        restAssuredThat(response -> response.body("'message'", equalTo("missing or malformed jwt")));


    }

    protected String invalidtoken = "jsabfciuasjfgcbwuia ";

    @Step("Admin set Put Api Data User endpoint with invalid token")
    public String adminSetPutApiDataUserEndpointWithInvalidToken() {
        return url + "user";


    }
    @Step("Admin send Put Data User invalid token http request")
    public void adminSendPutDataUserInvalidTokenHttpRequest() {
        SerenityRest.given().header("Authorization", "Bearer " + this.invalidtoken).header("Content-Type", "application/json").put(adminSetPutApiDataUserEndpointWithInvalidToken());



    }
    @Step("Admin receive invalid Data User http response code 401")
    public void adminReceiveInvalidDataUserHttpResponseCode401() {
        restAssuredThat(response -> response.statusCode(401));


    }
    @Step("Admin receive error message to put update data product")
    public void adminReceiveErrorMessageToPutUpdateDataProduct() {
        restAssuredThat(response -> response.body("'message'", equalTo("invalid or expired jwt")));

    }
}
