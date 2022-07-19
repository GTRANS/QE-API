package starter.stepsdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Category.CategoryPOST;

public class CategorySteps {

    @Steps
    CategoryPOST post;


    @Given("Admin want success auth with existing account to post category")
    public void wantSuccessAuthWithExistingAccountToPostCategory() {
        post.wantSuccessAuthWithExistingAccountToPostCategory();

    }
    @When("Admin set Post Api Category endpoint")
    public void setPostApiCategoryEndpoint() {
        post.setPostApiCategoryEndpoint();

    }
    @And("Admin send Post Category http request")
    public void sendPostCategoryHttpRequest() {
        post.sendPostCategoryHttpRequest();

    }
    @Then("Admin receive valid Post Category http response code 200")
    public void receiveValidPostCategoryHttpResponseCode200() {
        post.receiveValidPostCategoryHttpResponseCode200();

    }
    @And("Admin send Post Category http request empty saldo")
    public void sendPostCategoryHttpRequestEmptySaldo() {
        post.sendPostCategoryHttpRequestEmptySaldo();
    }

    @Then("Admin receive invalid Category http response code 500")
    public void receiveInvalidCategoryHttpResponseCode500() {
        post.receiveInvalidCategoryHttpResponseCode500();

    }
    @Given("I want success auth with existing account to post category")
    public void iWantSuccessAuthWithExistingAccountToPostCategory() {
        post.iWantSuccessAuthWithExistingAccountToPostCategory();

    }
    @When("I set Post Api Category endpoint")
    public void iSetPostApiCategoryEndpoint() {
        post.iSetPostApiCategoryEndpoint();
    }

    @And("I send Post Category http request")
    public void iSendPostCategoryHttpRequest() {
        post.iSendPostCategoryHttpRequest();
    }

    @Then("I receive invalid Post Category http response code 401")
    public void iReceiveInvalidPostCategoryHttpResponseCode401() {
        post.iReceiveInvalidPostCategoryHttpResponseCode401();
    }

    @Then("Admin receive invalid Category http response code 400")
    public void receiveInvalidCategoryHttpResponseCode400() {
        post.receiveInvalidCategoryHttpResponseCode400();
    }

    @And("Admin receive error message to post Category")
    public void receiveErrorMessageToPostCategory() {
        post.receiveErrorMessageToPostCategory();


    }
    @Given("Admin set Post Api Category endpoint with invalid token")
    public void adminSetPostApiCategoryEndpointWithInvalidToken() {
        post.adminSetPostApiCategoryEndpointWithInvalidToken();


    }
    @When("Admin send Post Category endpoint with invalid token")
    public void adminSendPostCategoryEndpointWithInvalidToken() {
        post.adminSendPostCategoryEndpointWithInvalidToken();


    }
    @Then("Admin receive invalid Post Category http response code 401")
    public void adminReceiveInvalidPostCategoryHttpResponseCode401() {
        post.adminReceiveInvalidPostCategoryHttpResponseCode401();


    }
    @And("Admin receive error message to Post Category")
    public void adminReceiveErrorMessageToPostCategory() {
        post.adminReceiveErrorMessageToPostCategory();


    }
}
