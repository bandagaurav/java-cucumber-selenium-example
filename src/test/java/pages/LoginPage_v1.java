package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "privateArea")
    public WebElement privateArea;

    @FindBy(how = How.ID, using = "errorMessage")
    public WebElement errorMessage;

    @FindBy(how = How.ID, using = "secureLogin")
    public WebElement secureLogin;

    @FindBy(how = How.ID, using = "userInformation")
    public WebElement userInformation;

    public boolean isPrivateAreaAccessible() {
        return this.privateArea.isDisplayed();
    }

    public boolean isErrorMessageDisplayed() {
        return this.errorMessage.isDisplayed();
    }

    public boolean isLoginProcessSecure() {
        return this.secureLogin.isDisplayed();
    }

    public boolean isUserInformationProtected() {
        return this.userInformation.isDisplayed();
    }
}
