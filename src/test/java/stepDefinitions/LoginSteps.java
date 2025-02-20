@Then("^I should see an error message \"([^\"]*)\"")
public void i_should_see_an_error_message(String errorMessage) {
    // Code to verify the error message
    String actualMessage = driver.findElement(By.id("error-message")).getText();
    assertEquals(errorMessage, actualMessage);
}

@Then("^the login process should be secure$")
public void the_login_process_should_be_secure() {
    // Code to verify the security of the login process
    // This could include checking for HTTPS, secure cookies, etc.
    boolean isSecure = driver.getCurrentUrl().startsWith("https");
    assertTrue("The login process is not secure", isSecure);
}

@Then("^user information should be protected$")
public void user_information_should_be_protected() {
    // Code to verify that user information is protected
    // This could include checking for encrypted storage, secure transmission, etc.
    // Example: Check if password field is of type 'password'
    WebElement passwordField = driver.findElement(By.id("password"));
    assertEquals("password", passwordField.getAttribute("type"));
}