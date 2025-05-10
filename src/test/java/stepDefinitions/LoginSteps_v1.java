package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import io.cucumber.java.en.Then;
import pageObjects.LoginPage;
import utils.TestContextSetup;

public class LoginSteps {
    private final LoginPage loginPage;

    public LoginSteps(TestContextSetup testContextSetup) {
        this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
    }

    @Then("^the user should not be logged in$")
    public void the_user_should_not_be_logged_in() throws Throwable {
        Assert.assertFalse(loginPage.isUserLoggedIn(), "User should not be logged in");
    }

    @Then("^the user should see an error message \"([^\"]*)\"$")
    public void the_user_should_see_an_error_message(String errorMessage) throws Throwable {
        Assert.assertEquals(loginPage.getErrorMessage(), errorMessage, "Error message should match");
    }

    @Then("^the login process should be secure$")
    public void the_login_process_should_be_secure() throws Throwable {
        Assert.assertTrue(loginPage.isLoginProcessSecure(), "Login process should be secure");
    }

    @Then("^user information should be protected$")
    public void user_information_should_be_protected() throws Throwable {
        Assert.assertTrue(loginPage.isUserInformationProtected(), "User information should be protected");
    }
}
