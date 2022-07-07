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
}
