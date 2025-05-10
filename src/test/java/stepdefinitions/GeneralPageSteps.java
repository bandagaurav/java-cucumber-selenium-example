@Then("the page will provide a success message")
public void thePageWillProvideASuccessMessage() {
    assertEquals("Success", page.getSuccessMessage());
}