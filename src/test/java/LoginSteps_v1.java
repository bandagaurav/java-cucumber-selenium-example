public class LoginSteps {

    private final LoginPage loginPage;

    public LoginSteps(TestContextSetup testContextSetup) {
        this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
    }

    @Then("^the user should not be able to access the private area$")
    public void user_should_not_be_able_to_access_private_area() throws Throwable {
        Assert.assertFalse(this.loginPage.isPrivateAreaAccessible(), "User should not be able to access the private area");
    }

    @Then("^the user should be notified with an appropriate error message$")
    public void user_should_be_notified_with_error_message() throws Throwable {
        Assert.assertTrue(this.loginPage.isErrorMessageDisplayed(), "Error message should be displayed");
    }

    @Then("^the login process should be secure$")
    public void login_process_should_be_secure() throws Throwable {
        Assert.assertTrue(this.loginPage.isLoginProcessSecure(), "Login process should be secure");
    }

    @Then("^user information should be protected following best practices$")
    public void user_information_should_be_protected() throws Throwable {
        Assert.assertTrue(this.loginPage.isUserInformationProtected(), "User information should be protected following best practices");
    }
}
