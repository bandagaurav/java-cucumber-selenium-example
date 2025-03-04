package steps;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.LoginPage;
import utils.TestContextSetup;

public class LoginSteps {

    private final LoginPage loginPage;

    public LoginSteps(TestContextSetup testContextSetup) {
        this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
    }

    @Then("^the user should see an error message \"([^\"]*)\"")
    public void the_user_should_see_an_error_message(String expectedErrorMessage) {
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message does not match!");
    }

    @Then("^the login process should follow best practices to protect user information")
    public void the_login_process_should_follow_best_practices() {
        boolean isSecure = loginPage.isLoginProcessSecure();
        Assert.assertTrue(isSecure, "Login process is not secure!");
    }
}
