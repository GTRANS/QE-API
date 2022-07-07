package starter.Category;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

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
}
