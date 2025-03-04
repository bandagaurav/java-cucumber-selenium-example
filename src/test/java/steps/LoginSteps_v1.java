package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;
import utils.TestContextSetup;

public class LoginSteps {

    private final LoginPage loginPage;

    public LoginSteps(TestContextSetup testContextSetup) {
        this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
    }

    @Then("^the user should have access to the private area$")
    public void user_should_have_access_to_private_area() {
        // Implement the logic to verify access to the private area
        Assert.assertTrue(loginPage.isPrivateAreaAccessible(), "Private area is not accessible");
    }

    @Then("^the user should not be able to access the private area$")
    public void user_should_not_have_access_to_private_area() {
        // Implement the logic to verify no access to the private area
        Assert.assertFalse(loginPage.isPrivateAreaAccessible(), "Private area is accessible");
    }

    @Then("^the user should be notified with an appropriate error message$")
    public void user_should_be_notified_with_error_message() {
        // Implement the logic to verify the error message
        Assert.assertTrue(loginPage.isErrorMessageDisplayed(), "Error message is not displayed");
    }

    @Then("^the login process should be secure$")
    public void login_process_should_be_secure() {
        // Implement the logic to verify the security of the login process
        Assert.assertTrue(loginPage.isLoginProcessSecure(), "Login process is not secure");
    }

    @Then("^user information should be protected following best practices$")
    public void user_information_should_be_protected() {
        // Implement the logic to verify the protection of user information
        Assert.assertTrue(loginPage.isUserInformationProtected(), "User information is not protected");
    }
}
