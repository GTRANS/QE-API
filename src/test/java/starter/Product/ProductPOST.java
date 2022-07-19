package starter.Product;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;


public class ProductPOST {

    protected String token = "";
    protected String url = "https://bearuang.me/";


    @Step("Admin want success auth with existing account to post product")
    public void wantSuccessAuthWithExistingAccountToPostProduct() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "admin@gmail.com");
        requestBody.put("password", "123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post("https://bearuang.me/user/login");
        Response resp = SerenityRest.lastResponse();
        this.token = resp.getBody().jsonPath().get("token");

    }
    @Step("Admin set Post Api Product endpoint")
    public String setPostApiProductEndpoint() {
        return url + "produk";

    }
    @Step("Admin send Post Product endpoint")
    public void sendPostProductEndpoint() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("nama", "Pulsa Axis 50k");
        requestBody.put("nominal", 50000);
        requestBody.put("harga", 52000);
        requestBody.put("deskripsi", "Pulsa Axis 50000");
        requestBody.put("kategori_id", 1);
        requestBody.put("provider_id", 1);

        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiProductEndpoint());


    }
    @Step("Admin receive valid Post Product http response code 200")
    public void receiveValidPostProductHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));

}

    @Step("Admin send Post Product endpoint empty category ID")
    public void sendPostProductEndpointEmptyCategoryID() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("nama", "Pulsa Axis 50k");
        requestBody.put("nominal", 50000);
        requestBody.put("harga", 52000);
        requestBody.put("deskripsi", "Pulsa Axis 50000");
        requestBody.put("provider_id", 1);

        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiProductEndpoint());


    }
    @Step("Admin receive invalid Post Product http response code 500")
    public void receiveInvalidPostProductHttpResponseCode500() {
        restAssuredThat(response -> response.statusCode(500));


}

    @Step("Admin send Post Product endpoint empty provider ID")
    public void sendPostProductEndpointEmptyProviderID() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("nama", "Pulsa Axis 50k");
        requestBody.put("nominal", 50000);
        requestBody.put("harga", 52000);
        requestBody.put("deskripsi", "Pulsa Axis 50000");
        requestBody.put("kategori_id", 1);

        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiProductEndpoint());


}

    @Step("Admin send Post Product endpoint with invalid ID")
    public void sendPostProductEndpointWithInvalidID() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("nama", "Pulsa Axis 50k");
        requestBody.put("nominal", 50000);
        requestBody.put("harga", 52000);
        requestBody.put("deskripsi", "Pulsa Axis 50000");
        requestBody.put("kategori_id", "A");
        requestBody.put("provider_id", "B");

        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiProductEndpoint());

    }
    @Step("Admin send Post Product endpoint empty name")
    public void sendPostProductEndpointEmptyName() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("nama", " ");
        requestBody.put("nominal", 50000);
        requestBody.put("harga", 52000);
        requestBody.put("deskripsi", "Pulsa Axis 50000");
        requestBody.put("kategori_id", "A");
        requestBody.put("provider_id", "B");

        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiProductEndpoint());


    }
    protected String invalidtoken = "jsfbjawbdjabcgjh ";

    @Step("Admin set Post Api Product endpoint with invalid token")
    public String  adminSetPostApiProductEndpointWithInvalidToken() {
        return url + "produk";


    }
    @Step("Admin send Post Product endpoint with invalid token")
    public void adminSendPostProductEndpointWithInvalidToken() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("nama", "Pulsa Axis 50k");
        requestBody.put("nominal", 50000);
        requestBody.put("harga", 52000);
        requestBody.put("deskripsi", "Pulsa Axis 50000");
        requestBody.put("kategori_id", 1);
        requestBody.put("provider_id", 1);

        SerenityRest.given().header("Authorization", "Bearer " + this.invalidtoken).header("Content-Type", "application/json").body(requestBody.toJSONString()).post(adminSetPostApiProductEndpointWithInvalidToken());



    }
    @Step("Admin receive invalid Product http response code 401")
    public void adminReceiveInvalidProductHttpResponseCode401() {
        restAssuredThat(response -> response.statusCode(401));


    }
    @Step("Admin receive error message to post product")
    public void adminReceiveErrorMessageToPostProduct() {
        restAssuredThat(response -> response.body("'message'", equalTo("invalid or expired jwt")));



    }
    @Step("I want success auth with existing account to post product")
    public void iWantSuccessAuthWithExistingAccountToPostProduct() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "wantrikw@gmail.com");
        requestBody.put("password", "1234567");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post("https://bearuang.me/user/login");
        Response resp = SerenityRest.lastResponse();
        this.token = resp.getBody().jsonPath().get("token");

    }
    @Step("I set Post Api Product endpoint")
    public String  iSetPostApiProductEndpoint() {
        return url + "produk";

    }
    @Step("I send Post Product endpoint")
    public void iSendPostProductEndpoint() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("nama", "Pulsa Axis 50k");
        requestBody.put("nominal", 50000);
        requestBody.put("harga", 52000);
        requestBody.put("deskripsi", "Pulsa Axis 50000");
        requestBody.put("kategori_id", 1);
        requestBody.put("provider_id", 1);

        SerenityRest.given().header("Authorization", "Bearer " + this.invalidtoken).header("Content-Type", "application/json").body(requestBody.toJSONString()).post(iSetPostApiProductEndpoint());


    }
    @Step("I receive invalid Post Product http response code 401")
    public void iReceiveInvalidPostProductHttpResponseCode401() {
        restAssuredThat(response -> response.statusCode(401));

    }

}
