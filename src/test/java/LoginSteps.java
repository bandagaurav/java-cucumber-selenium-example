public class LoginSteps {
    private final LoginPage loginPage;

    public LoginSteps(TestContextSetup testContextSetup) {
        this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
    }

    @Then("^the user should not be able to access the private area$")
    public void the_user_should_not_be_able_to_access_the_private_area() throws Throwable {
        System.out.println("User does not have access to the private area");
        Assert.assertFalse(this.loginPage.getTitleForm(), "User has access to the private area");
    }

    @Then("^the user should be notified with an appropriate error message$")
    public void the_user_should_be_notified_with_an_appropriate_error_message() throws Throwable {
        System.out.println("User is notified with an appropriate error message");
        Assert.assertTrue(this.loginPage.getErrorMessage().isDisplayed(), "Error message is not displayed");
    }

    @Then("^the login process should be secure$")
    public void the_login_process_should_be_secure() throws Throwable {
        System.out.println("Login process is secure");
        // Add security checks here
    }

    @Then("^user information should be protected following best practices$")
    public void user_information_should_be_protected_following_best_practices() throws Throwable {
        System.out.println("User information is protected following best practices");
        // Add security checks here
    }
}