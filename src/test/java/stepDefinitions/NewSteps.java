import static org.junit.Assert.assertTrue;

public class NewSteps {

    @Then("^I should be able to access the private area$")
    public void iShouldBeAbleToAccessThePrivateArea() {
        assertTrue("Not able to access the private area", loginPage.isPrivateAreaAccessible());
    }

    public class LoginPage {
        public boolean isPrivateAreaAccessible() {
            // Implementation to check access to private area
        }
    }
}