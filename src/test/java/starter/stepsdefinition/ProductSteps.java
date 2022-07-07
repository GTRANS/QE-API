package starter.stepsdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Product.ProductGET;

public class ProductSteps {

    @Steps
    ProductGET get;

    @Given("I want success auth with existing account to get product")
    public void wantSuccessAuthWithExistingAccountToGetProduct() {
        get.wantSuccessAuthWithExistingAccountToGetProduct();

    }
    @When("I set Get Api Product endpoint")
    public void setGetApiProductEndpoint() {
        get.setGetApiProductEndpoint();


    }
    @And("I send Get Product endpoint")
    public void sendGetProductEndpoint() {
        get.sendGetProductEndpoint();


    }
    @Then("I receive valid Product http response code 200")
    public void receiveValidProductHttpResponseCode200() {
        get.receiveValidProductHttpResponseCode200();


    }
    @Given("I set Get Api Product endpoint without ID")
    public void setGetApiProductEndpointWithoutID() {
        get.setGetApiProductEndpointWithoutID();


    }
    @When("I send Get Product endpoint without ID")
    public void sendGetProductEndpointWithoutID() {
        get.sendGetProductEndpointWithoutID();


    }
    @Then("I receive invalid Product http response code 404")
    public void receiveInvalidProductHttpResponseCode404() {
        get.receiveInvalidProductHttpResponseCode404();


    }
    @And("I receive error message")
    public void receiveErrorMessage() {
        get.receiveErrorMessage();


    }
    @When("I set Get Api Product by category endpoint")
    public void setGetApiProductByCategoryEndpoint() {
        get.setGetApiProductByCategoryEndpoint();


    }
    @And("I send Get Product by category endpoint")
    public void sendGetProductByCategoryEndpoint() {
        get.sendGetProductByCategoryEndpoint();


    }
    @Then("I receive valid Product by category http response code 200")
    public void receiveValidProductByCategoryHttpResponseCode200() {
        get.receiveValidProductByCategoryHttpResponseCode200();


    }

}
