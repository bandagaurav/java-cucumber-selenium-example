import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LoginFunctionalitySteps_v1 {

    @Then("the login process should be secure")
    public void the_login_process_should_be_secure() {
        // Implement security checks here
        Assert.assertTrue(loginPage.isLoginProcessSecure(), "Login process is not secure");
    }

    @Then("user information should be protected following best practices")
    public void user_information_should_be_protected_following_best_practices() {
        // Implement information protection checks here
        Assert.assertTrue(loginPage.isUserInfoProtected(), "User information is not protected following best practices");
    }
}
