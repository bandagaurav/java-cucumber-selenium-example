package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ProvideYourDetailsPage;
import pages.ThankYouPage;
import utils.TestContextSetup;

import java.util.Map;

public class ProvideYourDetailsSteps {

    private final ProvideYourDetailsPage provideYourDetailsPage;
    private final ThankYouPage thankYouPage;


    public ProvideYourDetailsSteps(TestContextSetup testContextSetup) {
        this.provideYourDetailsPage = testContextSetup.pageObjectManager.getProvideYourDetailsPage();
        this.thankYouPage           = testContextSetup.pageObjectManager.getThankYouPage();
    }

    @Given("I navigate to Information about yourself page")
    public void i_navigate_to_information_about_yourself_page() throws NoSuchFieldException, IllegalAccessException {
        this.provideYourDetailsPage.show();
        this.provideYourDetailsPage.maximize();
    }


    @When("I provide the following details")
    public void i_enter_following_values_to_login(Map<String, String> formFields) {

        for (Map.Entry<String, String> stringStringEntry : formFields.entrySet()) {
            Object key   = ((Map.Entry<?, ?>) stringStringEntry).getKey();
            Object value = ((Map.Entry<?, ?>) stringStringEntry).getValue();

            switch (key.toString()) {
                case "firstname" -> this.provideYourDetailsPage.ProvideFirstname((String) value);
                case "lastname" -> this.provideYourDetailsPage.ProvideLastName((String) value);
                case "street" -> this.provideYourDetailsPage.ProvideStreet((String) value);
                case "city" -> this.provideYourDetailsPage.ProvideCity((String) value);
                case "zip" -> this.provideYourDetailsPage.ProvideZip((String) value);
                case "state" -> this.provideYourDetailsPage.ProvideState((String) value);
                case "country" -> this.provideYourDetailsPage.ProvideCountry((String) value);
                case "mobile phone" -> this.provideYourDetailsPage.ProvideMobilePhoneNumber((String) value);
                case "home phone" -> this.provideYourDetailsPage.ProvideHomePhoneNumber((String) value);
                case "email" -> this.provideYourDetailsPage.ProvideEmail((String) value);
            }
        }

        this.provideYourDetailsPage.ClickSubmitYourInformation();
    }

    @Then("I will see message {string}")
    public void i_will_see_message(String expectedMessage) {
        String actualMessage = thankYouPage.grabThankYouMessage();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

}
