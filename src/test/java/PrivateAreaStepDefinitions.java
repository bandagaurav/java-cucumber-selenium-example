import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PrivateAreaStepDefinitions {
    private WebDriver driver;
    private PrivateAreaPage privateAreaPage;

    public PrivateAreaStepDefinitions(WebDriver driver) {
        this.driver = driver;
        privateAreaPage = PageFactory.initElements(driver, PrivateAreaPage.class);
    }

    @Given("^I am logged in as a registered user$")
    public void i_am_logged_in_as_registered_user() {
        // Assume user is logged in
    }

    @When("^I navigate to the private area$")
    public void i_navigate_to_private_area() {
        privateAreaPage.navigateToPrivateArea();
    }

    @Then("^I should see the private area content$")
    public void i_see_private_area_content() {
        assertTrue(privateAreaPage.isContentVisible());
    }
}