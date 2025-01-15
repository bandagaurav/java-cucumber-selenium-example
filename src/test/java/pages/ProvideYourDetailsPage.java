package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProvideYourDetailsPage extends BasePage {

    public ProvideYourDetailsPage(WebDriver driver) {
        super(driver);
    }

    public String URL = "?action=form1";

    @FindBy(how = How.ID, using = "fname")
    public WebElement inputFirstName;

    @FindBy(how = How.ID, using = "lname")
    public WebElement inputLastName;

    @FindBy(how = How.ID, using = "street")
    public WebElement inputStreet;

    @FindBy(how = How.ID, using = "city")
    public WebElement inputCity;

    @FindBy(how = How.ID, using = "zip")
    public WebElement inputZip;

    @FindBy(how = How.ID, using = "state")
    public WebElement inputState;

    @FindBy(how = How.ID, using = "country")
    public WebElement inputCountry;

    @FindBy(how = How.ID, using = "mobile")
    public WebElement inputMobilePhoneNumber;

    @FindBy(how = How.ID, using = "home")
    public WebElement inputHomePhoneNumber;

    @FindBy(how = How.ID, using = "email")
    public WebElement inputEmail;

    @FindBy(how = How.ID, using = "submit-info")
    public WebElement btnSubmit;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Form 1 - Information about yourself')]")
    public WebElement titleForm;

    public void ProvideFirstname(String firstName) {
        waitForElementVisibility(inputFirstName).sendKeys(firstName);
    }

    public void ProvideLastName(String lastName) {
        waitForElementVisibility(inputLastName).sendKeys(lastName);
    }

    public void ProvideStreet(String street) {
        waitForElementVisibility(inputStreet).sendKeys(street);
    }

    public void ProvideCity(String city) {
        waitForElementVisibility(inputCity).sendKeys(city);
    }

    public void ProvideZip(String zipCode) {
        waitForElementVisibility(inputZip).sendKeys(zipCode);
    }

    public void ProvideState(String state) {
        waitForElementVisibility(inputState).sendKeys(state);
    }

    public void ProvideCountry(String country) {
        waitForElementVisibility(inputCountry).sendKeys(country);
    }

    public void ProvideMobilePhoneNumber(String number) {
        waitForElementVisibility(inputMobilePhoneNumber).sendKeys(number);
    }

    public void ProvideHomePhoneNumber(String number) {
        waitForElementVisibility(inputHomePhoneNumber).sendKeys(number);
    }

    public void ProvideEmail(String email) {
        waitForElementVisibility(inputEmail).sendKeys(email);
    }

    public void ClickSubmitYourInformation() {
        waitForElementToBeClickable(btnSubmit).click();
    }
}
