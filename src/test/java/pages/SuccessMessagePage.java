import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessMessagePage {
    private WebDriver driver;
    private By successMessageLocator = By.id("success-message");

    public SuccessMessagePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isSuccessMessageDisplayed() {
        return driver.findElement(successMessageLocator).isDisplayed();
    }
}