public class LoginSteps {

    private LoginPage loginPage;

    public LoginSteps() {
        this.loginPage = new LoginPage();
    }

    @Then("the user should see an error message {string}")
    public void theUserShouldSeeAnErrorMessage(String expectedErrorMessage) {
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message does not match");
    }

    @Then("the login process should be secure")
    public void theLoginProcessShouldBeSecure() {
        boolean isSecure = loginPage.isLoginProcessSecure();
        Assert.assertTrue(isSecure, "Login process is not secure");
    }

    @Then("user information should be protected")
    public void userInformationShouldBeProtected() {
        boolean isProtected = loginPage.isUserInformationProtected();
        Assert.assertTrue(isProtected, "User information is not protected");
    }
}
