package starter.stepsdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.User.UserPUT;

public class UserSteps {
    @Steps
    UserPUT put;

    @Given("I want success auth with existing account to put data product")
    public void wantSuccessAuthWithExistingAccountToPutDataProduct() {
        put.wantSuccessAuthWithExistingAccountToPutDataProduct();

    }

    @When("I set Put Api data product endpoint")
    public void setPutApiDataProductEndpoint() {
        put.setPutApiDataProductEndpoint();
    }

    @And("I send Put data product endpoint")
    public void sendPutDataProductEndpoint() {
        put.sendPutDataProductEndpoint();
    }

    @Then("I receive valid data product http response code 200")
    public void receiveValidDataProductHttpResponseCode200() {
        put.receiveValidDataProductHttpResponseCode200();

    }
    @When("I send Put data product http request without token")
    public void sendPutDataProductHttpRequestWithoutToken() {
        put.sendPutDataProductHttpRequestWithoutToken();
    }

    @Then("I receive invalid data product http response code 400")
    public void receiveInvalidDataProductHttpResponseCode400() {
        put.receiveInvalidDataProductHttpResponseCode400();
    }

    @And("I receive error message to put data product")
    public void receiveErrorMessageToPutDataProduct() {
        put.receiveErrorMessageToPutDataProduct();
    }


    @Given("Admin want success auth with existing account to put data product")
    public void adminWantSuccessAuthWithExistingAccountToPutDataProduct() {
        put.adminWantSuccessAuthWithExistingAccountToPutDataProduct();


    }
    @When("Admin set Put Api data product endpoint")
    public void adminSetPutApiDataProductEndpoint() {
        put.adminSetPutApiDataProductEndpoint();


    }
    @And("Admin send Put data product endpoint")
    public void adminSendPutDataProductEndpoint() {
        put.adminSendPutDataProductEndpoint();


    }
    @Then("Admin receive valid data product http response code 200")
    public void adminReceiveValidDataProductHttpResponseCode200() {
        put.adminReceiveValidDataProductHttpResponseCode200();


    }
    @When("Admin send Put data product http request without token")
    public void adminSendPutDataProductHttpRequestWithoutToken() {
        put.adminSendPutDataProductHttpRequestWithoutToken();


    }
    @Then("Admin receive invalid data product http response code 400")
    public void adminReceiveInvalidDataProductHttpResponseCode400() {
        put.adminReceiveInvalidDataProductHttpResponseCode400();


    }
    @And("Admin receive error message to put data product")
    public void adminReceiveErrorMessageToPutDataProduct() {
        put.adminReceiveErrorMessageToPutDataProduct();


    }
    @Given("Admin set Put Api Data User endpoint with invalid token")
    public void adminSetPutApiDataUserEndpointWithInvalidToken() {
        put.adminSetPutApiDataUserEndpointWithInvalidToken();


    }
    @When("Admin send Put Data User invalid token http request")
    public void adminSendPutDataUserInvalidTokenHttpRequest() {
        put.adminSendPutDataUserInvalidTokenHttpRequest();


    }
    @Then("Admin receive invalid Data User http response code 401")
    public void adminReceiveInvalidDataUserHttpResponseCode401() {
        put.adminReceiveInvalidDataUserHttpResponseCode401();


    }
    @And("Admin receive error message to put update data product")
    public void adminReceiveErrorMessageToPutUpdateDataProduct() {
        put.adminReceiveErrorMessageToPutUpdateDataProduct();


    }
}
