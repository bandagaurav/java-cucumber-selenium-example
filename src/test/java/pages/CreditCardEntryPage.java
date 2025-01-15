package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreditCardEntryPage extends BasePage {

    public CreditCardEntryPage(WebDriver driver) {
        super(driver);
    }

    public String URL = "?action=form3";

    @FindBy(how = How.ID, using = "cname")
    protected WebElement inputCardname;

    @FindBy(how = How.ID, using = "ccnum")
    protected WebElement inputCcnumber;

    @FindBy(how = How.ID, using = "expdate")
    protected WebElement inputExpirydate;

    @FindBy(how = How.ID, using = "cvv")
    protected WebElement inputCvv;

    @FindBy(how = How.NAME, using = "paynow")
    protected WebElement btnPayNow;

    @FindBy(how = How.ID, using = "ccentry")
    protected WebElement formCreditCardInfoEntry;

    public void EnterCardInformation(
            String cardname,
            String ccnumber,
            String expiryDate,
            String cvv) {
        waitForElementVisibility(inputCardname).sendKeys(cardname);
        waitForElementVisibility(inputCcnumber).sendKeys(ccnumber);
        waitForElementVisibility(inputExpirydate).sendKeys(expiryDate);
        waitForElementVisibility(inputCvv).sendKeys(cvv);
    }

    public void SubmitPayment() {
        waitForElementToBeClickable(btnPayNow).click();
    }

    public boolean getCreditCardInfoEntryForm() {
        return formCreditCardInfoEntry.isDisplayed();
    }
}
