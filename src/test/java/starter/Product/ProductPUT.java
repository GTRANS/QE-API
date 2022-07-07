package starter.Product;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

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
        return url + "produk/update/1";


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
    public String  setPutApiProductEndpointInvalidID() {
        return url + "produk/update/";

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


}
