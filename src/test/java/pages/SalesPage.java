package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class SalesPage extends BasePage {

    public SalesPage(WebDriver driver) {
        super(driver);
    }

    public String URL = "?action=sales";

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Sales - Statistics')]")
    public WebElement titleSalesStatistics;

    @FindBy(how = How.ID, using = "sales-details")
    public WebElement tableSalesDetails;

    @FindBy(how = How.CSS, using = ".sales.header-year-month")
    public WebElement salesYearMonthHeader;

    public String monthCell = "//td[contains(text(), '%s')]";

    public String monthSalesCell = "//td[contains(text(), '%s')]/following-sibling::td";


    public boolean salesStatisticsPageIsDisplayed() {
        return this.titleSalesStatistics.isDisplayed();
    }

    public String grabYearMonthHeader() {
        return this.grabTextFromElement(this.salesYearMonthHeader);
    }

    public boolean monthCellIsDisplayed(String month) {
        String completeXpath = String.format(this.monthCell, month);
        return driver.findElement(By.xpath(completeXpath)).isDisplayed();
    }

    public String grabSalesAmountFromMonth(String month) {
        String     completeXpath = String.format(this.monthSalesCell, month);
        WebElement el            = driver.findElement(By.xpath(completeXpath));
        return this.grabTextFromElement(el);
    }
}
