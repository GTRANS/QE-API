package starter.stepsdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.User.LoginPOST;


public class LoginSteps {
    @Steps
    LoginPOST post;

    @Given("I set Post Api Login endpoint")
    public void setPostApiLoginEndpoint() {
        post.setPostApiLoginEndpoint();

    }
    @When("I send Post Login http request")
    public void sendPostLoginHttpRequest() {
        post.sendPostLoginHttpRequest();

    }
    @Then("I receive valid Login http response code 200")
    public void receiveValidLoginHttpResponseCode200() {
        post.receiveValidLoginHttpResponseCode200();

    }
    @And("I receive valid data to login")
    public void receiveValidDataToLogin() {
        post.receiveValidDataToLogin();

    }
    @When("I send Post Login http request empty email and password")
    public void sendPostLoginHttpRequestEmptyEmailAndPassword() {
        post.sendPostLoginHttpRequestEmptyEmailAndPassword();

    }
    @Then("I receive invalid Login http response code 404")
    public void receiveInvalidLoginHttpResponseCode404() {
        post.receiveInvalidLoginHttpResponseCode404();

    }
    @And("I receive error message to login")
    public void receiveErrorMessageToLogin() {
        post.receiveErrorMessageToLogin();

    }
    @When("I send Post Login http invalid email and password")
    public void sendPostLoginHttpInvalidEmailAndPassword() {
        post.sendPostLoginHttpInvalidEmailAndPassword();

    }
    @Given("Admin set Post Api Login endpoint")
    public void adminSetPostApiLoginEndpoint() {
        post.adminSetPostApiLoginEndpoint();
    }

    @When("Admin send Post Login http request")
    public void adminSendPostLoginHttpRequest() {
        post.adminSendPostLoginHttpRequest();
    }

    @Then("Admin receive valid Login http response code 200")
    public void adminReceiveValidLoginHttpResponseCode200() {
        post.adminReceiveValidLoginHttpResponseCode200();
    }

    @And("Admin receive valid data to login")
    public void adminReceiveValidDataToLogin() {
        post.adminReceiveValidDataToLogin();
    }

    @When("Admin send Post Login http request empty email and password")
    public void adminSendPostLoginHttpRequestEmptyEmailAndPassword() {
        post.adminSendPostLoginHttpRequestEmptyEmailAndPassword();
    }

    @Then("Admin receive invalid Login http response code 404")
    public void adminReceiveInvalidLoginHttpResponseCode404() {
        post.adminReceiveInvalidLoginHttpResponseCode404();
    }

    @And("Admin receive error message to login")
    public void adminReceiveErrorMessageToLogin() {
        post.adminReceiveErrorMessageToLogin();
    }

    @When("Admin send Post Login http invalid email and password")
    public void adminSendPostLoginHttpInvalidEmailAndPassword() {
        post.adminSendPostLoginHttpInvalidEmailAndPassword();
    }
}
