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
}
