package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Field;
import java.time.Duration;


public class BasePage {
    protected WebDriver driver;
    protected String baseUrl;
    protected WebDriverWait wait;

    public static final int EXPLICIT_WAIT = 10;

    public BasePage(WebDriver driver) {
        this.baseUrl = "http://localhost:8000/index.php";

        this.driver = driver;
        wait        = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        PageFactory.initElements(driver, this);
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void show() throws NoSuchFieldException, IllegalAccessException {
        String pageUrl = (String) this.get_page_url();
        String url     = this.baseUrl + pageUrl;
        this.driver.navigate().to(url);
    }

    public void maximize() {
        this.driver.manage().window().maximize();
    }

    private Object get_page_url() throws NoSuchFieldException, IllegalAccessException {
        Field field = this.getClass().getDeclaredField("URL");
        field.setAccessible(true);
        return field.get(this);
    }

    public WebElement waitForElementToBeClickable(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void click(WebElement element) {
        waitForElementToBeClickable(element).click();
    }

    public WebElement waitForElementVisibility(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void fillInputField(WebElement element, String value) {
        element = waitForElementVisibility(element);
        element.clear();
        element.sendKeys(value);
    }

    public void clearAndSendKeys(WebElement element, String value) {
        element = waitForElementVisibility(element);
        element.clear();
        element.sendKeys(value);
    }

    public String grabTextFromElement(WebElement element) {
        element = waitForElementVisibility(element);
        return element.getText();
    }
}
