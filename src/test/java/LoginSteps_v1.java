public class LoginSteps {

    private final LoginPage loginPage;
    private final SecurePage securePage;

    public LoginSteps(TestContextSetup testContextSetup) {
        this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
        this.securePage = testContextSetup.pageObjectManager.getSecurePage();
    }

    @Then("^the user should not be logged in$")
    public void the_user_should_not_be_logged_in() throws Throwable {
        Assert.assertFalse(this.loginPage.isUserLoggedIn(), "User should not be logged in");
    }

    @Then("^the user should see an error message \"([^\"]*)\"$")
    public void the_user_should_see_an_error_message(String errorMessage) throws Throwable {
        Assert.assertTrue(this.loginPage.getErrorMessage().contains(errorMessage), "Expected error message not found");
    }

    @Then("^the login process should be secure$")
    public void the_login_process_should_be_secure() throws Throwable {
        Assert.assertTrue(this.securePage.isLoginProcessSecure(), "Login process is not secure");
    }

    @Then("^user information should be protected$")
    public void user_information_should_be_protected() throws Throwable {
        Assert.assertTrue(this.securePage.isUserInformationProtected(), "User information is not protected");
    }
}
