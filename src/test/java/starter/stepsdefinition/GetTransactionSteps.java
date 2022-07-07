package starter.stepsdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Transaction.TransactionGET;

public class GetTransactionSteps {

    @Steps
    TransactionGET get;

    @Given("I want success auth with existing account to get transaction")
    public void wantSuccessAuthWithExistingAccountToGetTransaction() {
        get.wantSuccessAuthWithExistingAccountToGetTransaction();

    }
    @When("I set Get Api Transaction endpoint")
    public void setGetApiTransactionEndpoint() {
        get.setGetApiTransactionEndpoint();


    }
    @And("I send Get Transaction endpoint")
    public void sendGetTransactionEndpoint() {
        get.sendGetTransactionEndpoint();

    }
    @When("I set Get Api Transaction endpoint invalid url")
    public void setGetApiTransactionEndpointInvalidUrl() {
        get.setGetApiTransactionEndpointInvalidUrl();


    }
    @And("I send Get Transaction endpoint invalid url")
    public void sendGetTransactionEndpointInvalidUrl() {
        get.sendGetTransactionEndpointInvalidUrl();


    }
    @Then("I receive invalid Transaction http response code 404")
    public void receiveInvalidTransactionHttpResponseCode404() {
        get.receiveInvalidTransactionHttpResponseCode404();


    }
}
