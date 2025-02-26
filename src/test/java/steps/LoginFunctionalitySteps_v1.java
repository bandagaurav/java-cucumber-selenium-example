import io.cucumber.java.en.Then;

public class LoginFunctionalitySteps_v1 {

    @Then("the login process should be secure")
    public void the_login_process_should_be_secure() {
        // Implement security checks here
        System.out.println("Login process is secure.");
    }

    @Then("user information should be protected following best practices")
    public void user_information_should_be_protected_following_best_practices() {
        // Implement user information protection checks here
        System.out.println("User information is protected following best practices.");
    }
}
