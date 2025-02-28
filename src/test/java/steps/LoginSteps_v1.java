package steps;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Then("the user should not be able to access the private area")
    public void theUserShouldNotBeAbleToAccessThePrivateArea() {
        Assert.assertFalse(userForm.displayAdminDashboard(), "Admin Dashboard should not be displayed");
    }

    @Then("the user should be notified with an appropriate error message")
    public void theUserShouldBeNotifiedWithAnAppropriateErrorMessage() {
        String errorMessage = loginPage.getErrorMessage();
        Assert.assertNotNull(errorMessage, "Error message should be displayed");
    }

    @Then("the login process should be secure")
    public void theLoginProcessShouldBeSecure() {
        boolean isSecure = loginPage.isLoginProcessSecure();
        Assert.assertTrue(isSecure, "Login process should be secure");
    }

    @Then("user information should be protected following best practices")
    public void userInformationShouldBeProtectedFollowingBestPractices() {
        boolean isProtected = loginPage.isUserInformationProtected();
        Assert.assertTrue(isProtected, "User information should be protected following best practices");
    }
}
