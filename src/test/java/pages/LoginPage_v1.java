import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_v1 {
    private WebDriver driver;
    private By errorMessageLocator = By.id("error-message");

    public LoginPage_v1(WebDriver driver) {
        this.driver = driver;
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessageLocator).getText();
    }

    public boolean isLoginProcessSecure() {
        // Implement security check logic
        return true; // Placeholder
    }

    public boolean isUserInformationProtected() {
        // Implement user information protection check logic
        return true; // Placeholder
    }
}
