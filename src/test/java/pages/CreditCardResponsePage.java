package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreditCardResponsePage extends BasePage {

    public CreditCardResponsePage(WebDriver driver) {
        super(driver);
    }

    public String URL = "?action=responsecc";

    @FindBy(how = How.CLASS_NAME, using = "response")
    protected WebElement txtResponse;

    @FindBy(how = How.CLASS_NAME, using = "more-info")
    protected WebElement txtMoreInfo;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'alert')]")
    protected WebElement alertMessage;


    public boolean getAlertMessageBox() {
        return waitForElementVisibility(alertMessage).isDisplayed();
    }

    public String grabResponseFromAlertBox() {
        return waitForElementVisibility(txtResponse).getText();
    }

    public String grabMoreInfoFromAlertBox() {
        return waitForElementVisibility(txtMoreInfo).getText();
    }
}
