public class LoginSteps {

    private final LoginPage loginPage;
    private final SecurePage securePage;

    public LoginSteps(TestContextSetup testContextSetup) {
        this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
        this.securePage = testContextSetup.pageObjectManager.getSecurePage();
    }

    @Given("^the user is on the login page$")
    public void the_user_is_on_the_login_page() throws Throwable {
        loginPage.navigateToLoginPage();
    }

    @When("^the user enters the username \"([^\"]*)\" and password \"([^\"]*)\"")
    public void the_user_enters_the_username_and_password(String username, String password) throws Throwable {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("^clicks the login button$")
    public void clicks_the_login_button() throws Throwable {
        loginPage.clickLoginButton();
    }

    @Then("^the user should be successfully logged in$")
    public void the_user_should_be_successfully_logged_in() throws Throwable {
        Assert.assertTrue(loginPage.isProtectedAreaAccessible());
    }

    @Then("^the user should not be able to access the private area$")
    public void the_user_should_not_be_able_to_access_the_private_area() throws Throwable {
        Assert.assertFalse(loginPage.isProtectedAreaAccessible());
    }

    @Then("^the user should be notified with an appropriate error message$")
    public void the_user_should_be_notified_with_an_appropriate_error_message() throws Throwable {
        Assert.assertTrue(loginPage.isErrorMessageDisplayed());
    }

    @Then("^the login process should be secure$")
    public void the_login_process_should_be_secure() throws Throwable {
        Assert.assertTrue(securePage.isLoginProcessSecure());
    }

    @Then("^user information should be protected following best practices$")
    public void user_information_should_be_protected_following_best_practices() throws Throwable {
        Assert.assertTrue(securePage.isUserInfoProtected());
    }
}
