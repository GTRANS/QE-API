package starter.stepsdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Product.ProductDELETE;

public class DeleteProductSteps {

    @Steps
    ProductDELETE delete;

    @Given("Admin want success auth with existing account to delete product")
    public void wantSuccessAuthWithExistingAccountToDeleteProduct() {
        delete.wantSuccessAuthWithExistingAccountToDeleteProduct();

    }
    @When("Admin set Delete Api Product endpoint")
    public void setDeleteApiProductEndpoint() {
        delete.setDeleteApiProductEndpoint();


    }
    @And("Admin send Delete Product endpoint")
    public void sendDeleteProductEndpoint() {
        delete.sendDeleteProductEndpoint();

    }
    @Then("Admin receive valid Delete Product http response code 200")
    public void receiveValidDeleteProductHttpResponseCode200() {
        delete.receiveValidDeleteProductHttpResponseCode200();


    }
    @Then("Admin receive invalid Delete Product http response code 400")
    public void receiveInvalidDeleteProductHttpResponseCode400() {
        delete.receiveInvalidDeleteProductHttpResponseCode400();


    }
    @And("Admin receive error message to Delete Product")
    public void receiveErrorMessageToDeleteProduct() {
        delete.receiveErrorMessageToDeleteProduct();


    }

    @When("Admin set Delete Api Product endpoint invalid ID")
    public void setDeleteApiProductEndpointInvalidID() {
        delete.setDeleteApiProductEndpointInvalidID();


    }
    @And("Admin send Delete Product endpoint invalid ID")
    public void sendDeleteProductEndpointInvalidID() {
        delete.sendDeleteProductEndpointInvalidID();


    }
    @Then("Admin receive valid Delete Product http response code 404")
    public void receiveValidDeleteProductHttpResponseCode404() {
        delete.receiveValidDeleteProductHttpResponseCode404();


    }
}
