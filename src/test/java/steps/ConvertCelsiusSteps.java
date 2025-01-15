package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CelsiusToFahrenheitPage;
import utils.TestContextSetup;


public class ConvertCelsiusSteps {
    private final CelsiusToFahrenheitPage celsiusToFahrenheitPage;

    public ConvertCelsiusSteps(TestContextSetup testContextSetup) {
        this.celsiusToFahrenheitPage = testContextSetup.pageObjectManager.getCelsiusToFahrenheitPage();
    }

    @Given("^I provide \"([^\"]*)\" degree Celsius$")
    public void i_provide_something_degree_celsius(String celsius) throws Throwable {
        this.celsiusToFahrenheitPage.show();
        this.celsiusToFahrenheitPage.maximize();

        this.celsiusToFahrenheitPage.provideCelsius(celsius);
    }

    @When("^I click the convert button$")
    public void i_click_the_convert_button() {
        this.celsiusToFahrenheitPage.ClickConvert();
    }

    @Then("^I should see as result \"([^\"]*)\" Fahrenheit$")
    public void i_should_see_as_result_something_fahrenheit(String expectedFahrenheit) {
        String actualFahrenheit = this.celsiusToFahrenheitPage.readFahrenheitField();
        Assert.assertEquals(actualFahrenheit, expectedFahrenheit);
    }

}
