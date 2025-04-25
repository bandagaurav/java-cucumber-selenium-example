@Then("I should be able to access the private area")
public void iShouldBeAbleToAccessThePrivateArea() {
    assertTrue(privateArea.isAccessible());
}