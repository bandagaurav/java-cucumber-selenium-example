import static org.junit.Assert.assertTrue;

@Then("I should be able to access the private area")
public void iShouldBeAbleToAccessPrivateArea() {
    assertTrue(privateAreaPage.isInPrivateArea());
}