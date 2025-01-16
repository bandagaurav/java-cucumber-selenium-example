import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NewStepDefinitions {
    private WebDriver driver;

    public NewStepDefinitions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Given("User is on the login page")
    public void userOnLoginPage() {
        // code to navigate to login page
    }

    @When("User enters valid credentials")
    public void userEntersCredentials() {
        // code to enter credentials
    }

    @Then("User is redirected to the dashboard")
    public void userRedirectedToDashboard() {
        // code to verify dashboard
    }
}