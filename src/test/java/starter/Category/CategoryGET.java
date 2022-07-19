package starter.Category;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class CategoryGET {

    protected String token = "";
    protected String url = "https://bearuang.me/";

    @Step("I want success auth with existing account to get Category")
    public void wantSuccessAuthWithExistingAccountToGetCategory() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "wantrikw@gmail.com");
        requestBody.put("password", "1234567");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post("https://bearuang.me/user/login");
        Response resp = SerenityRest.lastResponse();
        this.token = resp.getBody().jsonPath().get("token");

    }

    @Step("I set Get Api product by Category endpoint")
    public String setGetApiProductByCategoryEndpoint() {
        return url + "kategori/produk/1";


    }

    @Step("I send Get product by Category endpoint")
    public void sendGetProductByCategoryEndpoint() {

        SerenityRest.given().header("Authorization", "Bearer " + this.token).get(setGetApiProductByCategoryEndpoint());


    }
    @Step("I receive valid category http response code 200")
    public void receiveValidCategoryHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));

}

    protected String link = "https://bearuang.me/";

    @Step("I set Get Api Category endpoint without input token")
    public String setGetApiCategoryEndpointWithoutInputToken() {
        return link + " ";


    }

    @Step("I send Get Category endpoint without input token")
    public void sendGetCategoryEndpointWithoutInputToken() {
        SerenityRest.given().get(setGetApiCategoryEndpointWithoutInputToken());


    }
    @Step("I receive invalid Category http response code 404")
    public void receiveInvalidCategoryHttpResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));


    }
    @Step("I set Get Api Category endpoint")
    public String setGetApiCategoryEndpoint() {
        return url + "kategori";


    }
    @Step("I send Get Category endpoint")
    public void sendGetCategoryEndpoint() {

        SerenityRest.given().header("Authorization", "Bearer " + this.token).get(setGetApiCategoryEndpoint());


}

    @Step("Admin want success auth with existing account to get Category")
    public void adminWantSuccessAuthWithExistingAccountToGetCategory() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "admin@gmail.com");
        requestBody.put("password", "123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post("https://bearuang.me/user/login");
        Response resp = SerenityRest.lastResponse();
        this.token = resp.getBody().jsonPath().get("token");

    }

    @Step("Admin set Get Api Category saldo endpoint")
    public String adminSetGetApiCategorySaldoEndpoint() {
        return url + "kategori/saldo";


    }

    @Step("Admin send Get Category saldo endpoint")
    public void adminSendGetCategorySaldoEndpoint() {

        SerenityRest.given().header("Authorization", "Bearer " + this.token).get(adminSetGetApiCategorySaldoEndpoint());

    }
    @Step("Admin receive valid category http response code 200")
    public void adminReceiveValidCategoryHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));


}
    @Step("I set Get Api Category saldo endpoint")
    public String setGetApiCategorySaldoEndpoint() {
        return url + "kategori/saldo";


    }
    @Step("I send Get Category saldo endpoint")
    public void sendGetCategorySaldoEndpoint() {

        SerenityRest.given().header("Authorization", "Bearer " + this.token).get(setGetApiCategorySaldoEndpoint());

    }
    @Step("I receive invalid Category http response code 401")
    public void receiveInvalidCategoryHttpResponseCode401() {
        restAssuredThat(response -> response.statusCode(401));

    }
    @Step("I set Get Api product by Category endpoint without ID")
    public String setGetApiProductByCategoryEndpointWithoutID() {
        return url + "kategori/produk/";


    }
    @Step("I send Get product by Category endpoint without ID")
    public void sendGetProductByCategoryEndpointWithoutID() {
        SerenityRest.given().header("Authorization", "Bearer " + this.token).get(setGetApiProductByCategoryEndpointWithoutID());


    }
    @Step("I receive error message to Get Category")
    public void receiveErrorMessageToGetCategory() {
        restAssuredThat(response -> response.body("'message'", equalTo("Not Found")));


    }
    @Step("Admin receive invalid category http response code 400")
    public void adminReceiveInvalidCategoryHttpResponseCode400() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("Admin receive error message to Get Category")
    public void adminReceiveErrorMessageToGetCategory() {
        restAssuredThat(response -> response.body("'message'", equalTo("missing or malformed jwt")));


    }
}