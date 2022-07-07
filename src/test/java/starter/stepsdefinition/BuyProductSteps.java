package starter.stepsdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Product.BuyProductGET;

public class BuyProductSteps {

    @Steps
    BuyProductGET get;

    @Given("I want success auth with existing account to buy product")
    public void wantSuccessAuthWithExistingAccountToBuyProduct() {
        get.wantSuccessAuthWithExistingAccountToBuyProduct();

    }
    @When("I set Get Api Buy Product endpoint")
    public void setGetApiBuyProductEndpoint() {
        get.setGetApiBuyProductEndpoint();

    }
    @And("I send Get Buy Product endpoint")
    public void sendGetBuyProductEndpoint() {
        get.sendGetBuyProductEndpoint();

    }
    @Then("I receive valid Buy Product http response code 200")
    public void iReceiveValidBuyProductHttpResponseCode200() {
        get.receiveValidBuyProductHttpResponseCode200();


    }
    @Given("I set Get Api Buy Product endpoint without ID")
    public void setGetApiBuyProductEndpointWithoutID() {
        get.setGetApiBuyProductEndpointWithoutID();

    }
    @When("I send Get Buy Product endpoint without ID")
    public void sendGetBuyProductEndpointWithoutID() {
        get.sendGetBuyProductEndpointWithoutID();

    }
    @Then("I receive invalid Buy Product http response code 404")
    public void receiveInvalidBuyProductHttpResponseCode404() {
        get.receiveInvalidBuyProductHttpResponseCode404();

    }
    @And("I receive error message to buy product")
    public void receiveErrorMessageToBuyProduct() {
        get.receiveErrorMessageToBuyProduct();

    }
}
