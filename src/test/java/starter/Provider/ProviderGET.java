package starter.Provider;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class ProviderGET {

    protected String token = "";
    protected String url = "https://bearuang.me/";

    @Step("I want success auth with existing account to get Provider")
    public void wantSuccessAuthWithExistingAccountToGetProvider() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "wantrikw@gmail.com");
        requestBody.put("password", "1234567");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post("https://bearuang.me/user/login");
        Response resp = SerenityRest.lastResponse();
        this.token = resp.getBody().jsonPath().get("token");

    }
    @Step("I set Get Api Provider endpoint")
    public String setGetApiProviderEndpoint() {
        return url + "provider/1";


    }
    @Step("I send Get Provider endpoint")
    public void sendGetProviderEndpoint() {

        SerenityRest.given().header("Authorization", "Bearer " + this.token).get(setGetApiProviderEndpoint());


    }
    @Step("I receive valid Provider http response code 200")
    public void receiveValidProviderHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));


    }
    @Step("I set Get Api Provider endpoint empty ID")
    public String setGetApiProviderEndpointEmptyID() {
        return url + "provider/";


    }
    @Step("I send Get Provider endpoint empty ID")
    public void sendGetProviderEndpointEmptyID() {

        SerenityRest.given().header("Authorization", "Bearer " + this.token).get(setGetApiProviderEndpointEmptyID());


    }
    @Step("I receive invalid Provider http response code 404")
    public void receiveInvalidProviderHttpResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));

    }
    @Step("I set Get Api Provider endpoint without input token")
    public String  iSetGetApiProviderEndpointWithoutInputToken() {
        return url + "provider/1";


    }
    @Step("I send Get Provider endpoint without input token")
    public void iSendGetProviderEndpointWithoutInputToken() {

        SerenityRest.given().header("Authorization", "Bearer " + this.token).get(iSetGetApiProviderEndpointWithoutInputToken());



    }
    @Step("I receive invalid Provider http response code 400")
    public void iReceiveInvalidProviderHttpResponseCode400() {
        restAssuredThat(response -> response.statusCode(400));


    }
    @Step("I receive error message to get Provider")
    public void iReceiveErrorMessageToGetProvider() {
        restAssuredThat(response -> response.body("'message'", equalTo("missing or malformed jwt")));



    }
    protected String invalidtoken = "sjdvbkasbvsjd ";

    @Step("I set Get Api Provider endpoint with invalid token")
    public String  iSetGetApiProviderEndpointWithInvalidToken() {
        return url + "provider/1";


    }
    @Step("I send Get Provider endpoint with invalid token")
    public void iSendGetProviderEndpointWithInvalidToken() {
        SerenityRest.given().header("Authorization", "Bearer " + this.invalidtoken).get(iSetGetApiProviderEndpointWithInvalidToken());



    }
    @Step("I receive invalid Provider http response code 401")
    public void iReceiveInvalidProviderHttpResponseCode401() {
        restAssuredThat(response -> response.statusCode(401));


    }
    @Step("I receive error message to get this Provider")
    public void iReceiveErrorMessageToGetThisProvider() {
        restAssuredThat(response -> response.body("'message'", equalTo("invalid or expired jwt")));
    }

}
