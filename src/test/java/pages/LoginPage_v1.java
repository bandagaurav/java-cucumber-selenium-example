public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.NAME, using = "user")
    public WebElement txtUserName;

    @FindBy(how = How.NAME, using = "pw")
    public WebElement txtPassWord;

    @FindBy(how = How.NAME, using = "Login")
    public WebElement btnLogin;

    @FindBy(how = How.XPATH, using = "//div[@class='error-message']")
    public WebElement errorMessage;

    public void ProvideUsername(String userName) throws Exception {
        waitForElementVisibility(txtUserName).sendKeys(userName);
    }

    public void ProvidePassword(String password) throws Exception {
        waitForElementVisibility(txtPassWord).sendKeys(password);
    }

    public void ClickLogin() {
        waitForElementToBeClickable(btnLogin).click();
    }

    public boolean isErrorMessageDisplayed() {
        return errorMessage.isDisplayed();
    }

    public boolean isLoginProcessSecure() {
        // Implement security check logic
        return true;
    }

    public boolean isUserInfoProtected() {
        // Implement user info protection logic
        return true;
    }
}
