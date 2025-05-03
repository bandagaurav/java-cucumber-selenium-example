public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public String URL = "?action=form4";

    @FindBy(how = How.NAME, using = "user")
    public WebElement txtUserName;

    @FindBy(how = How.NAME, using = "pw")
    public WebElement txtPassWord;

    @FindBy(how = How.NAME, using = "Login")
    public WebElement btnLogin;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'User 123')]")
    public WebElement titleForm;

    @FindBy(how = How.XPATH, using = "//div[@class='error']")
    public WebElement errorMessage;

    public void navigateToLoginPage() {
        driver.get(URL);
    }

    public void enterUsername(String username) {
        waitForElementVisibility(txtUserName).sendKeys(username);
    }

    public void enterPassword(String password) {
        waitForElementVisibility(txtPassWord).sendKeys(password);
    }

    public void clickLoginButton() {
        waitForElementToBeClickable(btnLogin).click();
    }

    public boolean isUserLoggedIn() {
        return titleForm.isDisplayed();
    }

    public boolean isErrorMessageDisplayed() {
        return errorMessage.isDisplayed();
    }

    public boolean isLoginProcessSecure() {
        // Implement security checks
        return true;
    }

    public boolean isUserInformationProtected() {
        // Implement information protection checks
        return true;
    }
}
