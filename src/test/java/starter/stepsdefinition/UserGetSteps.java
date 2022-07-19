package starter.stepsdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.User.UserGET;

public class UserGetSteps {

    @Steps
    UserGET get;

    @Given("I want success auth with existing account to get data user")
    public void wantSuccessAuthWithExistingAccountToGetDataUser() {
        get.wantSuccessAuthWithExistingAccountToGetDataUser();

    }
    @When("I set Get Api Data User endpoint")
    public void setGetApiDataUserEndpoint() {
        get.setGetApiDataUserEndpoint();

    }
    @And("I send Get Data User endpoint")
    public void sendGetDataUserEndpoint() {
        get.sendGetDataUserEndpoint();

    }
    @Then("I receive valid Data User http response code 200")
    public void receiveValidDataUserHttpResponseCode200() {
        get.receiveValidDataUserHttpResponseCode200();

    }

    @Given("I set Get Api Data User endpoint without token")
    public void setGetApiDataUserEndpointWithoutToken() {
        get.setGetApiDataUserEndpointWithoutToken();

    }

    @When("I send Get Data User http request")
    public void sendGetDataUserHttpRequest() {
        get.sendGetDataUserHttpRequest();

    }

    @Then("I receive invalid Data User http response code 400")
    public void receiveInvalidDataUserHttpResponseCode400() {
        get.receiveInvalidDataUserHttpResponseCode400();

    }

    @And("I receive error message to get Data User")
    public void receiveErrorMessageToGetDataUser() {
        get.receiveErrorMessageToGetDataUser();
    }

    @Given("I set Get Api Data User endpoint with invalid token")
    public void setGetApiDataUserEndpointWithInvalidToken() {
        get.setGetApiDataUserEndpointWithInvalidToken();
    }

    @When("I send Get Data User invalid token http request")
    public void sendGetDataUserInvalidTokenHttpRequest() {
        get.sendGetDataUserInvalidTokenHttpRequest();
    }

    @Then("I receive invalid Data User http response code 401")
    public void receiveInvalidDataUserHttpResponseCode401() {
        get.receiveInvalidDataUserHttpResponseCode401();
    }

    @And("I receive error message to get ID User")
    public void receiveErrorMessageToGetIDUser() {
        get.receiveErrorMessageToGetIDUser();
    }
}
