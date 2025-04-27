@Then("the page will provide a success message")
public void thePageWillProvideASuccessMessage() {
    Assert.assertTrue("Success message is displayed", loginPage.isSuccessMessageDisplayed());
}