import org.junit.Assert;
import org.openqa.selenium.By;
import pages.LoginPage;

public class SuccessMessageSteps {

    private LoginPage loginPage;

    @Then("the page will provide a success message")
    public void thePageWillProvideASuccessMessage() {
        Assert.assertTrue("Success message is displayed", loginPage.isSuccessMessageDisplayed());
    }
}