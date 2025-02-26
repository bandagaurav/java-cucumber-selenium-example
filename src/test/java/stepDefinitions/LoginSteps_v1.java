package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import utils.TestContextSetup;

public class LoginSteps {
    private final LoginPage loginPage;

    public LoginSteps(TestContextSetup testContextSetup) {
        this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
    }

    @Given("^the user is on the login page$")
    public void the_user_is_on_the_login_page() throws Throwable {
        System.out.println("Navigate to login page");
        this.loginPage.show();
        this.loginPage.maximize();
    }

    @When("^the user enters the username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void the_user_enters_the_username_and_password(String username, String password) throws Throwable {
        System.out.println("User enters login credentials");
        this.loginPage.ProvideUsername(username);
        this.loginPage.ProvidePassword(password);
    }

    @When("^clicks the login button$")
    public void clicks_the_login_button() throws Throwable {
        System.out.println("User clicks login button");
        this.loginPage.ClickLogin();
    }

    @Then("^the user should be successfully logged in$")
    public void the_user_should_be_successfully_logged_in() throws Throwable {
        System.out.println("User is successfully logged in");
        Assert.assertTrue(this.loginPage.getTitleForm(), "User is not logged in");
    }

    @Then("^the user should have access to the private area$")
    public void the_user_should_have_access_to_the_private_area() throws Throwable {
        System.out.println("User has access to the private area");
        Assert.assertTrue(this.loginPage.getTitleForm(), "User does not have access to the private area");
    }

    @Then("^the user should not be able to access the private area$")
    public void the_user_should_not_be_able_to_access_the_private_area() throws Throwable {
        System.out.println("User should not be able to access the private area");
        Assert.assertFalse(this.loginPage.getTitleForm(), "User has access to the private area");
    }

    @Then("^the user should be notified with an appropriate error message$")
    public void the_user_should_be_notified_with_an_appropriate_error_message() throws Throwable {
        System.out.println("User is notified with an appropriate error message");
        Assert.assertTrue(this.loginPage.getErrorMessage(), "Error message is not displayed");
    }

    @Then("^the login process should be secure$")
    public void the_login_process_should_be_secure() throws Throwable {
        System.out.println("Login process is secure");
        Assert.assertTrue(this.loginPage.isLoginSecure(), "Login process is not secure");
    }

    @Then("^the user information should be protected following best practices$")
    public void the_user_information_should_be_protected_following_best_practices() throws Throwable {
        System.out.println("User information is protected following best practices");
        Assert.assertTrue(this.loginPage.isUserInfoProtected(), "User information is not protected following best practices");
    }
}
