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

    @Then("I receive valid Get Transaction http response code 200")
    public void receiveValidGetTransactionHttpResponseCode200() {
        get.receiveValidGetTransactionHttpResponseCode200();

    }
    @When("I set Get Api Transaction endpoint invalid url")
    public void setGetApiTransactionEndpointInvalidUrl() {
        get.setGetApiTransactionEndpointInvalidUrl();


    }
    @And("I send Get Transaction endpoint invalid url")
    public void sendGetTransactionEndpointInvalidUrl() {
        get.sendGetTransactionEndpointInvalidUrl();


    }
    @Then("I receive invalid Get Transaction http response code 404")
    public void receiveInvalidGetTransactionHttpResponseCode404() {
        get.receiveInvalidGetTransactionHttpResponseCode404();


    }

    @Given("Admin want success auth with existing account to get transaction")
    public void adminWantSuccessAuthWithExistingAccountToGetTransaction() {
        get.adminWantSuccessAuthWithExistingAccountToGetTransaction();

    }

    @When("Admin set Get Api Data Transaction endpoint")
    public void adminSetGetApiDataTransactionEndpoint() {
        get.adminSetGetApiDataTransactionEndpoint();

    }

    @And("Admin send Get Data Transaction endpoint")
    public void adminSendGetDataTransactionEndpoint() {
        get.adminSendGetDataTransactionEndpoint();

    }

    @Then("Admin receive valid Get Data Transaction http response code 200")
    public void adminReceiveValidGetDataTransactionHttpResponseCode200() {
        get.adminReceiveValidGetDataTransactionHttpResponseCode200();

    }

    @When("I set Get Api Data Transaction endpoint")
    public void setGetApiDataTransactionEndpoint() {
        get.setGetApiDataTransactionEndpoint();
    }

    @And("I send Get Data Transaction endpoint")
    public void sendGetDataTransactionEndpoint() {
        get.sendGetDataTransactionEndpoint();
    }

    @Then("I receive invalid Get Data Transaction http response code 401")
    public void receiveInvalidGetDataTransactionHttpResponseCode401() {
        get.receiveInvalidGetDataTransactionHttpResponseCode401();
    }

    @And("I receive error message to Get Data Transaction")
    public void receiveErrorMessageToGetDataTransaction() {
        get.receiveErrorMessageToGetDataTransaction();
    }

    @When("Admin set Get Api Transaction pemasukan endpoint")
    public void adminSetGetApiTransactionPemasukanEndpoint() {
        get.adminSetGetApiTransactionPemasukanEndpoint();
    }

    @And("Admin send Get Transaction pemasukan endpoint")
    public void adminSendGetTransactionPemasukanEndpoint() {
        get.adminSendGetTransactionPemasukanEndpoint();
    }

    @Then("Admin receive valid Get Transaction pemasukan http response code 200")
    public void adminReceiveValidGetTransactionPemasukanHttpResponseCode200() {
        get.adminReceiveValidGetTransactionPemasukanHttpResponseCode200();

    }
    @When("I set Get Api Transaction pemasukan endpoint")
    public void setGetApiTransactionPemasukanEndpoint() {
        get.setGetApiTransactionPemasukanEndpoint();
    }

    @And("I send Get Transaction pemasukan endpoint")
    public void sendGetTransactionPemasukanEndpoint() {
        get.sendGetTransactionPemasukanEndpoint();
    }

    @Then("I receive invalid Get Transaction pemasukan http response code 401")
    public void receiveInvalidGetTransactionPemasukanHttpResponseCode401() {
        get.receiveInvalidGetTransactionPemasukanHttpResponseCode401();

    }

    @When("I set Get Api Transaction with ID endpoint")
    public void setGetApiTransactionWithIDEndpoint() {
        get.setGetApiTransactionWithIDEndpoint();

    }

    @And("I send Get Transaction with ID endpoint")
    public void sendGetTransactionWithIDEndpoint() {
        get.sendGetTransactionWithIDEndpoint();

    }

    @When("Admin set Get Api Transaction with ID endpoint")
    public void adminSetGetApiTransactionWithIDEndpoint() {
        get.adminSetGetApiTransactionWithIDEndpoint();

    }

    @And("Admin send Get Transaction with ID endpoint")
    public void adminSendGetTransactionWithIDEndpoint() {
        get.adminSendGetTransactionWithIDEndpoint();

    }

    @Then("Admin receive valid Get Transaction http response code 200")
    public void adminReceiveValidGetTransactionHttpResponseCode200() {
        get.adminReceiveValidGetTransactionHttpResponseCode200();
    }

    @When("I set Get Api Transaction without ID endpoint")
    public void setGetApiTransactionWithoutIDEndpoint() {
        get.setGetApiTransactionWithoutIDEndpoint();
    }

    @And("I send Get Transaction without ID endpoint")
    public void sendGetTransactionWithoutIDEndpoint() {
        get.sendGetTransactionWithoutIDEndpoint();
    }

    @When("Admin set Get Api Transaction without ID endpoint")
    public void adminSetGetApiTransactionWithoutIDEndpoint() {
        get.adminSetGetApiTransactionWithoutIDEndpoint();
    }

    @And("Admin send Get Transaction without ID endpoint")
    public void adminSendGetTransactionWithoutIDEndpoint() {
        get.adminSendGetTransactionWithoutIDEndpoint();
    }

    @Then("Admin receive invalid Get Transaction http response code 404")
    public void adminReceiveInvalidGetTransactionHttpResponseCode404() {
        get.adminReceiveInvalidGetTransactionHttpResponseCode404();
    }

}
