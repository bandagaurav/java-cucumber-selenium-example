package stepdefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSteps {

    @When("^I enter the username 'admin' and password 'wrongpassword'$")
    public void enterIncorrectCredentials() {
        // Code to enter incorrect credentials
    }

    @Then("^I should not be logged in$")
    public void verifyNotLoggedIn() {
        // Code to verify user is not logged in
    }

    @Then("^I should see an error message 'Incorrect username or password'$")
    public void verifyErrorMessage() {
        // Code to verify error message
    }

    @Then("^the login process should follow best practices to protect user information$")
    public void verifySecureLoginProcess() {
        // Code to verify secure login process
    }
}
