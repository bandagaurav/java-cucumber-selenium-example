package steps;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.LoginPage;
import utils.TestContextSetup;

public class LoginSecuritySteps {
    private final LoginPage loginPage;

    public LoginSecuritySteps(TestContextSetup testContextSetup) {
        this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
    }

    @Then("the login process should be secure")
    public void theLoginProcessShouldBeSecure() {
        // Implement security checks here
        boolean isSecure = loginPage.isLoginProcessSecure();
        Assert.assertTrue(isSecure, "The login process is not secure");
    }

    @Then("user information should be protected")
    public void userInformationShouldBeProtected() {
        // Implement user information protection checks here
        boolean isProtected = loginPage.isUserInformationProtected();
        Assert.assertTrue(isProtected, "User information is not protected");
    }
}
