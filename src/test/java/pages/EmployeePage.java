package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class EmployeePage extends BasePage {

    public EmployeePage(WebDriver driver) {
        super(driver);
    }

    public String URL = "?action=employee";


    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Human Resources - Find employee')]")
    public WebElement titleFindEmployee;

    @FindBy(how = How.ID, using = "employee-name")
    public WebElement inputEmployeeName;

    @FindBy(how = How.ID, using = "btnSearch")
    public WebElement btnSearch;

    @FindBy(how = How.ID, using = "employee-details")
    public WebElement tableEmployeeDetails;

    @FindBy(how = How.CSS, using = ".employee.department")
    public WebElement txtDepartment;

    @FindBy(how = How.CSS, using = ".employee.name")
    public WebElement txtEmployeeName;


    public boolean employeePageIsDisplayed() {
        return this.titleFindEmployee.isDisplayed();
    }

    public void fillEmployeeNameInput(String employeeName) {
        this.fillInputField(this.inputEmployeeName, employeeName);
    }

    public void clickSearchBtn() {
        this.click(this.btnSearch);
    }

    public boolean employeeRecordIsDisplayed() {
        return this.tableEmployeeDetails.isDisplayed();
    }

    public String GrabEmployeeName() {
        return this.grabTextFromElement(this.txtEmployeeName);
    }

    public String GrabDepartmentName() {
        return this.grabTextFromElement(this.txtDepartment);
    }
}
