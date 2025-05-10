import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.LoginPage;

public class UserLoginSteps_v1 {
    private LoginPage loginPage = new LoginPage();

    @Then("the user should see an error message {string}")
    public void theUserShouldSeeAnErrorMessage(String expectedErrorMessage) {
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message does not match");
    }

    @Then("the login process should follow best practices to protect user information")
    public void theLoginProcessShouldFollowBestPractices() {
        Assert.assertTrue(loginPage.isSecureConnection(), "The connection is not secure");
        Assert.assertTrue(loginPage.isPasswordEncrypted(), "The password is not encrypted");
    }
}
