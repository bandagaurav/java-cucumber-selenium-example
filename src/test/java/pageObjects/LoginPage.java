public class LoginPage {
    @FindBy(id = "successMessage")
    private WebElement successMessage;

    public boolean isSuccessMessageDisplayed() {
        return successMessage.isDisplayed();
    }
}