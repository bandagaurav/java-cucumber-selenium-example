package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "secure-login")
    public WebElement secureLoginIndicator;

    @FindBy(how = How.ID, using = "user-info-protected")
    public WebElement userInfoProtectedIndicator;

    public boolean isLoginProcessSecure() {
        return this.secureLoginIndicator.isDisplayed();
    }

    public boolean isUserInformationProtected() {
        return this.userInfoProtectedIndicator.isDisplayed();
    }
}
