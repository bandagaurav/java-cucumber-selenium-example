public class LoginSteps {

    private final LoginPage loginPage;

    public LoginSteps(TestContextSetup testContextSetup) {
        this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
    }

    @Then("^the login process should be secure$")
    public void the_login_process_should_be_secure() throws Throwable {
        System.out.println("Checking if the login process is secure");
        // Add your security checks here
    }

    @Then("^user information should be protected following best practices$")
    public void user_information_should_be_protected_following_best_practices() throws Throwable {
        System.out.println("Ensuring user information is protected following best practices");
        // Add your information protection checks here
    }
}
