package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "error-message")
    public WebElement errorMessage;

    @FindBy(how = How.ID, using = "login-form")
    public WebElement loginForm;

    public String getErrorMessage() {
        return this.errorMessage.getText();
    }

    public boolean isLoginProcessSecure() {
        // Implement security checks here
        return true;
    }
}
