package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class UserAccountPage extends BasePage {


    public UserAccountPage(WebDriver driver) {
        super(driver);
    }

    public String URL = "?action=useraccount";

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'User Account')]")
    public WebElement titleUserForm;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Admin Dashboard')]")
    public WebElement titleAdminDashboard;

    @FindBy(how = How.ID, using = "hr-resources-link")
    public WebElement linkHumanResources;

    @FindBy(how = How.ID, using = "sales-statistics-link")
    public WebElement linkSalesStatistics;

    public boolean displayTitleForm() {
        this.titleUserForm.isDisplayed();
        return true;
    }

    public boolean displayAdminDashboard() {
        return this.titleAdminDashboard.isDisplayed();
    }

    public void navigateToHumanResourcesSection() {
        this.click(this.linkHumanResources);
    }

    public void navigateToSalesSection() {
        this.click(this.linkSalesStatistics);
    }
}
