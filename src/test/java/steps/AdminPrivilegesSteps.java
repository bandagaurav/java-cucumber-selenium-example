package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.EmployeePage;
import pages.LoginPage;
import pages.SalesPage;
import pages.UserAccountPage;
import utils.TestContextSetup;

import java.io.IOException;

public class AdminPrivilegesSteps {

    private final LoginPage loginPage;
    private final UserAccountPage userAccountPage;
    private final EmployeePage employeePage;
    private final SalesPage salesPage;


    public AdminPrivilegesSteps(TestContextSetup testContextSetup) {
        this.loginPage       = testContextSetup.pageObjectManager.getLoginPage();
        this.userAccountPage = testContextSetup.pageObjectManager.getUserAccountPage();
        this.employeePage    = testContextSetup.pageObjectManager.getEmployeePage();
        this.salesPage       = testContextSetup.pageObjectManager.getSalesPage();
    }

    @When("I submit username {string} and password {string}")
    public void i_submit_username_and_password(String user, String pw) throws Exception {
        this.loginPage.ProvideUsername(user);
        this.loginPage.ProvidePassword(pw);
        this.loginPage.ClickLogin();
    }

    @Then("I will be logged into the Admin Dashboard")
    public void i_will_be_logged_into_the_admin_dashboard() {
        Assert.assertTrue(this.userAccountPage.displayAdminDashboard(), "Admin Dashboard is not displayed");
    }

    @When("Admin searches for employee {string}")
    public void adminSearchesForEmployee(String employeeName) {
        this.userAccountPage.navigateToHumanResourcesSection();
        Assert.assertTrue(this.employeePage.employeePageIsDisplayed(), "Employee Page is not displayed");

        this.employeePage.fillEmployeeNameInput(employeeName);
        this.employeePage.clickSearchBtn();
    }

    @Then("information appears that employee {string} belongs to department {string}")
    public void informationAppearsThatEmployeeBelongsToDepartment(String expectedEmployeeName, String expectedDepartmentName) {
        Assert.assertTrue(this.employeePage.employeeRecordIsDisplayed(), "No employee record is displayed");

        String actualEmployeeName = this.employeePage.GrabEmployeeName();
        Assert.assertEquals(actualEmployeeName, expectedEmployeeName, "Expected employee name not found");

        String actualDepartmentName = this.employeePage.GrabDepartmentName();
        Assert.assertEquals(actualDepartmentName, expectedDepartmentName, "Expected department name not found");
    }

    @When("Admin looks up total sales amount for month {string} in year {string}")
    public void admin_looks_up_total_sales_amount_for_month_in_year(String month, String year) {
        this.userAccountPage.navigateToSalesSection();
        Assert.assertTrue(this.salesPage.salesStatisticsPageIsDisplayed(), "Sales statistics Page is not displayed");
        Assert.assertTrue(this.salesPage.grabYearMonthHeader().contains(year), "Year " + year + " was not found.");
        Assert.assertTrue(this.salesPage.monthCellIsDisplayed(month), "Month " + month + " was not found.");
    }

    @Then("the total {string} sales amount is {string}")
    public void theTotalSalesAmountIs(String month, String expectedSalesAmount) {
        String actualSalesAmount = this.salesPage.grabSalesAmountFromMonth(month);
        Assert.assertEquals(actualSalesAmount, expectedSalesAmount);
    }
}
