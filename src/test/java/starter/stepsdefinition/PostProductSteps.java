package starter.stepsdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import starter.Product.ProductPOST;

public class PostProductSteps {

    @Steps
    ProductPOST post;


    @Given("Admin want success auth with existing account to post product")
    public void wantSuccessAuthWithExistingAccountToPostProduct() {
        post.wantSuccessAuthWithExistingAccountToPostProduct();


    }
    @When("Admin set Post Api Product endpoint")
    public void setPostApiProductEndpoint() {
        post.setPostApiProductEndpoint();

    }
    @And("Admin send Post Product endpoint")
    public void sendPostProductEndpoint() {
        post.sendPostProductEndpoint();

    }
    @Then("Admin receive valid Post Product http response code 200")
    public void receiveValidPostProductHttpResponseCode200() {
        post.receiveValidPostProductHttpResponseCode200();


    }
    @And("Admin send Post Product endpoint empty category ID")
    public void sendPostProductEndpointEmptyCategoryID() {
        post.sendPostProductEndpointEmptyCategoryID();


    }
    @Then("Admin receive invalid Post Product http response code 500")
    public void receiveInvalidPostProductHttpResponseCode500() {
        post.receiveInvalidPostProductHttpResponseCode500();


    }
    @And("Admin send Post Product endpoint empty provider ID")
    public void sendPostProductEndpointEmptyProviderID() {
        post.sendPostProductEndpointEmptyProviderID();

    }
    @And("Admin send Post Product endpoint with invalid ID")
    public void sendPostProductEndpointWithInvalidID() {
        post.sendPostProductEndpointWithInvalidID();

    }
    @And("Admin send Post Product endpoint empty name")
    public void sendPostProductEndpointEmptyName() {
        post.sendPostProductEndpointEmptyName();

    }
    @Given("Admin set Post Api Product endpoint with invalid token")
    public void adminSetPostApiProductEndpointWithInvalidToken() {
        post.adminSetPostApiProductEndpointWithInvalidToken();


    }
    @When("Admin send Post Product endpoint with invalid token")
    public void adminSendPostProductEndpointWithInvalidToken() {
       post.adminSendPostProductEndpointWithInvalidToken();


    }
    @Then("Admin receive invalid Product http response code 401")
    public void adminReceiveInvalidProductHttpResponseCode401() {
        post.adminReceiveInvalidProductHttpResponseCode401();


    }
    @And("Admin receive error message to post product")
    public void adminReceiveErrorMessageToPostProduct() {
        post.adminReceiveErrorMessageToPostProduct();


    }
    @Given("I want success auth with existing account to post product")
    public void iWantSuccessAuthWithExistingAccountToPostProduct() {
        post.iWantSuccessAuthWithExistingAccountToPostProduct();

    }
    @When("I set Post Api Product endpoint")
    public void iSetPostApiProductEndpoint() {
        post.iSetPostApiProductEndpoint();

    }
    @And("I send Post Product endpoint")
    public void iSendPostProductEndpoint() {
        post.iSendPostProductEndpoint();

    }
    @Then("I receive invalid Post Product http response code 401")
    public void iReceiveInvalidPostProductHttpResponseCode401() {
        post.iReceiveInvalidPostProductHttpResponseCode401();
    }
}
