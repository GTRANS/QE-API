package starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginPOST {

    protected String url = "https://bearuang.me/user/";

    @Step("I set POST API Login endpoint")
    public String setPostApiLoginEndpoint() {
        return url + "login";

    }
    @Step("I send Post Login http request")
    public void sendPostLoginHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "wantrikw@gmail.com");
        requestBody.put("password", "1234567");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiLoginEndpoint());

    }
    @Step("I receive valid Login http response code 200")
    public void receiveValidLoginHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));


    }
    @Step("I receive valid data to login")
    public void receiveValidDataToLogin() {
        restAssuredThat(response -> response.body("'pesan'", equalTo("success")));


    }
    @Step("I send Post Login http request empty email and password")
    public void sendPostLoginHttpRequestEmptyEmailAndPassword() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        requestBody.put("password", "");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiLoginEndpoint());

    }
    @Step("I receive invalid Login http response code 404")
    public void receiveInvalidLoginHttpResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));

    }
    @Step("I receive error message to login")
    public void receiveErrorMessageToLogin() {
        restAssuredThat(response -> response.body("'pesan'", equalTo("email tidak ditemukan")));

    }
    @Step("I send Post Login http invalid email and password")
    public void sendPostLoginHttpInvalidEmailAndPassword() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "wantri");
        requestBody.put("password", "qwert");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiLoginEndpoint());

    }
    @Step("Admin set POST API Login endpoint")
    public String adminSetPostApiLoginEndpoint() {
        return url + "login";

    }
    @Step("Admin send Post Login http request")
    public void adminSendPostLoginHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "admin@gmail.com");
        requestBody.put("password", "123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(adminSetPostApiLoginEndpoint());

    }
    @Step("Admin receive valid Login http response code 200")
    public void adminReceiveValidLoginHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));


    }
    @Step("Admin receive valid data to login")
    public void adminReceiveValidDataToLogin() {
        restAssuredThat(response -> response.body("'pesan'", equalTo("success")));


    }
    @Step("Admin send Post Login http request empty email and password")
    public void adminSendPostLoginHttpRequestEmptyEmailAndPassword() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        requestBody.put("password", "");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(adminSetPostApiLoginEndpoint());

    }
    @Step("Admin receive invalid Login http response code 404")
    public void adminReceiveInvalidLoginHttpResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));

    }
    @Step("Admin receive error message to login")
    public void adminReceiveErrorMessageToLogin() {
        restAssuredThat(response -> response.body("'pesan'", equalTo("email tidak ditemukan")));

    }
    @Step("Admin send Post Login http invalid email and password")
    public void adminSendPostLoginHttpInvalidEmailAndPassword() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "admin");
        requestBody.put("password", "qwert");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(adminSetPostApiLoginEndpoint());

    }



}