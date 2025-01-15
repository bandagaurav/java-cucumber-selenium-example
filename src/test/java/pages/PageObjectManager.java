package pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    public CreditCardEntryPage creditCardEntryPage;
    public CreditCardResponsePage creditCardResponsePage;
    public LoginPage loginPage;
    public UserAccountPage userAccountPage;
    public CelsiusToFahrenheitPage celsiusToFahrenheitPage;
    public ProvideYourDetailsPage provideYourDetailsPage;
    public ThankYouPage thankYouPage;
    public EmployeePage employeePage;
    public SalesPage salesPage;
    public OrangePage orangePage;
    public BasePage basePage;

    public WebDriver driver;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public CreditCardEntryPage getCreditCardEntryPage() {
        creditCardEntryPage = new CreditCardEntryPage(driver);
        return creditCardEntryPage;
    }

    public CreditCardResponsePage getCreditCardResponsePage() {
        creditCardResponsePage = new CreditCardResponsePage(driver);
        return creditCardResponsePage;
    }

    public LoginPage getLoginPage() {
        loginPage = new LoginPage(driver);
        return loginPage;
    }

    public UserAccountPage getUserAccountPage() {
        userAccountPage = new UserAccountPage(driver);
        return userAccountPage;
    }

    public CelsiusToFahrenheitPage getCelsiusToFahrenheitPage() {
        celsiusToFahrenheitPage = new CelsiusToFahrenheitPage(driver);
        return celsiusToFahrenheitPage;
    }

    public ProvideYourDetailsPage getProvideYourDetailsPage() {
        provideYourDetailsPage = new ProvideYourDetailsPage(driver);
        return provideYourDetailsPage;
    }

    public ThankYouPage getThankYouPage() {
        this.thankYouPage = new ThankYouPage(driver);
        return thankYouPage;
    }

    public EmployeePage getEmployeePage() {
        this.employeePage = new EmployeePage(driver);
        return employeePage;
    }

    public SalesPage getSalesPage() {
        this.salesPage = new SalesPage(driver);
        return salesPage;
    }

    public OrangePage getOrangePage() {
        this.orangePage = new OrangePage(driver);
        return orangePage;
    }

    public BasePage getBasePage() {
        this.basePage = new BasePage(driver);
        return basePage;
    }

}
