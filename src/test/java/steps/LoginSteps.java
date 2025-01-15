package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.LoginPage;
import pages.UserAccountPage;
import utils.TestContextSetup;

import java.util.List;
import java.util.Map;

public class LoginSteps {
    private final LoginPage loginPage;
    private final UserAccountPage userForm;


    public LoginSteps(TestContextSetup testContextSetup) {
        // this.testContextSetup = testContextSetup;
        this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
        this.userForm  = testContextSetup.pageObjectManager.getUserAccountPage();
    }

    @Given("I navigate to login page")
    public void iNavigateToLoginPage() throws NoSuchFieldException, IllegalAccessException {
        System.out.println("Navigate to login page");
        this.loginPage.show();
        this.loginPage.maximize();
    }

    @And("I enter following for login")
    public void iEnterFollowingForLogin(DataTable dataTable) throws Exception {
        List<List<String>> data = dataTable.cells();
        this.loginPage.Login(data.get(1).get(0), data.get(1).get(1));
    }

    @And("^I enter following values to login$")
    public void i_enter_following_values_to_login(Map<String, String> formFields) throws Throwable {

        for (Map.Entry<String, String> stringStringEntry : formFields.entrySet()) {
            Object key   = ((Map.Entry<?, ?>) stringStringEntry).getKey();
            Object value = ((Map.Entry<?, ?>) stringStringEntry).getValue();

            switch (key.toString()) {
                case "username" -> this.loginPage.ProvideUsername((String) value);
                case "password" -> this.loginPage.ProvidePassword((String) value);
            }
        }
    }

    @When("I click login button")
    public void iClickLoginButton() {
        this.loginPage.ClickLogin();
    }

    @Then("I should be able to access the protected area")
    public void iShouldBeAbleToAccessTheProtectedArea() {
        Assert.assertTrue(this.userForm.displayAdminDashboard(), "Admin Dashboard Is not displayed");
    }
}
