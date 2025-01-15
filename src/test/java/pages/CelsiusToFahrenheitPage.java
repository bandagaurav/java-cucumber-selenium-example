package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CelsiusToFahrenheitPage extends BasePage {

    public CelsiusToFahrenheitPage(WebDriver driver) {
        super(driver);
    }

    public String URL = "?action=form6";


    @FindBy(how = How.NAME, using = "celsius")
    protected WebElement inputCelsius;

    @FindBy(how = How.NAME, using = "fahrenheit")
    protected WebElement inputFahrenheit;

    @FindBy(how = How.ID, using = "btnCelsius")
    protected WebElement btnCelsius;

    public void provideCelsius(String celsiusDegrees) {
        clearAndSendKeys(this.inputCelsius, celsiusDegrees);
    }

    public void ClickConvert() {
        waitForElementToBeClickable(btnCelsius).click();
    }

    public String readFahrenheitField() {
        return inputFahrenheit.getAttribute("value");
    }
}
