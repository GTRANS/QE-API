package starter.Category;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class CategoryPOST {

    protected String token = "";
    protected String url = "https://bearuang.me/";


    @Step("Admin want success auth with existing account to post category")
    public void wantSuccessAuthWithExistingAccountToPostCategory() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "admin@gmail.com");
        requestBody.put("password", "123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post("https://bearuang.me/user/login");
        Response resp = SerenityRest.lastResponse();
        this.token = resp.getBody().jsonPath().get("token");


    }
    @Step("Admin set Post Api Category endpoint")
    public String setPostApiCategoryEndpoint() {
        return url + "kategori/saldo";

    }

    @Step("Admin send Post Category http request")
    public void sendPostCategoryHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("saldo", 50000);
        requestBody.put("kategori_id", 1);

        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiCategoryEndpoint());


    }
    @Step("Admin receive valid Post Category http response code 200")
    public void receiveValidPostCategoryHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));

    }

    @Step("Admin send Post Category http request empty saldo")
    public void sendPostCategoryHttpRequestEmptySaldo() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("kategori_id", 1);

        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiCategoryEndpoint());


    }
    @Step("Admin receive invalid Category http response code 500")
    public void receiveInvalidCategoryHttpResponseCode500() {
        restAssuredThat(response -> response.statusCode(500));

    }
    @Step("I want success auth with existing account to post category")
    public void iWantSuccessAuthWithExistingAccountToPostCategory() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "wantrikw@gmail.com");
        requestBody.put("password", "1234567");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post("https://bearuang.me/user/login");
        Response resp = SerenityRest.lastResponse();
        this.token = resp.getBody().jsonPath().get("token");

    }
    @Step("I set Post Api Category endpoint")
    public String iSetPostApiCategoryEndpoint() {
        return url + "kategori/saldo";

    }
    @Step("I send Post Category http request")
    public void iSendPostCategoryHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("saldo", 50000);
        requestBody.put("kategori_id", 1);

        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").body(requestBody.toJSONString()).post(iSetPostApiCategoryEndpoint());

    }
    @Step("I receive invalid Post Category http response code 401")
    public void iReceiveInvalidPostCategoryHttpResponseCode401() {
        restAssuredThat(response -> response.statusCode(401));


    }
    @Step("Admin receive invalid Category http response code 400")
    public void receiveInvalidCategoryHttpResponseCode400() {
        restAssuredThat(response -> response.statusCode(400));


    }
    @Step("Admin receive error message to post Category")
    public void receiveErrorMessageToPostCategory() {
        restAssuredThat(response -> response.body("'message'", equalTo("missing or malformed jwt")));


    }

    protected String invalidtoken = "kmsnfjsafbjsc ";

    @Step("Admin set Post Api Category endpoint with invalid token")
    public String adminSetPostApiCategoryEndpointWithInvalidToken() {
        return url + "kategori/saldo";

    }
    @Step("Admin send Post Category endpoint with invalid token")
    public void adminSendPostCategoryEndpointWithInvalidToken() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("saldo", 50000);
        requestBody.put("kategori_id", 1);

        SerenityRest.given().header("Authorization", "Bearer " + this.invalidtoken).header("Content-Type", "application/json").body(requestBody.toJSONString()).post(adminSetPostApiCategoryEndpointWithInvalidToken());


    }
    @Step("Admin receive invalid Post Category http response code 401")
    public void adminReceiveInvalidPostCategoryHttpResponseCode401() {
        restAssuredThat(response -> response.statusCode(401));


    }
    @Step("Admin receive error message to Post Category")
    public void adminReceiveErrorMessageToPostCategory() {
        restAssuredThat(response -> response.body("'message'", equalTo("invalid or expired jwt")));


    }

}
