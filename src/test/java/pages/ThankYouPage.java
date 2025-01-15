package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class ThankYouPage extends BasePage {

    public ThankYouPage(WebDriver driver) {
        super(driver);
    }

    public String URL = "?action=thankYou";

    @FindBy(how = How.TAG_NAME, using = "h2")
    public WebElement txtThankYou;

    public String grabThankYouMessage() {
        return this.waitForElementVisibility(this.txtThankYou).getText();
    }
}
