package starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class RegisterPOST {

    protected String url = "https://bearuang.me/";

    @Step("I set POST API Register endpoint")
    public String setPostApiRegisterEndpoint() {
        return url + "user";

    }
    @Step("I send Post Register HTTP request")
    public void sendPostRegisterHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("nama", "Wantri");
        requestBody.put("email", "wantriksmwt@gmail.com");
        requestBody.put("password", "1234567");
        requestBody.put("nomor_handphone", "082386238470");
        requestBody.put("role_id", "2");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiRegisterEndpoint());

    }
    @Step("I receive valid Register HTTP response code 200")
    public void receiveValidRegisterHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));


    }
    @Step("I receive valid data for detail user")
    public void receiveValidDataForDetailUser() {
        restAssuredThat(response -> response.body("'pesan'", equalTo("sukses")));


    }
    @Step("I send Post Register http request with invalid email")
    public void sendPostRegisterHttpRequestWithInvalidEmail() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("nama", "Wantri");
        requestBody.put("email", "wantri.com");
        requestBody.put("password", "1234567");
        requestBody.put("nomor_handphone", "082386238470");
        requestBody.put("role_id", "2");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiRegisterEndpoint());


    }
    @Step("I receive invalid Register http response code 500")
    public void receiveInvalidRegisterHttpResponseCode500() {
        restAssuredThat(response -> response.statusCode(500));


    }
    @Step("I receive error message to register")
    public void receiveErrorMessageToRegister() {
        restAssuredThat(response -> response.body("'pesan'", equalTo("Gagal kirim email verifikasi")));


    }
    @Step("I send Post Register http request with empty email and password")
    public void sendPostRegisterHttpRequestWithEmptyEmailAndPassword() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("nama", "Wantri");
        requestBody.put("email", "");
        requestBody.put("password", "");
        requestBody.put("nomor_handphone", "082386238470");
        requestBody.put("role_id", "2");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiRegisterEndpoint());

    }


}
