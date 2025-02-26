public class LoginSteps {

    private final LoginPage loginPage;

    public LoginSteps(TestContextSetup testContextSetup) {
        this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
    }

    @Then("^the user should be notified with an appropriate error message$")
    public void the_user_should_be_notified_with_an_appropriate_error_message() {
        System.out.println("Verify error message is displayed");
        Assert.assertTrue(loginPage.isErrorMessageDisplayed(), "Error message is not displayed");
    }

    @Then("^the login process should be secure$")
    public void the_login_process_should_be_secure() {
        System.out.println("Verify login process is secure");
        Assert.assertTrue(loginPage.isLoginProcessSecure(), "Login process is not secure");
    }

    @Then("^user information should be protected following best practices$")
    public void user_information_should_be_protected_following_best_practices() {
        System.out.println("Verify user information is protected");
        Assert.assertTrue(loginPage.isUserInformationProtected(), "User information is not protected");
    }
}