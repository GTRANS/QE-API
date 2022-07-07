package starter.Product;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class ProductDELETE {

    protected String token = "";
    protected String url = "https://bearuang.me/";

    @Step("Adminwant success auth with existing account to delete product")
    public void wantSuccessAuthWithExistingAccountToDeleteProduct() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "admin@gmail.com");
        requestBody.put("password", "123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post("https://bearuang.me/user/login");
        Response resp = SerenityRest.lastResponse();
        this.token = resp.getBody().jsonPath().get("token");

    }
    @Step("Admin set Delete Api Product endpoint")
    public String  setDeleteApiProductEndpoint() {
        return url + "produk/1";


    }
    @Step("Admin send Delete Product endpoint")
    public void sendDeleteProductEndpoint() {
        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").delete(setDeleteApiProductEndpoint());

    }
    @Step("Admin receive valid Delete Product http response code 200")
    public void receiveValidDeleteProductHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));


    }
    @Step("Admin receive invalid Delete Product http response code 400")
    public void receiveInvalidDeleteProductHttpResponseCode400() {
        restAssuredThat(response -> response.statusCode(400));


    }
    @Step("Admin receive error message to Delete Product")
    public void receiveErrorMessageToDeleteProduct() {
        restAssuredThat(response -> response.body("'message'", equalTo("missing or malformed jwt")));


    }
    @Step("Admin set Delete Api Product endpoint invalid ID")
    public String setDeleteApiProductEndpointInvalidID() {
        return url + "produk/";


    }
    @Step("Admin send Delete Product endpoint invalid ID")
    public void sendDeleteProductEndpointInvalidID() {
        SerenityRest.given().header("Authorization", "Bearer " + this.token).header("Content-Type", "application/json").delete(setDeleteApiProductEndpointInvalidID());


    }
    @Step("Admin receive valid Delete Product http response code 404")
    public void receiveValidDeleteProductHttpResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));


    }

}
