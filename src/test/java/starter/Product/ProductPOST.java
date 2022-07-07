package starter.Product;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;


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
        return url + "produk/tambah";

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

}
