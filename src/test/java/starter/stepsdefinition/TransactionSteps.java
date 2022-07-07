package starter.stepsdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Transaction.TransactionPOST;

public class TransactionSteps {

    @Steps
    TransactionPOST post;

    @Given("I want success auth with existing account to transaction")
    public void wantSuccessAuthWithExistingAccountToTransaction() {
        post.wantSuccessAuthWithExistingAccountToTransaction();


    }
    @When("I set Post Api Transaction endpoint")
    public void setPostApiTransactionEndpoint() {
        post.setPostApiTransactionEndpoint();


    }
    @And("I send Post Transaction endpoint")
    public void sendPostTransactionEndpoint() {
        post.sendPostTransactionEndpoint();


    }
    @Then("I receive valid Transaction http response code 200")
    public void receiveValidTransactionHttpResponseCode200() {
        post.receiveValidTransactionHttpResponseCode200();


    }
    @And("I send Post Transaction endpoint invalid user ID")
    public void sendPostTransactionEndpointInvalidUserID() {
        post.sendPostTransactionEndpointInvalidUserID();


    }
    @Then("I receive invalid Transaction http response code 500")
    public void receiveInvalidTransactionHttpResponseCode500() {
        post.receiveInvalidTransactionHttpResponseCode500();


    }
    @And("I send Post Transaction endpoint invalid bank name")
    public void sendPostTransactionEndpointInvalidBankName() {
        post.sendPostTransactionEndpointInvalidBankName();


    }
    @Then("I receive invalid Transaction http response code 520")
    public void receiveInvalidTransactionHttpResponseCode520() {
        post.receiveInvalidTransactionHttpResponseCode520();


    }
    @When("I set Post Api Transaction via e-wallet endpoint")
    public void setPostApiTransactionViaEWalletEndpoint() {
        post.setPostApiTransactionViaEWalletEndpoint();


    }
    @And("I send Post Transaction via e-wallet endpoint")
    public void sendPostTransactionViaEWalletEndpoint() {
        post.sendPostTransactionViaEWalletEndpoint();


    }
    @And("I send Post Transaction via e-wallet endpoint invalid ID")
    public void sendPostTransactionViaEWalletEndpointInvalidID() {
        post.sendPostTransactionViaEWalletEndpointInvalidID();


    }

}
