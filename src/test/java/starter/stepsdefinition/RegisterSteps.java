package starter.stepsdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.User.RegisterPOST;


public class RegisterSteps {

    @Steps
    RegisterPOST post;

    @Given("I set Post Api Register endpoint")
    public void setPostApiRegisterEndpoint() {
        post.setPostApiRegisterEndpoint();

    }
    @When("I send Post Register http request")
    public void sendPostRegisterHttpRequest() {
        post.sendPostRegisterHttpRequest();

    }
    @Then("I receive valid Register http response code 200")
    public void receiveValidRegisterHttpResponseCode200() {
        post.receiveValidRegisterHttpResponseCode200();

    }
    @And("I receive valid data for detail user")
    public void receiveValidDataForDetailUser() {
        post.receiveValidDataForDetailUser();

    }
    @When("I send Post Register http request with invalid email")
    public void sendPostRegisterHttpRequestWithInvalidEmail() {
        post.sendPostRegisterHttpRequestWithInvalidEmail();


    }
    @Then("I receive invalid Register http response code 500")
    public void receiveInvalidRegisterHttpResponseCode500() {
        post.receiveInvalidRegisterHttpResponseCode500();


    }
    @And("I receive error message to register")
    public void receiveErrorMessageToRegister() {
        post.receiveErrorMessageToRegister();


    }
    @When("I send Post Register http request with empty email and password")
    public void sendPostRegisterHttpRequestWithEmptyEmailAndPassword() {
        post.sendPostRegisterHttpRequestWithEmptyEmailAndPassword();


    }

}
