package starter.stepsdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Product.ProductPUT;

public class PutProductSteps {

    @Steps
    ProductPUT put;


    @Given("Admin want success auth with existing account to put product")
    public void wantSuccessAuthWithExistingAccountToPutProduct() {
        put.wantSuccessAuthWithExistingAccountToPutProduct();

    }
    @When("Admin set Put Api Product endpoint")
    public void setPutApiProductEndpoint() {
        put.setPutApiProductEndpoint();

    }
    @And("Admin send Put Product endpoint")
    public void sendPutProductEndpoint() {
        put.sendPutProductEndpoint();

    }
    @Then("Admin receive valid Put Product http response code 200")
    public void receiveValidPutProductHttpResponseCode200() {
        put.receiveValidPutProductHttpResponseCode200();


    }

    @And("Admin send Put Product endpoint invalid ID")
    public void sendPutProductEndpointInvalidID() {
        put.sendPutProductEndpointInvalidID();


    }
    @When("Admin set Put Api Product endpoint invalid ID")
    public void adminSetPutApiProductEndpointInvalidID() {
        put.setPutApiProductEndpointInvalidID();


    }
    @Then("Admin receive invalid Put Product http response code 404")
    public void receiveInvalidPutProductHttpResponseCode404() {
        put.receiveInvalidPutProductHttpResponseCode404();


    }
    @Then("Admin receive invalid Put Product http response code 400")
    public void adminReceiveInvalidPutProductHttpResponseCode400() {
        put.adminReceiveInvalidPutProductHttpResponseCode400();


    }
    @And("Admin receive error message to Put Product")
    public void adminReceiveErrorMessageToPutProduct() {
        put.adminReceiveErrorMessageToPutProduct();


    }
    @Given("Admin set Put Api Product endpoint with invalid token")
    public void adminSetPutApiProductEndpointWithInvalidToken() {
        put.adminSetPutApiProductEndpointWithInvalidToken();


    }
    @When("Admin send Put Product endpoint with invalid token")
    public void adminSendPutProductEndpointWithInvalidToken() {
        put.adminSendPutProductEndpointWithInvalidToken();


    }
    @Then("Admin receive invalid Put Product http response code 401")
    public void adminReceiveInvalidPutProductHttpResponseCode401() {
        put.adminReceiveInvalidPutProductHttpResponseCode401();


    }
    @And("Admin receive error message to Put this Product")
    public void adminReceiveErrorMessageToPutThisProduct() {
        put.adminReceiveErrorMessageToPutThisProduct();


    }
    @Given("I want success auth with existing account to Put Product")
    public void iWantSuccessAuthWithExistingAccountToPutProduct() {
        put.iWantSuccessAuthWithExistingAccountToPutProduct();

    }
    @When("I set Put Api Product endpoint")
    public void iSetPutApiProductEndpoint() {
        put.iSetPutApiProductEndpoint();

    }
    @And("I send Put Product http request")
    public void iSendPutProductHttpRequest() {
        put.iSendPutProductHttpRequest();

    }
    @Then("I receive invalid Put Product http response code 401")
    public void iReceiveInvalidPutProductHttpResponseCode401() {
        put.iReceiveInvalidPutProductHttpResponseCode401();


    }
}
