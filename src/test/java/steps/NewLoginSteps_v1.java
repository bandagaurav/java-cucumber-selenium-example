package steps;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.LoginPage;
import utils.TestContextSetup;

public class NewLoginSteps {
    private final LoginPage loginPage;

    public NewLoginSteps(TestContextSetup testContextSetup) {
        this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
    }

    @Then("the login process should be secure")
    public void the_login_process_should_be_secure() {
        // Implement security checks here
        Assert.assertTrue(loginPage.isLoginProcessSecure(), "Login process is not secure");
    }

    @Then("user information should be protected")
    public void user_information_should_be_protected() {
        // Implement user information protection checks here
        Assert.assertTrue(loginPage.isUserInformationProtected(), "User information is not protected");
    }
}
