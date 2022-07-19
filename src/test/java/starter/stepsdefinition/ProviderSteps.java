package starter.stepsdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Provider.ProviderGET;

public class ProviderSteps {

    @Steps
    ProviderGET get;


    @Given("I want success auth with existing account to get Provider")
    public void wantSuccessAuthWithExistingAccountToGetProvider() {
        get.wantSuccessAuthWithExistingAccountToGetProvider();

    }
    @When("I set Get Api Provider endpoint")
    public void setGetApiProviderEndpoint() {
        get.setGetApiProviderEndpoint();


    }
    @And("I send Get Provider endpoint")
    public void sendGetProviderHttpEndpoint() {
        get.sendGetProviderEndpoint();


    }
    @Then("I receive valid Provider http response code 200")
    public void receiveValidProviderHttpResponseCode200() {
        get.receiveValidProviderHttpResponseCode200();


    }
    @When("I set Get Api Provider endpoint empty ID")
    public void setGetApiProviderEndpointEmptyID() {
        get.setGetApiProviderEndpointEmptyID();


    }
    @And("I send Get Provider endpoint empty ID")
    public void sendGetProviderEndpointEmptyID() {
        get.sendGetProviderEndpointEmptyID();


    }
    @Then("I receive invalid Provider http response code 404")
    public void receiveInvalidProviderHttpResponseCode404() {
        get.receiveInvalidProviderHttpResponseCode404();


    }
    @Given("I set Get Api Provider endpoint without input token")
    public void iSetGetApiProviderEndpointWithoutInputToken() {
        get.iSetGetApiProviderEndpointWithoutInputToken();


    }
    @When("I send Get Provider endpoint without input token")
    public void iSendGetProviderEndpointWithoutInputToken() {
        get.iSendGetProviderEndpointWithoutInputToken();


    }
    @Then("I receive invalid Provider http response code 400")
    public void iReceiveInvalidProviderHttpResponseCode400() {
        get.iReceiveInvalidProviderHttpResponseCode400();


    }
    @And("I receive error message to get Provider")
    public void iReceiveErrorMessageToGetProvider() {
        get.iReceiveErrorMessageToGetProvider();


    }
    @Given("I set Get Api Provider endpoint with invalid token")
    public void iSetGetApiProviderEndpointWithInvalidToken() {
        get.iSetGetApiProviderEndpointWithInvalidToken();


    }
    @When("I send Get Provider endpoint with invalid token")
    public void iSendGetProviderEndpointWithInvalidToken() {
        get.iSendGetProviderEndpointWithInvalidToken();


    }
    @Then("I receive invalid Provider http response code 401")
    public void iReceiveInvalidProviderHttpResponseCode401() {
        get.iReceiveInvalidProviderHttpResponseCode401();


    }
    @And("I receive error message to get this Provider")
    public void iReceiveErrorMessageToGetThisProvider() {
        get.iReceiveErrorMessageToGetThisProvider();
    }

}
