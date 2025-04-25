import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.ConversionPage;

public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;
    private ConversionPage conversionPage;

    @Given("^I navigate to the login page$")
    public void i_navigate_to_the_login_page() {
        loginPage = new LoginPage(driver);
        loginPage.navigateToLoginPage();
    }

    @When("^I click the login button$")
    public void i_click_the_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("^I should be able to access the private area$")
    public void i_should_be_able_to_access_the_private_area() {
        loginPage.verifyAccessToPrivateArea();
    }

    @When("^I click the convert button$")
    public void i_click_the_convert_button() {
        conversionPage = new ConversionPage(driver);
        conversionPage.clickConvertButton();
    }

    @Then("^the total \"([^\"]*)\" sales amount is \"([^\"]*)\"$")
    public void the_total_sales_amount_is(String month, String amount) {
        conversionPage.verifySalesAmount(month, amount);
    }

    @Then("^the page will respond with (.+) and provide as reason (.+)$")
    public void the_page_will_respond_with_and_provide_as_reason(String response, String reason) {
        conversionPage.verifyResponseAndReason(response, reason);
    }
}