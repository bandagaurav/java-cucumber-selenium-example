package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.BasePage;

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

    public void ProvideUsername(String userName) throws Exception {
        waitForElementVisibility(txtUserName).sendKeys(userName);
    }

    public void ProvidePassword(String password) throws Exception {
        waitForElementVisibility(txtPassWord).sendKeys(password);
    }

    public void Login(String userName, String password) throws Exception {
        this.ProvideUsername(userName);
        this.ProvidePassword(password);
    }

    public void ClickLogin() {
        waitForElementToBeClickable(btnLogin).click();
    }

    public boolean getTitleForm() {
        return titleForm.isDisplayed();
    }

    public boolean getErrorMessage() {
        return errorMessage.isDisplayed();
    }

    public boolean isLoginSecure() {
        // Implement security check logic here
        return true;
    }

    public boolean isUserInfoProtected() {
        // Implement user information protection logic here
        return true;
    }
}
