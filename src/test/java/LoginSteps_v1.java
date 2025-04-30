public class LoginSteps {

    private final LoginPage loginPage;
    private final SecurePage securePage;

    public LoginSteps(TestContextSetup testContextSetup) {
        this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
        this.securePage = testContextSetup.pageObjectManager.getSecurePage();
    }

    @Then("^the user should be notified with an appropriate error message$")
    public void the_user_should_be_notified_with_an_appropriate_error_message() {
        Assert.assertTrue(loginPage.isErrorMessageDisplayed(), "Error message is not displayed");
    }

    @Then("^the login process should be secure$")
    public void the_login_process_should_be_secure() {
        Assert.assertTrue(securePage.isLoginProcessSecure(), "Login process is not secure");
    }

    @Then("^user information should be protected following best practices$")
    public void user_information_should_be_protected_following_best_practices() {
        Assert.assertTrue(securePage.isUserInfoProtected(), "User information is not protected following best practices");
    }
}
