package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CreditCardEntryPage;
import pages.CreditCardResponsePage;
import utils.TestContextSetup;


public class CreditcardSteps {

    private final CreditCardEntryPage creditCardEntryPage;
    private final CreditCardResponsePage creditCardResponsePage;


    public CreditcardSteps(TestContextSetup testContextSetup) {
        this.creditCardEntryPage    = testContextSetup.pageObjectManager.getCreditCardEntryPage();
        this.creditCardResponsePage = testContextSetup.pageObjectManager.getCreditCardResponsePage();
    }

    @Given("^User is on card card entry page$")
    public void user_is_on_card_card_entry_page() throws Throwable {
        System.out.println("Navigate to Credit card page");
        this.creditCardEntryPage.show();
        this.creditCardEntryPage.maximize();
    }

    @When("^User (.+) enters card number (.+) together with expiry date (.+) and cvv (.+)$")
    public void user_enters_card_number_together_with_expiry_date_and_cvv(
            String name,
            String ccnumber,
            String expirydate,
            String cvv) throws Throwable {

        System.out.println("User enters CC data");
        this.creditCardEntryPage.EnterCardInformation(name, ccnumber, expirydate, cvv);
        this.creditCardEntryPage.SubmitPayment();
    }

    @Then("^the page will respond with (.+) and provide as reason (.+)$")
    public void the_page_will_respond_with_and_provide_as_reason(String expectedResponse, String expectedReason) {
        System.out.println("The CC page responds correctly");

        Assert.assertTrue(this.creditCardResponsePage.getAlertMessageBox(), "Message alert box is not displayed");

        String response = this.creditCardResponsePage.grabResponseFromAlertBox();
        Assert.assertTrue(response.contains(expectedResponse), "Expected response '" + response + "' to contain '"
                + expectedResponse + "' but string could not be found.");

        String reason = this.creditCardResponsePage.grabMoreInfoFromAlertBox();
        Assert.assertTrue(reason.contains(expectedReason), "Expected reason '" + reason + "' to contain '"
                + expectedReason + "' but string could not be found.");
    }
}
