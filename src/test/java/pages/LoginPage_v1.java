package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "username")
    public WebElement inputUsername;

    @FindBy(how = How.ID, using = "password")
    public WebElement inputPassword;

    @FindBy(how = How.ID, using = "loginButton")
    public WebElement btnLogin;

    @FindBy(how = How.ID, using = "errorMessage")
    public WebElement errorMessage;

    public void ProvideUsername(String username) {
        this.fillInputField(this.inputUsername, username);
    }

    public void ProvidePassword(String password) {
        this.fillInputField(this.inputPassword, password);
    }

    public void ClickLogin() {
        this.click(this.btnLogin);
    }

    public String getErrorMessage() {
        return this.errorMessage.getText();
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
