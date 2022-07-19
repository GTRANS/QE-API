package starter.stepsdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Category.CategoryGET;

public class GetCategorySteps {

    @Steps
    CategoryGET get;

    @Given("I want success auth with existing account to get Category")
    public void wantSuccessAuthWithExistingAccountToGetCategory() {
        get.wantSuccessAuthWithExistingAccountToGetCategory();


    }
    @When("I set Get Api product by Category endpoint")
    public void setGetApiProductByCategoryEndpoint() {
        get.setGetApiProductByCategoryEndpoint();


    }
    @And("I send Get product by Category endpoint")
    public void sendGetProductByCategoryEndpoint() {
        get.sendGetProductByCategoryEndpoint();


    }
    @Then("I receive valid category http response code 200")
    public void receiveValidCategoryHttpResponseCode200() {
        get.receiveValidCategoryHttpResponseCode200();


}

    @Given("I set Get Api Category endpoint without input token")
    public void setGetApiCategoryEndpointWithoutInputToken() {
        get.setGetApiCategoryEndpointWithoutInputToken();


    }
    @When("I send Get Category endpoint without input token")
    public void sendGetCategoryEndpointWithoutInputToken() {
        get.sendGetCategoryEndpointWithoutInputToken();


    }
    @Then("I receive invalid Category http response code 404")
    public void receiveInvalidCategoryHttpResponseCode404() {
        get.receiveInvalidCategoryHttpResponseCode404();


}
    @When("I set Get Api Category endpoint")
    public void setGetApiCategoryEndpoint() {
        get.setGetApiCategoryEndpoint();


    }
    @And("I send Get Category endpoint")
    public void sendGetCategoryEndpoint() {
        get.sendGetCategoryEndpoint();


}

    @Given("Admin want success auth with existing account to get Category")
    public void adminWantSuccessAuthWithExistingAccountToGetCategory() {
        get.adminWantSuccessAuthWithExistingAccountToGetCategory();


    }
    @When("Admin set Get Api Category saldo endpoint")
    public void adminSetGetApiCategorySaldoEndpoint() {
        get.adminSetGetApiCategorySaldoEndpoint();


    }
    @And("Admin send Get Category saldo endpoint")
    public void adminSendGetCategorySaldoEndpoint() {
        get.adminSendGetCategorySaldoEndpoint();


    }
    @Then("Admin receive valid category http response code 200")
    public void adminReceiveValidCategoryHttpResponseCode200() {
        get.adminReceiveValidCategoryHttpResponseCode200();


}
    @When("I set Get Api Category saldo endpoint")
    public void setGetApiCategorySaldoEndpoint() {
        get.setGetApiCategorySaldoEndpoint();


    }
    @And("I send Get Category saldo endpoint")
    public void sendGetCategorySaldoEndpoint() {
        get.sendGetCategorySaldoEndpoint();


    }
    @Then("I receive invalid Category http response code 401")
    public void receiveInvalidCategoryHttpResponseCode401() {
        get.receiveInvalidCategoryHttpResponseCode401();

    }
    @When("I set Get Api product by Category endpoint without ID")
    public void setGetApiProductByCategoryEndpointWithoutID() {
        get.setGetApiProductByCategoryEndpointWithoutID();


    }
    @And("I send Get product by Category endpoint without ID")
    public void sendGetProductByCategoryEndpointWithoutID() {
        get.sendGetProductByCategoryEndpointWithoutID();


    }
    @And("I receive error message to Get Category")
    public void receiveErrorMessageToGetCategory() {
        get.receiveErrorMessageToGetCategory();


    }
    @Then("Admin receive invalid category http response code 400")
    public void adminReceiveInvalidCategoryHttpResponseCode400() {
        get.adminReceiveInvalidCategoryHttpResponseCode400();

    }
    @And("Admin receive error message to Get Category")
    public void adminReceiveErrorMessageToGetCategory() {
        get.adminReceiveErrorMessageToGetCategory();

    }
}

