package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class LoginSteps_v1 {
    WebDriver driver;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        driver = new ChromeDriver();
        driver.get("http://example.com/login");
    }

    @When("the user enters the username {string} and password {string}")
    public void the_user_enters_the_username_and_password(String username, String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("clicks the login button")
    public void clicks_the_login_button() {
        driver.findElement(By.id("loginButton")).click();
    }

    @Then("the user should be successfully logged in")
    public void the_user_should_be_successfully_logged_in() {
        assertTrue(driver.findElement(By.id("privateArea")).isDisplayed());
    }

    @Then("the user should have access to the private area")
    public void the_user_should_have_access_to_the_private_area() {
        assertTrue(driver.findElement(By.id("privateArea")).isDisplayed());
    }

    @Then("the user should not be able to access the private area")
    public void the_user_should_not_be_able_to_access_the_private_area() {
        assertFalse(driver.findElement(By.id("privateArea")).isDisplayed());
    }

    @Then("the user should be notified with an appropriate error message")
    public void the_user_should_be_notified_with_an_appropriate_error_message() {
        assertTrue(driver.findElement(By.id("errorMessage")).isDisplayed());
    }

    @Then("the login process should be secure")
    public void the_login_process_should_be_secure() {
        // Implement security checks
    }

    @Then("user information should be protected following best practices")
    public void user_information_should_be_protected_following_best_practices() {
        // Implement security checks
    }
}
