public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//div[@class='error']")
    public WebElement errorMessage;

    public boolean isErrorMessageDisplayed() {
        return errorMessage.isDisplayed();
    }

    public boolean isLoginProcessSecure() {
        // Implement security check logic
        return true;
    }

    public boolean isUserInformationProtected() {
        // Implement user information protection logic
        return true;
    }
}