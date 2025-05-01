public class LoginSteps {

    private final LoginPage loginPage;

    public LoginSteps(TestContextSetup testContextSetup) {
        this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
    }

    @Then("^the login process should be secure$")
    public void the_login_process_should_be_secure() throws Throwable {
        System.out.println("Checking if the login process is secure");
        // Add your logic to verify the security of the login process
    }

    @Then("^the user information should be protected$")
    public void the_user_information_should_be_protected() throws Throwable {
        System.out.println("Checking if the user information is protected");
        // Add your logic to verify the protection of user information
    }
}
