import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginSteps_v1 {

    @Then("the user should be notified with an appropriate error message")
    public void theUserShouldBeNotifiedWithAnAppropriateErrorMessage() {
        String errorMessage = loginPage.getErrorMessage();
        Assert.assertNotNull(errorMessage, "Error message is not displayed");
        Assert.assertTrue(errorMessage.contains("appropriate error message"), "Error message is not appropriate");
    }

    @Then("the login process should be secure")
    public void theLoginProcessShouldBeSecure() {
        boolean isSecure = loginPage.isLoginProcessSecure();
        Assert.assertTrue(isSecure, "Login process is not secure");
    }

    @Then("user information should be protected following best practices")
    public void userInformationShouldBeProtectedFollowingBestPractices() {
        boolean isProtected = loginPage.isUserInformationProtected();
        Assert.assertTrue(isProtected, "User information is not protected following best practices");
    }
}
