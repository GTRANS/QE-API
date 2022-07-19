package starter.User;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class UserGET {

    protected String token = "";
    protected String url = "https://bearuang.me/";

    @Step("I want success auth with existing account to get data user")
    public void wantSuccessAuthWithExistingAccountToGetDataUser() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "wantrikw@gmail.com");
        requestBody.put("password", "1234567");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post("https://bearuang.me/user/login");
        Response resp = SerenityRest.lastResponse();
        this.token = resp.getBody().jsonPath().get("token");


    }
    @Step("I set Get Api Data User endpoint")
    public String setGetApiDataUserEndpoint() {
        return url + "user";


    }
    @Step("I send Get Data User endpoint")
    public void sendGetDataUserEndpoint() {
        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").get(setGetApiDataUserEndpoint());


    }
    @Step("I receive valid Data User http response code 200")
    public void receiveValidDataUserHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));

    }
    @Step("I set Get Api Data User endpoint without token")
    public String setGetApiDataUserEndpointWithoutToken() {
        return url + "user";

    }

    @Step("I send Get Data User http request")
    public void sendGetDataUserHttpRequest() {
        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").get(setGetApiDataUserEndpointWithoutToken());


    }

    @Step("I receive invalid Data User http response code 400")
    public void receiveInvalidDataUserHttpResponseCode400() {
        restAssuredThat(response -> response.statusCode(400));

    }

    @Step("I receive error message to get Data User")
    public void receiveErrorMessageToGetDataUser() {
        restAssuredThat(response -> response.body("'message'", equalTo("missing or malformed jwt")));

    }

    protected String initoken = "hshdgbcjAGDJmdb ";
    protected String link = "https://bearuang.me/";

    @Step("I set Get Api Data User endpoint with invalid token")
    public String  setGetApiDataUserEndpointWithInvalidToken() {
        return url + "user";

    }

    @Step("I send Get Data User invalid token http request")
    public void sendGetDataUserInvalidTokenHttpRequest() {
        SerenityRest.given().header("Authorization", "Bearer " + this.initoken).header("Content-Type", "application/json").get(setGetApiDataUserEndpointWithInvalidToken());


    }

    @Step("I receive invalid Data User http response code 401")
    public void receiveInvalidDataUserHttpResponseCode401() {
        restAssuredThat(response -> response.statusCode(401));

    }

    @Step("I receive error message to get ID User")
    public void receiveErrorMessageToGetIDUser() {
        restAssuredThat(response -> response.body("'message'", equalTo("invalid or expired jwt")));


    }


}
