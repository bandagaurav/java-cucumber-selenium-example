import org.openqa.selenium.WebDriver;

public class LoginPageSteps {
    WebDriver driver;

    @Given("User is on Login Page")
    public void user_is_on_login_page() {
        // code to navigate to login page
    }

    @When("User enters valid credentials")
    public void user_enters_valid_credentials() {
        // code to enter credentials
    }

    @Then("User is redirected to Dashboard")
    public void user_is_redirected_to_dashboard() {
        // code to verify dashboard
    }
}