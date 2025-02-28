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
        Assert.assertTrue(loginPage.isLoginProcessSecure(), "Login process is not secure");
    }

    @Then("user information should be protected")
    public void userInformationShouldBeProtected() {
        Assert.assertTrue(loginPage.isUserInformationProtected(), "User information is not protected");
    }
}
