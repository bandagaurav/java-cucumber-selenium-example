public class LoginSteps {

    private final LoginPage loginPage;
    private final SecurePage securePage;

    public LoginSteps(TestContextSetup testContextSetup) {
        this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
        this.securePage = testContextSetup.pageObjectManager.getSecurePage();
    }

    @Given("^the user is on the login page$")
    public void the_user_is_on_the_login_page() throws Throwable {
        System.out.println("Navigate to login page");
        this.loginPage.show();
        this.loginPage.maximize();
    }

    @When("^the user enters the username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void the_user_enters_the_username_and_password(String username, String password) throws Throwable {
        System.out.println("User enters username and password");
        this.loginPage.enterUsername(username);
        this.loginPage.enterPassword(password);
    }

    @When("^clicks the login button$")
    public void clicks_the_login_button() throws Throwable {
        System.out.println("User clicks login button");
        this.loginPage.clickLogin();
    }

    @Then("^the user should be successfully logged in$")
    public void the_user_should_be_successfully_logged_in() throws Throwable {
        System.out.println("User is successfully logged in");
        Assert.assertTrue(this.loginPage.isProtectedAreaAccessible(), "Protected area is not accessible");
    }

    @Then("^the user should not be able to access the private area$")
    public void the_user_should_not_be_able_to_access_the_private_area() throws Throwable {
        System.out.println("User is not able to access the private area");
        Assert.assertFalse(this.loginPage.isProtectedAreaAccessible(), "Protected area is accessible");
    }

    @Then("^the user should be notified with an appropriate error message$")
    public void the_user_should_be_notified_with_an_appropriate_error_message() throws Throwable {
        System.out.println("User is notified with an error message");
        Assert.assertTrue(this.loginPage.isErrorMessageDisplayed(), "Error message is not displayed");
    }

    @Then("^the login process should be secure$")
    public void the_login_process_should_be_secure() throws Throwable {
        System.out.println("Login process is secure");
        Assert.assertTrue(this.securePage.isLoginProcessSecure(), "Login process is not secure");
    }

    @Then("^user information should be protected following best practices$")
    public void user_information_should_be_protected_following_best_practices() throws Throwable {
        System.out.println("User information is protected");
        Assert.assertTrue(this.securePage.isUserInformationProtected(), "User information is not protected");
    }
}
