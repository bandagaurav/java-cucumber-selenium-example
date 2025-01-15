package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.OrangePage;
import utils.TestContextSetup;

import java.io.IOException;

public class ConcurrentWindowsSteps {

    private final TestContextSetup testContextSetup;
    private final String baseUrl;
    private final OrangePage orangePage;
    private WebDriver greenFriend;
    private WebDriver brownFriend;

    public ConcurrentWindowsSteps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.baseUrl          = testContextSetup.pageObjectManager.getBasePage().getBaseUrl();
        this.orangePage       = testContextSetup.pageObjectManager.getOrangePage();
    }

    @Given("^different people went to different sites$")
    public void different_people_went_to_different_sites() throws NoSuchFieldException, IllegalAccessException, IOException {
        this.orangePage.show();

        this.greenFriend = this.testContextSetup.testBase.haveFriend();
        this.greenFriend.navigate().to(this.baseUrl + "?action=greenPage");

        this.brownFriend = this.testContextSetup.testBase.haveFriend();
        this.brownFriend.navigate().to(this.baseUrl + "?action=brownPage");
    }

    @When("^they realize that they forgot what they actually wanted to do there$")
    public void they_realize_that_they_forget_what_they_actually_wanted_to_do_there() {
        System.out.println("Wait a minute ...");
        System.out.println("We forgot that we are so forgetful.");
    }

    @Then("^they leave the sites again$")
    public void they_leave_the_sites_again() {
        System.out.println("Brown window stops");
        this.brownFriend.quit();

        System.out.println("Green window stops");
        this.greenFriend.quit();
    }

}
